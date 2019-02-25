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
public abstract class Obra {
    
    protected String cod;
    protected String nom;
    protected long precio;
    private Artista artista;

    public Obra(String cod, String nom, long precio, Artista artista) {
        this.cod = cod;
        this.nom = nom;
        this.precio = precio;
        this.artista = artista;
    }

    public Obra() {
        this.cod = "";
        this.nom = "";
        this.precio = 0;
        this.artista = new Artista();
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) throws CampoVacioException{
        if (cod.length() == 0){
            throw new CampoVacioException("Codigo");
        }
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws CampoVacioException {
        if (nom.length() == 0){
            throw new CampoVacioException("Nombre");
        }
        this.nom = nom;
    }
    
    //Si el precio de la obra es 0 es porque no esta a la venta
    public long getPrecio() {    
        return precio;
    }

    public void setPrecio(long precio) throws RangoValorException{
        if(precio == -1){
            throw new RangoValorException(2, "Precio");
        }
        this.precio = precio;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        if(precio != 0){
        return "Codigo: " + cod + "\nNombre: " + nom + "\nPrecio: " + precio + "\n\n\nDatos de " + artista.toString() + "\n";
        }
        else  return "Codigo: " + cod + "\nNombre: " + nom + "\nPrecio: " + "No esta a la venta" + "\n\n\nDatos de " + artista.toString() + "\n";
    }
    
    public abstract long impuesto();
    
}
