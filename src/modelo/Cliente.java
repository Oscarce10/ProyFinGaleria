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

    public Cliente(String id, String nom, String tel) {
        super (id, nom, tel);
    }

    public Cliente() {
        super ();
    }

    @Override
    public String toString() {
        return "Cliente\n" + super.toString() +"\n";
    }
    

    
}
