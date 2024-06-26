package app;

/**
 *
 * @author caioa
 */
public class BhaskaraTela extends javax.swing.JFrame {

    /**
     * Creates new form BhaskaraTela
     */
    public BhaskaraTela() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spinA = new javax.swing.JSpinner();
        spinB = new javax.swing.JSpinner();
        spinC = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDelta = new javax.swing.JButton();
        btnX1 = new javax.swing.JButton();
        btnX2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblDelta = new javax.swing.JLabel();
        lblX1 = new javax.swing.JLabel();
        lblX2 = new javax.swing.JLabel();
        lblDeltaB = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        lblDeltaA = new javax.swing.JLabel();
        lblDeltaC = new javax.swing.JLabel();
        lblP4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblX1B = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblX1Delta = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblX1A = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblX2B = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblX2Delta = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblX2A = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spinA.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        spinA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinAStateChanged(evt);
            }
        });

        spinB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        spinB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinBStateChanged(evt);
            }
        });

        spinC.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        spinC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinCStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("x² +");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("x +");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel3.setText("Equação de bhaskara");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Meu projeto (3).jpg"))); // NOI18N

        btnDelta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnDelta.setText("Δ");
        btnDelta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeltaActionPerformed(evt);
            }
        });

        btnX1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnX1.setText("x¹");
        btnX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnX1ActionPerformed(evt);
            }
        });

        btnX2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnX2.setText("x²");
        btnX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnX2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("=");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("=");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("=");

        lblDelta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDelta.setForeground(new java.awt.Color(0, 102, 255));
        lblDelta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblX1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblX1.setForeground(new java.awt.Color(0, 102, 255));
        lblX1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblX2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblX2.setForeground(new java.awt.Color(0, 102, 255));
        lblX2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblDeltaB.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblDeltaB.setForeground(new java.awt.Color(255, 0, 102));
        lblDeltaB.setText("b");

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel99.setText("² - 4 *");

        lblDeltaA.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblDeltaA.setForeground(new java.awt.Color(255, 0, 102));
        lblDeltaA.setText("a");

        lblDeltaC.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblDeltaC.setForeground(new java.awt.Color(255, 0, 102));
        lblDeltaC.setText("c");

        lblP4.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblP4.setText("*");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel5.setText("(-");

        lblX1B.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblX1B.setForeground(new java.awt.Color(255, 0, 102));
        lblX1B.setText("b");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel10.setText("+ √");

        lblX1Delta.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblX1Delta.setForeground(new java.awt.Color(255, 0, 102));
        lblX1Delta.setText("Δ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel12.setText(") / 2 *");

        lblX1A.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblX1A.setForeground(new java.awt.Color(255, 0, 102));
        lblX1A.setText("a");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel14.setText("(-");

        lblX2B.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblX2B.setForeground(new java.awt.Color(255, 0, 102));
        lblX2B.setText("b");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel16.setText("- √");

        lblX2Delta.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblX2Delta.setForeground(new java.awt.Color(255, 0, 102));
        lblX2Delta.setText("Δ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel19.setText(") / 2 * ");

        lblX2A.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblX2A.setForeground(new java.awt.Color(255, 0, 102));
        lblX2A.setText("a");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(spinA, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(spinB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(spinC, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnX2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnDelta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnX1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblX2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblX1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDelta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(4, 4, 4)
                                .addComponent(lblX2B)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(lblX2Delta))
                                    .addComponent(jLabel16))
                                .addGap(6, 6, 6)
                                .addComponent(jLabel19)
                                .addGap(2, 2, 2)
                                .addComponent(lblX2A))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDeltaB)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel99)
                                .addGap(6, 6, 6)
                                .addComponent(lblDeltaA)
                                .addGap(8, 8, 8)
                                .addComponent(lblP4)
                                .addGap(8, 8, 8)
                                .addComponent(lblDeltaC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(4, 4, 4)
                                .addComponent(lblX1B)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel10)
                                .addGap(1, 1, 1)
                                .addComponent(lblX1Delta)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblX1A)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spinB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spinA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spinC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnDelta)
                                        .addComponent(jLabel7))
                                    .addComponent(lblDelta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnX1)
                                        .addComponent(jLabel8))
                                    .addComponent(lblX1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblX2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnX2)
                                        .addComponent(jLabel9))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDeltaB)
                                    .addComponent(jLabel99)
                                    .addComponent(lblDeltaA)
                                    .addComponent(lblP4)
                                    .addComponent(lblDeltaC))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(lblX1B)
                                    .addComponent(jLabel10)
                                    .addComponent(lblX1Delta)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(lblX1A)))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(lblX2B)
                                    .addComponent(lblX2Delta)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel19)
                                    .addComponent(lblX2A)))))
                    .addComponent(jLabel4))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeltaActionPerformed
          
        int varA = (int) spinA.getValue();
        int varB = (int) spinB.getValue();
        int varC = (int) spinC.getValue();
        double delta = ((Math.pow(varB, 2)) - (4 * varA * varC));
        lblDelta.setText(Double.toString(delta));
        lblX1Delta.setText(Double.toString(delta));
        lblX2Delta.setText(Double.toString(delta));
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeltaActionPerformed

    private void btnX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnX1ActionPerformed
        int varA = (int) spinA.getValue();
        int varB = (int) spinB.getValue();
        int varC = (int) spinC.getValue();
        int delta = (int) (Math.pow(varB, 2)) - (4 * varA * varC);
        if (delta >= 0) {
        double x1 =  ((varB * -1) + Math.sqrt(delta)) / (2 * varA);
        lblX1.setText(Double.toString(x1));
        }
        else {
          lblX1.setText("x¹ = Ø");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnX1ActionPerformed

    private void btnX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnX2ActionPerformed
        int varA = (int) spinA.getValue();
        int varB = (int) spinB.getValue();
        int varC = (int) spinC.getValue();
        int delta = (int) (Math.pow(varB, 2)) - (4 * varA * varC);
        if (delta > 0) {
        double x2 =  ((varB * -1) - Math.sqrt(delta)) / (2 * varA);
        lblX2.setText(Double.toString(x2));
        }
        else if (delta == 0) {
          lblX2.setText("x¹ = x²");
        }
        else {
          lblX2.setText("x² = Ø");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnX2ActionPerformed

    private void spinAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinAStateChanged
         lblDeltaA.setText(spinA.getValue().toString());
         lblX1A.setText(spinA.getValue().toString());
         lblX2A.setText(spinA.getValue().toString());
// TODO add your handling code here:
    }//GEN-LAST:event_spinAStateChanged

    private void spinBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinBStateChanged
         lblDeltaB.setText(spinB.getValue().toString());
         lblX1B.setText(spinB.getValue().toString());
         lblX2B.setText(spinB.getValue().toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_spinBStateChanged

    private void spinCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinCStateChanged
       lblDeltaC.setText(spinC.getValue().toString());
// TODO add your handling code here:
    }//GEN-LAST:event_spinCStateChanged

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
            java.util.logging.Logger.getLogger(BhaskaraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BhaskaraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BhaskaraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BhaskaraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BhaskaraTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelta;
    private javax.swing.JButton btnX1;
    private javax.swing.JButton btnX2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel lblDelta;
    private javax.swing.JLabel lblDeltaA;
    private javax.swing.JLabel lblDeltaB;
    private javax.swing.JLabel lblDeltaC;
    private javax.swing.JLabel lblP4;
    private javax.swing.JLabel lblX1;
    private javax.swing.JLabel lblX1A;
    private javax.swing.JLabel lblX1B;
    private javax.swing.JLabel lblX1Delta;
    private javax.swing.JLabel lblX2;
    private javax.swing.JLabel lblX2A;
    private javax.swing.JLabel lblX2B;
    private javax.swing.JLabel lblX2Delta;
    private javax.swing.JSpinner spinA;
    private javax.swing.JSpinner spinB;
    private javax.swing.JSpinner spinC;
    // End of variables declaration//GEN-END:variables
}
