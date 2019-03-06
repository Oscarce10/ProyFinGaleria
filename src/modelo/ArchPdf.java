/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
//archivos
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
//librerias ajenas a itext
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import sun.tools.jar.Main;
import sun.util.calendar.BaseCalendar;

/**
 * @web http://jc-mouse.blogspot.com/
 * @author Mouse
 */
public class ArchPdf {

    private String ruta_destino;

    public ArchPdf() {
        ruta_destino = "";
    }

    /* metodo que hace uso de la clase itext para manipular archivos PDF*/
    public void crear_Factura(ResultSet txt, int numFac) throws SQLException {
        try {
            ruta_destino = "src/facturas/";
            // se crea instancia del documento
            Document mipdf = new Document();
            // se establece una instancia a un documento pdf
            PdfWriter.getInstance(mipdf, new FileOutputStream(this.ruta_destino + "Factura " + numFac + ".pdf"));
            mipdf.open();// se abre el documento
            mipdf.addTitle("Factura de venta"); // se añade el titulo
            /*mipdf.addAuthor(a); // se añade el autor del documento
                mipdf.addSubject(s); //se añade el asunto del documento
                mipdf.addKeywords(k); //Se agregan palabras claves*/
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            mipdf.add(new Paragraph("\t\tGALERIA DE ARTE ARTBOG" + "\n" + "FACTURA DE VENTA No. " + numFac + "\n" + "Bogota, " + dtf.format(now)));
            mipdf.add(new Paragraph("Codigo: " + txt.getString(1) + "\n"
                    + "Nombre: " + txt.getString(2) + "\n" + "Tipo: " + txt.getString(3) + "\n"
                    + "Artista: " + txt.getString(4) + "\n" + "Subtotal: " + txt.getLong(5) + "\n"
                    + "IVA: " + txt.getLong(6) + "\n" + "\t" + "---------------------------" + "\n" + "Total a pagar: " + txt.getLong(7)));
            // se añade el contendio del PDF
            mipdf.close(); //se cierra el PDF&

            try {
                Desktop.getDesktop().open(new File(this.ruta_destino + "Factura " + numFac + ".pdf"));
            } catch (IOException ex) {
                Logger.getLogger(ArchPdf.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Factura creada");
        } catch (DocumentException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void reporte(ResultSet txt, int r) throws SQLException {
        String d = "";
        //abre ventana de dialogo "guardar"
        //si destino es diferente de null
        try {
            ruta_destino = "src/reportes/";
            // se crea instancia del documento
            Document mipdf = new Document();
            // se establece una instancia a un documento pdf
            PdfWriter.getInstance(mipdf, new FileOutputStream(this.ruta_destino + "reporte_" + r + ".pdf"));
            mipdf.open();// se abre el documento
            mipdf.addTitle("Reporte de ventas No. " + r); // se añade el titulo
            /*mipdf.addAuthor(a); // se añade el autor del documento
                mipdf.addSubject(s); //se añade el asunto del documento
                mipdf.addKeywords(k); //Se agregan palabras claves*/
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            mipdf.add(new Paragraph("REPORTE DE VENTAS AL " + dtf.format(now) + "\n"));
            mipdf.add(new Paragraph("Tipo               Codigo              Nombre                  Precio"));
            long tot = 0;
            while (txt.next()) {
                mipdf.add(new Paragraph(txt.getString(3) + "          " + txt.getString(1) + "            " + txt.getString(4) + "                " + txt.getLong(7)));
                tot+=txt.getLong(7);
            }
            mipdf.add(new Paragraph("--------------------------------------------------------------------------"+"\n"));
            mipdf.add(new Paragraph("Total Ventas                                               "+tot));
            // se añade el contendio del PDF
            mipdf.close(); //se cierra el PDF&
            JOptionPane.showMessageDialog(null, "Documento PDF creado");
        } catch (DocumentException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

/* abre la ventana de dialogo GUARDAR*/
