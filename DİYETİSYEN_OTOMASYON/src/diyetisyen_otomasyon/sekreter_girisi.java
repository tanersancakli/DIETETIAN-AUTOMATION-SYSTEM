
package diyetisyen_otomasyon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Taner Sancaklı
 */
public class sekreter_girisi extends javax.swing.JFrame {

    /**
     * Creates new form sekreter_girişi
     */
    public void randevu_ara(){
        
         String baslik1[] = new String[]{ "TC Kimlik No", "Adı", "Soyadı", "Randevu Tarihi","Randevu Saati"};  

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st = con.createStatement();
            
            String sorgu2 = "select * from uyeler inner join muayene_alma on uyeler.id=muayene_alma.uye_id where muayene_alma.kayit='1' order by uyeler.id";
            
            st = con.createStatement();
            rs = st.executeQuery(sorgu2);
            
            rs.last();
            int kayitsayisi1 = rs.getRow();
            rs.beforeFirst();

            Object data1[][] = new Object[kayitsayisi1][];
            int i = 0;

            while (rs.next()) {

                data1[i] = new Object[]{  
                    
                    rs.getString("tc_no"),
                    rs.getString("adi"),
                    rs.getString("soyadi"),
                    rs.getString("randevu_tarihi"),
                    rs.getString("randevu_saati"),
                };
                i++;
            }
           
            table_randevu_ara.setModel(new DefaultTableModel(data1, baslik1));
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
    }
      public void onayla(){ 
          
          String baslik[] = new String[]{ "TC Kimlik No", "Adı", "Soyadı", "Randevu Tarihi","Randevu Saati"};  

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st = con.createStatement();
            
            String sorgu21 = "select * from uyeler inner join muayene_alma on uyeler.id=muayene_alma.uye_id where muayene_alma.kayit='0' order by uyeler.id";
            
            st = con.createStatement();
            rs = st.executeQuery(sorgu21);
            
            rs.last();
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("tc_no"),  
                    rs.getString("adi"),
                    rs.getString("soyadi"),
                    rs.getString("randevu_tarihi"),
                    rs.getString("randevu_saati"),
                };
                i++;
            }
           
            table_onayla.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
          
      }
    public sekreter_girisi() {
        super("Sekreter Girişi");
        initComponents();
        
         randevu_ara();
         onayla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txt_tc = new javax.swing.JTextField();
        txt_adi = new javax.swing.JTextField();
        txt_soyadi = new javax.swing.JTextField();
        txt_ucret = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_onayla = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        combo_gun = new javax.swing.JComboBox<>();
        combo_yil = new javax.swing.JComboBox<>();
        combo_ay = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_randevu_ara = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jRadioButton2.setText("Ödenmedi");

        jRadioButton1.setText("Ödendi");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 425));
        setPreferredSize(new java.awt.Dimension(600, 425));
        getContentPane().setLayout(null);

        jPanel3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("TC Kimlik:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(40, 30, 90, 14);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Adı:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(40, 70, 60, 14);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Soyadı:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(40, 110, 80, 14);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Muayene Ücreti:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(40, 150, 120, 14);

        jButton2.setBackground(new java.awt.Color(72 118 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/promo_tik.png"))); // NOI18N
        jButton2.setText("KAYDET");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton2.setIconTextGap(-110);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(250, 210, 120, 55);
        jPanel3.add(txt_tc);
        txt_tc.setBounds(180, 20, 190, 30);
        jPanel3.add(txt_adi);
        txt_adi.setBounds(180, 60, 190, 30);
        jPanel3.add(txt_soyadi);
        txt_soyadi.setBounds(180, 100, 190, 30);
        jPanel3.add(txt_ucret);
        txt_ucret.setBounds(180, 140, 190, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/araa.png"))); // NOI18N
        jButton5.setText("ARA");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.setIconTextGap(-20);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(380, 10, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/tyuytu.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 410);

        jTabbedPane1.addTab("Vezne", jPanel3);

        jPanel4.setLayout(null);

        table_onayla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TC Kimlik", "ADI", "SOYADI", "RANDEVU TARİHİ", "RANDEVU SAATİ"
            }
        ));
        jScrollPane1.setViewportView(table_onayla);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(2, 80, 590, 91);

        jButton4.setBackground(new java.awt.Color(72 118 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/promo_tik.png"))); // NOI18N
        jButton4.setText("ONAYLA");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton4.setIconTextGap(-115);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(440, 200, 130, 55);

        jButton7.setBackground(new java.awt.Color(72 118 255));
        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/si.png"))); // NOI18N
        jButton7.setText("TEMİZLE");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setIconTextGap(-10);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);
        jButton7.setBounds(440, 270, 130, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/tyuytu.png"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(620, 420));
        jPanel4.add(jLabel1);
        jLabel1.setBounds(0, -6, 600, 420);

        jTabbedPane1.addTab("Randevu Onayla", jPanel4);

        jPanel2.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Tarih:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(30, 80, 61, 17);

        jButton3.setBackground(new java.awt.Color(72 118 255);
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/araa.png"))); // NOI18N
        jButton3.setText("ARA");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.setIconTextGap(-20);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(430, 60, 100, 50);

        combo_gun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GÜN", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(combo_gun);
        combo_gun.setBounds(90, 70, 90, 30);

        combo_yil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YIL", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", " " }));
        jPanel2.add(combo_yil);
        combo_yil.setBounds(300, 70, 100, 30);

        combo_ay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AY", "OCAK", "ŞUBAT", "MART", "NİSAN", "MAYIS", "HAZİRAN", "TEMMUZ", "AGUSTOS", "EYLÜL", "EKİM", "KASIM", "ARALIK" }));
        jPanel2.add(combo_ay);
        combo_ay.setBounds(190, 70, 100, 30);

        table_randevu_ara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TC Kimlik", "ADI", "SOYADI", "RANDEVU TARİHİ", "RANDEVU SAATİ"
            }
        ));
        jScrollPane2.setViewportView(table_randevu_ara);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 199, 580, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/tyuytu.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(-6, 0, 600, 410);

        jTabbedPane1.addTab("Randevu Ara", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 11, 630, 440);

        pack();
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String tc_no=txt_tc.getText();
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st = con.createStatement();
            
            String sorgu21 = "select * from uyeler where tc_no='"+tc_no+"'";
            rs = st.executeQuery(sorgu21);            
            rs.next();
            
            int kayitsayisi = rs.getRow();
            
            if(kayitsayisi>0){
                
                txt_adi.setText(rs.getString("adi"));
                txt_soyadi.setText(rs.getString("soyadi"));
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Böyle bir kullanıcı kayıtlı değil");
            }
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }    
       
            
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try {
            String gun=String.valueOf(combo_gun.getSelectedItem());
            String ay=String.valueOf(combo_ay.getSelectedItem());
            String yil=String.valueOf(combo_yil.getSelectedItem());

            String randevu_tarihi= gun + " / " + ay + " / " + yil;
            //JOptionPane.showMessageDialog(null,randevu_tarihi);

            String baslik1[] = new String[]{ "TC Kimlik No", "Adı", "Soyadı", "Randevu Tarihi","Randevu Saati"};  
 
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st = con.createStatement();
            
            String sorgu2 = "select * from uyeler inner join muayene_alma on uyeler.id=muayene_alma.uye_id where muayene_alma.randevu_tarihi='"+randevu_tarihi+"' and muayene_alma.kayit='1' order by uyeler.id";
            
            rs = st.executeQuery(sorgu2);            
            rs.last();
            
            int kayitsayisi1 = rs.getRow();
            rs.beforeFirst();

            Object data1[][] = new Object[kayitsayisi1][];
            int i = 0;

            while (rs.next()) {

                data1[i] = new Object[]{  
                    
                    rs.getString("tc_no"),
                    rs.getString("adi"),
                    rs.getString("soyadi"),
                    rs.getString("randevu_tarihi"),
                    rs.getString("randevu_saati"),
                };
                i++;
            }
           
            table_randevu_ara.setModel(new DefaultTableModel(data1, baslik1));
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try {
        
            int row=table_onayla.getSelectedRow();
            String secim_yap=(table_onayla.getValueAt(row, 0).toString());
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st = (com.mysql.jdbc.Statement) con.createStatement();
            
            rs = st.executeQuery("select * from uyeler where tc_no='"+secim_yap+"'");
            
            if(rs.next()){
                int id_no = Integer.parseInt(rs.getString("id"));
                
                String sql = "Update muayene_alma set kayit='1' where uye_id='"+id_no+"'";
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null,"İşleminiz Gerçekleşmiştir.");
              
            }
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
        
        randevu_ara();
        onayla();
        
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
        
            int row=table_onayla.getSelectedRow();
            String secim_yap=(table_onayla.getModel().getValueAt(row, 0).toString());
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st = (com.mysql.jdbc.Statement) con.createStatement();
            
            rs = st.executeQuery("select * from uyeler where tc_no='"+secim_yap+"'");
            
            if(rs.next()){
                int id_no = Integer.parseInt(rs.getString("id"));
                
                String sql = "Delete from muayene_alma where id='"+id_no+"'";
                st.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null,"İşleminiz Gerçekleşmiştir.");
              
            }
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
        
         randevu_ara();
        onayla();
        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try {
            
            String tc_no=txt_tc.getText();
            String adi=txt_adi.getText();
            String soyadi=txt_soyadi.getText();
            String ucret=txt_ucret.getText();
            
  
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            com.mysql.jdbc.Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st = (com.mysql.jdbc.Statement) con.createStatement();
            
            String sql = "insert into vezne (tc_no,adi,soyadi,ucret) values ('"+tc_no+"','"+adi+"','"+soyadi+"','"+ucret+"')";

            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, " İşleminiz Gerçekleşmiştir.");
           
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }        
        // Kayıt yapılacak.
        
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        String tc_no=txt_tc.getText();
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st = con.createStatement();
            
            String sorgu21 = "select * from uyeler where tc_no='"+tc_no+"'";
            rs = st.executeQuery(sorgu21);            
            rs.next();
            
            int kayitsayisi = rs.getRow();
            
            if(kayitsayisi>0){
                
                txt_adi.setText(rs.getString("adi"));
                txt_soyadi.setText(rs.getString("soyadi"));
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Böyle bir kullanıcı kayıtlı değil");
            }
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
    }

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
            java.util.logging.Logger.getLogger(sekreter_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sekreter_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sekreter_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sekreter_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sekreter_girisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_ay;
    private javax.swing.JComboBox<String> combo_gun;
    private javax.swing.JComboBox<String> combo_yil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable table_onayla;
    private javax.swing.JTable table_randevu_ara;
    private javax.swing.JTextField txt_adi;
    private javax.swing.JTextField txt_soyadi;
    private javax.swing.JTextField txt_tc;
    private javax.swing.JTextField txt_ucret;
    // End of variables declaration//GEN-END:variables
}
