/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * se creo una clase Pintura la cual hereda atributos de la clase Obra  
 * @author Oscar
 */
public class Pintura extends Obra{
    
    /**
     * constructor parametrico que permite instanciar la clase Pintura apartir de los datos recibidos
     * @param cod codigo
     * @param nom nombre
     * @param precio precio
     * @param artista objetio tipo Artista
     */
    public Pintura(String cod, String nom, long precio, Artista artista) {
        super(cod, nom, precio, artista);
    }

    /**
     * constructor basico que permite instanciar la clase Pintura con valores predeterminados 
     */
    public Pintura() {
        super ();
    }
    
    @Override
    public long impuesto() {
        return (long) (this.precio * 0.045 );
    }
    
}
