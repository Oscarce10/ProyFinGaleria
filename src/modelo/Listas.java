/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 * se creo una clase Lista la cual  
 * @author Oscar
 */
public class Listas {
    
    private ArrayList <Cliente> ObC ;
    private ArrayList <Artista> ObA ;
    private ArrayList <Obra> ObO ;

    /**
     * constructor parametrico que permite instanciar la clase Listas apartir de los datos recibidos 
     * @param ObC objeto ArrayList de Cliente
     * @param ObA objeto ArrayList de Artista
     * @param ObO objeto Arraylist de Obra 
     */
    public Listas(ArrayList<Cliente> ObC, ArrayList<Artista> ObA, ArrayList<Obra> ObO) {
        this.ObC = ObC;
        this.ObA = ObA;
        this.ObO = ObO;
    }

    /**
     * constructor basico que permite instanciar la clase Listas con valores predeterminados 
     */
    public Listas() {
         this.ObC = new ArrayList<Cliente>();
         this.ObA = new ArrayList<Artista>();
         this.ObO = new ArrayList<Obra>();
    }

    /**
     * retorna un ArrayList de tipo cliente 
     * @return ArrayList
     */
    public ArrayList<Cliente> getObC() {
        return ObC;
    }

    /**
     * le asigna valores al Arraylist de tipo Cliente
     * @param ObC objeto ArrayList de Cliente
     */
    public void setObC(ArrayList<Cliente> ObC) {
        this.ObC = ObC;
    }

    /**
     * retorna un ArrayList de tipo Artista
     * @return ArrayList
     */
    public ArrayList<Artista> getObA() {
        return ObA;
    }

    /**
     * le asigna valores al Arraylist de tipo Artista
     * @param ObA objeto ArrayList de Artista
     */
    public void setObA(ArrayList<Artista> ObA) {
        this.ObA = ObA;
    }

    /**
     * retorna un ArrayList de tipo Artista
     * @return ArrayList
     */
    public ArrayList<Obra> getObO() {
        return ObO;
    }

    /**
     * le asigna valores al ArrayList de tipo Obra
     * @param ObO  objeto Arraylist de Obra 
     */
    public void setObO(ArrayList<Obra> ObO) {
        this.ObO = ObO;
    }
    
        
      
}
