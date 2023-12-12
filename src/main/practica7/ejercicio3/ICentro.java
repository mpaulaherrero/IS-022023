import java.awt.Color;
import java.util.Hashtable;
import javax.swing.table.DefaultTableModel;

public class ICentro extends javax.swing.JFrame {
    private IReporte ventana; 
    private Hashtable<String, Profesor> responsables; 
    private final Color VERDE = new Color(0, 145, 0);
    
    public ICentro() {
        initComponents();
        this.ventana = new IReporte(); 
        this.ventana.setTitle("Reporte del Inventario del Centro de Investigación");
        this.ventana.setLocationRelativeTo(null); 
        this.ventana.setResizable(false); 
        this.responsables = new Hashtable<>(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroFactura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFechaAdquirido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCostoUnitario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnGenerarReporte = new javax.swing.JButton();
        btnRegistrarData = new javax.swing.JButton();
        lblExito = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingrese data del equipo: ");
        //jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setText("Descripción:");
        //jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 20));
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 370, -1));

        jLabel3.setText("Cantidad:");
        //jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));
        //jPanel1.add(txtUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 60, -1));

        jLabel4.setText("Costo unitario (Bs.):");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, 20));
        jPanel1.add(txtNumeroFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 100, -1));

        jLabel5.setText("Fecha de adquisición:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel6.setText("dd/mm/aaaa");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel1.add(txtFechaAdquirido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 70, -1));

        jLabel7.setText("Nro. de Factura:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));
        jPanel1.add(txtCostoUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 100, -1));

        jLabel8.setText("C.I. del Responsable del equipo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));
        jPanel1.add(txtResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 120, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 70, -1));

        btnGenerarReporte.setText("Generar Reporte");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 160, -1));

        btnRegistrarData.setText("Registrar Data");
        btnRegistrarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDataActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarData, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));
        jPanel1.add(lblExito, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.responsables.clear();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        this.ventana.setVisible(true); 
        this.ventana.setResponsables(this.responsables); 
        this.ventana.llenarTabla();
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void btnRegistrarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDataActionPerformed
       try{
            double costoUnitario = Double.parseDouble(txtCostoUnitario.getText()); 
            int unidades = Integer.parseInt(txtUnidades.getText()); 
            String descripcion = txtDescripcion.getText(); 
            String numeroFactura = txtNumeroFactura.getText(); 
            String fechaAdquirido = txtFechaAdquirido.getText(); 
            String cedulaResponsable = txtResponsable.getText(); 
            if(responsables.containsKey(cedulaResponsable)){
                //Agrega equipo a profesor ya existente
                responsables.get(cedulaResponsable).agregarEquipo(costoUnitario,
                                                                  unidades,
                                                                  descripcion,
                                                                  numeroFactura,
                                                                  fechaAdquirido);
            } else {
                //Registra nuevo profesor
                Profesor responsable = new Profesor(costoUnitario, unidades, 
                                                    descripcion, numeroFactura,
                                                    fechaAdquirido); 
                responsables.put(cedulaResponsable, responsable); 
            }
            //Se le informa del éxito al usuario
            lblExito.setForeground(VERDE);
            lblExito.setText("Data registrada exitosamente.");
            //Reiniciar los textField a vacío
            txtCostoUnitario.setText(""); 
            txtUnidades.setText(""); 
            txtDescripcion.setText(""); 
            txtNumeroFactura.setText(""); 
            txtFechaAdquirido.setText(""); 
            txtResponsable.setText(""); 
       }catch(Exception e){
            //Se le informa del éxito al usuario
            lblExito.setForeground(Color.red);
            lblExito.setText("Error: " + e.getMessage());
       }
    }//GEN-LAST:event_btnRegistrarDataActionPerformed

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
            java.util.logging.Logger.getLogger(ICentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ICentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ICentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ICentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ICentro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnRegistrarData;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblExito;
    private javax.swing.JTextField txtCostoUnitario;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFechaAdquirido;
    private javax.swing.JTextField txtNumeroFactura;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
}
