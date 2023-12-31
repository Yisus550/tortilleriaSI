/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.CRUD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author favel
 */
public class tblEmpleado extends javax.swing.JFrame {
    DefaultTableModel modTabla = new DefaultTableModel();
    private final CRUD CP;

    /**
     * Creates new form tblEmpleado
     */
    public tblEmpleado() {
        initComponents();
        this.setLocationRelativeTo(null);
        CP = new CRUD();
        cargarRegistros();
        txtApellido.setEnabled(false);
        txtContraseña.setEnabled(false);
        txtCorreo.setEnabled(false);
        txtNombre.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtUsuario.setEnabled(false);
        cmbTipEmp.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    public void cargarRegistros() {
        TblEmpleado.setModel(CP.getDatosEmpleado());
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtIdentificador = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbTipEmp = new javax.swing.JComboBox<>();
        btnBorrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblEmpleado = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MRegresar = new javax.swing.JMenu();
        MTablauser = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Tipo de empleado:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 220, -1));

        txtApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 200, -1));

        txtCorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 220, 30));

        txtTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 200, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Actualizacion de usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, 40));

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 209, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Buscar ID de empleado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        txtContraseña.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 210, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Apellidos: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Correo: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 119, 41));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Telefono:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 744, 14));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Usuario:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 750, 10));

        txtIdentificador.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificadorActionPerformed(evt);
            }
        });
        txtIdentificador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificadorKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdentificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 150, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Nombres: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        cmbTipEmp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cmbTipEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Administrador", "Maquinista", "Vendedor" }));
        jPanel1.add(cmbTipEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 176, -1));

        btnBorrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 120, 40));

        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 80, 30));

        btnEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 80, 30));

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, 30));

        TblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TblEmpleado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );

        MRegresar.setText("Menú");

        MTablauser.setText("Ingresar usuario");
        MTablauser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTablauserActionPerformed(evt);
            }
        });
        MRegresar.add(MTablauser);

        jMenuItem3.setText("Regresar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MRegresar.add(jMenuItem3);

        jMenuBar1.add(MRegresar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal1 pantalla = new MenuPrincipal1();
        pantalla.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        int iD = Integer.parseInt(txtIdentificador.getText());
        String Nom = txtNombre.getText();
        String Ape = txtApellido.getText();
        String Tel = txtTelefono.getText();
        String Correo = txtCorreo.getText();
        String user = txtUsuario.getText();
        String Pass = txtContraseña.getText();
        String Tip = cmbTipEmp.getSelectedItem().toString();
        

        int res = CP.ActualizarEmpleados(iD, Nom, Ape, Tel,Correo,Tip,user,Pass);

        if (res > 0) {
            cargarRegistros();
            txtApellido.setEnabled(false);
            txtNombre.setEnabled(false);
            txtTelefono.setEnabled(false);
            txtCorreo.setEnabled(false);
            txtUsuario.setEnabled(false);
            txtContraseña.setEnabled(false);
            cmbTipEmp.setEnabled(false);
            txtIdentificador.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnGuardar.setEnabled(false);
            btnEditar.setEnabled(false);
            txtTelefono.setEnabled(false);
            limpiarCampos();
        }
    }

    private void limpiarCampos() {
        txtApellido.setText("");
        txtNombre.setText("");
        txtCorreo.setText("");
        txtIdentificador.setText("");
        txtTelefono.setText("");
        txtUsuario.setText("");
        txtContraseña.setText("");
        cmbTipEmp.setSelectedItem("Seleccionar");

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void MTablauserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTablauserActionPerformed
        // TODO add your handling code here:
        MenuRegistro reg = new MenuRegistro();
        reg.setVisible(true);
        this.hide();
    }//GEN-LAST:event_MTablauserActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String id = txtIdentificador.getText();

        Object valor[];
        valor = CP.buscarEmpleado(id);
        txtNombre.setText(String.valueOf(valor[0]));
        txtApellido.setText(String.valueOf(valor[1]));
        txtTelefono.setText(String.valueOf(valor[2]));
        txtCorreo.setText(String.valueOf(valor[3]));
        cmbTipEmp.setSelectedItem(String.valueOf(valor[4]));
        txtUsuario.setText(String.valueOf(valor[5]));
        txtContraseña.setText(String.valueOf(valor[6]));
        System.out.println(String.valueOf(valor[4]));
        btnBorrar.setEnabled(true);
        btnEditar.setEnabled(true);
        

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        txtApellido.setEnabled(true);
        txtContraseña.setEnabled(true);
        txtCorreo.setEnabled(true);
        txtNombre.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtUsuario.setEnabled(true);
        cmbTipEmp.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txtApellido.setEnabled(false);
        txtContraseña.setEnabled(false);
        txtCorreo.setEnabled(false);
        txtNombre.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtUsuario.setEnabled(false);
        cmbTipEmp.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtIdentificador.getText());
        int res = CP.EliminarEmpleado(id);
        if (res > 0) {
            cargarRegistros();
            txtApellido.setEnabled(false);
            txtNombre.setEnabled(false);
            txtTelefono.setEnabled(false);
            txtCorreo.setEnabled(false);
            txtUsuario.setEnabled(false);
            txtContraseña.setEnabled(false);
            cmbTipEmp.setEnabled(false);
            txtIdentificador.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnGuardar.setEnabled(false);
            btnEditar.setEnabled(false);
            txtTelefono.setEnabled(false);
            limpiarCampos();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtIdentificadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificadorKeyTyped
        // TODO add your handling code here:
                    char validar = evt.getKeyChar();
      if (Character.isLetter(validar)){
          getToolkit().beep();
          evt.consume();
          JOptionPane.showMessageDialog(null, "ingrese numeros solamente.");
      }
    }//GEN-LAST:event_txtIdentificadorKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
                    char validar = evt.getKeyChar();
      if (Character.isLetter(validar)){
          getToolkit().beep();
          evt.consume();
          JOptionPane.showMessageDialog(null, "ingrese numeros solamente.");
      }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificadorActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
                            char validar = evt.getKeyChar();
      if (Character.isDigit(validar)){
          getToolkit().beep();
          evt.consume();
          JOptionPane.showMessageDialog(null, "ingrese numeros solamente.");
      }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
                            char validar = evt.getKeyChar();
      if (Character.isDigit(validar)){
          getToolkit().beep();
          evt.consume();
          JOptionPane.showMessageDialog(null, "ingrese numeros solamente.");
      }
    }//GEN-LAST:event_txtApellidoKeyTyped

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
            java.util.logging.Logger.getLogger(tblEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tblEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tblEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tblEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tblEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MRegresar;
    private javax.swing.JMenuItem MTablauser;
    private javax.swing.JTable TblEmpleado;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbTipEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
