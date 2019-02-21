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
public class Controlador implements ActionListener{
        
    private FrmPpal frmP;
    private FrmArt frmA;
    private FrmCli frmC;
    private FrmObra FrmO;
    private FrmVenta FrmV;
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
        this.FrmO = FrmO;
        this.FrmV = FrmV;
        this.obA = obA;
        this.obC = obC;
        this.obE = obE;
        this.obL = obL;
        this.obOL = obOL;
        this.obOP = obOP;
        frmP.getEscritorio().setVisible(true);
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
        this.frmA = new FrmArt();
        this.frmC = new FrmCli();
        this.FrmO = new FrmObra();
        this.FrmV = new FrmVenta();
        this.obL = new Listas();
        frmP.getEscritorio().setVisible(true);
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
    
    public void iniciar(){
        frmP.setVisible(true);
        frmP.setDefaultCloseOperation(frmP.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
    
}
