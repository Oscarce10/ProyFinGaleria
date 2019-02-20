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
    
    private static double impP;

    public Pintura(String cod, String nom, long precio, Artista artista, int venta) {
        super(cod, nom, precio, artista, venta);
        this.impP = 0.045;
    }

    public Pintura() {
        super ();
        this.impP = 0.045;
    }

    @Override
    public long impuesto() {
        return (long) (super.impuesto() * impP);
    }
    
}
