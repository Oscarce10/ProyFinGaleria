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
import modelo.Cliente;
import modelo.Escultura;
import modelo.Listas;
import modelo.ObLapiz;
import modelo.Pintura;

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
            if(e.getSource() == frmP.getMnuExit()){
                System.exit(0);
            }
            /*Cuando se selecciona nuevo-->artista se crea formulario nuevo, se agregan los actionlistener a los botones y
            Se agregan las acciones a tomar cuando se oprimen los botones, si es de agregar artista se crea el objeto artista*/
            else if (e.getSource() == frmP.getMnuArtista()) {
                frmA = new FrmArt();
                frmP.getEscritorio().add(frmA);
                frmA.setMaximum(true); //Permite iniciar el formulario maximizado dentro del Jdesktop
                frmA.setVisible(true);
                frmA.getBtnAddArt().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Se verifica que no haya ningun campo vacio, si lo hay se lanza advertencia
                        if (frmA.getTxtDirArt().getText().isEmpty() || frmA.getTxtCiudArt().getText().isEmpty() || 
                                frmA.getTxtIdArt().getText().isEmpty() || frmA.getTxtNomArt().getText().isEmpty() ||
                                frmA.getTxtTelArt().getText().isEmpty()) {
                            JOptionPane.showMessageDialog(frmP, "Error, hay campos vacios");
                        } else {
                            //Si no hay campos vacios se procede a crear objeto artista
                            obA = new Artista(frmA.getTxtDirArt().getText(), frmA.getTxtCiudArt().getText(),
                                    frmA.getTxtIdArt().getText(), frmA.getTxtNomArt().getText(), frmA.getTxtTelArt().getText());
                            //Se pide confirmacion para crear al artista, en caso afirmativo se agrega a la lista de Persona y se avisa
                            if (JOptionPane.showConfirmDialog(frmP, "Desea agregar? \n" + obA.toString() , "Agregar artista", JOptionPane.YES_NO_OPTION)
                                    == JOptionPane.YES_OPTION) {
                                obL.getObP().add(obA);
                                JOptionPane.showMessageDialog(frmP, "Artista agregado satisfactoriamente");
                                //Se pregunta si desean agregar un nuevo artista, en caso afirmativo se limpian los campos del FrmA
                                if(JOptionPane.showConfirmDialog(frmP, "Desea agregar otro artista?", "Agregar nuevo artista", JOptionPane.YES_NO_OPTION) ==
                                        JOptionPane.YES_OPTION){
                                    frmA.getTxtDirArt().setText("");
                                    frmA.getTxtCiudArt().setText("");
                                    frmA.getTxtIdArt().setText("");
                                    frmA.getTxtNomArt().setText("");
                                    frmA.getTxtTelArt().setText("");
                                }
                                //Si no desean registrar mas artistas se cierra el frmA
                                else{
                                    frmA.dispose();
                                }

                            }
                            //Si no desea registrar el actual artista se avisa y no se guarda nada 
                            else {
                                JOptionPane.showMessageDialog(frmP, "Registro cancelado");
                            }
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
            /*Cuando se selecciona nuevo-->cliente se crea formulario nuevo, se agregan los actionlistener a los botones y
            Se agregan las acciones a tomar cuando se oprimen los botones, si es de agregar cliente se crea el objeto cliente*/
            else if (e.getSource() == frmP.getMnuCliente()){
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
                                switch (frmC.getCbCliente().getSelectedIndex()){
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
                        if(frmC.getCbCliente().getSelectedIndex() == -1){
                            JOptionPane.showMessageDialog(frmP, "No se ha seleccionado la edad del cliente");
                        }
                        else if(frmC.getTxtIdCliente().getText().isEmpty() || frmC.getTxtNomCliente().getText().isEmpty() ||
                                frmC.getTxtTelCliente().getText().isEmpty()){
                            JOptionPane.showMessageDialog(frmP, "Error, hay campos vacios");
                        }
                        else{
                            int c = Integer.parseInt(frmC.getTxtPagoCliente().getText());
                            //Si todo en el formulario esta correcto se procede con la creacion del cliente
                            obC = new Cliente(frmC.getTxtIdCliente().getText(), frmC.getTxtNomCliente().getText(), 
                                    frmC.getTxtTelCliente().getText(), Integer.parseInt(frmC.getTxtPagoCliente().getText()));
                            //Se pide confirmacion para crear al cliente, en caso afirmativo se agrega a la lista de Persona y se avisa
                            if (JOptionPane.showConfirmDialog(frmP, "Desea agregar? \n" + obC.toString() , "Agregar cliente", JOptionPane.YES_NO_OPTION)
                                    == JOptionPane.YES_OPTION) {
                                obL.getObP().add(obC);
                                JOptionPane.showMessageDialog(frmP, "Cliente agregado satisfactoriamente");
                                //Se pregunta si desean agregar un nuevo cliente, en caso afirmativo se limpian los campos del FrmC
                                if(JOptionPane.showConfirmDialog(frmP, "Desea agregar otro cliente?", "Agregar nuevo cliente", JOptionPane.YES_NO_OPTION) ==
                                        JOptionPane.YES_OPTION){
                                    frmC.getCbCliente().setSelectedIndex(-1);
                                    frmC.getTxtIdCliente().setText("");
                                    frmC.getTxtNomCliente().setText("");
                                    frmC.getTxtTelCliente().setText("");
                                    frmC.getTxtPagoCliente().setText("");
                                }
                                //Si no desean registrar mas clientes se cierra el frmC
                                else{
                                    frmC.dispose();
                                }

                            }
                            //Si no desea registrar el actual cliente se avisa y no se guarda nada 
                            else {
                                JOptionPane.showMessageDialog(frmP, "Registro cancelado");
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
            }
            else if(e.getSource() == frmP.getMnuObra()){
                frmP.setSize(500, 550); //Para que se vea bien el frmO, se reajustara a su valor original al final
                frmO = new FrmObra();
                /*Como se observa el cb de artista solo se llenara a medida que estan los artistas registrados, en tal caso que se
                desee añadir una obra y el artista no este, se podra añadir un artista nuevo y posteriormente su obra.
                Para llenar el combo box se hace un recorrido a la lista de tipo Persona desde 0 hasta el valor menor a su tamaño y solo se
                toman los datos de los objetos registrados solo como Artista (instance of Artista) y si se encuentra alguno, se toma su nombre
                y se inserta en el cb
                */
                for(int i=0; i<obL.getObP().size(); i++){
                    if(obL.getObP().get(i) instanceof Artista){
                        frmO.getCbArtistaObra().addItem(obL.getObP().get(i).getNom());
                    }
                }
                frmO.getCbArtistaObra().setSelectedIndex(-1); //Deja el combobox en blanco por defecto
                frmP.getEscritorio().add(frmO);
                frmO.setMaximum(true);
                frmO.setVisible(true);
                frmO.getBtnCancelObra().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frmO.dispose();
                    }
                });
                
            }
        } catch (PropertyVetoException ex) {
            //Exception creada por setMaximum()
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
