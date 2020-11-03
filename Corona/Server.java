
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sirak
 */
public class Server extends javax.swing.JFrame implements Subject {

    private String günlüktest;
    private String vaka;
    private String yogunbakim;
    private String entübe;
    private String ölü;
    private String iyilesen;
    private String Tarih;
    private String bugun_test1;
    private String bugun_vaka1;
    private String bugun_vefat1;
    private String bugun_iyilesen1;

    FileWriter filewriter;

    private Vector<Observer> observers;

    // soket ile bağlanma işlemi(Server)
    static ServerSocket ss;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;

    public Server() {
        observers = new Vector<Observer>();
        initComponents();
    }

    public String getGünlüktest() {
        // get metotların içerisinde textfielda atanan değerler olmalı fakat uygulayamadım.
        return günlüktest;
    }

    public void setGünlüktest(String günlüktest) {

        this.günlüktest = günlüktest;

    }

    public String getVaka() {

        return vaka;
    }

    public void setVaka(String vaka) {
        this.vaka = vaka;

    }

    public String getYogunbakim() {

        return yogunbakim;
    }

    public void setYogunbakim(String yogunbakim) {
        this.yogunbakim = yogunbakim;

    }

    public String getEntübe() {

        return entübe;

    }

    public void setEntübe(String entübe) {
        this.entübe = entübe;

    }

    public String getÖlü() {

        return ölü;
    }

    public void setÖlü(String ölü) {
        this.ölü = ölü;

    }

    public String getIyilesen() {

        return iyilesen;
    }

    public String getTarih() {
        return Tarih;
    }

    public String getBugun_test1() {
        return bugun_test1;
    }

    public String getBugun_vaka1() {
        return bugun_vaka1;
    }

    public String getBugun_vefat1() {
        return bugun_vefat1;
    }

    public String getBugun_iyilesen1() {
        return bugun_iyilesen1;
    }

    public void setIyilesen(String iyilesen) {

        this.iyilesen = iyilesen;

    }

    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        test_txt = new javax.swing.JTextField();
        vaka_txt = new javax.swing.JTextField();
        yogunbakim_txt = new javax.swing.JTextField();
        ölü_txt = new javax.swing.JTextField();
        entübe_txt = new javax.swing.JTextField();
        iyilesen_txt = new javax.swing.JTextField();
        ekle_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        testlabel = new javax.swing.JLabel();
        vakalabel = new javax.swing.JLabel();
        vefatlabel = new javax.swing.JLabel();
        yogunlabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        entübelabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        iyilesenlabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tarihlabel = new javax.swing.JLabel();
        tarih_txt = new javax.swing.JTextField();
        bugun_test = new javax.swing.JTextField();
        bugun_vaka = new javax.swing.JTextField();
        bugun_vefat = new javax.swing.JTextField();
        bugun_iyilesen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        test_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                test_txtKeyPressed(evt);
            }
        });

        vaka_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vaka_txtKeyPressed(evt);
            }
        });

        yogunbakim_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yogunbakim_txtKeyPressed(evt);
            }
        });

        ölü_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ölü_txtActionPerformed(evt);
            }
        });
        ölü_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ölü_txtKeyPressed(evt);
            }
        });

        entübe_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entübe_txtKeyPressed(evt);
            }
        });

        iyilesen_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iyilesen_txtActionPerformed(evt);
            }
        });
        iyilesen_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iyilesen_txtKeyPressed(evt);
            }
        });

        ekle_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ekle_btn.setText("EKLE");
        ekle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_btnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                   KORONA VİRÜS TABLO GİRİŞ İŞLEMLERİ");

        testlabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        testlabel.setForeground(new java.awt.Color(255, 255, 255));
        testlabel.setText("TOPLAM TEST SAYISI");

        vakalabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        vakalabel.setForeground(new java.awt.Color(255, 255, 255));
        vakalabel.setText("TOPLAM VAKA SAYISI");

        vefatlabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        vefatlabel.setForeground(new java.awt.Color(255, 255, 255));
        vefatlabel.setText("TOPLAM VEFAT SAYISI");

        yogunlabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        yogunlabel.setForeground(new java.awt.Color(255, 255, 255));
        yogunlabel.setText("TOPLAM YOĞUN BAKIM");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("HASTA SAYISI");

        entübelabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        entübelabel.setForeground(new java.awt.Color(255, 255, 255));
        entübelabel.setText("TOPLAM  ENTÜBE HASTA");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SAYISI");

        iyilesenlabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        iyilesenlabel.setForeground(new java.awt.Color(255, 255, 255));
        iyilesenlabel.setText("TOPLAM İYİLEŞEN ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("HASTA SAYISI");

        tarihlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tarihlabel.setForeground(new java.awt.Color(255, 255, 255));
        tarihlabel.setText("TARİH");

        bugun_test.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bugun_testKeyPressed(evt);
            }
        });

        bugun_vaka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bugun_vakaKeyPressed(evt);
            }
        });

        bugun_vefat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bugun_vefatKeyPressed(evt);
            }
        });

        bugun_iyilesen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bugun_iyilesenKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUGÜNKİ TEST SAYISI");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BUGÜNKİ VAKA SAYISI");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BUGÜNKÜ VEFAT SAYISI");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BUGÜNKÜ İYİLEŞEN HASTA ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SAYISI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(tarihlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(431, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 724, Short.MAX_VALUE)
                .addComponent(ekle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iyilesenlabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(entübelabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(entübe_txt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yogunlabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addComponent(yogunbakim_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(vefatlabel)
                                .addGap(18, 18, 18)
                                .addComponent(ölü_txt))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vakalabel)
                                    .addComponent(testlabel))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(vaka_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addComponent(test_txt))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)))
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(90, 90, 90)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bugun_vaka)
                            .addComponent(bugun_test)
                            .addComponent(bugun_vefat, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(bugun_iyilesen))
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tarih_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iyilesen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(test_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testlabel)
                    .addComponent(bugun_test, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vaka_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vakalabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(bugun_vaka, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yogunlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(48, 48, 48))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(bugun_vefat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(bugun_iyilesen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ölü_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vefatlabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yogunbakim_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(entübelabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addComponent(entübe_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(iyilesenlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iyilesen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tarihlabel)
                            .addComponent(tarih_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ekle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
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
    }// </editor-fold>//GEN-END:initComponents

    private void ekle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_btnActionPerformed
       
        try {

            ölü = "";
            günlüktest = "";
            vaka = "";
            yogunbakim = "";
            entübe = "";
            iyilesen = "";
            Tarih = "";
            bugun_test1 = "";
            bugun_vaka1 = "";
            bugun_vefat1 = "";
            bugun_iyilesen1 = "";

            günlüktest = (test_txt.getText().trim());
            dout.writeUTF((günlüktest));
            vaka = (vaka_txt.getText().trim());
            dout.writeUTF((vaka));
            ölü = (ölü_txt.getText().trim());
            dout.writeUTF((ölü));

            yogunbakim = (yogunbakim_txt.getText().trim());
            dout.writeUTF((yogunbakim));

            entübe = (entübe_txt.getText().trim());
            dout.writeUTF((entübe));

            iyilesen = (iyilesen_txt.getText().trim());
            dout.writeUTF((iyilesen));

            Tarih = (tarih_txt.getText().trim());
            dout.writeUTF((Tarih));

            bugun_test1 = (bugun_test.getText().trim());
            dout.writeUTF((bugun_test1));

            bugun_vaka1 = (bugun_vaka.getText().trim());
            dout.writeUTF((bugun_vaka1));

            bugun_vefat1 = (bugun_vefat.getText().trim());
            dout.writeUTF((bugun_vefat1));

            bugun_iyilesen1 = (bugun_iyilesen.getText().trim());
            dout.writeUTF((bugun_iyilesen1));

             if (ölü.isEmpty() || vaka.isEmpty() || yogunbakim.isEmpty() || entübe.isEmpty()
                    || günlüktest.isEmpty() || iyilesen.isEmpty() || Tarih.isEmpty() || bugun_test1.isEmpty()
                    || bugun_vaka1.isEmpty() || bugun_vefat1.isEmpty() || bugun_iyilesen1.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Ekleme işlemleriniz başarılı");
            } else {
                JOptionPane.showMessageDialog(null, "Ekleme işlemleriniz başarılı");
            }
        } catch (Exception e) {

        }

        if (evt.getActionCommand() == ekle_btn.getActionCommand()) {

            try {
                filewriter = new FileWriter("C:\\Users\\Public\\corona.txt");
                filewriter.write(günlüktest);
                filewriter.write("\n");
                filewriter.write(vaka);
                filewriter.write("\n");
                filewriter.write(ölü);
                filewriter.write("\n");
                filewriter.write(yogunbakim);
                filewriter.write("\n");
                filewriter.write(entübe);
                filewriter.write("\n");
                filewriter.write(iyilesen);
                filewriter.write("\n");
                filewriter.write(Tarih);
                filewriter.write("\n");
                filewriter.write(bugun_test1);
                filewriter.write("\n");
                filewriter.write(bugun_vaka1);
                filewriter.write("\n");
                filewriter.write(bugun_vefat1);
                filewriter.write("\n");
                filewriter.write(bugun_iyilesen1);

                filewriter.close();

            } catch (Exception e) {

            }
        }


    }//GEN-LAST:event_ekle_btnActionPerformed

    private void ölü_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ölü_txtActionPerformed

    }//GEN-LAST:event_ölü_txtActionPerformed

    private void test_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_test_txtKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            test_txt.setEditable(false);

        } else {
            test_txt.setEditable(true);
        }
    }//GEN-LAST:event_test_txtKeyPressed

    private void vaka_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vaka_txtKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            vaka_txt.setEditable(false);

        } else {
            vaka_txt.setEditable(true);
        }
    }//GEN-LAST:event_vaka_txtKeyPressed

    private void yogunbakim_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yogunbakim_txtKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            yogunbakim_txt.setEditable(false);

        } else {
            yogunbakim_txt.setEditable(true);
        }
    }//GEN-LAST:event_yogunbakim_txtKeyPressed

    private void ölü_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ölü_txtKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            ölü_txt.setEditable(false);

        } else {
            ölü_txt.setEditable(true);
        }
    }//GEN-LAST:event_ölü_txtKeyPressed

    private void entübe_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entübe_txtKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            entübe_txt.setEditable(false);

        } else {
            entübe_txt.setEditable(true);
        }
    }//GEN-LAST:event_entübe_txtKeyPressed

    private void iyilesen_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iyilesen_txtKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            iyilesen_txt.setEditable(false);

        } else {
            iyilesen_txt.setEditable(true);
        }
    }//GEN-LAST:event_iyilesen_txtKeyPressed

    private void iyilesen_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iyilesen_txtActionPerformed

    }//GEN-LAST:event_iyilesen_txtActionPerformed

    private void bugun_testKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bugun_testKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            bugun_test.setEditable(false);

        } else {
            bugun_test.setEditable(true);
        }
    }//GEN-LAST:event_bugun_testKeyPressed

    private void bugun_vakaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bugun_vakaKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            bugun_vaka.setEditable(false);

        } else {
            bugun_vaka.setEditable(true);
        }
    }//GEN-LAST:event_bugun_vakaKeyPressed

    private void bugun_vefatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bugun_vefatKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            bugun_vefat.setEditable(false);

        } else {
            bugun_vefat.setEditable(true);
        }
    }//GEN-LAST:event_bugun_vefatKeyPressed

    private void bugun_iyilesenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bugun_iyilesenKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            bugun_iyilesen.setEditable(false);

        } else {
            bugun_iyilesen.setEditable(true);
        }
    }//GEN-LAST:event_bugun_iyilesenKeyPressed

    public static void main(String args[]) throws IOException {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Server().setVisible(true);

            }
        });

        CurrentData a = new CurrentData();
        toplamdeger b = new toplamdeger();
        //  Server data = new Server();

        //data.addObserver(a);
        //data.addObserver(b);
        //data.notifyObserver();
        
        
        String test_in = "";
        String vaka_in = "";
        String yogunbakim_in = "";
        String entübe_in = "";
        String vefat_in = "";
        String iyilesen_in = "";
        String tarih_in = "";
        String bugun_testin = "";
        String bugun_vakain = "";
        String bugun_vefatin = "";
        String bugun_iyilesenin = "";

        try {
            ss = new ServerSocket(1101); // server starts at 1201port number
            s = ss.accept(); // now server will acceptsthe connections
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());

            test_in = din.readUTF();
            test_txt.setText(test_txt.getText().trim() + "\n" + test_in);
            vaka_in = din.readUTF();
            vaka_txt.setText(vaka_txt.getText().trim() + "\n" + vaka_in);
            vefat_in = din.readUTF();
            ölü_txt.setText(ölü_txt.getText().trim() + "\n" + vefat_in);

            yogunbakim_in = din.readUTF();
            yogunbakim_txt.setText(yogunbakim_txt.getText().trim() + "\n" + yogunbakim_in);
            entübe_in = din.readUTF();
            entübe_txt.setText(entübe_txt.getText().trim() + "\n" + entübe_in);

            iyilesen_in = din.readUTF();
            iyilesen_txt.setText(iyilesen_txt.getText().trim() + "" + iyilesen_in);
            tarih_in = din.readUTF();
            tarih_txt.setText(tarih_txt.getText().trim() + "" + tarih_in);
            bugun_testin = din.readUTF();
            bugun_test.setText(bugun_test.getText().trim() + "" + bugun_testin);
            bugun_vakain = din.readUTF();
            bugun_vaka.setText(bugun_vaka.getText().trim() + "" + bugun_vakain);
            bugun_vefatin = din.readUTF();
            bugun_vefat.setText(bugun_vefat.getText().trim() + "" + bugun_vefatin);
            bugun_iyilesenin = din.readUTF();
            bugun_iyilesen.setText(bugun_iyilesen.getText().trim() + "" + bugun_iyilesenin);

        } catch (Exception e) {

        }

    }

    @Override
    public void addObserver(Observer o
    ) {

        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o
    ) {
        observers.add(o);

    }

    @Override
    public void notifyObserver() {

        String günlüktest = getGünlüktest();
        String vaka = getVaka();
        String yogunbakim = getYogunbakim();
        String entübe = getEntübe();
        String ölü = getÖlü();
        String iyilesen = getIyilesen();
        String Tarih = getTarih();
        String bugun_test1 = getBugun_test1();
        String bugun_vaka1 = getBugun_vaka1();
        String bugun_vefat1 = getBugun_vefat1();
        String bugun_iyilesen1 = getBugun_iyilesen1();

        for (Observer observer : observers) {
            observer.update(günlüktest, vaka, yogunbakim, entübe, ölü,
                    iyilesen, Tarih, bugun_test1, bugun_vaka1, bugun_vefat1, bugun_iyilesen1);

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField bugun_iyilesen;
    private static javax.swing.JTextField bugun_test;
    private static javax.swing.JTextField bugun_vaka;
    private static javax.swing.JTextField bugun_vefat;
    private javax.swing.JButton ekle_btn;
    private static javax.swing.JTextField entübe_txt;
    private javax.swing.JLabel entübelabel;
    private static javax.swing.JTextField iyilesen_txt;
    private javax.swing.JLabel iyilesenlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JTextField tarih_txt;
    private javax.swing.JLabel tarihlabel;
    private static javax.swing.JTextField test_txt;
    private static javax.swing.JLabel testlabel;
    private static javax.swing.JTextField vaka_txt;
    private static javax.swing.JLabel vakalabel;
    private javax.swing.JLabel vefatlabel;
    private static javax.swing.JTextField yogunbakim_txt;
    private javax.swing.JLabel yogunlabel;
    private static javax.swing.JTextField ölü_txt;
    // End of variables declaration//GEN-END:variables

}
