/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
  
/**
 * se creo una clase abstracta obra  la cual le hereda atrivutos y funciones a las clases ObLapiz, Escultura y Pintura
 * @author Oscar
 */
public abstract class Obra {
    
    /**
     * se crea una variable tipo string la cual va a ser heredada por otras clases (Escultura, ObLapiz, Pintura)
     */
    protected String cod;

    /**
     * se crea una variable tipo string la cual va a ser heredada por otras clases (Escultura, ObLapiz, Pintura)
     */
    protected String nom;

    /**
     * se crea una variable tipo long la cual va a ser heredada por otras clases (Escultura, ObLapiz, Pintura)
     */
    protected long precio;
    private Artista artista;

    /**
     * constructor parametrico que permite instanciar la clase abstracta obra a aprtir de los varoles recibidos 
     * @param cod codigo 
     * @param nom nombre
     * @param precio precio
     * @param artista objeto tipo artista
     */
    public Obra(String cod, String nom, long precio, Artista artista) {
        this.cod = cod;
        this.nom = nom;
        this.precio = precio;
        this.artista = artista;
    }

    /**
     * constructor basico que permite instanciar la clase abstrata obra con valores predeterminados 
     */
    public Obra() {
        this.cod = "";
        this.nom = "";
        this.precio = 0;
        this.artista = new Artista();
    }

    /**
     * retorna el codigo 
     * @return String
     */
    public String getCod() {
        return cod;
    }

    /**
     * le asigna a la variable cod un valor con una Excepcion CampoVacioException
     * @param cod codigo 
     * @throws CampoVacioException
     */
    public void setCod(String cod) throws CampoVacioException{
        if (cod.length() == 0){
            throw new CampoVacioException("Codigo");
        }
        this.cod = cod;
    }

    /**
     * retorna el nombre
     * @return string
     */
    public String getNom() {
        return nom;
    }

    /**
     *le asigna a la variable nom valores con una Excepcion CampoVacioException
     * @param nom nombre
     * @throws CampoVacioException
     */
    public void setNom(String nom) throws CampoVacioException {
        if (nom.length() == 0){
            throw new CampoVacioException("Nombre");
        }
        this.nom = nom;
    }
    
    //Si el precio de la obra es 0 es porque no esta a la venta

    /**
     * retorna el  precio
     * @return long
     */
    public long getPrecio() {    
        return precio;
    }

    /**
     * le asigna a precio un valor con una Excepcion RangoValorException
     * @param precio precio
     * @throws RangoValorException
     */
    public void setPrecio(long precio) throws RangoValorException{
        if(precio == -1){
            throw new RangoValorException(2, "Precio");
        }
        this.precio = precio;
    }

    /**
     * retorna un objeto de tipo artista
     * @return Artista
     */
    public Artista getArtista() {
        return artista;
    }

    /**
     * le asigna a la el obejeto Artista unos valores 
     * @param artista Artista
     */
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
    
    /**
     * funcion abstracta que retorna un valor de tipo long 
     * @return long
     */
    public abstract long impuesto();
    
}
