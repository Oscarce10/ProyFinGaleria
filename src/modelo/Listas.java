/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class Listas {
    
    private ArrayList <Persona> ObP ;
    private ArrayList <Obra> ObO ;

    public Listas(ArrayList<Persona> ObP, ArrayList<Obra> ObO) {
        this.ObP = ObP;
        this.ObO = ObO;
    }

    public Listas() {
        this.ObP = new ArrayList<Persona>();
        this.ObO = new ArrayList<Obra>();
    }

    public ArrayList<Persona> getObP() {
        return ObP;
    }

    public void setObP(ArrayList<Persona> ObP) {
        this.ObP = ObP;
    }

    public ArrayList<Obra> getObO() {
        return ObO;
    }

    public void setObO(ArrayList<Obra> ObO) {
        this.ObO = ObO;
    }
      
}
