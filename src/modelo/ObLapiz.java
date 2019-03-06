/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * se creo una clase ObLapiz la cual hereda atributos y funciones de la clase Obra 
 * @author Oscar
 */
public class ObLapiz extends Obra{

    /**
     * constructor parametrico que permite instanciar la clase ObLapiz apartir de los datos recibidos 
     * @param cod codigo 
     * @param nom  nombre 
     * @param precio precio 
     * @param artista objeto tipo Artista
     */
    public ObLapiz(String cod, String nom, long precio, Artista artista) {
        super(cod, nom, precio, artista);
    }

    /**
     * constructor basico que permite instanciar la clase ObLapiz
     */
    public ObLapiz() {
        super();
    }

    /**
     *  funcion que retorna un dato de tipo long el cual es el impuesto de la ObLapiz, funcion herededa de Obra
     * @return long 
     */
    @Override
    public long impuesto() {
        return (long) (this.precio * 0.02);
    }
    
    
    
}
