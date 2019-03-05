/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class BaseDeDatos {

    private ConexionMysql con;

    public BaseDeDatos() {
        this.con = new ConexionMysql();
    }

    public void insertar(String tabla, String valor) {
        System.out.println(valor);
        String sql = "INSERT INTO " + tabla + " values(" + valor + ");";
        System.out.println(sql);
        con.ejecuta(sql);
    }

public void eliminar(String tabla, String columna, String condicion, String condicion2) {
    con.ejecuta("DELETE FROM " + tabla + " WHERE " + condicion + " = " + condicion2 + "'");
    }

    public ResultSet Consultar() {
        ResultSet tabla = con.consuta("SELECT * FROM `autor`");
        return tabla;
    }

}
