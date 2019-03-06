/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * se creo una clase cliente la cual hereda atributos de la clase Persona 
 * @author Oscar
 */
public class Cliente extends Persona{
    
    private int pago;
    
    /**
     * constructor parametrico que permite instanciar la clase Cliente apartir de los datos recibidos 
     * @param id identificacion
     * @param nom nombre
     * @param tel telefono 
     * @param pago pago de la entrada
     */
    public Cliente(String id, String nom, String tel, int pago) {
        super (id, nom, tel);
        this.pago = pago;
    }

    /**
     * constructor basico que permite instanciar la clase cliente con valores nulos 
     */
    public Cliente() {
        super ();
        pago = 0;
    }

    /**
     * retorna el pago 
     * @return int 
     */
    public int getPago() {
        return pago;
    }

    /**
     * le asigna a la variable pago un valor  
     * @param pago pago 
     */
    public void setPago(int pago) {
        this.pago = pago;
    }
    
    

    @Override
    public String toString() {
        return "Cliente\n" + super.toString() + "Valor entrada: "+ pago + "\n";
    }
    

    
}
