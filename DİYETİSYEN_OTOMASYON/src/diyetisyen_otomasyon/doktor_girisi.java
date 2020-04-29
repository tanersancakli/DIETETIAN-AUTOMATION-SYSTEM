
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
public class doktor_girisi extends javax.swing.JFrame {

    /**
     * Creates new form doktor_girişi
     */
    public doktor_girisi() {
        super("Doktor Girişi");
        initComponents();
        
         String baslik[] = new String[]{ "TC Kimlik No", "Adı", "Soyadı", "Randevu Tarihi","Randevu Saati"};  

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st = con.createStatement();
            
            String sorgu21 = "select * from uyeler inner join muayene_alma on uyeler.id=muayene_alma.uye_id where muayene_alma.kayit='1' order by uyeler.adi ";
            
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
           
            table_randevular.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        String baslik1[] = new String[]{ "TC Kimlik No", "Adı", "Soyadı", "Randevu Saati"};  

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st = con.createStatement();
            
            String sorgu2 = "select * from uyeler inner join muayene_alma on uyeler.id=muayene_alma.uye_id where muayene_alma.kayit='1' order by uyeler.adi ";
            
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
                    rs.getString("randevu_saati"),
                    
                };
                i++;
            }
           
            table_randevuara.setModel(new DefaultTableModel(data1, baslik1));
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_tc = new javax.swing.JTextField();
        txt_adi = new javax.swing.JTextField();
        txt_soyadi = new javax.swing.JTextField();
        txt_cinsiyet = new javax.swing.JTextField();
        txt_dtarihi = new javax.swing.JTextField();
        txt_dyeri = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_yas = new javax.swing.JTextField();
        txt_kilo = new javax.swing.JTextField();
        txt_boy = new javax.swing.JTextField();
        txt_sikayet = new javax.swing.JTextField();
        txt_aciklama = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        table_randevular = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_randevuara = new javax.swing.JTable();
        ran_gun = new javax.swing.JComboBox<>();
        ran_ay = new javax.swing.JComboBox<>();
        ran_yil = new javax.swing.JComboBox<>();
        ran_yıl = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        jScrollPane4.setViewportView(jEditorPane1);

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
        jScrollPane5.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel15.setText("TC Kimlik:");

        jLabel16.setText("Adı:");

        jLabel17.setText("Soyadı:");

        jLabel18.setText("Cinsiyet:");

        jLabel19.setText("Doğum Tarihi:");

        jLabel20.setText("Doğum Yeri:");

        jLabel21.setText("Tel:");

        jLabel22.setText("Yaş:");

        jLabel23.setText("Kilo:");

        jLabel24.setText("Boy:");

        jLabel25.setText("Obezite Dururmu:");

        jRadioButton4.setText("Başlangıç");

        jRadioButton5.setText("Orta Düzey");

        jRadioButton6.setText("İleri Düzey");

        jLabel27.setText("Açıklama:");

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        jButton5.setText("GÜNCELLE");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel15)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addGap(10, 10, 10)
                            .addComponent(jRadioButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton6))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23)
                                .addComponent(jLabel22))
                            .addGap(19, 19, 19)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField22, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addComponent(jTextField21))))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 480));
        setPreferredSize(new java.awt.Dimension(600, 480));
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("TC Kimlik:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 30, 61, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Adı:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 70, 40, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Soyadı:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 110, 41, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Cinsiyet:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 150, 48, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Doğum Tarihi:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 190, 82, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Doğum Yeri:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 230, 72, 17);
        jPanel2.add(txt_tc);
        txt_tc.setBounds(110, 20, 100, 30);
        jPanel2.add(txt_adi);
        txt_adi.setBounds(110, 60, 100, 30);
        jPanel2.add(txt_soyadi);
        txt_soyadi.setBounds(110, 100, 100, 30);
        jPanel2.add(txt_cinsiyet);
        txt_cinsiyet.setBounds(110, 140, 100, 30);
        jPanel2.add(txt_dtarihi);
        txt_dtarihi.setBounds(110, 180, 100, 30);
        jPanel2.add(txt_dyeri);
        txt_dyeri.setBounds(110, 220, 100, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Yaş:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(320, 40, 40, 17);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Kilo:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(320, 80, 40, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Boy:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(320, 120, 25, 17);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Şikayet:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(260, 200, 50, 14);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Açıklama:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(250, 290, 55, 17);
        jPanel2.add(txt_yas);
        txt_yas.setBounds(380, 30, 100, 30);
        jPanel2.add(txt_kilo);
        txt_kilo.setBounds(380, 70, 101, 30);
        jPanel2.add(txt_boy);
        txt_boy.setBounds(380, 110, 100, 30);
        jPanel2.add(txt_sikayet);
        txt_sikayet.setBounds(320, 170, 245, 70);
        jPanel2.add(txt_aciklama);
        txt_aciklama.setBounds(320, 270, 250, 70);

        jButton1.setBackground(new java.awt.Color(72 118 255);
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/promo_tik.png"))); // NOI18N
        jButton1.setText("KAYDET");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.setIconTextGap(-115);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(10, 260, 130, 50);

        jButton2.setBackground(new java.awt.Color(72 118 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/button_refresh_100861.png"))); // NOI18N
        jButton2.setText("GÜNCELLE");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setIconTextGap(-21);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(10, 320, 130, 50);

        jButton4.setBackground(new java.awt.Color(72 118 255);
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("ARA");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setIconTextGap(-240);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(220, 10, 80, 40);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/tyuytu.png"))); // NOI18N
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel26);
        jLabel26.setBounds(0, -6, 590, 440);

        jTabbedPane1.addTab("Hasta Bilgileri", jPanel2);

        jPanel9.setLayout(null);

        table_randevular.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(table_randevular);

        jPanel9.add(jScrollPane8);
        jScrollPane8.setBounds(20, 130, 560, 91);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/tyuytu.png"))); // NOI18N
        jPanel9.add(jLabel28);
        jLabel28.setBounds(0, 0, 600, 420);

        jTabbedPane1.addTab("Randevularım", jPanel9);

        jPanel5.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Tarih:");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(20, 110, 43, 22);

        jButton3.setBackground(new java.awt.Color(72 118 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/araa.png"))); // NOI18N
        jButton3.setText("ARA");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton3.setIconTextGap(-90);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(430, 90, 100, 50);

        table_randevuara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TC Kimlik", "ADI", "SOYADI", "RANDEVU SAATİ"
            }
        ));
        jScrollPane2.setViewportView(table_randevuara);
        table_randevuara.getAccessibleContext().setAccessibleName("ADI\n");

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(60, 230, 452, 88);

        ran_gun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GÜN", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel5.add(ran_gun);
        ran_gun.setBounds(90, 100, 90, 32);

        ran_ay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AY", "OCAK", "ŞUBAT", "MART", "NİSAN", "MAYIS", "HAZİRAN", "TEMMUZ", "AGUSTOS", "EYLÜL", "EKİM", "KASIM", "ARALIK" }));
        jPanel5.add(ran_ay);
        ran_ay.setBounds(190, 100, 110, 32);

        ran_yil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YIL", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", " " }));
        jPanel5.add(ran_yil);
        ran_yil.setBounds(310, 100, 110, 32);

        ran_yıl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/tyuytu.png"))); // NOI18N
        jPanel5.add(ran_yıl);
        ran_yıl.setBounds(0, 0, 600, 430);

        jTabbedPane1.addTab("Randevu Ara", jPanel5);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 10, 600, 460);
        jTabbedPane1.getAccessibleContext().setAccessibleName("aaa");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            
            String tc_no=txt_tc.getText();
            String adi=txt_adi.getText();
            String soyadi=txt_soyadi.getText();
            String dtarihi=txt_dtarihi.getText();
            String dyeri=txt_dyeri.getText();
            String cinsiyeti=txt_cinsiyet.getText();
            String sikayet=txt_sikayet.getText();
            String yas=txt_yas.getText();
            String kilo=txt_kilo.getText();
            String boy=txt_boy.getText();
            String aciklama=txt_aciklama.getText();
             

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            com.mysql.jdbc.Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st = (com.mysql.jdbc.Statement) con.createStatement();
            
            String sql = "Update hasta_muayene set tc_no='"+tc_no+"',adi='"+adi+"',soyadi='"+soyadi+"',dtarihi='"+dtarihi+"'"
                    +",dyeri='"+dyeri+"',cinsiyeti='"+cinsiyeti+"',sikayet='"+sikayet+"',yas='"+yas+"',kilo='"+kilo+"'"
                    +",boy='"+boy+"',aciklama='"+aciklama+"' where tc_no='"+tc_no+"'";

            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Sayın "+ adi + " "+ soyadi + " İşleminiz Gerçekleşmiştir.");
           
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          try {
              
        String gun=String.valueOf(ran_gun.getSelectedItem());
        String ay=String.valueOf(ran_ay.getSelectedItem());
        String yil=String.valueOf(ran_yil.getSelectedItem());        
        String randevu_tarihi=gun + " / " + ay + " / " + yil;
        
        String baslik[] = new String[]{ "TC Kimlik", "Adı", "Soyadı", "Randevu Saati"};  

       
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st = con.createStatement();
            
            String sorgu21 = "select * from uyeler inner join muayene_alma on uyeler.id=muayene_alma.uye_id where muayene_alma.randevu_tarihi='"+randevu_tarihi+"' and muayene_alma.kayit='1' order by uyeler.id";
            
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
                    rs.getString("randevu_saati"),
                    
                };
                i++;
            }
            
            table_randevuara.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st = con.createStatement();
            
            String sorgu2 = "select * from uyeler INNER JOIN hasta_muayene where uyeler.id=hasta_muayene.uye_id and hasta_muayene.tc_no='"+txt_tc.getText()+"'";
            
            rs = st.executeQuery(sorgu2);
            rs.last();
            
            int sayi = rs.getRow();
            
            if(sayi>0){
                
                txt_adi.setText(rs.getString("adi"));
                txt_soyadi.setText(rs.getString("soyadi"));
                txt_dtarihi.setText(rs.getString("dtarihi"));
                txt_cinsiyet.setText(rs.getString("cinsiyeti"));
                txt_dyeri.setText(rs.getString("dyeri"));                
                
                txt_yas.setText(rs.getString("yas"));
                txt_kilo.setText(rs.getString("kilo"));
                txt_boy.setText(rs.getString("boy"));
                txt_sikayet.setText(rs.getString("sikayet"));
                txt_aciklama.setText(rs.getString("aciklama"));
                
            }
            
            else if(sayi==0){
                
                con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
                st = con.createStatement();

                String sorgu21 = "select * from uyeler where tc_no='"+txt_tc.getText()+"'";
                rs = st.executeQuery(sorgu21);
                rs.next();

                int sayi1 = rs.getRow();

                if(sayi1>0){

                    txt_adi.setText(rs.getString("adi"));
                    txt_soyadi.setText(rs.getString("soyadi"));
                    txt_dtarihi.setText(rs.getString("dtarihi"));
                    txt_cinsiyet.setText(rs.getString("cinsiyet"));
                    txt_dyeri.setText(rs.getString("dyeri"));
            
                }
                else{
                    JOptionPane.showMessageDialog(null, "Böyle bir kullanıcı kayıtlı değil");
                }
                
            }
            
 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
        try {
            
            String tc_no=txt_tc.getText();
            String adi=txt_adi.getText();
            String soyadi=txt_soyadi.getText();
            String dtarihi=txt_dtarihi.getText();
            String dyeri=txt_dyeri.getText();
            String cinsiyeti=txt_cinsiyet.getText();
            String sikayet=txt_sikayet.getText();
            String yas=txt_yas.getText();
            String kilo=txt_kilo.getText();
            String boy=txt_boy.getText();
            String aciklama=txt_aciklama.getText();
             

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = null;
            com.mysql.jdbc.Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/diyetisyen?useUnicode=true&characterEncoding=UTF8", "root", "");
            st = (com.mysql.jdbc.Statement) con.createStatement();
            
            String sql = "INSERT INTO hasta_muayene (tc_no,adi,soyadi,dtarihi,dyeri,cinsiyeti,sikayet,yas,kilo,boy,aciklama)"
                    +"VALUES ('"+tc_no+"', '"+adi+"', '"+soyadi+"', '"+dtarihi+"','"+dyeri+"', '"+cinsiyeti+"', '"+sikayet+"',"
                    + "'"+yas+"', '"+kilo+"', '"+boy+"', '"+aciklama+"')";

            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Sayın "+ adi + " "+ soyadi + " İşleminiz Gerçekleşmiştir.");
           
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(doktor_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doktor_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doktor_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doktor_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doktor_girisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JComboBox<String> ran_ay;
    private javax.swing.JComboBox<String> ran_gun;
    private javax.swing.JComboBox<String> ran_yil;
    private javax.swing.JLabel ran_yıl;
    private javax.swing.JTable table_randevuara;
    private javax.swing.JTable table_randevular;
    private javax.swing.JTextField txt_aciklama;
    private javax.swing.JTextField txt_adi;
    private javax.swing.JTextField txt_boy;
    private javax.swing.JTextField txt_cinsiyet;
    private javax.swing.JTextField txt_dtarihi;
    private javax.swing.JTextField txt_dyeri;
    private javax.swing.JTextField txt_kilo;
    private javax.swing.JTextField txt_sikayet;
    private javax.swing.JTextField txt_soyadi;
    private javax.swing.JTextField txt_tc;
    private javax.swing.JTextField txt_yas;
    // End of variables declaration//GEN-END:variables
}
