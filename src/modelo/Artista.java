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
public class Artista extends Persona{
    
    private String dir;
    private String ciu;

    public Artista(String dir, String ciu, String id, String nom, String tel) {
        super(id, nom, tel);
        this.dir = dir;
        this.ciu = ciu;
    }

    public Artista() {
        super ();
        this.dir = "";
        this.ciu = "";
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getCiu() {
        return ciu;
    }

    public void setCiu(String ciu) {
        this.ciu = ciu;
    }

    @Override
    public String toString() {
        return "Artista\n" + super.toString() + "Direccion: " + dir + "\nCiudad: " + ciu + "\n";
    }

    
    
}
