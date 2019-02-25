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
public class Pintura extends Obra{
    
    public Pintura(String cod, String nom, long precio, Artista artista) {
        super(cod, nom, precio, artista);
    }

    public Pintura() {
        super ();
    }
    
    @Override
    public long impuesto() {
        return (long) (this.precio * 0.045 );
    }
    
}
