/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
import javax.swing.*;
public class history extends javax.swing.JFrame {

    /**
     * Creates new form history
     */
    public history() {
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

        jPanel1 = new javax.swing.JPanel();
        abacus = new javax.swing.JButton();
        LIEBNIZ = new javax.swing.JButton();
        napier = new javax.swing.JButton();
        pascaline = new javax.swing.JButton();
        DIFFERENCE = new javax.swing.JButton();
        ANALYTICAL = new javax.swing.JButton();
        tabulating = new javax.swing.JButton();
        differential = new javax.swing.JButton();
        mark1 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abacus.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        abacus.setText("ABACUS");
        abacus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abacusActionPerformed(evt);
            }
        });
        jPanel1.add(abacus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        LIEBNIZ.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LIEBNIZ.setText("LEIBNIZ WHEEL");
        LIEBNIZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIEBNIZActionPerformed(evt);
            }
        });
        jPanel1.add(LIEBNIZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 780, -1, 30));

        napier.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        napier.setText("NAPIER'S BONES");
        napier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                napierActionPerformed(evt);
            }
        });
        jPanel1.add(napier, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 780, -1, -1));

        pascaline.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        pascaline.setText("PASCALINE");
        pascaline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pascalineActionPerformed(evt);
            }
        });
        jPanel1.add(pascaline, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, -1));

        DIFFERENCE.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        DIFFERENCE.setText("DIFFERENCE ENGINE");
        DIFFERENCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIFFERENCEActionPerformed(evt);
            }
        });
        jPanel1.add(DIFFERENCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 310, -1, -1));

        ANALYTICAL.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ANALYTICAL.setText("ANALYTICAL ENGINE");
        ANALYTICAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANALYTICALActionPerformed(evt);
            }
        });
        jPanel1.add(ANALYTICAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, -1, 30));

        tabulating.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        tabulating.setText("TABULATING MACHINE");
        tabulating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabulatingActionPerformed(evt);
            }
        });
        jPanel1.add(tabulating, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 550, -1, -1));

        differential.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        differential.setText("DIFFERENTIAL ANALYZER");
        differential.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                differentialActionPerformed(evt);
            }
        });
        jPanel1.add(differential, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        mark1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        mark1.setText("MARK 1");
        mark1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mark1ActionPerformed(evt);
            }
        });
        jPanel1.add(mark1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 780, 110, 30));

        exit.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        exit.setText("PREV");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication2\\src\\JAVA.HISTORY.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void napierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_napierActionPerformed
        new napier().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_napierActionPerformed

    private void abacusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abacusActionPerformed
       new abacus().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_abacusActionPerformed

    private void LIEBNIZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIEBNIZActionPerformed
        new LIEBNIZ().setVisible(true);        
        this.setVisible(false);

    }//GEN-LAST:event_LIEBNIZActionPerformed

    private void pascalineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pascalineActionPerformed
        new pascaline().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pascalineActionPerformed

    private void DIFFERENCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIFFERENCEActionPerformed
         new differential().setVisible(true);    
        this.setVisible(false);

    }//GEN-LAST:event_DIFFERENCEActionPerformed

    private void ANALYTICALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANALYTICALActionPerformed
         new ANALYTICAL().setVisible(true);       
        this.setVisible(false);

    }//GEN-LAST:event_ANALYTICALActionPerformed

    private void tabulatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabulatingActionPerformed
        new tabulating().setVisible(true);        
        this.setVisible(false);

    }//GEN-LAST:event_tabulatingActionPerformed

    private void differentialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_differentialActionPerformed
        new differential().setVisible(true);         
        this.setVisible(false);

    }//GEN-LAST:event_differentialActionPerformed

    private void mark1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mark1ActionPerformed
        new mark1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mark1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        new login().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new history().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ANALYTICAL;
    private javax.swing.JButton DIFFERENCE;
    private javax.swing.JButton LIEBNIZ;
    private javax.swing.JButton abacus;
    private javax.swing.JButton differential;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mark1;
    private javax.swing.JButton napier;
    private javax.swing.JButton pascaline;
    private javax.swing.JButton tabulating;
    // End of variables declaration//GEN-END:variables
}
