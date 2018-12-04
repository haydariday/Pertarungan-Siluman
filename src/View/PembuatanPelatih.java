/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Deking
 */
public class PembuatanPelatih extends javax.swing.JFrame {

    /**
     * Creates new form ViewPelatih
     */
    public PembuatanPelatih() {
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

        rasBtn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        judulpembuatanpelatihLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        inputnamaTxt = new javax.swing.JTextField();
        manusiaRdo = new javax.swing.JRadioButton();
        periRdo = new javax.swing.JRadioButton();
        kurcaciRdo = new javax.swing.JRadioButton();
        namaLbl = new javax.swing.JLabel();
        judulinputpelatihLbl = new javax.swing.JLabel();
        rasLbl = new javax.swing.JLabel();
        buatpelatihBtn = new javax.swing.JButton();
        kembaliBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.black);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        jPanel1.setBackground(java.awt.Color.black);
        jPanel1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 5, true));
        jPanel1.setForeground(java.awt.Color.white);

        judulpembuatanpelatihLbl.setBackground(java.awt.Color.black);
        judulpembuatanpelatihLbl.setFont(new java.awt.Font("Square721 BT", 1, 48)); // NOI18N
        judulpembuatanpelatihLbl.setForeground(java.awt.Color.white);
        judulpembuatanpelatihLbl.setText("Pembuatan Pelatih");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(judulpembuatanpelatihLbl)
                .addGap(250, 250, 250))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulpembuatanpelatihLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.Color.black);
        jPanel2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 5, true));
        jPanel2.setForeground(java.awt.Color.white);

        inputnamaTxt.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N

        manusiaRdo.setBackground(java.awt.Color.black);
        rasBtn.add(manusiaRdo);
        manusiaRdo.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        manusiaRdo.setForeground(java.awt.Color.white);
        manusiaRdo.setText("Manusia");

        periRdo.setBackground(java.awt.Color.black);
        rasBtn.add(periRdo);
        periRdo.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        periRdo.setForeground(java.awt.Color.white);
        periRdo.setText("Peri");

        kurcaciRdo.setBackground(java.awt.Color.black);
        rasBtn.add(kurcaciRdo);
        kurcaciRdo.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        kurcaciRdo.setForeground(java.awt.Color.white);
        kurcaciRdo.setText("Kurcaci");

        namaLbl.setBackground(java.awt.Color.black);
        namaLbl.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        namaLbl.setForeground(java.awt.Color.white);
        namaLbl.setText("Nama");

        judulinputpelatihLbl.setBackground(java.awt.Color.black);
        judulinputpelatihLbl.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        judulinputpelatihLbl.setForeground(java.awt.Color.white);
        judulinputpelatihLbl.setText("Input Data Pelatih");

        rasLbl.setBackground(java.awt.Color.black);
        rasLbl.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        rasLbl.setForeground(java.awt.Color.white);
        rasLbl.setText("Ras");

        buatpelatihBtn.setBackground(java.awt.Color.black);
        buatpelatihBtn.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        buatpelatihBtn.setForeground(java.awt.Color.white);
        buatpelatihBtn.setText("Buat Pelatih");

        kembaliBtn.setBackground(java.awt.Color.black);
        kembaliBtn.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        kembaliBtn.setForeground(java.awt.Color.white);
        kembaliBtn.setText("Kembali");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaLbl)
                            .addComponent(rasLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputnamaTxt)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(periRdo)
                                    .addComponent(manusiaRdo)
                                    .addComponent(kurcaciRdo))
                                .addGap(0, 251, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(judulinputpelatihLbl)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kembaliBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buatpelatihBtn)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulinputpelatihLbl)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputnamaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaLbl))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rasLbl)
                    .addComponent(manusiaRdo))
                .addGap(44, 44, 44)
                .addComponent(periRdo)
                .addGap(48, 48, 48)
                .addComponent(kurcaciRdo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buatpelatihBtn)
                    .addComponent(kembaliBtn))
                .addGap(40, 40, 40))
        );

        jPanel3.setBackground(java.awt.Color.black);
        jPanel3.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 5, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBuatpelatihBtn() {
        return buatpelatihBtn;
    }

    public void setBuatpelatihBtn(JButton buatpelatihBtn) {
        this.buatpelatihBtn = buatpelatihBtn;
    }

    public JButton getKembaliBtn() {
        return kembaliBtn;
    }

    public void setKembaliBtn(JButton kembaliBtn) {
        this.kembaliBtn = kembaliBtn;
    }

    public JTextField getInputnamaTxt() {
        return inputnamaTxt;
    }

    public void setInputnamaTxt(JTextField inputnamaTxt) {
        this.inputnamaTxt = inputnamaTxt;
    }

    public JRadioButton getKurcaciRdo() {
        return kurcaciRdo;
    }

    public void setKurcaciRdo(JRadioButton kurcaciRdo) {
        this.kurcaciRdo = kurcaciRdo;
    }

    public JRadioButton getManusiaRdo() {
        return manusiaRdo;
    }

    public void setManusiaRdo(JRadioButton manusiaRdo) {
        this.manusiaRdo = manusiaRdo;
    }

    public JRadioButton getPeriRdo() {
        return periRdo;
    }

    public void setPeriRdo(JRadioButton periRdo) {
        this.periRdo = periRdo;
    }

    public ButtonGroup getRasBtn() {
        return rasBtn;
    }

    public void setRasBtn(ButtonGroup rasBtn) {
        this.rasBtn = rasBtn;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buatpelatihBtn;
    private javax.swing.JTextField inputnamaTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel judulinputpelatihLbl;
    private javax.swing.JLabel judulpembuatanpelatihLbl;
    private javax.swing.JButton kembaliBtn;
    private javax.swing.JRadioButton kurcaciRdo;
    private javax.swing.JRadioButton manusiaRdo;
    private javax.swing.JLabel namaLbl;
    private javax.swing.JRadioButton periRdo;
    private javax.swing.ButtonGroup rasBtn;
    private javax.swing.JLabel rasLbl;
    // End of variables declaration//GEN-END:variables
}
