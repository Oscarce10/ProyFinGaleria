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

    public String insertar(String tabla, String columna, String valor) {
        con.conectar();
        String sql = "INSERT INTO " + tabla + " (" + columna + ") values(?);";
        
        PreparedStatement ps = null;
        try {
            ps = (PreparedStatement) con.getConexion().prepareStatement(sql);
            ps.setString(1, valor);
            System.out.println(ps);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        int resul = con.ejecuta(sql);

        if (resul == 1) {
            return "Datos Insertados exitosamente";
        } else {
            return "Fallo en la insersion verifique los datos ";
        }
    }

    public String actualizar(String tabla, String columna, String valor, String condicion, String condicion2) {
        con.conectar();
        int resul = con.ejecuta("UPDATE " + tabla + " SET " + columna + "=" + valor + " WHERE " + condicion + "=" + condicion2 + ";");
        if (resul == 1) {
            return "Valores actualizados";
        } else {
            return "Fallo en la actualizacion de datos, verifique los datos ";
        }
    }

    public String eliminar(String tabla, String columna, String condicion, String condicion2) {
        con.conectar();
        int resul = con.ejecuta("DELETE FROM " + tabla + " WHERE " + condicion + " = " + condicion2 + "'");
        if (resul == 1) {
            return "Consulta realizada exitosamente";
        } else {
            return "Fallo en la consulta verifique los datos ";
        }
    }

    public ResultSet Consultar() {
        ResultSet tabla = con.consuta("SELECT * FROM `autor`");
        return tabla;
    }

}
