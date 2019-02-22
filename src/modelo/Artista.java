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

    public Artista(String dir, String ciu, String id, String nom, String tel){
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
    /*CampoVacioException() --> Verifica que no hayan campos sin llenar
      RangoValorException() --> Verifica que no hayan caracteres especiales o numeros (0), o que solo existan numeros y sin espacios(2)
    En todos se envia el nombre del campo para que la excepcion indique donde esta el error
    */
    public void setDir(String dir) throws CampoVacioException, RangoValorException{
        if (dir.length()==0){
            throw new CampoVacioException("Direccion");
        }
        //En el campo direccion pueden aplicar numeros y caracteres especiales
        this.dir = dir;
    }

    public String getCiu() {
        return ciu;
    }

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
