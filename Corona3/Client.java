
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.net.Socket;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sirak
 */
public class Client extends javax.swing.JFrame {

    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;

//private static Client instance;
    /**
     * Creates new form Client
     */
    public Client() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        test_txt = new javax.swing.JTextField();
        vaka_txt = new javax.swing.JTextField();
        ölü_txt = new javax.swing.JTextField();
        yogunbakim_txt = new javax.swing.JTextField();
        entübe_txt = new javax.swing.JTextField();
        iyilesen_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        T = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        test_txt.setBackground(new java.awt.Color(0, 153, 153));
        test_txt.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        test_txt.setForeground(new java.awt.Color(255, 255, 255));
        test_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test_txtActionPerformed(evt);
            }
        });

        vaka_txt.setBackground(new java.awt.Color(0, 153, 153));
        vaka_txt.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        vaka_txt.setForeground(new java.awt.Color(255, 255, 255));
        vaka_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaka_txtActionPerformed(evt);
            }
        });

        ölü_txt.setBackground(new java.awt.Color(0, 153, 153));
        ölü_txt.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ölü_txt.setForeground(new java.awt.Color(255, 255, 255));
        ölü_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ölü_txtActionPerformed(evt);
            }
        });

        yogunbakim_txt.setBackground(new java.awt.Color(0, 153, 153));
        yogunbakim_txt.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        yogunbakim_txt.setForeground(new java.awt.Color(255, 255, 255));
        yogunbakim_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yogunbakim_txtActionPerformed(evt);
            }
        });

        entübe_txt.setBackground(new java.awt.Color(0, 153, 153));
        entübe_txt.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        entübe_txt.setForeground(new java.awt.Color(255, 255, 255));
        entübe_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entübe_txtActionPerformed(evt);
            }
        });

        iyilesen_txt.setBackground(new java.awt.Color(0, 153, 153));
        iyilesen_txt.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        iyilesen_txt.setForeground(new java.awt.Color(255, 255, 255));
        iyilesen_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iyilesen_txtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("TOPLAM TEST SAYISI");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("TOPLAM VAKA SAYISI");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("TOPLAM VEFAT SAYISI");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("TOPLAM YOĞUN BAKIM ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("TOPLAM ENTÜBE SAYISI");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("TOPLAM İYİLEŞEN SAYISI");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("SAYISI");

        panel.setBackground(new java.awt.Color(0, 204, 204));
        panel.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("GÖSTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        T.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        T.setForeground(new java.awt.Color(255, 255, 255));
        T.setText("TÜRKİYE GÜNLÜK KORONAVİRÜS TABLOSU");

        jLabel8.setText("Vaka Sayısı");

        jLabel9.setText("Vefat Sayısı");

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 51, 0));

        jButton3.setBackground(new java.awt.Color(204, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel7)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)))
                        .addGap(58, 58, 58)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iyilesen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(yogunbakim_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addComponent(vaka_txt)
                        .addComponent(test_txt)
                        .addComponent(ölü_txt)
                        .addComponent(entübe_txt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(55, 55, 55)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(test_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vaka_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ölü_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addComponent(yogunbakim_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entübe_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iyilesen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(T, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void test_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test_txtActionPerformed
        try {
            FileReader f = new FileReader("C:\\Users\\Public\\corona.txt");
            BufferedReader in = new BufferedReader(f);
            String[] line = new String[1];
            for (int i = 0; i < 1; i++) {

                line[i] = in.readLine();

                // if (line[i].startsWith(":")==false) {
                //System.out.println(line[i]);
                test_txt.setText(line[i]);
                // }
            }

        } catch (Exception e) {

        }


    }//GEN-LAST:event_test_txtActionPerformed

    private void vaka_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaka_txtActionPerformed
        try {
            FileReader f = new FileReader("C:\\Users\\Public\\corona.txt");
            BufferedReader in = new BufferedReader(f);
            String[] line = new String[2];
            for (int i = 0; i < 2; i++) {
 
                line[i] = in.readLine();

                // if (line[i].startsWith(":")==false) {
                // System.out.println(line[i]);
                vaka_txt.setText(line[i]);
                // }
            }

        } catch (Exception e) {

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_vaka_txtActionPerformed

    private void ölü_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ölü_txtActionPerformed
        try {
            FileReader f = new FileReader("C:\\Users\\Public\\corona.txt");
            BufferedReader in = new BufferedReader(f);
            String[] line = new String[3];
            for (int i = 0; i < 3; i++) {

                line[i] = in.readLine();

                // if (line[i].startsWith(":")==false) {
                // System.out.println(line[i]);
                ölü_txt.setText(line[i]);
                // }
            }

        } catch (Exception e) {

        }

// TODO add your handling code here:
    }//GEN-LAST:event_ölü_txtActionPerformed

    private void yogunbakim_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yogunbakim_txtActionPerformed
        try {
            FileReader f = new FileReader("C:\\Users\\Public\\corona.txt");
            BufferedReader in = new BufferedReader(f);
            String[] line = new String[4];
            for (int i = 0; i < 4; i++) {

                line[i] = in.readLine();

             
                yogunbakim_txt.setText(line[i]);
              
            }

        } catch (Exception e) {

        }
// TODO add your handling code here:
    }//GEN-LAST:event_yogunbakim_txtActionPerformed

    private void entübe_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entübe_txtActionPerformed
        try {
            FileReader f = new FileReader("C:\\Users\\Public\\corona.txt");
            BufferedReader in = new BufferedReader(f);
            String[] line = new String[5];
            for (int i = 0; i < 5; i++) {

                line[i] = in.readLine();

             
                entübe_txt.setText(line[i]);
               
            }

        } catch (Exception e) {

        }

// TODO add your handling code here:
    }//GEN-LAST:event_entübe_txtActionPerformed

    private void iyilesen_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iyilesen_txtActionPerformed

        try {
            FileReader f = new FileReader("C:\\Users\\Public\\corona.txt");
            BufferedReader in = new BufferedReader(f);
            String[] line = new String[6];
            for (int i = 0; i < 6; i++) {

                line[i] = in.readLine();

              
                iyilesen_txt.setText(line[i]);
               
            }

        } catch (Exception e) {

        }
// TODO add your handling code here:
    }//GEN-LAST:event_iyilesen_txtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //float s1 = Float.parseFloat(test_txt.getText());
        float s2 = Float.parseFloat(vaka_txt.getText());
        float s3 = Float.parseFloat(ölü_txt.getText());
        // float s4 = Float.parseFloat(yogunbakim_txt.getText());
        //float s5 = Float.parseFloat(entübe_txt.getText());
        //float s6 = Float.parseFloat(iyilesen_txt.getText());
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
      

        dataset.setValue(s2, "", "128000");
        dataset.setValue(s2, "", "118400");
        dataset.setValue(s2, "", "108800");
        dataset.setValue(s2, "", "99200");
        dataset.setValue(s2, "", "89600");
        dataset.setValue(s2, "", "80000");
        dataset.setValue(s2, "", "70400");
        dataset.setValue(s2, "", "60800");
         dataset.setValue(s2, "", "51200");
        dataset.setValue(s2, "", "416000");
        dataset.setValue(s2, "", "320000");
        dataset.setValue(s2, "", "22400");
         dataset.setValue(s2, "", "12800");
          dataset.setValue(s2, "", "3200");

        dataset.setValue(s3, "", "3200");

        JFreeChart chart = ChartFactory.createLineChart("", "", "", dataset, PlotOrientation.HORIZONTAL, false, false, false);
    
        CategoryPlot catPlot = chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.BLACK);
        ChartPanel chartpanel = new ChartPanel(chart);
       
             
        panel.removeAll();
        panel.add(chartpanel, BorderLayout.CENTER);
     
        panel.validate();
      

// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
                Singleton singleton = Singleton.GetInstance();
            }
        });

        String test_in = "";
        String vaka_in = "";
        String yogunbakim_in = "";
        String entübe_in = "";
        String vefat_in = "";
        String iyilesen_in = "";

        try {

            s = new Socket("127.0.0.1", 1101);
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());

            test_in = din.readUTF();
            test_txt.setText(test_txt.getText().trim() + "" + test_in);
            vaka_in = din.readUTF();
            vaka_txt.setText(vaka_txt.getText().trim() + "\n" + vaka_in);
            vefat_in = din.readUTF();
            ölü_txt.setText(ölü_txt.getText().trim() + "" + vefat_in);
            yogunbakim_in = din.readUTF();
            yogunbakim_txt.setText(yogunbakim_txt.getText().trim() + "" + yogunbakim_in);

            entübe_in = din.readUTF();
            entübe_txt.setText(entübe_txt.getText().trim() + "" + entübe_in);
            iyilesen_in = din.readUTF();
            iyilesen_txt.setText(iyilesen_txt.getText().trim() + "" + iyilesen_in);
        } catch (Exception e) {

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel T;
    private static javax.swing.JTextField entübe_txt;
    private static javax.swing.JTextField iyilesen_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    private static javax.swing.JTextField test_txt;
    private static javax.swing.JTextField vaka_txt;
    private static javax.swing.JTextField yogunbakim_txt;
    private static javax.swing.JTextField ölü_txt;
    // End of variables declaration//GEN-END:variables
}
