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

    /**
     * costructor parametrico que permite instarciar variables con tados definidos
     * @param dir direccion 
     * @param ciu ciudad
     * @param id identificacion 
     * @param nom nombre
     * @param tel telefono
     */
    public Artista(String dir, String ciu, String id, String nom, String tel){
            super(id, nom, tel);
            this.dir = dir;
            this.ciu = ciu;
    }

    /**
     * constructor basico que permite instanciar las variables en nulo
     */
    public Artista() {
        super ();
        this.dir = "";
        this.ciu = "";
    }

    /**
     * retrorna la direccion del artista
     * @return String 
     */
    public String getDir() {
        return dir;
    }
    /*CampoVacioException() --> Verifica que no hayan campos sin llenar
      RangoValorException() --> Verifica que no hayan caracteres especiales o numeros (0), o que solo existan numeros y sin espacios(2)
    En todos se envia el nombre del campo para que la excepcion indique donde esta el error
    */

    /**
     * asigna la variable direccion con una excepcion de CampoVacionException 
     * @param dir direccion 
     * @throws CampoVacioException
     
     */

    public void setDir(String dir) throws CampoVacioException{
        if (dir.length()==0){
            throw new CampoVacioException("Direccion");
        }
        //En el campo direccion pueden aplicar numeros y caracteres especiales
        this.dir = dir;
    }

    /**
     * retorna la ciudad del artista
     * @return String
     */
    public String getCiu() {
        return ciu;
    }

    /**
     * asigna la variable ciudad on una excepcion de CampoVacionException y RangoValorException
     * @param ciu ciudad
     * @throws CampoVacioException
     * @throws RangoValorException
     */
    public void setCiu(String ciu) throws CampoVacioException, RangoValorException{
        if (ciu.length()==0){
            throw new CampoVacioException("Ciudad");
        }
        for (int i = 0; i < ciu.length(); i++) {
                if (ciu.charAt(i) != ' ') {
                    if (ciu.charAt(i) < 65 || ciu.charAt(i) >= 91 && ciu.charAt(i) <= 96 || ciu.charAt(i) > 122 && ciu.charAt(i) != 'ñ') {
                        throw new RangoValorException(0, "Ciudad");
                    }
                }
            }
        this.ciu = ciu;
    }

    @Override
    public String toString() {
        return "Artista\n" + super.toString() + "Direccion: " + dir + "\nCiudad: " + ciu + "\n";
    }

    
    
}
