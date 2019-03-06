/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
// falta constructor parametrico 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.lang.NullPointerException;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * se creo una clase ConexionMysql la cual permite conectar la base de datos con el programa
 * @author Estudiante
 */
public class ConexionMysql {

    private Connection conexion;

    /**
     * consttructor basico que permite instanciar la clase ConexionMysql con valores nulos 
     */
    public ConexionMysql() {
        this.conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String ruta = "jdbc:mysql://localhost/galeria";
            conexion = DriverManager.getConnection(ruta, "root", "");
        }catch (ClassNotFoundException ex) {
            System.out.println("ex.getMessage();");
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, no se ha podido conectar con base de datos", "Error de conexion BD", 0);
            System.exit(0);
        }
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

    
}
