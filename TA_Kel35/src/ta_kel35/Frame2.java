package ta_kel35;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

public class Frame2 extends javax.swing.JFrame {   
    syntax_login sini = new syntax_login();
    hitungan here = new hitungan();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        main_panel = new javax.swing.JPanel();
        depan = new javax.swing.JPanel();
        judul_depan = new javax.swing.JLabel();
        pergi01 = new javax.swing.JButton();
        pergi02 = new javax.swing.JButton();
        masuk = new javax.swing.JPanel();
        judul_masuk = new javax.swing.JLabel();
        masuk1 = new javax.swing.JLabel();
        masuk2 = new javax.swing.JLabel();
        form_user = new javax.swing.JTextField();
        form_pass = new javax.swing.JPasswordField();
        confrim_masuk = new javax.swing.JButton();
        cancel_masuk = new javax.swing.JButton();
        member = new javax.swing.JPanel();
        judul_member = new javax.swing.JLabel();
        panel_wahana1 = new javax.swing.JPanel();
        deskripsi_pilih_member = new javax.swing.JLabel();
        pick_taman1 = new javax.swing.JRadioButton();
        pick_water1 = new javax.swing.JRadioButton();
        pick_semua1 = new javax.swing.JRadioButton();
        des_member = new javax.swing.JLabel();
        panel_hitung1 = new javax.swing.JPanel();
        deskripsi_tiket_member = new javax.swing.JLabel();
        input1 = new javax.swing.JSpinner();
        input2 = new javax.swing.JSpinner();
        teks_dewasa_member1 = new javax.swing.JLabel();
        teks_anak_member1 = new javax.swing.JLabel();
        harga_dewasa1 = new javax.swing.JLabel();
        harga_anak1 = new javax.swing.JLabel();
        teks_total1 = new javax.swing.JLabel();
        harga_total1 = new javax.swing.JLabel();
        hitung_member = new javax.swing.JButton();
        reset_member = new javax.swing.JButton();
        panel_harga1 = new javax.swing.JPanel();
        deskripsi_daftar1 = new javax.swing.JLabel();
        harga_d1 = new javax.swing.JLabel();
        harga_a1 = new javax.swing.JLabel();
        batal_member1 = new javax.swing.JButton();
        cetak_member1 = new javax.swing.JButton();
        non_member = new javax.swing.JPanel();
        judul_member2 = new javax.swing.JLabel();
        panel_wahana2 = new javax.swing.JPanel();
        deskripsi_pilih_member2 = new javax.swing.JLabel();
        pick_taman2 = new javax.swing.JRadioButton();
        pick_water2 = new javax.swing.JRadioButton();
        pick_semua2 = new javax.swing.JRadioButton();
        des_member2 = new javax.swing.JLabel();
        panel_hitung2 = new javax.swing.JPanel();
        deskripsi_tiket_member2 = new javax.swing.JLabel();
        input3 = new javax.swing.JSpinner();
        input4 = new javax.swing.JSpinner();
        teks_dewasa_member2 = new javax.swing.JLabel();
        teks_anak_member2 = new javax.swing.JLabel();
        harga_dewasa2 = new javax.swing.JLabel();
        harga_anak2 = new javax.swing.JLabel();
        teks_total2 = new javax.swing.JLabel();
        harga_total2 = new javax.swing.JLabel();
        hitung_member2 = new javax.swing.JButton();
        reset_member2 = new javax.swing.JButton();
        panel_harga2 = new javax.swing.JPanel();
        deskripsi_daftar2 = new javax.swing.JLabel();
        harga_d2 = new javax.swing.JLabel();
        harga_a2 = new javax.swing.JLabel();
        batal_member2 = new javax.swing.JButton();
        cetak_member2 = new javax.swing.JButton();
        akhir = new javax.swing.JPanel();
        judul_akhir = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        harga_akhir = new javax.swing.JLabel();
        ket_akhir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_panel.setLayout(new java.awt.CardLayout());

        depan.setBackground(new java.awt.Color(120, 180, 240));
        depan.setToolTipText("");

        judul_depan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        judul_depan.setText("Selamat Datang di Wahana Kuvukiland");

        pergi01.setText("Non-Member");
        pergi01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pergi01ActionPerformed(evt);
            }
        });

        pergi02.setText("Member");
        pergi02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pergi02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout depanLayout = new javax.swing.GroupLayout(depan);
        depan.setLayout(depanLayout);
        depanLayout.setHorizontalGroup(
            depanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depanLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(pergi01, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(pergi02, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(judul_depan)
                .addGap(98, 98, 98))
        );
        depanLayout.setVerticalGroup(
            depanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depanLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(judul_depan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(depanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pergi01)
                    .addComponent(pergi02))
                .addGap(66, 66, 66))
        );

        main_panel.add(depan, "sayaka");

        masuk.setBackground(new java.awt.Color(180, 120, 240));

        judul_masuk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        judul_masuk.setText(" Silahkan masukkan data yang benar :");

        masuk1.setText("Username :");

        masuk2.setText("Password :");

        confrim_masuk.setText("Login");
        confrim_masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_masukActionPerformed(evt);
            }
        });

        cancel_masuk.setText("Batal");
        cancel_masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_masukActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout masukLayout = new javax.swing.GroupLayout(masuk);
        masuk.setLayout(masukLayout);
        masukLayout.setHorizontalGroup(
            masukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masukLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(masukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masukLayout.createSequentialGroup()
                        .addComponent(confrim_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(cancel_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masukLayout.createSequentialGroup()
                        .addGroup(masukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(masukLayout.createSequentialGroup()
                                .addGroup(masukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(masuk2)
                                    .addComponent(masuk1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(masukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(form_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(form_pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(judul_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 138, 138))))
        );
        masukLayout.setVerticalGroup(
            masukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masukLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(judul_masuk)
                .addGap(27, 27, 27)
                .addGroup(masukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(masuk1)
                    .addComponent(form_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(masukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(masuk2)
                    .addComponent(form_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(masukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confrim_masuk)
                    .addComponent(cancel_masuk))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        main_panel.add(masuk, "homura");

        member.setBackground(new java.awt.Color(240, 240, 120));
        member.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        judul_member.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        judul_member.setText("Selamat Datang, member");

        panel_wahana1.setBackground(new java.awt.Color(240, 240, 120));
        panel_wahana1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        deskripsi_pilih_member.setText("Silahkan pilih wahana:");

        buttonGroup1.add(pick_taman1);
        pick_taman1.setText("Theme Park");
        pick_taman1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pick_taman1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(pick_water1);
        pick_water1.setText("Waterboom");
        pick_water1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pick_water1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(pick_semua1);
        pick_semua1.setText("Semua Wahana");
        pick_semua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pick_semua1ActionPerformed(evt);
            }
        });

        des_member.setText("Pilih dahulu");

        javax.swing.GroupLayout panel_wahana1Layout = new javax.swing.GroupLayout(panel_wahana1);
        panel_wahana1.setLayout(panel_wahana1Layout);
        panel_wahana1Layout.setHorizontalGroup(
            panel_wahana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_wahana1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_wahana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_wahana1Layout.createSequentialGroup()
                        .addComponent(deskripsi_pilih_member, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pick_taman1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pick_water1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pick_semua1))
                    .addGroup(panel_wahana1Layout.createSequentialGroup()
                        .addComponent(des_member)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_wahana1Layout.setVerticalGroup(
            panel_wahana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_wahana1Layout.createSequentialGroup()
                .addGroup(panel_wahana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deskripsi_pilih_member, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pick_taman1)
                    .addComponent(pick_water1)
                    .addComponent(pick_semua1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(des_member, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panel_hitung1.setBackground(new java.awt.Color(240, 240, 120));
        panel_hitung1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        deskripsi_tiket_member.setText("Silahkan masukkan jumlah tiket");

        teks_dewasa_member1.setText("Dewasa     :");

        teks_anak_member1.setText("Anak-anak :");

        harga_dewasa1.setText("Rp");

        harga_anak1.setText("Rp");

        teks_total1.setText("Total Harga Tiket :");

        harga_total1.setText("Rp");

        hitung_member.setText("Hitung");
        hitung_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung_memberActionPerformed(evt);
            }
        });

        reset_member.setText("Reset");
        reset_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_memberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_hitung1Layout = new javax.swing.GroupLayout(panel_hitung1);
        panel_hitung1.setLayout(panel_hitung1Layout);
        panel_hitung1Layout.setHorizontalGroup(
            panel_hitung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_hitung1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_hitung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_hitung1Layout.createSequentialGroup()
                        .addGroup(panel_hitung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(input2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_hitung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_hitung1Layout.createSequentialGroup()
                                .addComponent(teks_dewasa_member1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(harga_dewasa1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_hitung1Layout.createSequentialGroup()
                                .addComponent(teks_anak_member1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(harga_anak1))))
                    .addGroup(panel_hitung1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(teks_total1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(harga_total1))
                    .addComponent(deskripsi_tiket_member))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(panel_hitung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hitung_member, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reset_member, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22))
        );
        panel_hitung1Layout.setVerticalGroup(
            panel_hitung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_hitung1Layout.createSequentialGroup()
                .addComponent(deskripsi_tiket_member, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_hitung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_hitung1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panel_hitung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teks_dewasa_member1)
                            .addComponent(harga_dewasa1)
                            .addComponent(hitung_member)))
                    .addGroup(panel_hitung1Layout.createSequentialGroup()
                        .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_hitung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teks_anak_member1)
                            .addComponent(harga_anak1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_hitung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teks_total1)
                    .addComponent(reset_member)
                    .addComponent(harga_total1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_harga1.setBackground(new java.awt.Color(240, 240, 120));
        panel_harga1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        deskripsi_daftar1.setText("Daftar Harga:");

        harga_d1.setText("Dewasa : Rp");

        harga_a1.setText("Anak-anak : Rp");

        javax.swing.GroupLayout panel_harga1Layout = new javax.swing.GroupLayout(panel_harga1);
        panel_harga1.setLayout(panel_harga1Layout);
        panel_harga1Layout.setHorizontalGroup(
            panel_harga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_harga1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_harga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deskripsi_daftar1)
                    .addComponent(harga_d1)
                    .addComponent(harga_a1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_harga1Layout.setVerticalGroup(
            panel_harga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_harga1Layout.createSequentialGroup()
                .addComponent(deskripsi_daftar1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga_d1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(harga_a1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        batal_member1.setText("Batal");
        batal_member1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batal_member1ActionPerformed(evt);
            }
        });

        cetak_member1.setText("Cetak");
        cetak_member1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetak_member1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout memberLayout = new javax.swing.GroupLayout(member);
        member.setLayout(memberLayout);
        memberLayout.setHorizontalGroup(
            memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(memberLayout.createSequentialGroup()
                        .addComponent(judul_member)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panel_wahana1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(memberLayout.createSequentialGroup()
                        .addComponent(panel_hitung1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_harga1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(memberLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cetak_member1)
                                .addGap(18, 18, 18)
                                .addComponent(batal_member1)
                                .addGap(0, 42, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        memberLayout.setVerticalGroup(
            memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul_member)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_wahana1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(memberLayout.createSequentialGroup()
                        .addComponent(panel_harga1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cetak_member1)
                            .addComponent(batal_member1)))
                    .addComponent(panel_hitung1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        main_panel.add(member, "mami");

        non_member.setBackground(new java.awt.Color(240, 60, 120));

        judul_member2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        judul_member2.setText("Selamat Datang, tamu");

        panel_wahana2.setBackground(new java.awt.Color(240, 60, 120));
        panel_wahana2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        deskripsi_pilih_member2.setText("Silahkan pilih wahana:");

        buttonGroup1.add(pick_taman2);
        pick_taman2.setText("Theme Park");
        pick_taman2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pick_taman2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(pick_water2);
        pick_water2.setText("Waterboom");
        pick_water2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pick_water2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(pick_semua2);
        pick_semua2.setText("Semua Wahana");
        pick_semua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pick_semua2ActionPerformed(evt);
            }
        });

        des_member2.setText("Pilih dahulu");

        javax.swing.GroupLayout panel_wahana2Layout = new javax.swing.GroupLayout(panel_wahana2);
        panel_wahana2.setLayout(panel_wahana2Layout);
        panel_wahana2Layout.setHorizontalGroup(
            panel_wahana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_wahana2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_wahana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_wahana2Layout.createSequentialGroup()
                        .addComponent(deskripsi_pilih_member2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pick_taman2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pick_water2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pick_semua2))
                    .addGroup(panel_wahana2Layout.createSequentialGroup()
                        .addComponent(des_member2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_wahana2Layout.setVerticalGroup(
            panel_wahana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_wahana2Layout.createSequentialGroup()
                .addGroup(panel_wahana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deskripsi_pilih_member2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pick_taman2)
                    .addComponent(pick_water2)
                    .addComponent(pick_semua2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(des_member2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panel_hitung2.setBackground(new java.awt.Color(240, 60, 120));
        panel_hitung2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        deskripsi_tiket_member2.setText("Silahkan masukkan jumlah tiket");

        teks_dewasa_member2.setText("Dewasa     :");

        teks_anak_member2.setText("Anak-anak :");

        harga_dewasa2.setText("Rp");

        harga_anak2.setText("Rp");

        teks_total2.setText("Total Harga Tiket :");

        harga_total2.setText("Rp");

        hitung_member2.setText("Hitung");
        hitung_member2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung_member2ActionPerformed(evt);
            }
        });

        reset_member2.setText("Reset");
        reset_member2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_member2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_hitung2Layout = new javax.swing.GroupLayout(panel_hitung2);
        panel_hitung2.setLayout(panel_hitung2Layout);
        panel_hitung2Layout.setHorizontalGroup(
            panel_hitung2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_hitung2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_hitung2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_hitung2Layout.createSequentialGroup()
                        .addGroup(panel_hitung2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(input4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_hitung2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_hitung2Layout.createSequentialGroup()
                                .addComponent(teks_dewasa_member2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(harga_dewasa2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_hitung2Layout.createSequentialGroup()
                                .addComponent(teks_anak_member2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(harga_anak2))))
                    .addGroup(panel_hitung2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(teks_total2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(harga_total2))
                    .addComponent(deskripsi_tiket_member2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(panel_hitung2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hitung_member2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reset_member2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22))
        );
        panel_hitung2Layout.setVerticalGroup(
            panel_hitung2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_hitung2Layout.createSequentialGroup()
                .addComponent(deskripsi_tiket_member2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_hitung2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_hitung2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panel_hitung2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teks_dewasa_member2)
                            .addComponent(harga_dewasa2)
                            .addComponent(hitung_member2)))
                    .addGroup(panel_hitung2Layout.createSequentialGroup()
                        .addComponent(input3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_hitung2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teks_anak_member2)
                            .addComponent(harga_anak2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_hitung2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teks_total2)
                    .addComponent(reset_member2)
                    .addComponent(harga_total2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_harga2.setBackground(new java.awt.Color(240, 60, 120));
        panel_harga2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        deskripsi_daftar2.setText("Daftar Harga:");

        harga_d2.setText("Dewasa : Rp");

        harga_a2.setText("Anak-anak : Rp");

        javax.swing.GroupLayout panel_harga2Layout = new javax.swing.GroupLayout(panel_harga2);
        panel_harga2.setLayout(panel_harga2Layout);
        panel_harga2Layout.setHorizontalGroup(
            panel_harga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_harga2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_harga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deskripsi_daftar2)
                    .addComponent(harga_d2)
                    .addComponent(harga_a2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_harga2Layout.setVerticalGroup(
            panel_harga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_harga2Layout.createSequentialGroup()
                .addComponent(deskripsi_daftar2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga_d2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(harga_a2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        batal_member2.setText("Batal");
        batal_member2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batal_member2ActionPerformed(evt);
            }
        });

        cetak_member2.setText("Cetak");
        cetak_member2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetak_member2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout non_memberLayout = new javax.swing.GroupLayout(non_member);
        non_member.setLayout(non_memberLayout);
        non_memberLayout.setHorizontalGroup(
            non_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(non_memberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(non_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(non_memberLayout.createSequentialGroup()
                        .addComponent(judul_member2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panel_wahana2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(non_memberLayout.createSequentialGroup()
                        .addComponent(panel_hitung2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(non_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_harga2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(non_memberLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cetak_member2)
                                .addGap(18, 18, 18)
                                .addComponent(batal_member2)
                                .addGap(0, 42, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        non_memberLayout.setVerticalGroup(
            non_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(non_memberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul_member2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_wahana2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(non_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(non_memberLayout.createSequentialGroup()
                        .addComponent(panel_harga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(non_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cetak_member2)
                            .addComponent(batal_member2)))
                    .addComponent(panel_hitung2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        main_panel.add(non_member, "kyoko");

        akhir.setBackground(new java.awt.Color(240, 165, 240));
        akhir.setToolTipText("");

        judul_akhir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        judul_akhir.setText("Terima Kasih sudah berkunjung di wahana Kuvukiland!");

        jButton1.setText("BALIK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(240, 165, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        harga_akhir.setText("harga");

        ket_akhir.setText("Berikut detail tiket anda:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(harga_akhir)
                    .addComponent(ket_akhir))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(ket_akhir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga_akhir)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout akhirLayout = new javax.swing.GroupLayout(akhir);
        akhir.setLayout(akhirLayout);
        akhirLayout.setHorizontalGroup(
            akhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(akhirLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(judul_akhir)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, akhirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        akhirLayout.setVerticalGroup(
            akhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(akhirLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(judul_akhir)
                .addGroup(akhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(akhirLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(64, 64, 64))
                    .addGroup(akhirLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        main_panel.add(akhir, "madoka");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// KODE UMUM
    //Method transisi panel
        public void madoka(){
        CardLayout card = (CardLayout)main_panel.getLayout();
        card.show(main_panel,"madoka");
    }
    
        public void mami(){
        CardLayout card = (CardLayout)main_panel.getLayout();
        card.show(main_panel,"mami");
    }
        
        public void homura(){
        CardLayout card = (CardLayout)main_panel.getLayout();
        card.show(main_panel,"homura");
    }
        
        public void sayaka(){
        CardLayout card = (CardLayout)main_panel.getLayout();
        card.show(main_panel,"sayaka");
    }
        
        public void kyoko(){
        CardLayout card = (CardLayout)main_panel.getLayout();
        card.show(main_panel,"kyoko");
    }
    
    // Method peringatan pesan
        public static void infoBox(String infoMessege){
        JOptionPane.showMessageDialog(null, infoMessege, "Pesan", JOptionPane.INFORMATION_MESSAGE);
    }

        
// KODE PANEL LOGIN   
    private String namae, passworde, input_nama, input_pass;
    int statuse;

    public Frame2(){
        initComponents();
    }
      
    public void erase(){
        form_user.setText("");
        form_pass.setText("");
    }
    
    //Syntax button login
    private void confrim_masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_masukActionPerformed
    input_nama=(form_user.getText());
    input_pass=(form_pass.getText());
    // check input
    if (input_nama.isEmpty() || input_pass.isEmpty())
        {
        Frame2.infoBox("Silahkan masukkan dengan benar!");
        statuse=1;
        }
    else
        {
        statuse=0;
        }
        // verifikasi input
        if (statuse==0)
            {
            namae=(form_user.getText());
            passworde=(form_pass.getText());
            {
            if(sini.verif(namae,passworde) == true)
                {
                    infoBox("Benar, Selamat Datang "+namae+" Di Wahana Kuvukiland");
                    mami();
                    judul_member.setText("Selamat Datang, member "+namae);
                    erase();
                }
            else{infoBox("Salah, Silahkan Coba Lagi");}
            erase();
            }
            }
    }//GEN-LAST:event_confrim_masukActionPerformed
    
    // Syntax button cancel
    private void cancel_masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_masukActionPerformed
        erase();
        sayaka();
    }//GEN-LAST:event_cancel_masukActionPerformed

    
// KODE PANEL DEPAN
    //Button depan
    private void pergi01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pergi01ActionPerformed
        kyoko();
    }//GEN-LAST:event_pergi01ActionPerformed
    
    private void pergi02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pergi02ActionPerformed
        homura();
    }//GEN-LAST:event_pergi02ActionPerformed

    
// KODE PANEL MEMBER
    private int pilihan1=0;
    private int anak1, an1, dewasa1, dew1, total1;
    private String tempat1;    
       
    public void reset_member(){
    harga_dewasa1.setText("Rp ");
    harga_anak1.setText("Rp ");
    harga_total1.setText("Rp ");
    input1.setValue(0);
    input2.setValue(0);
    }
    
    //perhitungan member
    public void output_member(){
    dew1=(Integer)input1.getValue();
    an1=(Integer)input2.getValue();
    here.hitungan1(dew1, an1, pilihan1);
    
    dewasa1=here.get_dewasa1();
    anak1=here.get_anak1();
    total1=here.get_total1();
    tempat1=here.get_tempat1();
    
    harga_dewasa1.setText("Rp "+dewasa1);
    harga_anak1.setText("Rp "+anak1);
    harga_total1.setText("Rp "+total1);
    }
    
    //Radio button member
    private void pick_taman1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pick_taman1ActionPerformed
        pilihan1=1;
        des_member.setText("<html>Tiket dimana anda bisa masuk Taman wahana kami, nikmati"
                + "<br/>Komedi putar, Rumah hantu, Maid Cafe, dll.</html>");
        harga_d1.setText("Dewasa: Rp 50000");
        harga_a1.setText("Anak-anak: Rp 40000");
        output_member();
    }//GEN-LAST:event_pick_taman1ActionPerformed

    private void pick_water1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pick_water1ActionPerformed
        pilihan1=2;
        des_member.setText("<html>Tiket dimana anda bisa masuk wahana Waterboom, nikmati"
                + "<br/>Kolam renang, Pantai Parangtritis mini, Onsen, dsb.</html>");
        harga_d1.setText("Dewasa: Rp 60000");
        harga_a1.setText("Anak-anak: Rp 55000");
        output_member();
    }//GEN-LAST:event_pick_water1ActionPerformed

    private void pick_semua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pick_semua1ActionPerformed
        pilihan1=3;
        des_member.setText("<html>Tiket dimana anda bisa masuk kedua wahana sekaligus, nikmati"
                + "<br/>semua yang terbaik dari wahana kami.</html>");
        harga_d1.setText("Dewasa: Rp 80000");
        harga_a1.setText("Anak-anak: Rp 70000");
        output_member();
    }//GEN-LAST:event_pick_semua1ActionPerformed

    //Button member
    private void hitung_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitung_memberActionPerformed
        output_member();
    }//GEN-LAST:event_hitung_memberActionPerformed

    private void reset_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_memberActionPerformed
        reset_member();
    }//GEN-LAST:event_reset_memberActionPerformed

    private void cetak_member1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetak_member1ActionPerformed
    if (pilihan1==0)
    {
        infoBox("Silahkan pilih wahana dan isi terlebih dahulu");
    }
    else
    {
        output_member();
        int jawab = JOptionPane.showOptionDialog(this,
            "Apakah anda ingin mencetak tiket untuk "+tempat1+" Dengan biaya total Rp "+total1+" ?",
            "Konfirmasi",
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
    
        if(jawab == JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(this, "Tiket anda akan dicetak");
        madoka();
        end(an1,dew1,anak1,dewasa1,total1,tempat1);
        reset_member();
        }
    }
    }//GEN-LAST:event_cetak_member1ActionPerformed

    private void batal_member1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batal_member1ActionPerformed
        reset_member();
        sayaka();
    }//GEN-LAST:event_batal_member1ActionPerformed

//KODE PANEL NON MEMBER    
    private int pilihan2=0;
    private int anak2, an2, dewasa2, dew2, total2;
    private String tempat2;
      
    public void reset_member2(){
    harga_dewasa2.setText("Rp ");
    harga_anak2.setText("Rp ");
    harga_total2.setText("Rp ");
    input3.setValue(0);
    input4.setValue(0);
    }
    
    // perhitungan non member
    public void output_member2(){
    dew2=(Integer)input3.getValue();
    an2=(Integer)input4.getValue();
    here.hitungan2(dew2, an2, pilihan2);
    
    dewasa2=here.get_dewasa2();
    anak2=here.get_anak2();
    total2=here.get_total2();
    tempat2=here.get_tempat2();
    
    harga_dewasa2.setText("Rp "+dewasa2);
    harga_anak2.setText("Rp "+anak2);
    harga_total2.setText("Rp "+total2);
    } 
    
    // Radio button non member
    private void pick_taman2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pick_taman2ActionPerformed
        pilihan2=1;
        des_member2.setText("<html>Tiket dimana anda bisa masuk Taman wahana kami, nikmati"
                + "<br/>Komedi putar, Rumah hantu, Maid Cafe, dll.</html>");
        harga_d2.setText("Dewasa: Rp 65000");
        harga_a2.setText("Anak-anak: Rp 55000");
        output_member2();
    }//GEN-LAST:event_pick_taman2ActionPerformed

    private void pick_water2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pick_water2ActionPerformed
        pilihan2=2;
        des_member2.setText("<html>Tiket dimana anda bisa masuk wahana Waterboom, nikmati"
                + "<br/>Kolam renang, Pantai Parangtritis mini, Onsen, dsb.</html>");
        harga_d2.setText("Dewasa: Rp 70000");
        harga_a2.setText("Anak-anak: Rp 65000");
        output_member2();
    }//GEN-LAST:event_pick_water2ActionPerformed

    private void pick_semua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pick_semua2ActionPerformed
        pilihan2=3;
        des_member.setText("<html>Tiket dimana anda bisa masuk kedua wahana sekaligus, nikmati"
                + "<br/>semua yang terbaik dari wahana kami.</html>");
        harga_d2.setText("Dewasa: Rp 100000");
        harga_a2.setText("Anak-anak: Rp 90000");
        output_member2();
    }//GEN-LAST:event_pick_semua2ActionPerformed

    // button non member
    private void hitung_member2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitung_member2ActionPerformed
        output_member2();
    }//GEN-LAST:event_hitung_member2ActionPerformed

    private void reset_member2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_member2ActionPerformed
        reset_member2();
    }//GEN-LAST:event_reset_member2ActionPerformed

    private void batal_member2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batal_member2ActionPerformed
        reset_member2();
        sayaka();
    }//GEN-LAST:event_batal_member2ActionPerformed

    private void cetak_member2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetak_member2ActionPerformed
    if (pilihan2==0)
    {
        infoBox("Silahkan pilih wahana dan isi terlebih dahulu");
    }
    else
    {
        output_member2();
        int jawab = JOptionPane.showOptionDialog(this,
            "Apakah anda ingin mencetak tiket untuk "+tempat2+" Dengan biaya total Rp "+total2+" ?",
            "Konfirmasi",
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
    
        if(jawab == JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(this, "Tiket anda akan dicetak");
        madoka();
        end(an2,dew2,anak2,dewasa2,total2,tempat2);
        reset_member2();
        }
    }
    }//GEN-LAST:event_cetak_member2ActionPerformed

//KODE PANEL AKHIR
    
    // method pesan akhir
    public void end(Integer an,Integer dw, Integer anak, Integer dewasa, Integer total, String tempat)
    {
        harga_akhir.setText("<html>Jenis Tiket: "+tempat
                + "<br/><br/>Jumlah Dewasa: "+dw
                + "<br/>Biaya Tiket  : "+dewasa
                + "<br/>Jumlah Anak  : "+an
                + "<br/>Biaya Tiket  : "+anak
                + "<br/><br/>Biaya total : "+total
                + "<br/><br/>Silahkan bayar di loket</html>");
    }
    // button kembali ke depan
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sayaka();
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel akhir;
    private javax.swing.JButton batal_member1;
    private javax.swing.JButton batal_member2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel_masuk;
    private javax.swing.JButton cetak_member1;
    private javax.swing.JButton cetak_member2;
    private javax.swing.JButton confrim_masuk;
    private javax.swing.JPanel depan;
    private javax.swing.JLabel des_member;
    private javax.swing.JLabel des_member2;
    private javax.swing.JLabel deskripsi_daftar1;
    private javax.swing.JLabel deskripsi_daftar2;
    private javax.swing.JLabel deskripsi_pilih_member;
    private javax.swing.JLabel deskripsi_pilih_member2;
    private javax.swing.JLabel deskripsi_tiket_member;
    private javax.swing.JLabel deskripsi_tiket_member2;
    private javax.swing.JPasswordField form_pass;
    private javax.swing.JTextField form_user;
    private javax.swing.JLabel harga_a1;
    private javax.swing.JLabel harga_a2;
    private javax.swing.JLabel harga_akhir;
    private javax.swing.JLabel harga_anak1;
    private javax.swing.JLabel harga_anak2;
    private javax.swing.JLabel harga_d1;
    private javax.swing.JLabel harga_d2;
    private javax.swing.JLabel harga_dewasa1;
    private javax.swing.JLabel harga_dewasa2;
    private javax.swing.JLabel harga_total1;
    private javax.swing.JLabel harga_total2;
    private javax.swing.JButton hitung_member;
    private javax.swing.JButton hitung_member2;
    private javax.swing.JSpinner input1;
    private javax.swing.JSpinner input2;
    private javax.swing.JSpinner input3;
    private javax.swing.JSpinner input4;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judul_akhir;
    private javax.swing.JLabel judul_depan;
    private javax.swing.JLabel judul_masuk;
    private javax.swing.JLabel judul_member;
    private javax.swing.JLabel judul_member2;
    private javax.swing.JLabel ket_akhir;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel masuk;
    private javax.swing.JLabel masuk1;
    private javax.swing.JLabel masuk2;
    private javax.swing.JPanel member;
    private javax.swing.JPanel non_member;
    private javax.swing.JPanel panel_harga1;
    private javax.swing.JPanel panel_harga2;
    private javax.swing.JPanel panel_hitung1;
    private javax.swing.JPanel panel_hitung2;
    private javax.swing.JPanel panel_wahana1;
    private javax.swing.JPanel panel_wahana2;
    private javax.swing.JButton pergi01;
    private javax.swing.JButton pergi02;
    private javax.swing.JRadioButton pick_semua1;
    private javax.swing.JRadioButton pick_semua2;
    private javax.swing.JRadioButton pick_taman1;
    private javax.swing.JRadioButton pick_taman2;
    private javax.swing.JRadioButton pick_water1;
    private javax.swing.JRadioButton pick_water2;
    private javax.swing.JButton reset_member;
    private javax.swing.JButton reset_member2;
    private javax.swing.JLabel teks_anak_member1;
    private javax.swing.JLabel teks_anak_member2;
    private javax.swing.JLabel teks_dewasa_member1;
    private javax.swing.JLabel teks_dewasa_member2;
    private javax.swing.JLabel teks_total1;
    private javax.swing.JLabel teks_total2;
    // End of variables declaration//GEN-END:variables
}
