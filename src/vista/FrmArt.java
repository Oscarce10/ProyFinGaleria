/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Oscar
 */
public class FrmArt extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmArt
     */
    public FrmArt() {
        initComponents();
    }

    public JButton getBtnAddArt() {
        return btnAddArt;
    }

    public void setBtnAddArt(JButton btnAddArt) {
        this.btnAddArt = btnAddArt;
    }

    public JButton getBtnCancelArt() {
        return btnCancelArt;
    }

    public void setBtnCancelArt(JButton btnCancelArt) {
        this.btnCancelArt = btnCancelArt;
    }

    public JTextField getTxtCiudArt() {
        return txtCiudArt;
    }

    public void setTxtCiudArt(JTextField txtCiudArt) {
        this.txtCiudArt = txtCiudArt;
    }

    public JTextField getTxtDirArt() {
        return txtDirArt;
    }

    public void setTxtDirArt(JTextField txtDirArt) {
        this.txtDirArt = txtDirArt;
    }

    public JTextField getTxtIdArt() {
        return txtIdArt;
    }

    public void setTxtIdArt(JTextField txtIdArt) {
        this.txtIdArt = txtIdArt;
    }

    public JTextField getTxtNomArt() {
        return txtNomArt;
    }

    public void setTxtNomArt(JTextField txtNomArt) {
        this.txtNomArt = txtNomArt;
    }

    public JTextField getTxtTelArt() {
        return txtTelArt;
    }

    public void setTxtTelArt(JTextField txtTelArt) {
        this.txtTelArt = txtTelArt;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        txtIdArt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        txtNomArt = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        txtTelArt = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        txtCiudArt = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        txtDirArt = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        btnAddArt = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        btnCancelArt = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Registro: Artista");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(new java.awt.GridLayout(6, 2));

        jPanel16.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel7.setText("Identificacion: ");
        jPanel16.add(jLabel7, new java.awt.GridBagConstraints());

        jPanel1.add(jPanel16);

        jPanel17.setLayout(new java.awt.BorderLayout());
        jPanel17.add(txtIdArt, java.awt.BorderLayout.CENTER);
        jPanel17.add(jPanel2, java.awt.BorderLayout.PAGE_START);
        jPanel17.add(jPanel4, java.awt.BorderLayout.PAGE_END);
        jPanel17.add(jPanel5, java.awt.BorderLayout.LINE_START);
        jPanel17.add(jPanel6, java.awt.BorderLayout.LINE_END);

        jPanel1.add(jPanel17);

        jPanel18.setLayout(new java.awt.GridBagLayout());

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel8.setText("Nombre: ");
        jPanel18.add(jLabel8, new java.awt.GridBagConstraints());

        jPanel1.add(jPanel18);

        jPanel19.setLayout(new java.awt.BorderLayout());
        jPanel19.add(txtNomArt, java.awt.BorderLayout.CENTER);
        jPanel19.add(jPanel7, java.awt.BorderLayout.PAGE_START);
        jPanel19.add(jPanel8, java.awt.BorderLayout.PAGE_END);
        jPanel19.add(jPanel9, java.awt.BorderLayout.LINE_START);
        jPanel19.add(jPanel10, java.awt.BorderLayout.LINE_END);

        jPanel1.add(jPanel19);

        jPanel20.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel9.setText("Telefono: ");
        jPanel20.add(jLabel9, new java.awt.GridBagConstraints());

        jPanel1.add(jPanel20);

        jPanel21.setLayout(new java.awt.BorderLayout());

        txtTelArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelArtActionPerformed(evt);
            }
        });
        jPanel21.add(txtTelArt, java.awt.BorderLayout.CENTER);
        jPanel21.add(jPanel11, java.awt.BorderLayout.PAGE_START);
        jPanel21.add(jPanel12, java.awt.BorderLayout.PAGE_END);
        jPanel21.add(jPanel13, java.awt.BorderLayout.LINE_END);
        jPanel21.add(jPanel14, java.awt.BorderLayout.LINE_START);

        jPanel1.add(jPanel21);

        jPanel22.setLayout(new java.awt.GridBagLayout());

        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel10.setText("Ciudad: ");
        jPanel22.add(jLabel10, new java.awt.GridBagConstraints());

        jPanel1.add(jPanel22);

        jPanel23.setLayout(new java.awt.BorderLayout());
        jPanel23.add(txtCiudArt, java.awt.BorderLayout.CENTER);
        jPanel23.add(jPanel15, java.awt.BorderLayout.PAGE_START);
        jPanel23.add(jPanel29, java.awt.BorderLayout.PAGE_END);
        jPanel23.add(jPanel30, java.awt.BorderLayout.LINE_START);
        jPanel23.add(jPanel31, java.awt.BorderLayout.LINE_END);

        jPanel1.add(jPanel23);

        jPanel24.setLayout(new java.awt.GridBagLayout());

        jLabel11.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel11.setText("Direccion:");
        jPanel24.add(jLabel11, new java.awt.GridBagConstraints());

        jPanel1.add(jPanel24);

        jPanel25.setLayout(new java.awt.BorderLayout());
        jPanel25.add(txtDirArt, java.awt.BorderLayout.CENTER);
        jPanel25.add(jPanel28, java.awt.BorderLayout.PAGE_END);
        jPanel25.add(jPanel32, java.awt.BorderLayout.PAGE_START);
        jPanel25.add(jPanel33, java.awt.BorderLayout.LINE_START);
        jPanel25.add(jPanel34, java.awt.BorderLayout.LINE_END);

        jPanel1.add(jPanel25);

        jPanel26.setLayout(new java.awt.GridBagLayout());

        btnAddArt.setText("Agregar artista...");
        jPanel26.add(btnAddArt, new java.awt.GridBagConstraints());

        jPanel1.add(jPanel26);

        jPanel27.setLayout(new java.awt.GridBagLayout());

        btnCancelArt.setText("Cancelar");
        jPanel27.add(btnCancelArt, new java.awt.GridBagConstraints());

        jPanel1.add(jPanel27);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelArtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelArtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddArt;
    private javax.swing.JButton btnCancelArt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtCiudArt;
    private javax.swing.JTextField txtDirArt;
    private javax.swing.JTextField txtIdArt;
    private javax.swing.JTextField txtNomArt;
    private javax.swing.JTextField txtTelArt;
    // End of variables declaration//GEN-END:variables
}
