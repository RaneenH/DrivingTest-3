/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivingtest;

/**
 *
 * @author Raneen
 */
public class Question5 extends javax.swing.JFrame {
private static double score5;
    /**
     * Creates new form Question5
     */
    public Question5() {
        initComponents();
        jProgressBar1.setValue(80);
        jProgressBar1.setStringPainted(true);
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
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Answer1 = new javax.swing.JRadioButton();
        Answer2 = new javax.swing.JRadioButton();
        Answer4 = new javax.swing.JRadioButton();
        Answer3 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(630, 442));
        getContentPane().setLayout(null);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(420, 40, 146, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Progress");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 20, 96, 22);

        jLabel2.setFont(new java.awt.Font("Vijaya", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Question 5");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 30, 102, 22);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("What does this sign mean?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 110, 360, 61);

        buttonGroup1.add(Answer1);
        Answer1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Answer1.setText("The road ahead has poor traction");
        getContentPane().add(Answer1);
        Answer1.setBounds(320, 180, 212, 23);

        buttonGroup1.add(Answer2);
        Answer2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Answer2.setText("Road ahead gets slippery when wet");
        Answer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answer2ActionPerformed(evt);
            }
        });
        getContentPane().add(Answer2);
        Answer2.setBounds(320, 210, 222, 23);

        buttonGroup1.add(Answer4);
        Answer4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Answer4.setText("Hilly road ahead");
        getContentPane().add(Answer4);
        Answer4.setBounds(320, 270, 119, 23);

        buttonGroup1.add(Answer3);
        Answer3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Answer3.setText("Winding road ahead");
        getContentPane().add(Answer3);
        Answer3.setBounds(320, 240, 141, 23);

        jButton2.setBackground(new java.awt.Color(0, 102, 51));
        jButton2.setFont(new java.awt.Font("Andalus", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 51));
        jButton2.setText("RESTART");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 360, 109, 30);

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Andalus", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 51));
        jButton1.setText("FINISH");
        jButton1.setMaximumSize(new java.awt.Dimension(148, 29));
        jButton1.setMinimumSize(new java.awt.Dimension(148, 29));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(510, 360, 108, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drivingtest/5.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 140, 198, 201);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drivingtest/carbk.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -4, 680, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Answer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Answer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Answer2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new StartPage().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(Answer2.isSelected()){
        score5 = 2;
    }
    else score5 =0;
        jProgressBar1.setValue(100);
        this.setVisible(false);
        new ScorePage().setVisible(true);
    }                                        

    public static double getScore(){
        return score5;
        }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Answer1;
    private javax.swing.JRadioButton Answer2;
    private javax.swing.JRadioButton Answer3;
    private javax.swing.JRadioButton Answer4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
