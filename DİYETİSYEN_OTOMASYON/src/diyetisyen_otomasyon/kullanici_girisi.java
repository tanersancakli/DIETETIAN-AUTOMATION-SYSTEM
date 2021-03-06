
package diyetisyen_otomasyon;

/**
 *
 * @author Taner Sancaklı
 */
public class kullanici_girisi extends javax.swing.JFrame {

    /**
     * Creates new form kullanıcı_girişi
     */
    public kullanici_girisi() {
        super("Kullanıcı Girişi");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 430));
        setPreferredSize(new java.awt.Dimension(600, 430));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(72 118 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Personel Girişi");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 350, 120, 35);

        jButton2.setBackground(new java.awt.Color(72 118 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Hasta Girişi");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 350, 120, 35);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel2.setText("DİYETİSYEN OTOMASYONU");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 30, 560, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kalp.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-30, 10, 220, 140);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/personel1.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 200, 190, 150);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/per.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 120, 250, 270);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/tyuytu.png"))); // NOI18N
        jLabel3.setMinimumSize(new java.awt.Dimension(600, 430));
        jLabel3.setPreferredSize(new java.awt.Dimension(600, 430));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       personel_girisi  deneme = new personel_girisi();
      deneme.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        hasta_girisi  deneme = new hasta_girisi();
      deneme.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kullanici_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kullanici_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kullanici_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kullanici_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanici_girisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
