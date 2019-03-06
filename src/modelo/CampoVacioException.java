/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * se crea una clase CampoVacioException la cual hereda funciones de la clase Exception 
 * @author Oscar
 */
public class CampoVacioException extends Exception{
    
    private String campo;

    /**
     * constructor parametrico que permite instanciar la clas eCampoVacioException con valores predeterminados
     * @param campo campo 
     */
    public CampoVacioException(String campo) {
        super();
        this.campo = campo;
    }

    @Override
    public String getMessage() {
           return "El campo " + this.campo +" no puede estar vacio";
        }
         
    }
