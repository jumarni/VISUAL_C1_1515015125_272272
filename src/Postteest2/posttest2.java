package Postteest2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJS
 */
public class posttest2 extends javax.swing.JFrame {
    private Object PanelHome;
    private Object panelProfile;
    private Object panelHome;
    private Object system;

    /**
     * Creates new form posttest2
     */
    public posttest2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        tempat = new javax.swing.JLabel();
        jk = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        rr = new javax.swing.JLabel();
        kd = new javax.swing.JLabel();
        kecamatan = new javax.swing.JLabel();
        kota = new javax.swing.JLabel();
        agama = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        gd = new javax.swing.JLabel();
        pekerjaan = new javax.swing.JLabel();
        txtnm = new javax.swing.JTextField();
        txttem = new javax.swing.JTextField();
        txtpria = new javax.swing.JRadioButton();
        txtwanita = new javax.swing.JRadioButton();
        txtal = new javax.swing.JTextField();
        txtpj = new javax.swing.JTextField();
        txtkc = new javax.swing.JTextField();
        txtkd = new javax.swing.JTextField();
        txtr = new javax.swing.JTextField();
        txtkt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtw = new javax.swing.JTextField();
        txtag = new javax.swing.JComboBox<String>();
        txtst = new javax.swing.JComboBox<String>();
        txtgd = new javax.swing.JComboBox<String>();
        txtwna = new javax.swing.JRadioButton();
        txtwni = new javax.swing.JRadioButton();
        breset = new javax.swing.JButton();
        bregister = new javax.swing.JButton();
        kewarganegaraan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttem2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        panelExit = new javax.swing.JButton();
        panelForm = new javax.swing.JButton();
        jpanelHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(255, 204, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("FORM ISIAN");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("KARTU TANDA PENDUDUK");

        nama.setText("Nama :");

        tempat.setText("Tempat/Tanggal Lahir :");

        jk.setText("Jenis Kelamin :");

        alamat.setText("Alamat :");

        rr.setText("RT/RW :");

        kd.setText("Kel/Desa :");

        kecamatan.setText("Kecamatan :");

        kota.setText("Kota :");

        agama.setText("Agama :");

        status.setText("Status :");

        gd.setText("Golongan Darah :");

        pekerjaan.setText("Pekerjaan :");

        txttem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttemActionPerformed(evt);
            }
        });

        buttonGroup1.add(txtpria);
        txtpria.setText("Pria");

        buttonGroup1.add(txtwanita);
        txtwanita.setText("Wanita");

        txtpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpjActionPerformed(evt);
            }
        });

        jLabel17.setText("/");

        txtag.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ISLAM", "KRISTEN", "HINDU", "BUDHA", " " }));

        txtst.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KAWIN", "BELUM KAWIN", "JOMBLO", " " }));
        txtst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstActionPerformed(evt);
            }
        });

        txtgd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "AB", "O" }));
        txtgd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgdActionPerformed(evt);
            }
        });

        buttonGroup2.add(txtwna);
        txtwna.setText("WNA");

        buttonGroup2.add(txtwni);
        txtwni.setText("WNI");
        txtwni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwniActionPerformed(evt);
            }
        });

        breset.setText("Reset");
        breset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bresetMouseClicked(evt);
            }
        });
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        bregister.setText("Register");
        bregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bregisterActionPerformed(evt);
            }
        });

        kewarganegaraan.setText("Kewarganegaraan");

        jLabel3.setText("/");

        txttem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttem2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        panelExit.setBackground(new java.awt.Color(0, 255, 255));
        panelExit.setText("EXIT");
        panelExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelExitActionPerformed(evt);
            }
        });

        panelForm.setBackground(new java.awt.Color(0, 255, 255));
        panelForm.setText("FORM");
        panelForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelFormActionPerformed(evt);
            }
        });

        jpanelHome.setBackground(new java.awt.Color(0, 255, 255));
        jpanelHome.setText("HOME");
        jpanelHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpanelHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gd)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agama)
                                    .addComponent(kecamatan)
                                    .addComponent(kota)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(kd)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(alamat)
                                            .addComponent(rr)))
                                    .addComponent(jk)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(nama))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tempat))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(kewarganegaraan)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel17)
                                .addGap(8, 8, 8)
                                .addComponent(txtw, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtpria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtwanita))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtwna)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtwni))
                                .addComponent(txtgd, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtst, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtag, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtpj, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                .addComponent(txtkc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txttem2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pekerjaan)
                            .addComponent(status))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(breset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bregister)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jpanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(panelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(294, 294, 294))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jpanelHome)
                        .addComponent(panelForm)
                        .addComponent(panelExit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama)
                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txttem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(tempat)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpria)
                    .addComponent(txtwanita)
                    .addComponent(jk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(rr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kd, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtkc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kecamatan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kota)
                    .addComponent(txtkt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status)
                    .addComponent(txtst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtgd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pekerjaan)
                    .addComponent(txtpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtwna)
                    .addComponent(txtwni)
                    .addComponent(kewarganegaraan))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breset)
                    .addComponent(bregister)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttemActionPerformed

    private void txtpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpjActionPerformed

    private void txtgdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgdActionPerformed

    private void txtwniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwniActionPerformed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        // TODO add your handling code here:
        txtnm.setText("");
        txttem.setText("");
        txttem2.setText("");
        txtal.setText("");
        buttonGroup1.clearSelection();
        txtr.setText("");
        txtw.setText("");
        txtkd.setText("");
        txtkc.setText("");
        txtkt.setText("");
        txtpj.setText("");
        buttonGroup2.clearSelection();
        txtag.setSelectedItem(null);
        txtst.setSelectedItem(null);
        txtgd.setSelectedItem(null);
        
        
    }//GEN-LAST:event_bresetActionPerformed

    private void bregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bregisterActionPerformed
        // TODO add your handling code here:
       String Nama,Tempat1,Tempat2,Jk=null,Alamat,Rr,Rw,Kd,Kecamatan,Kota,Agama,Status,Gd,Pekerjaan,Kg=null;
       Nama = txtnm.getText();
       Tempat1 = txttem.getText();
       Tempat2 = txttem2.getText();
            if (txtpria.isSelected())
            {Jk = txtpria.getText();}
            else if (txtwanita.isSelected())
            {Jk = txtwanita.getText();}
       Alamat = txtal.getText();
       Rr = txtr.getText();
       Rw = txtw.getText();
       Kd = txtkd.getText();
       Kecamatan = txtkc.getText();
       Kota = txtkt.getText();
       Agama = txtag.getSelectedItem().toString();
       Status = txtst.getSelectedItem().toString();
       Gd = txtgd.getSelectedItem().toString();
       Pekerjaan = txtpj.getText();
            if (txtwna.isSelected())
            {Kg = txtwna.getText();}
            else if (txtwni.isSelected())
            {Kg = txtwni.getText();}
            
       Output x=new Output(Nama,Tempat1,Tempat2,Jk,Alamat,Rr,Rw,Kd,Kecamatan,Kota,Agama,Status,Gd,Pekerjaan,Kg);
       x.setVisible(true);
       
    }//GEN-LAST:event_bregisterActionPerformed

    private void txttem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttem2ActionPerformed

    private void bresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bresetMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bresetMouseClicked

    private void jpanelHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpanelHomeActionPerformed
        // TODO add your handling code here:
        jpanelHome.setVisible(true);
        panelForm.setVisible(false);
    }//GEN-LAST:event_jpanelHomeActionPerformed

    private void panelFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelFormActionPerformed
        // TODO add your handling code here:
        panelForm.setVisible(true);
        jpanelHome.setVisible(false);
        
    }//GEN-LAST:event_panelFormActionPerformed

    private void panelExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_panelExitActionPerformed

    private void txtstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(posttest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(posttest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(posttest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(posttest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new posttest2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agama;
    private javax.swing.JLabel alamat;
    private javax.swing.JButton bregister;
    private javax.swing.JButton breset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel gd;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jk;
    private javax.swing.JButton jpanelHome;
    private javax.swing.JLabel kd;
    private javax.swing.JLabel kecamatan;
    private javax.swing.JLabel kewarganegaraan;
    private javax.swing.JLabel kota;
    private javax.swing.JLabel nama;
    private javax.swing.JButton panelExit;
    private javax.swing.JButton panelForm;
    private javax.swing.JLabel pekerjaan;
    private javax.swing.JLabel rr;
    private javax.swing.JLabel status;
    private javax.swing.JLabel tempat;
    private javax.swing.JComboBox<String> txtag;
    private javax.swing.JTextField txtal;
    private javax.swing.JComboBox<String> txtgd;
    private javax.swing.JTextField txtkc;
    private javax.swing.JTextField txtkd;
    private javax.swing.JTextField txtkt;
    private javax.swing.JTextField txtnm;
    private javax.swing.JTextField txtpj;
    private javax.swing.JRadioButton txtpria;
    private javax.swing.JTextField txtr;
    private javax.swing.JComboBox<String> txtst;
    private javax.swing.JTextField txttem;
    private javax.swing.JTextField txttem2;
    private javax.swing.JTextField txtw;
    private javax.swing.JRadioButton txtwanita;
    private javax.swing.JRadioButton txtwna;
    private javax.swing.JRadioButton txtwni;
    // End of variables declaration//GEN-END:variables
}
