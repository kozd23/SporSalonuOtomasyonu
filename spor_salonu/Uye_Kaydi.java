package spor_salonu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Uye_Kaydi extends javax.swing.JFrame {

    public Uye_Kaydi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jTextField23 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_adi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_dtarihi = new javax.swing.JTextField();
        txt_soyadi = new javax.swing.JTextField();
        txt_tc = new javax.swing.JTextField();
        txt_hastaliklari = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        txt_adres = new javax.swing.JTextField();
        txt_aranacak_adi = new javax.swing.JTextField();
        txt_aranacak_soyadi = new javax.swing.JTextField();
        txt_aranacak_tel = new javax.swing.JTextField();
        txt_aranacak_adres = new javax.swing.JTextField();
        txt_kilo = new javax.swing.JTextField();
        txt_yas = new javax.swing.JTextField();
        txt_boy = new javax.swing.JTextField();
        txt_tarih = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btn_uye_kaydet = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        combo_programi = new javax.swing.JComboBox<>();
        combo_kayit_suresi = new javax.swing.JComboBox<>();
        combo_cinsiyet = new javax.swing.JComboBox<>();
        btn_cikis = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Üye Soyadı");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ÜYE KAYDI");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Doğum Tarihi");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cinsiyet");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hastalıkları");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cep Numarası");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Adres");
        jLabel13.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ACİL DURUMDA ARANACAK KİŞİ");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Adı");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Soyadı");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TC");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Telefon Numarası");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Boy");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Adres");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kilo");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Yaş");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Kayıt süresi");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tarih");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Üye Adı");

        txt_boy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_boyActionPerformed(evt);
            }
        });

        txt_tarih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tarihActionPerformed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spor_salonu/resimler/logo.png"))); // NOI18N
        jLabel19.setToolTipText("");

        btn_uye_kaydet.setBackground(new java.awt.Color(0, 204, 0));
        btn_uye_kaydet.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_uye_kaydet.setForeground(new java.awt.Color(255, 255, 255));
        btn_uye_kaydet.setText("Kaydet");
        btn_uye_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uye_kaydetActionPerformed(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Program Seç");

        combo_programi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Program 1", "Program 2", "Program 3", "Program 4", " "}));

        combo_kayit_suresi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Aylık", "3 Aylık", "6 Aylık"}));

        combo_cinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Bay", "Bayan"}));

        btn_cikis.setText("ÇIKIŞ");
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });

        jButton1.setText("Programlara bak");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel14)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(21, 21, 21)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel1)
                                                                                        .addComponent(jLabel2)
                                                                                        .addComponent(jLabel3)
                                                                                        .addComponent(jLabel5)
                                                                                        .addComponent(jLabel12)
                                                                                        .addComponent(jLabel13)
                                                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addComponent(jLabel16)
                                                                        .addComponent(jLabel15))
                                                                .addGap(39, 39, 39)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(txt_dtarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txt_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txt_hastaliklari, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txt_adres, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txt_aranacak_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txt_aranacak_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(83, 83, 83)
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                        .addComponent(jLabel7)
                                                                                                                        .addComponent(jLabel8)
                                                                                                                        .addComponent(jLabel9)
                                                                                                                        .addComponent(jLabel11))
                                                                                                                .addGap(68, 68, 68)
                                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                        .addComponent(txt_boy, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addComponent(txt_kilo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addComponent(txt_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addComponent(txt_yas, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addComponent(combo_cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                        .addComponent(jLabel10)
                                                                                                                        .addComponent(jLabel21))
                                                                                                                .addGap(24, 24, 24)
                                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                        .addComponent(combo_programi, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addComponent(combo_kayit_suresi, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButton1))))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(txt_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(83, 83, 83)
                                                                                .addComponent(jLabel4))))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel17)
                                                                        .addComponent(jLabel18))
                                                                .addGap(39, 39, 39)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txt_aranacak_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txt_aranacak_adres, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btn_uye_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel22)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_cikis)
                                                .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel20))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(btn_cikis)))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txt_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4)
                                                .addComponent(combo_cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txt_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(txt_boy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txt_dtarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(txt_kilo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel9)
                                                .addComponent(txt_yas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(11, 11, 11)
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel12)
                                                                .addGap(6, 6, 6))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(26, 26, 26)
                                                                                .addComponent(jLabel11))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(7, 7, 7)
                                                                                .addComponent(txt_hastaliklari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(23, 23, 23)
                                                .addComponent(jLabel22))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(100, 100, 100)
                                                                .addComponent(jLabel13))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(59, 59, 59)
                                                                .addComponent(jButton1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txt_adres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel21)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(85, 85, 85)
                                                                .addComponent(combo_programi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(5, 5, 5)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel14)
                                                                .addGap(16, 16, 16)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(txt_aranacak_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel15))
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(28, 28, 28)
                                                                                                .addComponent(jLabel16))
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(txt_aranacak_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(txt_aranacak_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel17))
                                                                                .addGap(24, 24, 24)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(txt_aranacak_adres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel18))
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(btn_uye_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel19)))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel10)
                                                                .addComponent(combo_kayit_suresi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void txt_boyActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txt_tarihActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btn_uye_kaydetActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            String adi = txt_adi.getText();
            String soyadi = txt_soyadi.getText();
            String dtarihi = txt_dtarihi.getText();
            String tc = txt_tc.getText();
            String hastalik = txt_hastaliklari.getText();
            String tel = txt_tel.getText();
            String adres = txt_adres.getText();
            String aranacak_adi = txt_aranacak_adi.getText();
            String aranacak_soyadi = txt_aranacak_soyadi.getText();
            String aranacak_tel = txt_aranacak_tel.getText();
            String aranacak_adres = txt_aranacak_adres.getText();
            String cinsiyet = String.valueOf(combo_cinsiyet.getSelectedItem());
            String boy = txt_boy.getText();
            String kilo = txt_kilo.getText();
            String yas = txt_yas.getText();
            String kayit_tarihi = txt_tarih.getText();
            String programi = String.valueOf(combo_programi.getSelectedItem());
            String kayit_suresi = String.valueOf(combo_kayit_suresi.getSelectedItem());

            if (adi.equals("")) {
                JOptionPane.showMessageDialog(this, "Boş Alanları Doldurunuz.");
            } else {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = null;
                Statement st = null;
                ResultSet rs = null;

                con = DriverManager.getConnection("jdbc:mysql://localhost/spor.salonu?useUnicode=true&characterEncoding=UTF-8", "root", "");
                st = con.createStatement();

                String sql = "INSERT INTO uyeler (adi,soyadi,dtarihi,tc,hastalik,tel,adres,aranacak_adi,aranacak_soyadi,aranacak_tel,aranacak_adres,cinsiyet,boy,kilo,yas,kayit_tarihi,programi,kayit_suresi)"
                        + " VALUES ('" + adi + "', '" + soyadi + "', '" + dtarihi + "', '" + tc + "','" + hastalik + "', '" + tel + "', '" + adres + "', '" + aranacak_adi + "','" + aranacak_soyadi + "','" + aranacak_tel + "','" + aranacak_adres + "'"
                        + ", '" + cinsiyet + "', '" + boy + "', '" + kilo + "','" + yas + "', '" + kayit_tarihi + "', '" + programi + "', '" + kayit_suresi + "')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, " " + adi + soyadi + " Adlı Sporcu Eklenmiştir.");
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }

    }

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {
        Uye_Kaydi ac = new Uye_Kaydi();
        ac.setVisible(false);
        dispose();        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        AntrenmanProgramı ac = new AntrenmanProgramı();
        ac.setVisible(true);        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Uye_Kaydi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uye_Kaydi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uye_Kaydi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uye_Kaydi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uye_Kaydi().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_uye_kaydet;
    private javax.swing.JComboBox<String> combo_cinsiyet;
    private javax.swing.JComboBox<String> combo_kayit_suresi;
    private javax.swing.JComboBox<String> combo_programi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField txt_adi;
    private javax.swing.JTextField txt_adres;
    private javax.swing.JTextField txt_aranacak_adi;
    private javax.swing.JTextField txt_aranacak_adres;
    private javax.swing.JTextField txt_aranacak_soyadi;
    private javax.swing.JTextField txt_aranacak_tel;
    private javax.swing.JTextField txt_boy;
    private javax.swing.JTextField txt_dtarihi;
    private javax.swing.JTextField txt_hastaliklari;
    private javax.swing.JTextField txt_kilo;
    private javax.swing.JTextField txt_soyadi;
    private javax.swing.JTextField txt_tarih;
    private javax.swing.JTextField txt_tc;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txt_yas;

}

