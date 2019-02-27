/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class ConexionMysql {
    
    private Connection conexion;
    private String msj;

  
    public ConexionMysql() {
        this.conexion = null;
        this.msj = "";
    }


    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }
    
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
