/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

/**
 *
 * @author Deking
 */
public class Title extends javax.swing.JFrame {

    /**
     * Creates new form Title
     */
    public Title() {
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

        jPanel1 = new javax.swing.JPanel();
        Judul = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buatpelatihBtn = new javax.swing.JButton();
        buatSiluman = new javax.swing.JButton();
        dataPelatihBtn = new javax.swing.JButton();
        dataSilumanBtn = new javax.swing.JButton();
        bertarungBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 5, true));
        jPanel1.setForeground(java.awt.Color.white);

        Judul.setFont(new java.awt.Font("Square721 BT", 1, 48)); // NOI18N
        Judul.setForeground(new java.awt.Color(255, 255, 255));
        Judul.setText("Perang Siluman");
        Judul.setMaximumSize(new java.awt.Dimension(1024, 768));
        Judul.setMinimumSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(Judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(java.awt.Color.black);
        jPanel2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 5, true));

        buatpelatihBtn.setBackground(java.awt.Color.black);
        buatpelatihBtn.setFont(new java.awt.Font("Square721 BT", 0, 36)); // NOI18N
        buatpelatihBtn.setForeground(java.awt.Color.white);
        buatpelatihBtn.setText("Buat Pelatih");

        buatSiluman.setBackground(java.awt.Color.black);
        buatSiluman.setFont(new java.awt.Font("Square721 BT", 0, 36)); // NOI18N
        buatSiluman.setForeground(java.awt.Color.white);
        buatSiluman.setText("Buat Siluman");

        dataPelatihBtn.setBackground(java.awt.Color.black);
        dataPelatihBtn.setFont(new java.awt.Font("Square721 BT", 0, 36)); // NOI18N
        dataPelatihBtn.setForeground(java.awt.Color.white);
        dataPelatihBtn.setText("Data Pelatih");

        dataSilumanBtn.setBackground(java.awt.Color.black);
        dataSilumanBtn.setFont(new java.awt.Font("Square721 BT", 0, 36)); // NOI18N
        dataSilumanBtn.setForeground(java.awt.Color.white);
        dataSilumanBtn.setText("Data Siluman");

        bertarungBtn.setBackground(java.awt.Color.black);
        bertarungBtn.setFont(new java.awt.Font("Square721 BT", 0, 36)); // NOI18N
        bertarungBtn.setForeground(java.awt.Color.white);
        bertarungBtn.setText("Bertarung!!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(buatSiluman)
                    .addComponent(buatpelatihBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(dataSilumanBtn)
                    .addComponent(dataPelatihBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bertarungBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(bertarungBtn)
                .addGap(13, 13, 13)
                .addComponent(buatpelatihBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buatSiluman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataPelatihBtn)
                .addGap(18, 18, 18)
                .addComponent(dataSilumanBtn)
                .addGap(202, 202, 202))
        );

        buatpelatihBtn.getAccessibleContext().setAccessibleName("BuatPelatih");

        jPanel3.setBackground(java.awt.Color.black);
        jPanel3.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 5, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
    public JButton getBertarungBtn() {
        return bertarungBtn;
    }

    public void setBertarungBtn(JButton bertarungBtn) {
        this.bertarungBtn = bertarungBtn;
    }

    public JButton getBuatSiluman() {
        return buatSiluman;
    }

    public void setBuatSiluman(JButton buatSiluman) {
        this.buatSiluman = buatSiluman;
    }

    public JButton getBuatpelatihBtn() {
        return buatpelatihBtn;
    }

    public void setBuatpelatihBtn(JButton buatpelatihBtn) {
        this.buatpelatihBtn = buatpelatihBtn;
    }

    public JButton getDataPelatihBtn() {
        return dataPelatihBtn;
    }

    public void setDataPelatihBtn(JButton dataPelatihBtn) {
        this.dataPelatihBtn = dataPelatihBtn;
    }

    public JButton getDataSilumanBtn() {
        return dataSilumanBtn;
    }

    public void setDataSilumanBtn(JButton dataSilumanBtn) {
        this.dataSilumanBtn = dataSilumanBtn;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul;
    private javax.swing.JButton bertarungBtn;
    private javax.swing.JButton buatSiluman;
    private javax.swing.JButton buatpelatihBtn;
    private javax.swing.JButton dataPelatihBtn;
    private javax.swing.JButton dataSilumanBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
