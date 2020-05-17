package spor_salonu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class anagiris extends javax.swing.JFrame {


    public void personel_listesi() {

        String baslik[] = new String[]{"TC NO", "Adı", "Soyadı", "Telefon", "Eğitim Durumu", "Bölümü",};

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/spor.salonu?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            String sorgu21 = "select * from personel";
            rs = st.executeQuery(sorgu21);

            rs.last();
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{

                        rs.getString("tc"),
                        rs.getString("adi"),
                        rs.getString("soyadi"),
                        rs.getString("tel"),
                        rs.getString("egitim_durumu"),
                        rs.getString("bolum"),

                };
                i++;
            }

            table_personel.setModel(new DefaultTableModel(data, baslik));

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }

    }

    public void uyeler_listesi() {

        String baslik[] = new String[]{"TC NO", "Adı", "Soyadı", "Telefon", "Kayıt Tarihi", "Kayıt Süresi"};

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/spor.salonu?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            String sorgu21 = "select * from uyeler ";
            rs = st.executeQuery(sorgu21);

            rs.last();
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{

                        rs.getString("tc"),
                        rs.getString("adi"),
                        rs.getString("soyadi"),
                        rs.getString("tel"),
                        rs.getString("kayit_tarihi"),
                        rs.getString("kayit_suresi"),

                };
                i++;
            }

            table_uyeler.setModel(new DefaultTableModel(data, baslik));

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }

    }

    public anagiris() {
        initComponents();

        uyeler_listesi();

        personel_listesi();

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_ara = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_uyeler = new javax.swing.JTable();
        btn_ara = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_uyesil = new javax.swing.JButton();
        btn_cikis = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_personel = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        p_ara = new javax.swing.JButton();
        txt_ara_personel = new javax.swing.JTextField();
        btn_yeni_personel = new javax.swing.JButton();
        btn_uyesil1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Üye Ara");

        table_uyeler.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        table_uyeler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_uyelerMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(table_uyeler);

        btn_ara.setText("ÜYE ARA");
        btn_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_araActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spor_salonu/resimler/nav-save.png"))); // NOI18N
        jButton3.setText("Yeni Üye Ekle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_uyesil.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_uyesil.setForeground(new java.awt.Color(255, 0, 0));
        btn_uyesil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spor_salonu/resimler/Delete.jpg"))); // NOI18N
        btn_uyesil.setText("Üye Sil");
        btn_uyesil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uyesilActionPerformed(evt);
            }
        });

        btn_cikis.setText("ÇIKIŞ");
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btn_uyesil, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(42, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(txt_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(btn_ara)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_cikis)
                                                .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txt_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(btn_cikis)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_uyesil, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3))
                                .addGap(109, 109, 109))
        );
        jTabbedPane1.addTab("Üyeler", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        table_personel.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane2.setViewportView(table_personel);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Personel Ara");

        p_ara.setText("Personel Ara");
        p_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_araActionPerformed(evt);
            }
        });
        btn_yeni_personel.setText("Personel Ekle");
        btn_yeni_personel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yeni_personelActionPerformed(evt);
            }
        });

        btn_uyesil1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_uyesil1.setForeground(new java.awt.Color(255, 0, 0));
        btn_uyesil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spor_salonu/resimler/Delete.jpg"))); // NOI18N
        btn_uyesil1.setText("Üye Sil");
        btn_uyesil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uyesil1ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_ara_personel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(p_ara)))
                                .addContainerGap(63, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_uyesil1)
                                .addGap(65, 65, 65)
                                .addComponent(btn_yeni_personel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(p_ara)
                                        .addComponent(txt_ara_personel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_yeni_personel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_uyesil1))
                                .addContainerGap(96, Short.MAX_VALUE))
        );
        jTabbedPane1.addTab("Çalışan Bilgileri", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Anasayfa");

        pack();
    }

    private void p_araActionPerformed(java.awt.event.ActionEvent evt) {

        String personel_ara = txt_ara_personel.getText();

        String baslik[] = new String[]{"TC NO", "Adı", "Soyadı", "Telefon", "Eğitim Durumu", "Bölümü",};

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/spor.salonu?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            String sorgu21 = "select * from personel where adi like '%" + personel_ara + "%' or soyadi like '%" + personel_ara + "%' or tc like '%" + personel_ara + "%'";
            rs = st.executeQuery(sorgu21);

            rs.last();
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{

                        rs.getString("tc"),
                        rs.getString("adi"),
                        rs.getString("soyadi"),
                        rs.getString("tel"),
                        rs.getString("egitim_durumu"),
                        rs.getString("bolum"),

                };
                i++;
            }

            table_personel.setModel(new DefaultTableModel(data, baslik));

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Uye_Kaydi ac = new Uye_Kaydi();
        ac.setVisible(true);
    }

    private void btn_araActionPerformed(java.awt.event.ActionEvent evt) {

        String uye_ara = txt_ara.getText();

        String baslik[] = new String[]{"TC NO", "Adı", "Soyadı", "Telefon", "Kayıt Tarihi", "Kayıt Süresi",};

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/spor.salonu?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            String sorgu21 = "select * from uyeler where adi like '%" + uye_ara + "%' or soyadi like '%" + uye_ara + "%' or tc like '%" + uye_ara + "%'";
            rs = st.executeQuery(sorgu21);

            rs.last();
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{

                        rs.getString("tc"),
                        rs.getString("adi"),
                        rs.getString("soyadi"),
                        rs.getString("tel"),
                        rs.getString("kayit_tarihi"),
                        rs.getString("kayit_suresi"),

                };
                i++;
            }
            table_uyeler.setModel(new DefaultTableModel(data, baslik));

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }

    }

    private void btn_yeni_personelActionPerformed(java.awt.event.ActionEvent evt) {

        Kullanici_ekle ac = new Kullanici_ekle();
        ac.setVisible(true);

    }

    private void btn_uyesilActionPerformed(java.awt.event.ActionEvent evt) {

        int row = table_uyeler.getSelectedRow();
        String secim_yap = table_uyeler.getValueAt(row, 0).toString();

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/spor.salonu?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            String sorgu21 = "delete from uyeler where tc='" + secim_yap + "'";
            st.executeUpdate(sorgu21);

            JOptionPane.showMessageDialog(null, " " + " seçilen personel silinmiştir");


        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }

        uyeler_listesi();

    }

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {
        anagiris ac = new anagiris();
        ac.setVisible(false);
        dispose();        // TODO add your handling code here:
    }

    private void table_uyelerMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void btn_uyesil1ActionPerformed(java.awt.event.ActionEvent evt) {

        int row = table_personel.getSelectedRow();
        String secim_yap = table_personel.getValueAt(row, 0).toString();

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/spor.salonu?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            String sorgu21 = "delete from personel where tc='" + secim_yap + "'";
            st.executeUpdate(sorgu21);

            JOptionPane.showMessageDialog(null, " Adlı kullanıcısı silinmiştir");


        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
        personel_listesi();

    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(anagiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anagiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anagiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anagiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anagiris().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btn_ara;
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_uyesil;
    private javax.swing.JButton btn_uyesil1;
    private javax.swing.JButton btn_yeni_personel;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton p_ara;
    private javax.swing.JTable table_personel;
    private javax.swing.JTable table_uyeler;
    private javax.swing.JTextField txt_ara;
    private javax.swing.JTextField txt_ara_personel;

}


