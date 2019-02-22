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
public class CampoVacioException extends Exception{
    
    private String campo;

    public CampoVacioException(String campo) {
        super();
        this.campo = campo;
    }

    @Override
    public String getMessage() {
           return "El campo " + this.campo +" no puede estar vacio";
        }
         
    }
