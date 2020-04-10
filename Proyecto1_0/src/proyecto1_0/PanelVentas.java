/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author matgr
 */
public class PanelVentas extends javax.swing.JPanel {

    /**
     * Creates new form PanelVentas
     */
    int conv, conv1;
    int ingreso = 0, cantidad, cantidad1;
    String ncliente, ruta;
    double precio = 0.0, total = 0.0;

    public PanelVentas() {

        initComponents();
        btnfactura.setEnabled(false);
        try {

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            java.sql.Connection con = conn.getConexion();

            String sql = "SELECT  Nombre FROM cliente";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            while (rs.next()) {

                for (int i = 0; i < cantidadColumnas; i++) {
                    cbocliente.addItem("" + rs.getObject(i + 1));
                }

            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        try {

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            java.sql.Connection con = conn.getConexion();

            String sql = "SELECT  rutas FROM ruta";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            while (rs.next()) {

                for (int i = 0; i < cantidadColumnas; i++) {
                    cboruta.addItem("" + rs.getObject(i + 1));
                }

            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cboruta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbocliente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spncapacidad = new javax.swing.JSpinner();
        btnfactura = new javax.swing.JButton();
        btncompra = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblasientos = new javax.swing.JLabel();
        lblhorario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblprecio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("         VENTA BOLETOS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione Cliente:");

        cboruta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione" }));
        cboruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cborutaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione Ruta:");

        cbocliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Hora Salida:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ingrese el numero de boletos:");

        btnfactura.setText("Generar Factura");
        btnfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacturaActionPerformed(evt);
            }
        });

        btncompra.setText("Efectuar Compra");
        btncompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncompraActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Asientos Disponibles:");

        lblasientos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblasientos.setText("...");

        lblhorario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblhorario.setText("...");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Precio:");

        lblprecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblprecio.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboruta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbocliente, 0, 152, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(spncapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblasientos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2))
                    .addComponent(cboruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblhorario))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblprecio))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblasientos))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spncapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncompra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btncompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncompraActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea efectuar esta compra?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if ((cbocliente.getSelectedIndex() == 0) || (cboruta.getSelectedIndex() == 0) || (lblhorario.getText().equals("...")) || (lblasientos.getText().equals("...")) || ((int) spncapacidad.getValue() <= 0)) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado alguna opción");
        } else {
            //JOptionPane.showMessageDialog(null, "Compra Exitosa");
            if (confirmacion == JOptionPane.YES_OPTION) {
                conv1 = Integer.parseInt(lblasientos.getText());
                if ((conv1 != 0) && ((int) spncapacidad.getValue() <= conv1)) {
                    ncliente = cbocliente.getSelectedItem().toString();
                    ruta = cboruta.getSelectedItem().toString();

                    precio = Double.parseDouble(lblprecio.getText());
                    cantidad = (int) spncapacidad.getValue();
                    total = cantidad * precio;
                    guardar();
                    limpiar();
                    btnfactura.setEnabled(true);
                    ingreso = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "No hay cupos disponibles");
                }

            }

        }
    }//GEN-LAST:event_btncompraActionPerformed

    private void btnfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacturaActionPerformed

        if (ingreso == 1) {

            Frmfactura pf = new Frmfactura(cantidad, ncliente, ruta, precio, total);
            pf.show();
            btnfactura.setEnabled(false);
            ingreso = 0;
        } else {
            JOptionPane.showMessageDialog(null, "No se ha efectuado la compra");
        }
    }//GEN-LAST:event_btnfacturaActionPerformed

    private void cborutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cborutaActionPerformed
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();

        try {
            // System.out.println(nombre);
            java.sql.Connection con = conn.getConexion();
            ps = con.prepareStatement("SELECT * FROM ruta WHERE rutas = ?");
            ps.setString(1, cboruta.getSelectedItem().toString());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblasientos.setText(rs.getString("Limite"));
                lblhorario.setText(rs.getString("hora"));
                lblprecio.setText(rs.getString("precio"));
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_cborutaActionPerformed
    private void limpiar() {
        cbocliente.setSelectedIndex(0);
        cboruta.setSelectedIndex(0);
        lblhorario.setText("...");
        lblasientos.setText("...");
        lblprecio.setText("...");
        spncapacidad.setValue(0);

    }

    private void cuposdisp() {
        PreparedStatement ps = null;
        //  int Fila = tablausuarios.getSelectedRow();
        conv = Integer.parseInt(lblasientos.getText());
        conv = conv - ((int) spncapacidad.getValue());

        String cupos = String.valueOf(conv);
        try {
            Conexion objCon = new Conexion();
            com.mysql.jdbc.Connection conn = objCon.getConexion();

            ps = conn.prepareStatement("UPDATE ruta SET Limite=? WHERE rutas=?");

            ps.setString(1, cupos);
            ps.setString(2, cboruta.getSelectedItem().toString());
            ps.execute();
            //JOptionPane.showMessageDialog(null, "Alumno Modificado");

            //  limpiar();
            //   conn.close();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error al Modificar Alumno");
            System.err.println(ex);
        }

        // return cont;
    }

    private void guardar() {
        PreparedStatement ps = null;
        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();
            ps = conn.prepareStatement("INSERT INTO venta (Nombre,Ruta ,Horario,Numero_Boletos,Precio) VALUES (?,?,?,?,?)");
            ps.setString(1, cbocliente.getSelectedItem().toString());
            ps.setString(2, cboruta.getSelectedItem().toString());
            ps.setString(3, lblhorario.getText());
            ps.setInt(4, (int) spncapacidad.getValue());
            ps.setString(5, lblprecio.getText());
            cuposdisp();
            ps.execute();
            JOptionPane.showMessageDialog(null, "Compra Exitosa");

            //limpiar();
            // tabla();
        } catch (SQLException ex) {

            System.out.println(ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncompra;
    private javax.swing.JButton btnfactura;
    private javax.swing.JComboBox<String> cbocliente;
    private javax.swing.JComboBox<String> cboruta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblasientos;
    private javax.swing.JLabel lblhorario;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JSpinner spncapacidad;
    // End of variables declaration//GEN-END:variables
}