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
public class Cliente extends Persona{
    
    private int pago;
    
    public Cliente(String id, String nom, String tel, int pago) {
        super (id, nom, tel);
        this.pago = pago;
    }

    public Cliente() {
        super ();
        pago = 0;
    }

    @Override
    public String toString() {
        return "Cliente\n" + super.toString() + "Valor entrada: "+ pago + "\n";
    }
    

    
}
