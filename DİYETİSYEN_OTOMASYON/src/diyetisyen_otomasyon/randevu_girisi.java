
package diyetisyen_otomasyon;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Taner Sancaklı
 */
public class randevu_girisi extends javax.swing.JFrame {

    /**
     * Creates new form randevu_girişi
     */
    

    
    public randevu_girisi(String g_veri) {
        initComponents();
     
         veri_yukle.setText(g_veri);
    }

    randevu_girisi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
       
      public void r_kaydet(){
          
        try {
            
            
            String randevu_saati=String.valueOf(c_randevu.getSelectedItem());
            String gun=String.valueOf(c_gun.getSelectedItem());
            String ay=String.valueOf(c_ay.getSelectedItem());
            String yil=String.valueOf(c_yil.getSelectedItem());
            
            String randevu_tarihi=gun + " / " + ay + " / " + yil;
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            Statement st,st1 = null;
            ResultSet rs,rs1 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st1 = (Statement) con.createStatement();
            
            rs1 = st1.executeQuery("select * from uyeler where tc_no='"+veri_yukle.getText()+"'");
            
            if(rs1.next()){
                int uye_id_al = Integer.parseInt(rs1.getString("id"));
                
                st = (Statement) con.createStatement();
                String sql = "INSERT INTO muayene_alma (uye_id,randevu_tarihi,randevu_saati,kayit)" 
                + " VALUES ('"+uye_id_al+"','"+randevu_tarihi+"','"+randevu_saati+"','0')";

                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, " İşleminiz Gerçekleşmiştir.");
            }  
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
         
      }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c_ay = new javax.swing.JComboBox<>();
        c_gun = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        c_yil = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        c_randevu = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        veri_yukle = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 520));
        setPreferredSize(new java.awt.Dimension(610, 520));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Randevu Saati:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 120, 120, 14);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Randevu Tarihi:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 180, 116, 22);

        c_ay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AY", "OCAK", "ŞUBAT", "MART", "NİSAN", "MAYIS", "HAZİRAN", "TEMMUZ", "AĞUSTOS", "EYLÜL", "EKİM", "KASIM", "ARALIK" }));
        c_ay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_ayActionPerformed(evt);
            }
        });
        getContentPane().add(c_ay);
        c_ay.setBounds(320, 170, 100, 30);

        c_gun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GÜN", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(c_gun);
        c_gun.setBounds(210, 170, 100, 30);

        jButton1.setBackground(new java.awt.Color(72 118 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/promo_tik.png"))); // NOI18N
        jButton1.setText("KAYDET");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setIconTextGap(-35);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 250, 120, 55);

        c_yil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YIL", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        c_yil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_yilActionPerformed(evt);
            }
        });
        getContentPane().add(c_yil);
        c_yil.setBounds(430, 170, 100, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ça.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(540, 20, 50, 50);

        c_randevu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEÇİNİZ", "ÖĞLEDEN ÖNCE", "ÖĞLEDEN SONRA" }));
        getContentPane().add(c_randevu);
        c_randevu.setBounds(210, 110, 210, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/tyuytu.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 600, 510);

        veri_yukle.setText("jTextField1");
        getContentPane().add(veri_yukle);
        veri_yukle.setBounds(70, 30, 59, 20);

        pack();
    }

    private void c_yilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_yilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_yilActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         r_kaydet();    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        randevu_girisi degisken_adi = new randevu_girisi(null);
        degisken_adi.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void c_ayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_ayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_ayActionPerformed

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
            java.util.logging.Logger.getLogger(randevu_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(randevu_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(randevu_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(randevu_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new randevu_girisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c_ay;
    private javax.swing.JComboBox<String> c_gun;
    private javax.swing.JComboBox<String> c_randevu;
    private javax.swing.JComboBox<String> c_yil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField veri_yukle;
    // End of variables declaration//GEN-END:variables

    

   

   
}
