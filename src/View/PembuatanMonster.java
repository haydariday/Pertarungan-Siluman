/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Deking
 */
public class PembuatanMonster extends javax.swing.JFrame {

    /**
     * Creates new form PembuatanMonster
     */
    public PembuatanMonster() {
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

        tipeGrpBtn = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        atributLbl = new javax.swing.JLabel();
        buatsilumanBtn = new javax.swing.JButton();
        attLbl = new javax.swing.JLabel();
        defLbl = new javax.swing.JLabel();
        hpLbl = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        pointsLbl = new javax.swing.JLabel();
        plusattBtn = new javax.swing.JButton();
        plusdefBtn = new javax.swing.JButton();
        plushpBtn = new javax.swing.JButton();
        intattLbl = new javax.swing.JLabel();
        intdefLbl = new javax.swing.JLabel();
        inthpLbl = new javax.swing.JLabel();
        intpointLbl = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        inputnamaTxt = new javax.swing.JTextField();
        AirRdo = new javax.swing.JRadioButton();
        ApiRdo = new javax.swing.JRadioButton();
        bumiRdo = new javax.swing.JRadioButton();
        namaLbl = new javax.swing.JLabel();
        tipeLbl = new javax.swing.JLabel();
        kembaliBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        judulpembuatansilumanLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setSize(new java.awt.Dimension(1024, 768));

        jPanel3.setBackground(java.awt.Color.black);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white, 5));
        jPanel3.setForeground(java.awt.Color.white);

        atributLbl.setBackground(java.awt.Color.black);
        atributLbl.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        atributLbl.setForeground(java.awt.Color.white);
        atributLbl.setText("Atribut");

        buatsilumanBtn.setBackground(java.awt.Color.black);
        buatsilumanBtn.setFont(new java.awt.Font("Square721 BT", 1, 24)); // NOI18N
        buatsilumanBtn.setForeground(java.awt.Color.white);
        buatsilumanBtn.setText("Buat Siluman");

        attLbl.setBackground(java.awt.Color.black);
        attLbl.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        attLbl.setForeground(java.awt.Color.white);
        attLbl.setText("Attack :");

        defLbl.setBackground(java.awt.Color.black);
        defLbl.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        defLbl.setForeground(java.awt.Color.white);
        defLbl.setText("Defend :");

        hpLbl.setBackground(java.awt.Color.black);
        hpLbl.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        hpLbl.setForeground(java.awt.Color.white);
        hpLbl.setText("Health :");

        resetBtn.setBackground(java.awt.Color.black);
        resetBtn.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        resetBtn.setForeground(java.awt.Color.white);
        resetBtn.setText("Reset");

        pointsLbl.setBackground(java.awt.Color.black);
        pointsLbl.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        pointsLbl.setForeground(java.awt.Color.white);
        pointsLbl.setText("Points :");

        plusattBtn.setBackground(java.awt.Color.black);
        plusattBtn.setFont(new java.awt.Font("Square721 BT", 0, 18)); // NOI18N
        plusattBtn.setForeground(java.awt.Color.white);
        plusattBtn.setText("+");

        plusdefBtn.setBackground(java.awt.Color.black);
        plusdefBtn.setFont(new java.awt.Font("Square721 BT", 0, 18)); // NOI18N
        plusdefBtn.setForeground(java.awt.Color.white);
        plusdefBtn.setText("+");

        plushpBtn.setBackground(java.awt.Color.black);
        plushpBtn.setFont(new java.awt.Font("Square721 BT", 0, 18)); // NOI18N
        plushpBtn.setForeground(java.awt.Color.white);
        plushpBtn.setText("+");

        intattLbl.setBackground(java.awt.Color.black);
        intattLbl.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        intattLbl.setForeground(java.awt.Color.white);
        intattLbl.setText("0");

        intdefLbl.setBackground(java.awt.Color.black);
        intdefLbl.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        intdefLbl.setForeground(java.awt.Color.white);
        intdefLbl.setText("0");

        inthpLbl.setBackground(java.awt.Color.black);
        inthpLbl.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        inthpLbl.setForeground(java.awt.Color.white);
        inthpLbl.setText("0");

        intpointLbl.setBackground(java.awt.Color.black);
        intpointLbl.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        intpointLbl.setForeground(java.awt.Color.white);
        intpointLbl.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atributLbl)
                            .addComponent(defLbl)
                            .addComponent(hpLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(attLbl))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(intattLbl)
                            .addComponent(intdefLbl)
                            .addComponent(inthpLbl)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(pointsLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(intpointLbl))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(resetBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plusdefBtn)
                    .addComponent(plusattBtn)
                    .addComponent(plushpBtn))
                .addGap(75, 75, 75))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(buatsilumanBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(atributLbl)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pointsLbl)
                    .addComponent(intpointLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attLbl)
                    .addComponent(plusattBtn)
                    .addComponent(intattLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defLbl)
                    .addComponent(plusdefBtn)
                    .addComponent(intdefLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hpLbl)
                    .addComponent(plushpBtn)
                    .addComponent(inthpLbl))
                .addGap(59, 59, 59)
                .addComponent(resetBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(buatsilumanBtn)
                .addGap(110, 110, 110))
        );

        jPanel4.setBackground(java.awt.Color.black);
        jPanel4.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 5, true));
        jPanel4.setForeground(java.awt.Color.white);

        inputnamaTxt.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N

        AirRdo.setBackground(java.awt.Color.black);
        tipeGrpBtn.add(AirRdo);
        AirRdo.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        AirRdo.setForeground(java.awt.Color.white);
        AirRdo.setText("Air");

        ApiRdo.setBackground(java.awt.Color.black);
        tipeGrpBtn.add(ApiRdo);
        ApiRdo.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        ApiRdo.setForeground(java.awt.Color.white);
        ApiRdo.setText("Api");

        bumiRdo.setBackground(java.awt.Color.black);
        tipeGrpBtn.add(bumiRdo);
        bumiRdo.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        bumiRdo.setForeground(java.awt.Color.white);
        bumiRdo.setText("Bumi");

        namaLbl.setBackground(java.awt.Color.black);
        namaLbl.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        namaLbl.setForeground(java.awt.Color.white);
        namaLbl.setText("Nama");

        tipeLbl.setBackground(java.awt.Color.black);
        tipeLbl.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        tipeLbl.setForeground(java.awt.Color.white);
        tipeLbl.setText("Tipe");

        kembaliBtn.setBackground(java.awt.Color.black);
        kembaliBtn.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        kembaliBtn.setForeground(java.awt.Color.white);
        kembaliBtn.setText("Kembali");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kembaliBtn)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaLbl)
                            .addComponent(tipeLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ApiRdo)
                            .addComponent(AirRdo)
                            .addComponent(bumiRdo)
                            .addComponent(inputnamaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputnamaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaLbl))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipeLbl)
                    .addComponent(AirRdo))
                .addGap(34, 34, 34)
                .addComponent(ApiRdo)
                .addGap(37, 37, 37)
                .addComponent(bumiRdo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kembaliBtn)
                .addGap(102, 102, 102))
        );

        jPanel5.setBackground(java.awt.Color.black);
        jPanel5.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 5, true));
        jPanel5.setForeground(java.awt.Color.white);

        judulpembuatansilumanLbl.setBackground(java.awt.Color.black);
        judulpembuatansilumanLbl.setFont(new java.awt.Font("Square721 BT", 1, 48)); // NOI18N
        judulpembuatansilumanLbl.setForeground(java.awt.Color.white);
        judulpembuatansilumanLbl.setText("Pembuatan Siluman");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(judulpembuatansilumanLbl)
                .addGap(280, 280, 280))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulpembuatansilumanLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(660, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getKembaliBtn() {
        return kembaliBtn;
    }

    public void setKembaliBtn(JButton kembaliBtn) {
        this.kembaliBtn = kembaliBtn;
    }

    public JRadioButton getAirRdo() {
        return AirRdo;
    }

    public void setAirRdo(JRadioButton AirRdo) {
        this.AirRdo = AirRdo;
    }

    public JRadioButton getApiRdo() {
        return ApiRdo;
    }

    public void setApiRdo(JRadioButton ApiRdo) {
        this.ApiRdo = ApiRdo;
    }

    public JButton getBuatsilumanBtn() {
        return buatsilumanBtn;
    }

    public void setBuatsilumanBtn(JButton buatsilumanBtn) {
        this.buatsilumanBtn = buatsilumanBtn;
    }

    public JRadioButton getBumiRdo() {
        return bumiRdo;
    }

    public void setBumiRdo(JRadioButton bumiRdo) {
        this.bumiRdo = bumiRdo;
    }

    public JTextField getInputnamaTxt() {
        return inputnamaTxt;
    }

    public void setInputnamaTxt(JTextField inputnamaTxt) {
        this.inputnamaTxt = inputnamaTxt;
    }

    public JLabel getIntattLbl() {
        return intattLbl;
    }

    public void setIntattLbl(JLabel intattLbl) {
        this.intattLbl = intattLbl;
    }

    public JLabel getIntdefLbl() {
        return intdefLbl;
    }

    public void setIntdefLbl(JLabel intdefLbl) {
        this.intdefLbl = intdefLbl;
    }

    public JLabel getInthpLbl() {
        return inthpLbl;
    }

    public void setInthpLbl(JLabel inthpLbl) {
        this.inthpLbl = inthpLbl;
    }

    public JLabel getIntpointLbl() {
        return intpointLbl;
    }

    public void setIntpointLbl(JLabel intpointLbl) {
        this.intpointLbl = intpointLbl;
    }

    public JButton getPlusattBtn() {
        return plusattBtn;
    }

    public void setPlusattBtn(JButton plusattBtn) {
        this.plusattBtn = plusattBtn;
    }

    public JButton getPlusdefBtn() {
        return plusdefBtn;
    }

    public void setPlusdefBtn(JButton plusdefBtn) {
        this.plusdefBtn = plusdefBtn;
    }

    public JButton getPlushpBtn() {
        return plushpBtn;
    }

    public void setPlushpBtn(JButton plushpBtn) {
        this.plushpBtn = plushpBtn;
    }

    public JButton getResetBtn() {
        return resetBtn;
    }

    public void setResetBtn(JButton reserBtn) {
        this.resetBtn = reserBtn;
    }

    public ButtonGroup getTipeGrpBtn() {
        return tipeGrpBtn;
    }

    public void setTipeGrpBtn(ButtonGroup tipeGrpBtn) {
        this.tipeGrpBtn = tipeGrpBtn;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AirRdo;
    private javax.swing.JRadioButton ApiRdo;
    private javax.swing.JLabel atributLbl;
    private javax.swing.JLabel attLbl;
    private javax.swing.JButton buatsilumanBtn;
    private javax.swing.JRadioButton bumiRdo;
    private javax.swing.JLabel defLbl;
    private javax.swing.JLabel hpLbl;
    private javax.swing.JTextField inputnamaTxt;
    private javax.swing.JLabel intattLbl;
    private javax.swing.JLabel intdefLbl;
    private javax.swing.JLabel inthpLbl;
    private javax.swing.JLabel intpointLbl;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel judulpembuatansilumanLbl;
    private javax.swing.JButton kembaliBtn;
    private javax.swing.JLabel namaLbl;
    private javax.swing.JButton plusattBtn;
    private javax.swing.JButton plusdefBtn;
    private javax.swing.JButton plushpBtn;
    private javax.swing.JLabel pointsLbl;
    private javax.swing.JButton resetBtn;
    private javax.swing.ButtonGroup tipeGrpBtn;
    private javax.swing.JLabel tipeLbl;
    // End of variables declaration//GEN-END:variables
}
