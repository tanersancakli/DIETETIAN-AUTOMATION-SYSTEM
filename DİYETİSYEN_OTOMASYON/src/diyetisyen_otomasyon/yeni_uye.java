
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
public class yeni_uye extends javax.swing.JFrame {

    /**
     * Creates new form yeni_üye
     */
    public yeni_uye() {
        super("Yeni Üye Girişi");
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_tc = new javax.swing.JTextField();
        txt_adi = new javax.swing.JTextField();
        txt_soyadi = new javax.swing.JTextField();
        radio_e = new javax.swing.JRadioButton();
        radio_k = new javax.swing.JRadioButton();
        txt_dyeri = new javax.swing.JTextField();
        combo_yil = new javax.swing.JComboBox<>();
        combo_ay = new javax.swing.JComboBox<>();
        combo_gun = new javax.swing.JComboBox<>();
        txt_sifre = new javax.swing.JPasswordField();
        txt_badi = new javax.swing.JTextField();
        txt_aadi = new javax.swing.JTextField();
        txt_cep = new javax.swing.JTextField();
        txt_adres = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        jLabel11.setText("Gün:");

        jLabel12.setText("Ay:");

        jLabel13.setText("Yıl:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 520));
        setPreferredSize(new java.awt.Dimension(600, 520));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("TC Kimlik:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 61, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Adı:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 22, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Soyadı:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 41, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Cinsiyet:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 140, 48, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Doğum Yeri:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 180, 72, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Doğum Tarihi:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 220, 82, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Baba Adı:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 260, 53, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Anne Adı:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 300, 55, 17);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Tel:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 340, 21, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Adres:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 380, 36, 17);
        getContentPane().add(txt_tc);
        txt_tc.setBounds(130, 10, 130, 30);

        txt_adi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_adiActionPerformed(evt);
            }
        });
        getContentPane().add(txt_adi);
        txt_adi.setBounds(130, 50, 130, 30);
        getContentPane().add(txt_soyadi);
        txt_soyadi.setBounds(130, 90, 130, 30);

        radio_e.setText("Erkek");
        getContentPane().add(radio_e);
        radio_e.setBounds(130, 130, 70, 30);

        radio_k.setSelected(true);
        radio_k.setText("Kadın");
        getContentPane().add(radio_k);
        radio_k.setBounds(210, 130, 70, 30);
        getContentPane().add(txt_dyeri);
        txt_dyeri.setBounds(130, 170, 130, 30);

        combo_yil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YIL", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", " " }));
        getContentPane().add(combo_yil);
        combo_yil.setBounds(320, 210, 90, 30);

        combo_ay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AY", "OCAK", "ŞUBAT", "MART", "NİSAN", "MAYIS", "HAZİRAN", "TEMMUZ", "AĞUSTOS", "EYLÜL", "EKİM", "KASIM", "ARALIK" }));
        getContentPane().add(combo_ay);
        combo_ay.setBounds(220, 210, 90, 30);

        combo_gun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GÜN", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(combo_gun);
        combo_gun.setBounds(130, 210, 80, 30);
        getContentPane().add(txt_sifre);
        txt_sifre.setBounds(130, 450, 130, 30);
        getContentPane().add(txt_badi);
        txt_badi.setBounds(130, 290, 130, 30);
        getContentPane().add(txt_aadi);
        txt_aadi.setBounds(130, 250, 130, 30);
        getContentPane().add(txt_cep);
        txt_cep.setBounds(130, 330, 130, 30);
        getContentPane().add(txt_adres);
        txt_adres.setBounds(130, 370, 130, 30);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/promo_tik.png"))); // NOI18N
        jButton1.setText("KAYDET");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setIconTextGap(-30);
        jButton1.setInheritsPopupMenu(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 410, 120, 40);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("E-mail:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(30, 420, 39, 17);
        getContentPane().add(txt_email);
        txt_email.setBounds(130, 410, 130, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Şifre:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(30, 460, 30, 17);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ça.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(520, 10, 50, 50);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/tyuytu.png"))); // NOI18N
        jLabel16.setMinimumSize(new java.awt.Dimension(600, 520));
        jLabel16.setPreferredSize(new java.awt.Dimension(600, 520));
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 590, 510);

        pack();
    }

    private void txt_adiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_adiActionPerformed
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          try {
              
            String gun=String.valueOf(combo_gun.getSelectedItem());
            String ay=String.valueOf(combo_ay.getSelectedItem());
            String yil=String.valueOf(combo_yil.getSelectedItem());
            
            String d_tarihi=gun + " / " + ay + " / " + yil;
            
            String tc=txt_tc.getText();
            String adi=txt_adi.getText();
            String soyadi=txt_soyadi.getText();
            
            // Tarih bilgisi eklenecek
            String dyeri=txt_dyeri.getText();
            
            String erkek=radio_e.getText();
            String kadin=radio_k.getText();
             
            String baba_adi=txt_badi.getText();
            String anne_adi=txt_aadi.getText();
            String tel=txt_cep.getText();
            String adres=txt_adres.getText();
            String email=txt_email.getText();
            String sifre=txt_sifre.getText();
            
            if(tc.equals("")){
                JOptionPane.showMessageDialog(null, "Lütfen Boş Alanları Doldurunuz!");
            }
            else{

                Class.forName("com.mysql.jdbc.Driver");

                Connection con = null;
                Statement st = null;
                ResultSet rs = null;

                con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
                st = (Statement) con.createStatement();
                
                if(radio_e.isSelected()==true){
                    
                    String sql = "INSERT INTO uyeler (tc_no,adi,soyadi,dtarihi,dyeri,baba_adi,anne_adi,cinsiyet,cep_no,adres,email,sifre)" 
                            + " VALUES ('"+tc+"', '"+adi+"', '"+soyadi+"','"+d_tarihi+"','"+dyeri+"','"+baba_adi+"','"+anne_adi+"','Erkek','"+tel+"', '"+adres+"', '"+email+"', '"+sifre+"')";

                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Sayın "+ adi + " "+ soyadi + " İşleminiz Gerçekleşmiştir.");
                     
                    
                }
                 else if(radio_k.isSelected()==true){
                      String sql = "INSERT INTO uyeler (tc_no,adi,soyadi,dtarihi,dyeri,baba_adi,anne_adi,cinsiyet,cep_no,adres,email,sifre)" 
                        + " VALUES ('"+tc+"', '"+adi+"', '"+soyadi+"','"+d_tarihi+"','"+dyeri+"','"+baba_adi+"','"+anne_adi+"','Kadın','"+tel+"', '"+adres+"', '"+email+"', '"+sifre+"')";
 
                      st.executeUpdate(sql);
                      JOptionPane.showMessageDialog(null, "Sayın "+ adi + " "+ soyadi + " İşleminiz Gerçekleşmiştir.");
                       
                 }
            }
            
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        yeni_uye degisken_adi = new yeni_uye();
        degisken_adi.setVisible(false);
        dispose();
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
            java.util.logging.Logger.getLogger(yeni_uye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yeni_uye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yeni_uye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yeni_uye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yeni_uye().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_ay;
    private javax.swing.JComboBox<String> combo_gun;
    private javax.swing.JComboBox<String> combo_yil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton radio_e;
    private javax.swing.JRadioButton radio_k;
    private javax.swing.JTextField txt_aadi;
    private javax.swing.JTextField txt_adi;
    private javax.swing.JTextField txt_adres;
    private javax.swing.JTextField txt_badi;
    private javax.swing.JTextField txt_cep;
    private javax.swing.JTextField txt_dyeri;
    private javax.swing.JTextField txt_email;
    private javax.swing.JPasswordField txt_sifre;
    private javax.swing.JTextField txt_soyadi;
    private javax.swing.JTextField txt_tc;
    // End of variables declaration//GEN-END:variables
}
