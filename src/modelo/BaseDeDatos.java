/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class BaseDeDatos {

    private ConexionMysql con;
    private Statement sentencia;
    private ResultSet resultado;

    public BaseDeDatos() {
        this.con = new ConexionMysql();
        sentencia = null;
        resultado = null;
    }

    public void insertar(String tabla, String valor) throws SQLException {
        String sql = "INSERT INTO " + tabla + " values(" + valor + ");";
        sentencia = con.getConexion().createStatement();
        System.out.println(sql);
        sentencia.executeUpdate(sql);
    }

    public ResultSet consultar(String columnas, String tablas, String where) throws SQLException {
        String sql = "SELECT "+columnas+" FROM "+tablas+where+";";
        sentencia = con.getConexion().createStatement();
        System.out.println(sql);
        
        resultado = sentencia.executeQuery(sql);
        return resultado;
    }
    
    public void eliminar(String tablas, String where) throws SQLException{
        String sql = "DELETE FROM "+tablas+where+";";
        sentencia = con.getConexion().createStatement();
        System.out.println(sql);
        sentencia.executeUpdate(sql);
    }

}
