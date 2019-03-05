/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.awt.event.ActionEvent;
import vista.FrmArt;
import vista.FrmCli;
import vista.FrmObra;
import vista.FrmPpal;
import vista.FrmVenta;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JOptionPane;
import modelo.Artista;
import modelo.BaseDeDatos;
import modelo.CampoVacioException;
import modelo.Cliente;
import modelo.ConexionMysql;
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
    private BaseDeDatos obBD;
    private ConexionMysql obCBD;

    public Controlador(FrmPpal frmP, FrmArt frmA, FrmCli frmC, FrmObra FrmO, FrmVenta FrmV, Artista obA, Cliente obC, Escultura obE, Listas obL, ObLapiz obOL, Pintura obOP, BaseDeDatos obBD) {
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
        this.obBD = obBD;
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
        obBD = new BaseDeDatos();
        obCBD = new ConexionMysql();
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
            if (e.getSource() == frmP.getMnuExit()) {
                System.exit(0);
            }
            
            //Si es seleccionado archivo --> salir se termina el programa
             /*Cuando se selecciona nuevo-->artista se crea formulario nuevo, se agregan los actionlistener a los botones y
            Se agregan las acciones a tomar cuando se oprimen los botones, si es de agregar artista se crea el objeto artista*/ 
             else if (e.getSource() == frmP.getMnuArtista()) {
                 obCBD.conectar();
                agregarArtista();
            } /*Cuando se selecciona nuevo-->cliente se crea formulario nuevo, se agregan los actionlistener a los botones y
            Se agregan las acciones a tomar cuando se oprimen los botones, si es de agregar cliente se crea el objeto cliente*/ 
             else if (e.getSource() == frmP.getMnuCliente()) {
                 obCBD.conectar();
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
                        } /*Se verifica que no haya ningun campo vacio, si lo hay se lanza excepcion desde la clase Cliente o Persona
                        Si no hay campos vacios se procede a crear objeto artista
                        //Si todo en el formulario esta correcto se procede con la creacion del cliente
                         */ else {
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
                                    obBD.insertar("cliente", "'" + obC.getId() + "'" + "," + "'" + obC.getNom() + "'"  + "," + "'" 
                                            + obC.getTel() + "'" + "," + obC.getPago());
                                    obL.getObC().add(obC);
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
                obCBD.conectar();
                frmP.setSize(500, 550); //Para que se vea bien el frmO, se reajustara a su valor original al final cada vez que se cierre frmO
                frmO = new FrmObra();
                /*Como se observa el cb de artista solo se llenara a medida que estan los artistas registrados, en tal caso que se
                desee añadir una obra y el artista no este, se podra añadir un artista nuevo y posteriormente su obra.
                Para llenar el combo box se hace un recorrido a la lista de tipo Artista y solo se toman los datos de los objetos 
                registrados solo como Artista y si se encuentra alguno, se toma su nombre y se inserta en el cb
                 */
                for (int i = 0; i < obL.getObA().size(); i++) {
                    frmO.getCbArtistaObra().addItem(obL.getObA().get(i).getNom());
                }
                frmO.getCbArtistaObra().setSelectedIndex(-1); //Deja el combobox en seleccion nula por defecto
                frmP.getEscritorio().add(frmO);
                frmO.setMaximum(true);
                frmO.setVisible(true);
                frmO.getCbOpcVentaObra().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        switch (frmO.getCbOpcVentaObra().getSelectedIndex()) {
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
                        try {
                            frmP.setSize(500, 500);
                            frmO.dispose();
                            agregarArtista();  //Agregar artista puede lanzar excepcion ya que la ventana se maximiza
                        } catch (PropertyVetoException ex) {
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
                        long precio = 0;
                        /*Si hay combobox sin llenar se lanza advertencia y no se deja continuar, en el caso de venta
                        Si la opcion
                         */
                        if (frmO.getCbArtistaObra().getSelectedIndex() == -1) {
                            JOptionPane.showMessageDialog(frmP, "El campo de artista no esta seleccionado");
                        } else if (frmO.getCbOpcVentaObra().getSelectedIndex() == -1) {
                            JOptionPane.showMessageDialog(frmP, "El campo de venta no esta seleccionado");
                        } else if (frmO.getCbTipoObra().getSelectedIndex() == -1) {
                            JOptionPane.showMessageDialog(frmP, "El campo de Tipo obra no esta seleccionado");
                        } else {
                            try {
                                /*
                                Debido a que toda obra pertenece a un artista, hay una relacion de composicion entre Obra y artista
                                para establecer el artista de la obra primero creamos un objeto vacio de tipo artista, luego escogemos el 
                                nombre artista seleccionado en el combobox de artista con el nombre empezamos a reccorrer la lista de Artista 
                                cuando el nombre del artista en la lista coincida con el nombre que se tiene en el combobox sera copiado 
                                y sera pegado en el objeto de tipo artista que habiamos creado vacio.
                                Por ultimo el objeto nuevo, ahora con la informacion del artista seleccionado en el combobox sera añadido a tipoObra.Artista
                                 */
                                Artista ob = new Artista();
                                for (int i = 0; i < obL.getObA().size(); i++) {
                                    if (frmO.getCbArtistaObra().getSelectedItem() == obL.getObA().get(i).getNom()) {
                                        ob = (Artista) obL.getObA().get(i);
                                    }
                                }

                                /*Si el campo opc venta esta seleccionado se establece el valor de la obra
                                Al tratar de manejar excepcion cuando se ingresan caracteres distintos a numero en el precio, esto hace 
                                que el programa se estropee y no lance la excepcion, por tanto si detecteta un valor no permitido
                                    se da la orden de que caputure un numberformatexception y a su vez si este es capturado se
                                    da la orden que se lance la excepcion rango valor con mensaje propio, el valor
                                se establecera como -1 y en la clase de Obra al setectarlo se lanzara la excepcion correspondiente
                                 */
                                if (frmO.getCbOpcVentaObra().getSelectedIndex() == 0) {
                                    try {
                                        precio = Long.parseLong(frmO.getTxtPrecioObra().getText());
                                    } catch (NumberFormatException ne) {
                                        precio = -1;
                                    }
                                }

                                /*
                                Se crea variable boolean res que sirve como testigo para saber si la obra fue registrada, en tal caso que
                                haya sido registrada se hace verdadera para que se pueda lanzar la pregunta de registrar nuevamente artista
                                en caso contrario este mensaje no se lanza
                                 */
                                boolean res = true;
                                //Se toma la seleccion de tipo de obra del formulario: 0--> pintura, 1-->Escultura, 2-->dibujo a lapiz
                                switch (frmO.getCbTipoObra().getSelectedIndex()) {
                                    case 0:
                                        obOP = new Pintura();
                                        obOP.setCod(frmO.getTxtCodObra().getText());
                                        obOP.setNom(frmO.getTxtNomObra().getText());
                                        obOP.setArtista(ob);
                                        if (precio != 1) {
                                            obOP.setPrecio(precio);
                                            //Se pide confirmacion para crear la pintura, en caso afirmativo se agrega a la lista de Obras y se avisa
                                            if (JOptionPane.showConfirmDialog(frmP, "Desea agregar pintura? \n" + obOP.toString(), "Agregar Pintura", JOptionPane.YES_NO_OPTION)
                                                    == JOptionPane.YES_OPTION) {
                                                obL.getObO().add(obOP);
                                                JOptionPane.showMessageDialog(frmP, "Obra agregada satisfactoriamente");
                                                res = true;
                                            } else {
                                                JOptionPane.showMessageDialog(frmP, "Registro cancelado");
                                                res = false;
                                            }
                                        }
                                        break;

                                    case 1:
                                        obE = new Escultura();
                                        obE.setCod(frmO.getTxtCodObra().getText());
                                        obE.setNom(frmO.getTxtNomObra().getText());
                                        obE.setArtista(ob);
                                        if (precio != 1) {
                                            obE.setPrecio(precio);
                                            //Se pide confirmacion para crear la pintura, en caso afirmativo se agrega a la lista de Obras y se avisa
                                            if (JOptionPane.showConfirmDialog(frmP, "Desea agregar escultura? \n" + obE.toString(), "Agregar escultura", JOptionPane.YES_NO_OPTION)
                                                    == JOptionPane.YES_OPTION) {
                                                obL.getObO().add(obE);
                                                JOptionPane.showMessageDialog(frmP, "Obra agregada satisfactoriamente");
                                                res = true;

                                            } else {
                                                JOptionPane.showMessageDialog(frmP, "Registro cancelado");
                                                res = false;
                                            }
                                        }
                                        break;

                                    case 2:
                                        obOL = new ObLapiz();
                                        obOL.setCod(frmO.getTxtCodObra().getText());
                                        obOL.setNom(frmO.getTxtNomObra().getText());
                                        obOL.setArtista(ob);
                                        if (precio != 1) {
                                            obOL.setPrecio(precio);
                                            //Se pide confirmacion para crear la pintura, en caso afirmativo se agrega a la lista de Obras y se avisa
                                            if (JOptionPane.showConfirmDialog(frmP, "Desea agregar obra a lapiz? \n" + obOL.toString(), "Agregar obra a lapiz", JOptionPane.YES_NO_OPTION)
                                                    == JOptionPane.YES_OPTION) {
                                                obL.getObO().add(obOL);
                                                JOptionPane.showMessageDialog(frmP, "Obra agregada satisfactoriamente");
                                                res = true;

                                            } else {
                                                JOptionPane.showMessageDialog(frmP, "Registro cancelado");
                                                res = false;
                                            }
                                        }
                                        break;
                                }
                                if (res) {
                                    //Se pregunta si desean agregar una nueva obra, en caso afirmativo se limpian los campos del FrmO
                                    if (JOptionPane.showConfirmDialog(frmP, "Desea agregar otra obra?", "Agregar nueva obra", JOptionPane.YES_NO_OPTION)
                                            == JOptionPane.YES_OPTION) {
                                        frmO.getTxtCodObra().setText("");
                                        frmO.getTxtNomObra().setText("");
                                        frmO.getTxtPrecioObra().setText("");
                                        frmO.getCbArtistaObra().setSelectedIndex(-1);
                                        frmO.getCbOpcVentaObra().setSelectedIndex(-1);
                                        frmO.getCbTipoObra().setSelectedIndex(-1);
                                    } //Si no desean registrar mas obras se cierra el frmO
                                    else {
                                        frmO.dispose();
                                    }
                                }
                            } catch (CampoVacioException cv) {
                                JOptionPane.showMessageDialog(frmP, cv.getMessage(), "Error de campo vacio", 0);
                            } catch (RangoValorException rv) {
                                //Exception creada por setMaximum() para el frmO
                                JOptionPane.showMessageDialog(frmP, rv.getMessage(), "Error de valor de campo", 0);
                            }
                        }
                    }
                });
            } else if (e.getSource() == frmP.getMnuVenta()) {
                obCBD.conectar();
                frmV = new FrmVenta();
                frmP.getEscritorio().add(frmV);
                frmV.setMaximum(true);
                frmV.setVisible(true);
                //Agregar clientes al cb de cliente
                for (int i = 0; i < obL.getObC().size(); i++) {
                    if (obL.getObC().get(i).getPago() == 5000) {
                        frmV.getCbCliVenta().addItem(obL.getObC().get(i).getNom());
                    }
                    frmV.getCbCliVenta().setSelectedItem(null);
                }
                //para poder saber cual cliente fue seleccionado
                frmV.getCbCliVenta().addActionListener(this);

                frmV.getCbTipoVenta().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        /*
                        El formulario de venta va a pedir que el usuario seleccione el tipo de obra que se va a vender, cuando alguna
                        opcion ya sea pintura, escultura o dib a lapiz es seleccionada, esta desicion se toma con el switch del combobox
                        Primeramente con cualquier opcion se deja el cb en blanco y luego, se recorre la lista de obras verificando que
                        corresponda al tipo de objeto seleccionado como tipo de obra a vender y seguido del precio de esta sea diferente
                        de cero, porque si el valor es cero, significa que la obra no se puede vender
                         */
                        switch (frmV.getCbTipoVenta().getSelectedIndex()) {
                            case 0:
                                frmV.getCbNombreVenta().removeAllItems(); // Si no se borran los items se van agrupando a medida que se cambia de tipo de obra
                                for (int i = 0; i < obL.getObO().size(); i++) {
                                    if (obL.getObO().get(i) instanceof Pintura && obL.getObO().get(i).getPrecio() != 0) {
                                        frmV.getCbNombreVenta().addItem(obL.getObO().get(i).getNom());
                                    }
                                }
                                frmV.getCbNombreVenta().setSelectedItem(null);
                                break;

                            case 1:
                                frmV.getCbNombreVenta().removeAllItems(); // Si no se borran los items se van agrupando a medida que se cambia de tipo de obra
                                for (int i = 0; i < obL.getObO().size(); i++) {
                                    if (obL.getObO().get(i) instanceof Escultura && obL.getObO().get(i).getPrecio() != 0) {
                                        frmV.getCbNombreVenta().addItem(obL.getObO().get(i).getNom());
                                    }
                                }
                                frmV.getCbNombreVenta().setSelectedItem(null);
                                break;

                            case 2:
                                frmV.getCbNombreVenta().removeAllItems(); // Si no se borran los items se van agrupando a medida que se cambia de tipo de obra
                                for (int i = 0; i < obL.getObO().size(); i++) {
                                    if (obL.getObO().get(i) instanceof ObLapiz && obL.getObO().get(i).getPrecio() != 0) {
                                        frmV.getCbNombreVenta().addItem(obL.getObO().get(i).getNom());
                                    }
                                }
                                frmV.getCbNombreVenta().setSelectedItem(null);
                                break;
                        }
                    }
                });

                frmV.getCbNombreVenta().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Resetea los campos de valores cada vez que se cambia de tipo de obra y cada vez que se rellena el cb
                        frmV.getTxtPrecioVenta().setText("");
                        frmV.getTxtImpVenta().setText("");
                        frmV.getTxtTotalVenta().setText("");
                        for (int i = 0; i < obL.getObO().size(); i++) {
                            if (frmV.getCbNombreVenta().getSelectedItem() == obL.getObO().get(i).getNom()) {
                                frmV.getTxtPrecioVenta().setText("" + obL.getObO().get(i).getPrecio());
                                frmV.getTxtImpVenta().setText("" + obL.getObO().get(i).impuesto());
                                frmV.getTxtTotalVenta().setText("" + (obL.getObO().get(i).getPrecio() + obL.getObO().get(i).impuesto()));
                            }
                        }
                    }
                });
                frmV.getBtnCancelVenta().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frmV.dispose();
                    }
                });
                frmV.getBtnRegVenta().addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (frmV.getCbCliVenta().getSelectedItem() == null) {
                            JOptionPane.showMessageDialog(frmP, "El campo de cliente no esta seleccionado");
                        } else if (frmV.getCbNombreVenta().getSelectedItem() == null) {
                            JOptionPane.showMessageDialog(frmP, "El campo de nombre de obra no esta seleccionado");
                        } else {
                            if (JOptionPane.showConfirmDialog(frmP, "Registrar venta? \n" + "Tipo de obra: " + frmV.getCbTipoVenta().getSelectedItem()
                                    + "\n" + "Nombre de obra: " + frmV.getCbNombreVenta().getSelectedItem() + "\n" + "Cliente: " + frmV.getCbCliVenta().getSelectedItem()
                                    + "\n" + "Precio total a pagar: " + frmV.getTxtTotalVenta().getText(), "Registrar Venta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                                switch (frmV.getCbTipoVenta().getSelectedIndex()) {
                                    case 0:
                                        for (int i = 0; i < obL.getObO().size(); i++) {
                                            if (obL.getObO().get(i) instanceof Pintura && obL.getObO().get(i).getNom() == frmV.getCbNombreVenta().getSelectedItem()) {
                                                obL.getObO().remove(i);
                                            }
                                        }
                                        break;
                                    case 1:
                                        for (int i = 0; i < obL.getObO().size(); i++) {
                                            if (obL.getObO().get(i) instanceof Escultura && obL.getObO().get(i).getNom() == frmV.getCbNombreVenta().getSelectedItem()) {
                                                obL.getObO().remove(i);
                                            }
                                        }
                                        break;

                                    case 2:
                                        for (int i = 0; i < obL.getObO().size(); i++) {
                                            if (obL.getObO().get(i) instanceof ObLapiz && obL.getObO().get(i).getNom() == frmV.getCbNombreVenta().getSelectedItem()) {
                                                obL.getObO().remove(i);
                                            }
                                        }
                                        break;
                                }

                                JOptionPane.showMessageDialog(frmP, "Venta registrada satisfactoriamente");
                                frmV.dispose();
                            }
                            else{
                                 JOptionPane.showMessageDialog(frmP, "Venta cancelada");
                            }
                        }
                    }
                }
                );
            } ///BORRARR//
            else if (e.getSource() == frmP.getMnuReporte()) {
                String datos = "Registros clientes: ";
                for (int i = 0; i < obL.getObC().size(); i++) {
                    datos += obL.getObC().get(i).getNom() + "pago: " + obL.getObC().get(i).getPago() + "\n";
                }
                datos += "\n\n\n";

                datos += "Registros artistas: ";
                for (int i = 0; i < obL.getObA().size(); i++) {
                    datos += obL.getObA().get(i).getNom() + "\n";
                }
                datos += "\n\n\n";

                datos += "Registros Obras: ";
                for (int i = 0; i < obL.getObO().size(); i++) {
                    datos += obL.getObO().get(i).getNom() + "\n";
                }
                datos += "\n\n\n";

                System.out.println(datos);
            }

        } catch (PropertyVetoException ex) {
            //Exception creada por setMaximum() para el frmP
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException ne ){
            JOptionPane.showMessageDialog(frmP, "Conexion con base de datos fallida", "Error de conexion", 0);
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
                    //Se pide confirmacion para crear al artista, en caso afirmativo se agrega a la lista de Artista y se avisa
                    if (JOptionPane.showConfirmDialog(frmP, "Desea agregar? \n" + obA.toString(), "Agregar artista", JOptionPane.YES_NO_OPTION)
                            == JOptionPane.YES_OPTION) {
                        obL.getObA().add(obA);
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
                } catch (RangoValorException rv) {
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
