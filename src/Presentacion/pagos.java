/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Controlador.ControladorExcel;
import Datos.AltaMecanico;
import Datos.AltaPago;
import Datos.AltaPagoMecanico;
import Datos.AltaPersonal;
import Metodos.Metodos_Altas;
import Modelo.ModeloExcel;
import Puentes.puenteAltas;
import javax.swing.JOptionPane;

/**
 *
 * @author AlejandroSaenz
 */
public class pagos extends javax.swing.JFrame {

    /**
     * Creates new form pagos
     */
    public pagos() {
        this.Metodos = new Metodos_Altas();
        initComponents();
      
        txtp.setVisible(false);
                txtm.setVisible(false);
                bp.setVisible(false);
                bm.setVisible(false);
        setLocationRelativeTo(null);
    }
         Metodos_Altas Metodos;

    private int obtenerIdPagosStaff() {
    int f = this.Metodos.consultaIdPagosStaff();
    return f;
  }
     private int obtenerIdPagosMecanico() {
    int f = this.Metodos.consultaIdPagosMecanico();
    return f;
  }
    public void Limpiar() {
    txtnombre.setText("");
    txtapellido.setText("");
    txtperiodo.setText("");
       txtcantidad.setText("");

    txtbonus.setText("");
      //this.txtFecha1.setDateFormatString("");
   
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
        lae = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtm = new javax.swing.JTextField();
        txtnombre = new javax.swing.JLabel();
        txtapellido = new javax.swing.JLabel();
        txtperiodo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtfecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtaño = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        bm = new javax.swing.JButton();
        txtcantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtbonus = new javax.swing.JTextField();
        bp = new javax.swing.JButton();
        idp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(218, 165, 32));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lae.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lae.setText("Usuario");
        jPanel1.add(lae, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 11, 297, -1));

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        txtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpActionPerformed(evt);
            }
        });
        txtp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Id:");

        txtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmActionPerformed(evt);
            }
        });
        txtm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 59, -1, -1));

        txtnombre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtnombre.setText("First_Name:");
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 33, 258, -1));

        txtapellido.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtapellido.setText("Last_Name");
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 258, -1));

        txtperiodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtperiodoActionPerformed(evt);
            }
        });
        txtperiodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtperiodoKeyTyped(evt);
            }
        });
        jPanel1.add(txtperiodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 189, 210, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Period");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 197, 54, -1));
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 210, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        txtaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032" }));
        jPanel1.add(txtaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 220, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("Year");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 49, -1));

        bm.setText("Save");
        bm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmActionPerformed(evt);
            }
        });
        jPanel1.add(bm, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 229, 210, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("Amount");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("USD");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setText("Bonus");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        txtbonus.setText("0");
        txtbonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbonusActionPerformed(evt);
            }
        });
        txtbonus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbonusKeyTyped(evt);
            }
        });
        jPanel1.add(txtbonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 210, 30));

        bp.setText("Save");
        bp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpActionPerformed(evt);
            }
        });
        jPanel1.add(bp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        idp.setText("Id");
        jPanel1.add(idp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
ModeloExcel modeloE = new ModeloExcel();
        Sistema vistaE = new Sistema();
        ControladorExcel contraControladorExcel = new ControladorExcel(vistaE, modeloE);
        vistaE.setVisible(true);
        vistaE.nombreUsuario.setText(lae.getText());
        vistaE.setLocationRelativeTo(null); 
dispose();

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpActionPerformed
         
        if (!this.txtp.getText().isEmpty()) {
     
      AltaPersonal prov = new AltaPersonal();
      prov.setId(Integer.parseInt(this.txtp.getText()));
      (new puenteAltas()).PuenteBuscarPersonal(prov);
      this.txtnombre.setText("" + prov.getFirst_Name());
      this.txtapellido.setText("" + prov.getLast_Name());
      this.idp.setText("" + obtenerIdPagosStaff());
      txtp.setText("");
      txtperiodo.requestFocus();
             
    } else {
      JOptionPane.showMessageDialog(null, "Enter a ID", "Warning", 1);
    }
    }//GEN-LAST:event_txtpActionPerformed

    private void txtpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpKeyTyped
   char car = evt.getKeyChar();
        if (car < '0' || car > '9')
        evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_txtpKeyTyped

    private void txtperiodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtperiodoKeyTyped
   char car = evt.getKeyChar();
        if (car < '0' || car > '9')
        evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_txtperiodoKeyTyped

    private void txtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmActionPerformed
 if (!this.txtm.getText().isEmpty()) {
     
      AltaMecanico prov = new AltaMecanico();
      prov.setId(Integer.parseInt(this.txtm.getText()));
      (new puenteAltas()).PuenteBuscarMecanico(prov);
      this.txtnombre.setText("" + prov.getFirst_Name());
      this.txtapellido.setText("" + prov.getLast_Name());
 this.idp.setText("" + obtenerIdPagosMecanico());
      txtm.setText("");
      txtperiodo.requestFocus();
             
    } else {
      JOptionPane.showMessageDialog(null, "Enter a ID", "Warning", 1);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txtmActionPerformed

    private void txtmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmKeyTyped
char car = evt.getKeyChar();
        if (car < '0' || car > '9')
        evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_txtmKeyTyped

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
char car = evt.getKeyChar();
    if (car!='.'&&car!='0'&&car!='1'&&car!='2'&&car!='3'&&car!='4'&&car!='5'&&car!='6'&&car!='7'&&car!='8'&&car!='9')
      evt.consume();          // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtbonusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbonusKeyTyped
char car = evt.getKeyChar();
    if (car!='.'&&car!='0'&&car!='1'&&car!='2'&&car!='3'&&car!='4'&&car!='5'&&car!='6'&&car!='7'&&car!='8'&&car!='9')
      evt.consume();          // TODO add your handling code here:
    }//GEN-LAST:event_txtbonusKeyTyped

    private void bpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpActionPerformed
if ( this.txtnombre.getText().isEmpty() || this.txtapellido.getText().isEmpty() || txtfecha.getDate() == null
        || this.txtperiodo.getText().isEmpty()|| this.txtcantidad.getText().isEmpty()|| this.txtbonus.getText().isEmpty()) {
JOptionPane.showMessageDialog(null, "Please fill all fields", "empty fields", 1);    } else {
      AltaPago prod = new AltaPago();
      prod.setId(Integer.parseInt(idp.getText()));
      prod.setFirst_Name(txtnombre.getText());
      prod.setLast_Name(txtapellido.getText());
      prod.setPeriod(Integer.parseInt(txtperiodo.getText()));
      //prod.setDate(txtfecha.getDate().toString());
      
      java.util.Date fecha=txtfecha.getDate();
       long d=fecha.getTime();
        java.sql.Date soloFecha=new java.sql.Date(d);
        prod.setDate(soloFecha);
      
      
    prod.setYear(Integer.parseInt(txtaño.getSelectedItem().toString()));
    prod.setAmount(Float.parseFloat(txtcantidad.getText()));
  
              prod.setBonus(Float.parseFloat(txtbonus.getText()));


           (new puenteAltas()).PuenteRegistroPago(prod);

   Limpiar();
      //this.txtId.setText("" + obtenerId());
      //txtNombre.requestFocus(); 
    }         // TODO add your handling code here:
    }//GEN-LAST:event_bpActionPerformed

    private void txtperiodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtperiodoActionPerformed
txtcantidad.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtperiodoActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
txtbonus.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtbonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbonusActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_txtbonusActionPerformed

    private void bmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmActionPerformed
if ( this.txtnombre.getText().isEmpty() || this.txtapellido.getText().isEmpty() || txtfecha.getDate() == null
        || this.txtperiodo.getText().isEmpty()|| this.txtcantidad.getText().isEmpty()
       || this.txtbonus.getText().isEmpty()) {
JOptionPane.showMessageDialog(null, "Please fill all fields", "empty fields", 1);    } else {
      AltaPagoMecanico prod = new AltaPagoMecanico();
      prod.setId(Integer.parseInt(idp.getText()));
      prod.setFirst_Name(txtnombre.getText());
      prod.setLast_Name(txtapellido.getText());
      prod.setPeriod(Integer.parseInt(txtperiodo.getText()));
      java.util.Date fecha=txtfecha.getDate();
       long d=fecha.getTime();
        java.sql.Date soloFecha=new java.sql.Date(d);
        prod.setDate(soloFecha);
    prod.setYear(Integer.parseInt(txtaño.getSelectedItem().toString()));
    prod.setAmount(Float.parseFloat(txtcantidad.getText()));
    
              prod.setBonus(Float.parseFloat(txtbonus.getText()));


           (new puenteAltas()).PuenteRegistroPagoMecanico(prod);
              Limpiar();
}        // TODO add your handling code here:
    }//GEN-LAST:event_bmActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bm;
    public javax.swing.JButton bp;
    public javax.swing.JLabel idp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lae;
    private javax.swing.JLabel txtapellido;
    private javax.swing.JComboBox<String> txtaño;
    private javax.swing.JTextField txtbonus;
    private javax.swing.JTextField txtcantidad;
    private com.toedter.calendar.JDateChooser txtfecha;
    public javax.swing.JTextField txtm;
    private javax.swing.JLabel txtnombre;
    public javax.swing.JTextField txtp;
    private javax.swing.JTextField txtperiodo;
    // End of variables declaration//GEN-END:variables
}