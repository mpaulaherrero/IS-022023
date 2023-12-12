import java.util.*;
import javax.swing.table.DefaultTableModel;

public class IReporte extends javax.swing.JFrame {
    private Hashtable<String, Profesor> responsables;
    private DefaultTableModel tabla;

    public IReporte() {
        initComponents();
        //Iniciar panel general invisible
        pnlGeneral.setVisible(false); 
        //Iniciar tableModel 
        this.tabla = (DefaultTableModel) tblReporte.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdBtnIndividual = new javax.swing.JRadioButton();
        rdBtnGeneral = new javax.swing.JRadioButton();
        pnlIndividual = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        btnTotalizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblTotalUnidadesIndividual = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTotalBsIndividual = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnContinuarIndividual = new javax.swing.JButton();
        pnlGeneral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();
        lblTotalUnidadesGeneral = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTotalBsGeneral = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnContinuarGeneral = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tipo reporte:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        rdBtnIndividual.setSelected(true);
        rdBtnIndividual.setText("Individual");
        rdBtnIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnIndividualActionPerformed(evt);
            }
        });
        jPanel1.add(rdBtnIndividual, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        rdBtnGeneral.setText("General");
        rdBtnGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnGeneralActionPerformed(evt);
            }
        });
        jPanel1.add(rdBtnGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        pnlIndividual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("C.I. del Responsable de equipos:");
        pnlIndividual.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));
        pnlIndividual.add(txtResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 110, 20));

        btnTotalizar.setText("Totalizar");
        btnTotalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalizarActionPerformed(evt);
            }
        });
        pnlIndividual.add(btnTotalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 110, 20));

        jLabel3.setText("Totalización:");
        pnlIndividual.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblTotalUnidadesIndividual.setText("___");
        pnlIndividual.add(lblTotalUnidadesIndividual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel5.setText("equipos.");
        pnlIndividual.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        lblTotalBsIndividual.setText("________");
        pnlIndividual.add(lblTotalBsIndividual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel7.setText("Bs.");
        pnlIndividual.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        btnContinuarIndividual.setText("Continuar");
        btnContinuarIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarIndividualActionPerformed(evt);
            }
        });
        pnlIndividual.add(btnContinuarIndividual, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 120, -1));

        jPanel1.add(pnlIndividual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 500, 220));

        pnlGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C.I. Responsable", "Cantidad equipos", "Monto total (Bs.)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReporte);

        pnlGeneral.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 460, 140));

        lblTotalUnidadesGeneral.setText("___");
        pnlGeneral.add(lblTotalUnidadesGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel10.setText("equipos.");
        pnlGeneral.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        lblTotalBsGeneral.setText("________");
        pnlGeneral.add(lblTotalBsGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel8.setText("Totalización:");
        pnlGeneral.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel12.setText("Bs.");
        pnlGeneral.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        btnContinuarGeneral.setText("Continuar");
        btnContinuarGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarGeneralActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnContinuarGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 120, -1));

        jPanel1.add(pnlGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 480, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdBtnIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnIndividualActionPerformed
        rdBtnIndividual.setSelected(true); 
        rdBtnGeneral.setSelected(false); 
        
        //Ocultar el panel para reporte general
        pnlGeneral.setVisible(false); 
        
        //Mostrar el panel para reporte individual
        pnlIndividual.setVisible(true); 
    }//GEN-LAST:event_rdBtnIndividualActionPerformed

    private void rdBtnGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnGeneralActionPerformed
        rdBtnGeneral.setSelected(true); 
        rdBtnIndividual.setSelected(false); 
        
        //Ocultar el panel para reporte individual
        pnlIndividual.setVisible(false); 
        
        //Mostrar el panel para reporte general
        pnlGeneral.setVisible(true); 
    }//GEN-LAST:event_rdBtnGeneralActionPerformed

    private void btnContinuarIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarIndividualActionPerformed
        this.setVisible(false); 
        lblTotalUnidadesIndividual.setText("___"); 
        lblTotalBsIndividual.setText("________"); 
        lblTotalUnidadesGeneral.setText("___"); 
        lblTotalBsGeneral.setText("________");
        txtResponsable.setText(""); 
        for(int i = 0; i < tabla.getRowCount(); i++) {
            tabla.removeRow(0);
        }
    }//GEN-LAST:event_btnContinuarIndividualActionPerformed

    private void btnContinuarGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarGeneralActionPerformed
        this.setVisible(false); 
        lblTotalUnidadesIndividual.setText("___"); 
        lblTotalBsIndividual.setText("________"); 
        lblTotalUnidadesGeneral.setText("___"); 
        lblTotalBsGeneral.setText("________");
        txtResponsable.setText(""); 
        for(int i = 0; i < tabla.getRowCount(); i++) {
            tabla.removeRow(0);
        }
    }//GEN-LAST:event_btnContinuarGeneralActionPerformed

    private void btnTotalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalizarActionPerformed
        String cedulaResponsable = txtResponsable.getText(); 
        if(responsables.containsKey(cedulaResponsable)){
            //Si el profesor tiene elementos asociados
            Profesor responsable = responsables.get(cedulaResponsable); 
            //Imprimir valores
            lblTotalUnidadesIndividual.setText("" + responsable.getTotalUnidades() + ""); 
            lblTotalBsIndividual.setText("" + responsable.getTotalBs() + ""); 
        } else {
            //Si el profesor no tiene elementos asociados
            lblTotalUnidadesIndividual.setText("0"); 
            lblTotalBsIndividual.setText("0");
        }
    }//GEN-LAST:event_btnTotalizarActionPerformed

    public void setResponsables(Hashtable<String, Profesor> responsables) {
        this.responsables = responsables;
    }
    
    public void llenarTabla() {
        Enumeration cedulas = responsables.keys();  
        String[] fila = new String[3]; 
        Object cedula; 
        Profesor responsable; 
        int totalUnidadesGeneral = 0; 
        double totalBsGeneral = 0; 
        while(cedulas.hasMoreElements()){
            cedula = cedulas.nextElement(); 
            responsable = responsables.get(cedula); 
            fila[0] = cedula.toString();
            fila[1] = "" + responsable.getTotalUnidades() + "";  
            fila[2] = "" + responsable.getTotalBs() + ""; 
            this.tabla.addRow(fila);
            totalUnidadesGeneral += responsable.getTotalUnidades(); 
            totalBsGeneral += responsable.getTotalBs(); 
        }
        
        lblTotalUnidadesGeneral.setText(""+totalUnidadesGeneral+""); 
        lblTotalBsGeneral.setText(""+totalBsGeneral+""); 
    }
    
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
            java.util.logging.Logger.getLogger(IReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuarGeneral;
    private javax.swing.JButton btnContinuarIndividual;
    private javax.swing.JButton btnTotalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalBsGeneral;
    private javax.swing.JLabel lblTotalBsIndividual;
    private javax.swing.JLabel lblTotalUnidadesGeneral;
    private javax.swing.JLabel lblTotalUnidadesIndividual;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlIndividual;
    private javax.swing.JRadioButton rdBtnGeneral;
    private javax.swing.JRadioButton rdBtnIndividual;
    private javax.swing.JTable tblReporte;
    private javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables
}
