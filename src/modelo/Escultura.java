/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Oscar
 */
public class Escultura extends Obra{

    public Escultura(String cod, String nom, long precio, Artista artista, int venta) {
        super(cod, nom, precio, artista, venta);
    }

    public Escultura() {
        super();
    }

    @Override
    public long impuesto() {
        return (long)(this.precio * 0.05);
    }
    
}
