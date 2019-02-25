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
    
    private ArrayList <Cliente> ObC ;
    private ArrayList <Artista> ObA ;
    private ArrayList <Obra> ObO ;

    public Listas(ArrayList<Cliente> ObC, ArrayList<Artista> ObA, ArrayList<Obra> ObO) {
        this.ObC = ObC;
        this.ObA = ObA;
        this.ObO = ObO;
    }

    public Listas() {
         this.ObC = new ArrayList<Cliente>();
         this.ObA = new ArrayList<Artista>();
         this.ObO = new ArrayList<Obra>();
    }

    public ArrayList<Cliente> getObC() {
        return ObC;
    }

    public void setObC(ArrayList<Cliente> ObC) {
        this.ObC = ObC;
    }

    public ArrayList<Artista> getObA() {
        return ObA;
    }

    public void setObA(ArrayList<Artista> ObA) {
        this.ObA = ObA;
    }

    public ArrayList<Obra> getObO() {
        return ObO;
    }

    public void setObO(ArrayList<Obra> ObO) {
        this.ObO = ObO;
    }
    
        
      
}
