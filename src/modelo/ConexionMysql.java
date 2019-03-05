/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
 *
 * @author Estudiante
 */
public class ConexionMysql {

    private Connection conexion;
    private String msj;
    private ResultSet resultado;

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

    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String ruta = "jdbc:mysql://localhost/galeria";
            conexion = DriverManager.getConnection(ruta, "root", "");
        }catch (ClassNotFoundException ex) {
            System.out.println("ex.getMessage();");
           
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ejecuta(String Sql){
        try {
            System.out.println("aca creo que explotya");
            conexion.createStatement().executeUpdate(Sql);
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("ejecuta");
            System.out.println(ex.getMessage());
        }
    }

    public ResultSet consuta(String Consulta) {
        resultado = null;
        try {
            resultado = conexion.createStatement().executeQuery(Consulta);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resultado;
    }

}
