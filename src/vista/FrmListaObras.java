/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oscar
 */
public class FrmListaObras extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo1;
    private DefaultTableModel modelo2;
    private DefaultTableModel modelo3;
    private DefaultTableModel modelo4;

    /**
     * Creates new form FrmListaObras
     */
    public FrmListaObras() {
        initComponents();
        modelo1 = (DefaultTableModel) tblRegistradas.getModel();
        modelo2 = (DefaultTableModel) tblDispVen.getModel();
        modelo3 = (DefaultTableModel) tblVendidas.getModel();
        modelo4 = (DefaultTableModel) tblNoVenta.getModel();
        
    }

    public DefaultTableModel getModelo1() {
        return modelo1;
    }

    public void setModelo1(DefaultTableModel modelo1) {
        this.modelo1 = modelo1;
    }

    public DefaultTableModel getModelo2() {
        return modelo2;
    }

    public void setModelo2(DefaultTableModel modelo2) {
        this.modelo2 = modelo2;
    }

    public DefaultTableModel getModelo3() {
        return modelo3;
    }

    public void setModelo3(DefaultTableModel modelo3) {
        this.modelo3 = modelo3;
    }

    public DefaultTableModel getModelo4() {
        return modelo4;
    }

    public void setModelo4(DefaultTableModel modelo4) {
        this.modelo4 = modelo4;
    }
    
    

    public JButton getBtnCloseTab() {
        return btnCloseTab;
    }

    public void setBtnCloseTab(JButton btnCloseTab) {
        this.btnCloseTab = btnCloseTab;
    }

    public JTable getTblDispVen() {
        return tblDispVen;
    }

    public void setTblDispVen(JTable tblDispVen) {
        this.tblDispVen = tblDispVen;
    }

    public JTable getTblNoVenta() {
        return tblNoVenta;
    }

    public void setTblNoVenta(JTable tblNoVenta) {
        this.tblNoVenta = tblNoVenta;
    }

    public JTable getTblRegistradas() {
        return tblRegistradas;
    }

    public void setTblRegistradas(JTable tblRegistradas) {
        this.tblRegistradas = tblRegistradas;
    }

    public JTable getTblVendidas() {
        return tblVendidas;
    }

    public void setTblVendidas(JTable tblVendidas) {
        this.tblVendidas = tblVendidas;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistradas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDispVen = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVendidas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNoVenta = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnCloseTab = new javax.swing.JButton();

        tblRegistradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Codigo", "Nombre", "Precio", "Artista"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRegistradas);

        jPanel1.add(jScrollPane1);

        jTabbedPane1.addTab("Registradas", jPanel1);

        tblDispVen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Codigo", "Nombre", "Precio", "Artista"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDispVen);

        jPanel7.add(jScrollPane2);

        jPanel2.add(jPanel7);

        jTabbedPane1.addTab("Disponibles para venta", jPanel2);

        tblVendidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Codigo", "Nombre", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblVendidas);

        jPanel8.add(jScrollPane3);

        jPanel3.add(jPanel8);

        jTabbedPane1.addTab("Vendidas", jPanel3);

        tblNoVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Codigo", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblNoVenta);

        jPanel9.add(jScrollPane4);

        jPanel4.add(jPanel9);

        jTabbedPane1.addTab("No disponibles para venta", jPanel4);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        btnCloseTab.setText("Cerrar");
        jPanel5.add(btnCloseTab);

        getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseTab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblDispVen;
    private javax.swing.JTable tblNoVenta;
    private javax.swing.JTable tblRegistradas;
    private javax.swing.JTable tblVendidas;
    // End of variables declaration//GEN-END:variables
}
