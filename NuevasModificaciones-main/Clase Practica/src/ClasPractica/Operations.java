/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ClasPractica;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Operations extends javax.swing.JFrame {

    /**
     * Creates new form Operations
     */
    public Operations() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtn1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtn2 = new javax.swing.JTextField();
        ccsuma = new javax.swing.JRadioButton();
        ccresta = new javax.swing.JRadioButton();
        ccmulti = new javax.swing.JRadioButton();
        ccdivi = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtresultado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(0, 153, 153));
        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("CALCULOS");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 478, 50));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresar numero:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 58, 172, 27));

        txtn1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 61, 148, -1));

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingresar numero:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 91, 172, 27));

        txtn2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 94, 148, -1));

        ccsuma.setBackground(new java.awt.Color(0, 0, 204));
        buttonGroup1.add(ccsuma);
        ccsuma.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ccsuma.setText("Suma");
        getContentPane().add(ccsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 146, -1, -1));

        ccresta.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(ccresta);
        ccresta.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ccresta.setText("Resta");
        getContentPane().add(ccresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 146, -1, -1));

        ccmulti.setBackground(new java.awt.Color(255, 204, 0));
        buttonGroup1.add(ccmulti);
        ccmulti.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ccmulti.setText("Multiplicacion");
        getContentPane().add(ccmulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 146, -1, -1));

        ccdivi.setBackground(new java.awt.Color(0, 204, 0));
        buttonGroup1.add(ccdivi);
        ccdivi.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ccdivi.setText("Division");
        getContentPane().add(ccdivi, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 146, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Resultado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 202, 98, -1));

        txtresultado.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txtresultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 230, 90, -1));

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 199, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Amiges/matematica.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 480, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int n1, n2, result = 0;
        n1 = Integer.parseInt(txtn1.getText());
        n2 = Integer.parseInt(txtn2.getText());
        if(ccsuma.isSelected()){
            result = n1 + n2;
        } else if(ccresta.isSelected()){
            result = n1 - n2;
        }else if(ccmulti.isSelected()){
            result = n1 * n2;
        }else if(ccdivi.isSelected()){
            result = n1 / n2;
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona la operacion a realizar: ");
        }
        txtresultado.setText("" +result);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtn1.setText(null);
        txtn2.setText(null);
        txtresultado.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton ccdivi;
    private javax.swing.JRadioButton ccmulti;
    private javax.swing.JRadioButton ccresta;
    private javax.swing.JRadioButton ccsuma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtn1;
    private javax.swing.JTextField txtn2;
    private javax.swing.JTextField txtresultado;
    // End of variables declaration//GEN-END:variables
}
