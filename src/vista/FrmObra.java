/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Oscar
 */
public class FrmObra extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmObra
     */
    public FrmObra() {
        initComponents();
    }

    public JButton getBtnAddArtObra() {
        return btnAddArtObra;
    }

    public void setBtnAddArtObra(JButton btnAddArtObra) {
        this.btnAddArtObra = btnAddArtObra;
    }

    public JButton getBtnimagen() {
        return btnimagen;
    }

    public void setBtnimagen(JButton btnimagen) {
        this.btnimagen = btnimagen;
    }

    public JTextField getTxturl() {
        return txturl;
    }

    public void setTxturl(JTextField txturl) {
        this.txturl = txturl;
    }

    public JButton getBtnAddObra() {
        return btnAddObra;
    }

    public void setBtnAddObra(JButton btnAddObra) {
        this.btnAddObra = btnAddObra;
    }

    public JButton getBtnCancelObra() {
        return btnCancelObra;
    }

    public void setBtnCancelObra(JButton btnCancelObra) {
        this.btnCancelObra = btnCancelObra;
    }

    public JComboBox<String> getCbArtistaObra() {
        return cbArtistaObra;
    }

    public void setCbArtistaObra(JComboBox<String> cbArtistaObra) {
        this.cbArtistaObra = cbArtistaObra;
    }

    public JComboBox<String> getCbOpcVentaObra() {
        return cbOpcVentaObra;
    }

    public void setCbOpcVentaObra(JComboBox<String> cbOpcVentaObra) {
        this.cbOpcVentaObra = cbOpcVentaObra;
    }

    public JComboBox<String> getCbTipoObra() {
        return cbTipoObra;
    }

    public void setCbTipoObra(JComboBox<String> cbTipoObra) {
        this.cbTipoObra = cbTipoObra;
    }

    public JLabel getJlbimagen() {
        return jlbimagen;
    }

    public void setJlbimagen(JLabel jlbimagen) {
        this.jlbimagen = jlbimagen;
    }

   

    public JTextField getTxtCodObra() {
        return txtCodObra;
    }

    public void setTxtCodObra(JTextField txtCodObra) {
        this.txtCodObra = txtCodObra;
    }

    public JTextField getTxtNomObra() {
        return txtNomObra;
    }

    public void setTxtNomObra(JTextField txtNomObra) {
        this.txtNomObra = txtNomObra;
    }

    public JTextField getTxtPrecioObra() {
        return txtPrecioObra;
    }

    public void setTxtPrecioObra(JTextField txtPrecioObra) {
        this.txtPrecioObra = txtPrecioObra;
    }

    public JPanel getLblPrecio() {
        return lblPrecio;
    }

    public void setLblPrecio(JPanel lblPrecio) {
        this.lblPrecio = lblPrecio;
    }
    
    //para esconder o visibilizar el textfield de precio de obra
    public JPanel getPnlPrecio() {
        return pnlPrecio;
    }
    //para esconder o visibilizar el label de precio de obra
    public void setPnlPrecio(JPanel pnlPrecio) {
        this.pnlPrecio = pnlPrecio;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        txtCodObra = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        txtNomObra = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        cbArtistaObra = new javax.swing.JComboBox<>();
        jPanel26 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        cbTipoObra = new javax.swing.JComboBox<>();
        jPanel35 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        cbOpcVentaObra = new javax.swing.JComboBox<>();
        lblPrecio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlPrecio = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        txtPrecioObra = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnAddObra = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnCancelObra = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jlbimagen = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        txturl = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        btnimagen = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        btnAddArtObra = new javax.swing.JButton();

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new java.awt.GridLayout(7, 2));

        jPanel18.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel7.setText("Codigo:");
        jPanel18.add(jLabel7, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel18);

        jPanel19.setLayout(new java.awt.BorderLayout());
        jPanel19.add(txtCodObra, java.awt.BorderLayout.CENTER);
        jPanel19.add(jPanel8, java.awt.BorderLayout.PAGE_START);
        jPanel19.add(jPanel9, java.awt.BorderLayout.PAGE_END);
        jPanel19.add(jPanel10, java.awt.BorderLayout.LINE_START);
        jPanel19.add(jPanel11, java.awt.BorderLayout.LINE_END);

        jPanel2.add(jPanel19);

        jPanel20.setLayout(new java.awt.GridBagLayout());

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel8.setText("Nombre: ");
        jPanel20.add(jLabel8, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel20);

        jPanel21.setLayout(new java.awt.BorderLayout());
        jPanel21.add(txtNomObra, java.awt.BorderLayout.CENTER);
        jPanel21.add(jPanel12, java.awt.BorderLayout.PAGE_START);
        jPanel21.add(jPanel13, java.awt.BorderLayout.PAGE_END);
        jPanel21.add(jPanel14, java.awt.BorderLayout.LINE_START);
        jPanel21.add(jPanel15, java.awt.BorderLayout.LINE_END);

        jPanel2.add(jPanel21);

        jPanel22.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel9.setText("Artista:");
        jPanel22.add(jLabel9, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel22);

        jPanel23.setLayout(new java.awt.BorderLayout());
        jPanel23.add(jPanel24, java.awt.BorderLayout.PAGE_START);
        jPanel23.add(jPanel28, java.awt.BorderLayout.PAGE_END);
        jPanel23.add(jPanel29, java.awt.BorderLayout.LINE_START);
        jPanel23.add(jPanel30, java.awt.BorderLayout.LINE_END);

        jPanel23.add(cbArtistaObra, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel23);

        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel16.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel4.setText("Tipo de obra");
        jPanel16.add(jLabel4, new java.awt.GridBagConstraints());

        jPanel26.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel26);

        jPanel7.setLayout(new java.awt.GridBagLayout());

        cbTipoObra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pintura", "Escultura", "Dibujo a lapiz" }));
        cbTipoObra.setSelectedIndex(-1);
        jPanel7.add(cbTipoObra, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel7);

        jPanel35.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel1.setText("Esta a la venta");
        jPanel35.add(jLabel1, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel35);

        jPanel38.setLayout(new java.awt.GridBagLayout());

        cbOpcVentaObra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        cbOpcVentaObra.setSelectedIndex(-1);
        jPanel38.add(cbOpcVentaObra, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel38);

        lblPrecio.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel2.setText("Precio");
        lblPrecio.add(jLabel2, new java.awt.GridBagConstraints());

        jPanel2.add(lblPrecio);

        pnlPrecio.setLayout(new java.awt.BorderLayout());
        pnlPrecio.add(jPanel4, java.awt.BorderLayout.LINE_START);
        pnlPrecio.add(jPanel5, java.awt.BorderLayout.LINE_END);
        pnlPrecio.add(jPanel6, java.awt.BorderLayout.PAGE_START);
        pnlPrecio.add(jPanel42, java.awt.BorderLayout.PAGE_END);
        pnlPrecio.add(txtPrecioObra, java.awt.BorderLayout.CENTER);

        jPanel2.add(pnlPrecio);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnAddObra.setText("Agregar obra...");
        jPanel1.add(btnAddObra, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel1);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        btnCancelObra.setText("Cancelar");
        jPanel3.add(btnCancelObra, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel3);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel36.setLayout(new java.awt.BorderLayout());

        jPanel17.setLayout(new java.awt.GridLayout(1, 2));

        jPanel25.setLayout(new java.awt.GridLayout(1, 3));
        jPanel25.add(jlbimagen);

        jPanel31.setLayout(new java.awt.GridLayout(2, 0));

        jPanel33.setLayout(new java.awt.BorderLayout());

        txturl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txturlActionPerformed(evt);
            }
        });
        jPanel33.add(txturl, java.awt.BorderLayout.CENTER);
        txturl.setEditable(false);
        jPanel33.add(jPanel34, java.awt.BorderLayout.PAGE_START);
        jPanel33.add(jPanel39, java.awt.BorderLayout.PAGE_END);
        jPanel33.add(jPanel41, java.awt.BorderLayout.LINE_START);
        jPanel33.add(jPanel43, java.awt.BorderLayout.LINE_END);

        jPanel31.add(jPanel33);

        btnimagen.setText("buscar imagen");
        jPanel32.add(btnimagen);

        jPanel31.add(jPanel32);

        jPanel25.add(jPanel31);

        jPanel17.add(jPanel25);

        jPanel36.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel27.setLayout(new java.awt.GridLayout(1, 2));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel3.setText("No encuentra el artista?");
        jPanel37.add(jLabel3);

        jPanel27.add(jPanel37);

        jPanel40.setLayout(new java.awt.GridBagLayout());

        btnAddArtObra.setText("Agregar artista...");
        btnAddArtObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddArtObraActionPerformed(evt);
            }
        });
        jPanel40.add(btnAddArtObra, new java.awt.GridBagConstraints());

        jPanel27.add(jPanel40);

        jPanel36.add(jPanel27, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel36, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddArtObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddArtObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddArtObraActionPerformed

    private void txturlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txturlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txturlActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddArtObra;
    private javax.swing.JButton btnAddObra;
    private javax.swing.JButton btnCancelObra;
    private javax.swing.JButton btnimagen;
    private javax.swing.JComboBox<String> cbArtistaObra;
    private javax.swing.JComboBox<String> cbOpcVentaObra;
    private javax.swing.JComboBox<String> cbTipoObra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlbimagen;
    private javax.swing.JPanel lblPrecio;
    private javax.swing.JPanel pnlPrecio;
    private javax.swing.JTextField txtCodObra;
    private javax.swing.JTextField txtNomObra;
    private javax.swing.JTextField txtPrecioObra;
    private javax.swing.JTextField txturl;
    // End of variables declaration//GEN-END:variables
}
