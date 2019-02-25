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
public abstract class Persona {
    
    protected String id;
    protected String nom;
    protected String tel;

    public Persona(String id, String nom, String tel) {
        this.id = id;
        this.nom = nom;
        this.tel = tel;
    }

    public Persona() {
        this.id = "";
        this.nom = "";
        this.tel = "";
    }

    public String getId() {
        return id;
    }
    
    /*CampoVacioException() --> Verifica que no hayan campos sin llenar
      RangoValorException() --> Verifica que no hayan caracteres especiales o numeros (0), o que solo existan numeros y sin espacios(2)
      En todos se envia el nombre del campo para que la excepcion indique donde esta el error
     */

    public void setId(String id) throws CampoVacioException, RangoValorException{
        if (id.length()==0){
            throw new CampoVacioException("Identificacion");
        }
        for (int i = 0; i < id.length(); i++) {
                if (id.charAt(i) == ' ' || id.charAt(i) <48 ||  id.charAt(i)>=58) {
                        throw new RangoValorException(1, "Identificacion");
                    }
                }
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws CampoVacioException, RangoValorException{
        if (nom.length()==0){
            throw new CampoVacioException("Nombre");
        }
        for (int i = 0; i < nom.length(); i++) {
                if (nom.charAt(i) != ' ') {
                    if (nom.charAt(i) < 65 || nom.charAt(i) >= 91 && nom.charAt(i) <= 96 || nom.charAt(i) > 122 && nom.charAt(i) != 'ñ') {
                        throw new RangoValorException(0, "Nombre");
                    }
                }
            }
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) throws CampoVacioException, RangoValorException{
        if (tel.length()==0){
            throw new CampoVacioException("Telefono");
        }
        for (int i = 0; i < tel.length(); i++) {
                if (tel.charAt(i) == ' ' || tel.charAt(i) <=48 ||  tel.charAt(i)>58) {
                        throw new RangoValorException(1, "Telefono");
                    }
                }
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Identificacion: " + id + "\nNombre: " + nom + "\nTelefono: " + tel + "\n";
    }
      
    
    
}
