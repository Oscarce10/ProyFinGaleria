/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import vista.FrmArt;
import vista.FrmCli;
import vista.FrmObra;
import vista.FrmPpal;
import vista.FrmVenta;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JOptionPane;
import modelo.Artista;
import modelo.CampoVacioException;
import modelo.Cliente;
import modelo.Escultura;
import modelo.Listas;
import modelo.ObLapiz;
import modelo.Pintura;
import modelo.RangoValorException;

/**
 *
 * @author Oscar
 */
public class Controlador implements ActionListener {

    private FrmPpal frmP;
    private FrmArt frmA;
    private FrmCli frmC;
    private FrmObra frmO;
    private FrmVenta frmV;
    private Artista obA;
    private Cliente obC;
    private Escultura obE;
    private Listas obL;
    private ObLapiz obOL;
    private Pintura obOP;

    public Controlador(FrmPpal frmP, FrmArt frmA, FrmCli frmC, FrmObra FrmO, FrmVenta FrmV, Artista obA, Cliente obC, Escultura obE, Listas obL, ObLapiz obOL, Pintura obOP) {
        this.frmP = frmP;
        this.frmA = frmA;
        this.frmC = frmC;
        this.frmO = FrmO;
        this.frmV = FrmV;
        this.obA = obA;
        this.obC = obC;
        this.obE = obE;
        this.obL = obL;
        this.obOL = obOL;
        this.obOP = obOP;
        frmP.getEscritorio().setSize(540, 600);
        frmP.getMnuArtista().addActionListener(this);
        frmP.getMnuCliente().addActionListener(this);
        frmP.getMnuObra().addActionListener(this);
        frmP.getMnuExit().addActionListener(this);
        frmP.getMnuVenta().addActionListener(this);
        frmP.getMnuReporte().addActionListener(this);
        frmP.getMnuTabArtistas().addActionListener(this);
        frmP.getMnuTabClientes().addActionListener(this);
        frmP.getMnuTabObras().addActionListener(this);
    }

    public Controlador() {
        this.frmP = new FrmPpal();
        this.obL = new Listas();
        frmP.getEscritorio().setSize(500, 500);
        frmP.setSize(500, 500);
        frmP.getMnuArtista().addActionListener(this);
        frmP.getMnuCliente().addActionListener(this);
        frmP.getMnuObra().addActionListener(this);
        frmP.getMnuExit().addActionListener(this);
        frmP.getMnuVenta().addActionListener(this);
        frmP.getMnuReporte().addActionListener(this);
        frmP.getMnuTabArtistas().addActionListener(this);
        frmP.getMnuTabClientes().addActionListener(this);
        frmP.getMnuTabObras().addActionListener(this);
    }

    public void iniciar() {
        frmP.setTitle("GALERIA");
        frmP.setVisible(true);
        frmP.setDefaultCloseOperation(frmP.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            //Si es celeccionado archivo --> salir se termina el programa
            if (e.getSource() == frmP.getMnuExit()) {
                System.exit(0);
            } /*Cuando se selecciona nuevo-->artista se crea formulario nuevo, se agregan los actionlistener a los botones y
            Se agregan las acciones a tomar cuando se oprimen los botones, si es de agregar artista se crea el objeto artista*/ 
            else if (e.getSource() == frmP.getMnuArtista()) {
                agregarArtista();
            } /*Cuando se selecciona nuevo-->cliente se crea formulario nuevo, se agregan los actionlistener a los botones y
            Se agregan las acciones a tomar cuando se oprimen los botones, si es de agregar cliente se crea el objeto cliente*/ 
            else if (e.getSource() == frmP.getMnuCliente()) {
                frmC = new FrmCli();
                frmP.getEscritorio().add(frmC);
                frmC.setMaximum(true); //Permite iniciar el formulario maximizado dentro del Jdesktop
                frmC.setVisible(true);
                /*Se agrega actionlistener al combobox de frmC y se configura de tal forma que cada vez que este selecionado
                el index 0 = adulto, el pago (txtPagoCliente) se establecera como = 5.000.
                Si esta seleccionado el index 1 = niño, el pago se establecera como = 3.000
                 */
                frmC.getCbCliente().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        switch (frmC.getCbCliente().getSelectedIndex()) {
                            case 0:
                                frmC.getTxtPagoCliente().setText("5000");
                                break;
                            case 1:
                                frmC.getTxtPagoCliente().setText("3000");
                                break;
                        }
                    }
                });
                //Se agrega actionlistener al boton de agregar cliente en frmC y su respectivo procedimiento
                frmC.getBtnAddCliente().addActionListener(new ActionListener() {
                    @Override //Anonimous inner class
                    public void actionPerformed(ActionEvent e) {
                        //Se verifica que no haya ningun campo vacio o que el cb este seleccionado, en tal caso se lanza advertencia
                        if (frmC.getCbCliente().getSelectedIndex() == -1) {
                            JOptionPane.showMessageDialog(frmP, "No se ha seleccionado la edad del cliente");
                        } 
                        /*Se verifica que no haya ningun campo vacio, si lo hay se lanza excepcion desde la clase Cliente o Persona
                        Si no hay campos vacios se procede a crear objeto artista
                        //Si todo en el formulario esta correcto se procede con la creacion del cliente
                        */
                        else {
                            try {
                                //Se pueden lanzar excepciones de rango o campo vacio
                                obC = new Cliente();
                                obC.setId(frmC.getTxtIdCliente().getText());
                                obC.setNom(frmC.getTxtNomCliente().getText());
                                obC.setTel(frmC.getTxtTelCliente().getText());
                                obC.setPago(Integer.parseInt(frmC.getTxtPagoCliente().getText()));
                                //Se pide confirmacion para crear al cliente, en caso afirmativo se agrega a la lista de Persona y se avisa
                                if (JOptionPane.showConfirmDialog(frmP, "Desea agregar? \n" + obC.toString(), "Agregar cliente", JOptionPane.YES_NO_OPTION)
                                        == JOptionPane.YES_OPTION) {
                                    obL.getObP().add(obC);
                                    JOptionPane.showMessageDialog(frmP, "Cliente agregado satisfactoriamente");
                                    //Se pregunta si desean agregar un nuevo cliente, en caso afirmativo se limpian los campos del FrmC
                                    if (JOptionPane.showConfirmDialog(frmP, "Desea agregar otro cliente?", "Agregar nuevo cliente", JOptionPane.YES_NO_OPTION)
                                            == JOptionPane.YES_OPTION) {
                                        frmC.getCbCliente().setSelectedIndex(-1);
                                        frmC.getTxtIdCliente().setText("");
                                        frmC.getTxtNomCliente().setText("");
                                        frmC.getTxtTelCliente().setText("");
                                        frmC.getTxtPagoCliente().setText("");
                                    } //Si no desean registrar mas clientes se cierra el frmC
                                    else {
                                        frmC.dispose();
                                    }
                                    
                                } //Si no desea registrar el actual cliente se avisa y no se guarda nada
                                else {
                                    JOptionPane.showMessageDialog(frmP, "Registro cancelado");
                                }
                            } catch (CampoVacioException cv) {
                                JOptionPane.showMessageDialog(frmP, cv.getMessage(), "Error de campo vacio", 0);
                            } catch (RangoValorException rv) {
                                JOptionPane.showMessageDialog(frmP, rv.getMessage(), "Error de valor de campo", 0);
                            }
                        }
                    }
                });
                frmC.getBtnCancelCliente().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frmC.dispose();
                    }
                });
            } else if (e.getSource() == frmP.getMnuObra()) {
                frmP.setSize(500, 550); //Para que se vea bien el frmO, se reajustara a su valor original al final cada vez que se cierre frmO
                frmO = new FrmObra();
                /*Como se observa el cb de artista solo se llenara a medida que estan los artistas registrados, en tal caso que se
                desee añadir una obra y el artista no este, se podra añadir un artista nuevo y posteriormente su obra.
                Para llenar el combo box se hace un recorrido a la lista de tipo Persona desde 0 hasta el valor menor a su tamaño y solo se
                toman los datos de los objetos registrados solo como Artista (instance of Artista) y si se encuentra alguno, se toma su nombre
                y se inserta en el cb
                 */
                for (int i = 0; i < obL.getObP().size(); i++) {
                    if (obL.getObP().get(i) instanceof Artista) {
                        frmO.getCbArtistaObra().addItem(obL.getObP().get(i).getNom());
                    }
                }
                frmO.getCbArtistaObra().setSelectedIndex(-1); //Deja el combobox en seleccion nula por defecto
                frmP.getEscritorio().add(frmO);
                frmO.setMaximum(true);
                frmO.setVisible(true);
                frmO.getCbOpcVentaObra().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        switch (frmO.getCbOpcVentaObra().getSelectedIndex()){
                            //Si esta seleccionada la opcion No del cb opc venta, se esconde el campo de precio
                            case 1:
                                frmO.getLblPrecio().setVisible(false);
                                frmO.getPnlPrecio().setVisible(false);
                                break;
                            //Si esta sellecionada la opcion Si del cb opc venta, se esconde el campo de precio
                            case 0:
                                frmO.getLblPrecio().setVisible(true);
                                frmO.getPnlPrecio().setVisible(true);
                                break;
                        }
                    }
                });
                /*
                En tal caso que no exista el artista de la obra que se va a ingresar, existe la opcion de registrar artista al final del formulario
                la cual al oprimirla, cierra el formulario de obra y abre uno nuebo de artista
                */
                frmO.getBtnAddArtObra().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frmP.setSize(500, 500);
                        frmO.dispose();
                        try {
                            agregarArtista();
                        } catch (PropertyVetoException ex) {
                            //Puesto automaticamente por Netbeans, no creo que se lance nunca pero debe estar ahi
                            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                //En caso de que seleccione el boton de cancelar del formulario este se cierra
                frmO.getBtnCancelObra().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frmP.setSize(500, 500);
                        frmO.dispose();
                    }
                });
                
                /*
                Cuando se selecciona la opcion de registrar obra se verifica que todos los datos esten correctamente diligenciados
                en tal caso se procede a guardar la obra en la lista de obras
                */
                frmO.getBtnAddObra().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Si hay campos sin llenar se lanza advertencia y no se deja continuar
                        if (frmO.getTxtNomObra().getText().isEmpty() || frmO.getTxtCodObra().getText().isEmpty()
                                || frmO.getTxtPrecioObra().getText().isEmpty() || frmO.getCbArtistaObra().getSelectedIndex() == -1
                                || frmO.getCbOpcVentaObra().getSelectedIndex() == -1 || frmO.getCbTipoObra().getSelectedIndex() == -1){
                            JOptionPane.showMessageDialog(frmP, "Hay campos sin llenar");
                        }
                        else {
                            //Si esta seleccionada la primera opcion del cb tipo obra, se crea instancia de pintura
                            if (frmO.getCbTipoObra().getSelectedIndex() == 0){
                                obOP = new Pintura();
                                obOP.setCod(frmO.getTxtCodObra().getText());
                                obOP.setNom(frmO.getTxtNomObra().getText());
                                obOP.setPrecio(Long.parseLong(frmO.getTxtPrecioObra().getText()));
                                /*
                                Debido a que toda obra pertenece a un artista, hay una relacion de composicion entre Obra y artista
                                para establecer el artista de la obra primero creamos un objeto vacio de tipo artista, luego escogemos el 
                                nombre artista seleccionado en el combobox de artista con el nombre empezamos a reccorrer la lista de Personas 
                                ubicando solo las que son de tipo Artista (instance of artista) y esta sera ubicada cuando su nombre coincida con
                                el nombre que se tiene en el combobox y cuando sea ubicado el artista de la lista sera copiado y sera
                                pegado en el objeto de tipo artista que habiamos creado vacio.
                                Por ultimo el objeto nuevo, ahora con la informacion del artista seleccionado en el combobox sera añadido a pintura.Artista
                                */
                                Artista ob = new Artista();
                                for (int i = 0; i<obL.getObP().size(); i++){
                                    if (obL.getObP().get(i) instanceof Artista){
                                        if (frmO.getCbArtistaObra().getSelectedItem() == obL.getObP().get(i).getNom()){
                                            ob = (Artista) obL.getObP().get(i);
                                        }
                                    }
                                }
                                obOP.setArtista(ob);
                            }
                        }
                    }
                });

            }
        } catch (PropertyVetoException ex) {
            //Exception creada por setMaximum()
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    /*Se crea funcion que se encarga de crear el formulario para crear artista frmA, se encarga de validar los datos ingresados,
    crear y agregar a la lista los artistas. Esto debido a que se llama siempre que se crea un  artista, pero tambien se puede llamar
    desde el formulario de agregar obra cuando no hay artistas registrados entonces para evitar escribir doblemente el codigo dentro
    del controlador, simplemente se llama la funcion donde se requiere.
    En la funcion se declara que lanza una excepcion correspondiente a la funcion de maximizar el formulario, esta excepcion en caso de 
    presentarse, sera capturada en el controlador
    */
    
    public void agregarArtista() throws PropertyVetoException {
        frmA = new FrmArt();
        frmP.getEscritorio().add(frmA);
        frmA.setMaximum(true); //Permite iniciar el formulario maximizado dentro del Jdesktop
        frmA.setVisible(true);
        frmA.getBtnAddArt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    /*Se verifica que no haya ningun campo vacio, si lo hay se lanza excepcion desde la clase Artista o Persona
                    Si no hay campos vacios se procede a crear objeto artista
                    */
                    //Se pueden lanzar excepciones de rango o campo vacio
                    obA = new Artista();
                    obA.setId(frmA.getTxtIdArt().getText());
                    obA.setNom(frmA.getTxtNomArt().getText());
                    obA.setDir(frmA.getTxtDirArt().getText());
                    obA.setCiu(frmA.getTxtCiudArt().getText());
                    obA.setTel(frmA.getTxtTelArt().getText());
                    //Se pide confirmacion para crear al artista, en caso afirmativo se agrega a la lista de Persona y se avisa
                    if (JOptionPane.showConfirmDialog(frmP, "Desea agregar? \n" + obA.toString(), "Agregar artista", JOptionPane.YES_NO_OPTION)
                            == JOptionPane.YES_OPTION) {
                        obL.getObP().add(obA);
                        JOptionPane.showMessageDialog(frmP, "Artista agregado satisfactoriamente");
                        //Se pregunta si desean agregar un nuevo artista, en caso afirmativo se limpian los campos del FrmA
                        if (JOptionPane.showConfirmDialog(frmP, "Desea agregar otro artista?", "Agregar nuevo artista", JOptionPane.YES_NO_OPTION)
                                == JOptionPane.YES_OPTION) {
                            frmA.getTxtDirArt().setText("");
                            frmA.getTxtCiudArt().setText("");
                            frmA.getTxtIdArt().setText("");
                            frmA.getTxtNomArt().setText("");
                            frmA.getTxtTelArt().setText("");
                        } //Si no desean registrar mas artistas se cierra el frmA
                        else {
                            frmA.dispose();
                        }
                        
                    } //Si no desea registrar el actual artista se avisa y no se guarda nada 
                    else {
                        JOptionPane.showMessageDialog(frmP, "Registro cancelado");
                    }
                } catch (CampoVacioException cv) {
                    JOptionPane.showMessageDialog(frmP, cv.getMessage(), "Error de campo vacio", 0);
                } catch (RangoValorException rv){
                     JOptionPane.showMessageDialog(frmP, rv.getMessage(), "Error de valor de campo", 0);
                }
                }
        });
        //Si oprimen el boton de cancelar dentro del formulario, este se cierra
        frmA.getBtnCancelArt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmA.dispose();
            }
        });
    }

}
