/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
// falta constructor parametrico 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * se creo una clase ConexionMysql la cual permite conectar la base de datos con el programa
 * @author Estudiante
 */
public class ConexionMysql {
    
    private Connection conexion;
    private String msj;

    /**
     * consttructor basico que permite instanciar la clase ConexionMysql con valores nulos 
     */
    public ConexionMysql() {
        this.conexion = null;
        this.msj = "";
    }

    /**
     * retorna la conexion 
     * @return Connection 
     */
    public Connection getConexion() {
        return conexion;
    }

    /**
     * le asigna a la variable conexion un valor 
     * @param conexion conexion 
     */
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    /**
     * retorna el valor de msj 
     * @return String 
     */
    public String getMsj() {
        return msj;
    }

    /**
     * le asigna a msj un valor 
     * @param msj msj 
     */
    public void setMsj(String msj) {
        this.msj = msj;
    }
    
    /**
     *  proceso el cual nos permite asignarle enlazar al direccion del puerto en donde se encuentra la base de datos 
     * con el programa Java 
     */
    public void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String ruta = "jdbc:mysql://localhost";
            conexion = DriverManager.getConnection(ruta,"root","");
        } catch (ClassNotFoundException | SQLException ex) {
            msj= "Conexion con base de datos fallida";
        }
    }
    
}
