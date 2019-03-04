/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
 // falta constructor basico 
/**
 * se crea una clase RangoValorException la cual hereda funciones de la clase Exception 
 * @author Oscar
 */
public class RangoValorException extends Exception {

    private int num;
    private String campo;

    /**
     * constructor parametrico que permite instanciar la clase RangoValorException apartir de los datos recibidos 
     * @param num numero 
     * @param campo campo 
     */
    public RangoValorException(int num, String campo) {
        this.num = num;
        this.campo = campo;
    }

    @Override
    public String getMessage() {
        String msj = "";
        switch (num) {
            case 0:
                msj = "Se han introducido caracteres especiales o numeros en el campo ";
                break;
            case 1:
                msj = "Solo se permiten caracteres numericos y sin espacios en el campo ";
                break;
                
            case 2:
                msj = "Solo se permiten valores numericos en el campo ";
        }
        return msj + campo;
    }
}
