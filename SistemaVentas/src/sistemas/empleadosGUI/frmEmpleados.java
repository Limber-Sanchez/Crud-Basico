/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemas.empleadosGUI;
import sistema.empleadosBL.empleadosBL;
import sistemas.empleadosDAL.conexion;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

// Construrtor
public class frmEmpleados extends javax.swing.JFrame {
    DefaultTableModel modelo;
    //  clase publica 
    public frmEmpleados() {
        initComponents();
        // Metodo para mandar la ventana al centro de la pantalla
        this.setLocationRelativeTo(this);
        // Metodo para modificar el nombre d ela tablas de es codigo "DefaultTableModel" 
        String[] titulos = {"ID", "Nombre", "Coreo"};
        modelo = new DefaultTableModel(null,titulos);
        tblEmpleados.setModel(modelo);
        //Mstrar los datos en la tabla al llamar al metodo al construrtor
        this.mostrarDatos();
        this.limpiar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCanselar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmpleados.setBackground(new java.awt.Color(204, 204, 204));
        tblEmpleados.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        btnAgregar.setBackground(new java.awt.Color(0, 51, 204));
        btnAgregar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-save-as-16.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(51, 255, 51));
        btnEditar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-edit-text-file-16.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(255, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-trash-can-16.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnCanselar.setBackground(new java.awt.Color(255, 255, 0));
        btnCanselar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCanselar.setForeground(new java.awt.Color(0, 0, 0));
        btnCanselar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-cancel-16.png"))); // NOI18N
        btnCanselar.setText("Canselar");
        btnCanselar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanselarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("Correo");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtCorreo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel4.setText("Sistema de  Basico ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(txtId)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnBorrar)
                .addGap(18, 18, 18)
                .addComponent(btnCanselar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnBorrar)
                    .addComponent(btnCanselar))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Boton para agregra datos ala bse de datos
        // Generar un evento para saber si la base de datos esta conectada dando click en agregar
        conexion objconexion = new conexion(); //Este metodo los ayudapar saber si esta conectado ala base de datos
        empleadosBL oEmpleados= recuperarDatosGUI();
        String strSentenciaInsert = String.format("INSERT INTO `empleados` (`id`, `nombre`, `correo`) "
                + "VALUES (NULL, '%s', '%s');",oEmpleados.getNombre(),oEmpleados.getCoreo());
        // Insertamos datos en la base y los copiamos
        objconexion.ejecutarSentenciaSQL(strSentenciaInsert);
        // Aser la selcion ala tabla de empleados
        try {
            // Crear la varible resultado y llamar el nombe de la base de datso que tine como nombre "empleados"
            ResultSet resultado = objconexion.consultarRegistroSQL("SELECT * FROM empleados");
            // Creamos un ciclo y llamamo la varible resultado que va almacenar la informacio de la tabla "empleados"
            while (resultado.next()) {
                // al correr este codigo los datos que tines en tu base de datos apareseran en la consola de NetBeans
                System.out.println(resultado.getString("id"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("correo"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount()== 1) {
            JTable receptor = (JTable)evt.getSource();
            // Posiciones en aql interfas 
            // Metodo de selecsionn de informacion que seata en la tabla de Modelo
            txtId.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txtCorreo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            // Desativasion de botones
            btnAgregar.setEnabled(false);        
            btnEditar.setEnabled(true);
            btnBorrar.setEnabled(true);
        }
    }//GEN-LAST:event_tblEmpleadosMouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // Boton para iliminar la info
        // Los conectamos ala base dedatos de el boton "eliminar"
        conexion objconexion = new conexion();
        // recuperar datos 
        empleadosBL oEmpleados= recuperarDatosGUI();
        String strSentenciaInsert = String.format("DELETE FROM empleados WHERE ID=%d",oEmpleados.getID());
        // Opcion de borrado
        objconexion.ejecutarSentenciaSQL(strSentenciaInsert);
        // Mostrar datos
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Boton de editar
        conexion objconexion = new conexion(); //Este metodo los ayudapar saber si esta conectado ala base de datos
        empleadosBL oEmpleados= recuperarDatosGUI();
        String strSentenciaInsert = String.format("UPDATE empleados SET Nombre'%s', "
                + "Coreo='%s' WHERE ID=%d",oEmpleados.getNombre(),oEmpleados.getCoreo(),oEmpleados.getID());
        // Insertamos datos en la base y los copiamos
        objconexion.ejecutarSentenciaSQL(strSentenciaInsert);
        // Aser la selcion ala tabla de empleados      
        this.limpiar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCanselarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanselarActionPerformed
        // Boton canselar
        this.limpiar();
    }//GEN-LAST:event_btnCanselarActionPerformed
    public void mostrarDatos(){
        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }
        conexion objconexion = new conexion(); //Este metodo los ayudapar saber si esta conectado ala base de dato
        try {
            // Crear la varible resultado y llamar el nombe de la base de datso que tine como nombre "empleados"
            ResultSet resultado = objconexion.consultarRegistroSQL("SELECT * FROM empleados");
            // Creamos un ciclo y llamamo la varible resultado que va almacenar la informacio de la tabla "empleados"
            while (resultado.next()) {
                // al correr este codigo los datos que tines en tu base de datos apareseran en la consola de NetBeans
                System.out.println(resultado.getString("id"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("correo"));
                Object[] oUsuario = {resultado.getString("id"),resultado.getString("nombre"),resultado.getString("correo")};
                // 
                modelo.addRow(oUsuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public empleadosBL recuperarDatosGUI(){
        // Crear un objeto
        empleadosBL oEmpleados = new empleadosBL();
        // Validar el ID
        int id = (txtId.getText().isEmpty())?0: Integer.parseInt(txtId.getText());
        // Resecionar los datos que se incuentra en la base de datos
        oEmpleados.setID(id);
        oEmpleados.setNombre(txtNombre.getText());
        oEmpleados.setCoreo(txtCorreo.getText());
        // Retornar oEmpleados 
        return oEmpleados;
    }
    public  void limpiar(){
        txtId.setText("");
        txtNombre.setText("");
        txtCorreo.setText("");
        // Desativasion de botones
        btnAgregar.setEnabled(true);        
        btnEditar.setEnabled(false);
        btnBorrar.setEnabled(false);

    }
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
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCanselar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
