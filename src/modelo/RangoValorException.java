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
public class RangoValorException extends Exception {

    private int num;
    private String campo;

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
        }
        return msj + campo;
    }
}
