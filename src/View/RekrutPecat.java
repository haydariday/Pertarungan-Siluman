/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author Deking
 */
public class RekrutPecat extends javax.swing.JFrame {

    /**
     * Creates new form RekrutPecat
     */
    public RekrutPecat() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePelatih = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMonster = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        rekrutBtn = new javax.swing.JButton();
        pecatBtn = new javax.swing.JButton();
        kembaliBtn = new javax.swing.JButton();
        perbaharuiBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.black);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        jPanel1.setBackground(java.awt.Color.black);
        jPanel1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 5, true));
        jPanel1.setForeground(java.awt.Color.white);

        jLabel1.setBackground(java.awt.Color.black);
        jLabel1.setFont(new java.awt.Font("Square721 BT", 1, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Rekrut & Pecat Siluman");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(199, 199, 199))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.Color.black);
        jPanel2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 5, true));
        jPanel2.setForeground(java.awt.Color.white);

        jLabel2.setBackground(java.awt.Color.black);
        jLabel2.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Pelatih");

        tablePelatih.setBackground(java.awt.Color.black);
        tablePelatih.setFont(new java.awt.Font("Square721 BT", 0, 18)); // NOI18N
        tablePelatih.setForeground(java.awt.Color.white);
        tablePelatih.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Ras", "Level", "Siluman_Botol"
            }
        ));
        jScrollPane2.setViewportView(tablePelatih);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(java.awt.Color.black);
        jPanel4.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 5, true));

        jLabel3.setBackground(java.awt.Color.black);
        jLabel3.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Monster");

        tableMonster.setBackground(java.awt.Color.black);
        tableMonster.setFont(new java.awt.Font("Square721 BT", 0, 18)); // NOI18N
        tableMonster.setForeground(java.awt.Color.white);
        tableMonster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Tipe", "Level", "HP", "ATT", "DEF"
            }
        ));
        jScrollPane1.setViewportView(tableMonster);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(java.awt.Color.black);
        jPanel5.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 5, true));
        jPanel5.setForeground(java.awt.Color.white);

        rekrutBtn.setBackground(java.awt.Color.black);
        rekrutBtn.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        rekrutBtn.setForeground(java.awt.Color.white);
        rekrutBtn.setText("Rekrut");

        pecatBtn.setBackground(java.awt.Color.black);
        pecatBtn.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        pecatBtn.setForeground(java.awt.Color.white);
        pecatBtn.setText("Pecat");

        kembaliBtn.setBackground(java.awt.Color.black);
        kembaliBtn.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        kembaliBtn.setForeground(java.awt.Color.white);
        kembaliBtn.setText("Kembali");

        perbaharuiBtn.setBackground(java.awt.Color.black);
        perbaharuiBtn.setFont(new java.awt.Font("Square721 BT", 0, 24)); // NOI18N
        perbaharuiBtn.setForeground(java.awt.Color.white);
        perbaharuiBtn.setText("Perbaharui");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(rekrutBtn)
                            .addComponent(pecatBtn)
                            .addComponent(kembaliBtn)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(perbaharuiBtn)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(perbaharuiBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rekrutBtn)
                .addGap(11, 11, 11)
                .addComponent(pecatBtn)
                .addGap(11, 11, 11)
                .addComponent(kembaliBtn)
                .addContainerGap(353, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getKembaliBtn() {
        return kembaliBtn;
    }

    public void setKembaliBtn(JButton kembaliBtn) {
        this.kembaliBtn = kembaliBtn;
    }

    public JButton getPecatBtn() {
        return pecatBtn;
    }

    public void setPecatBtn(JButton pecatBtn) {
        this.pecatBtn = pecatBtn;
    }

    public JButton getRekrutBtn() {
        return rekrutBtn;
    }

    public void setRekrutBtn(JButton rekrutBtn) {
        this.rekrutBtn = rekrutBtn;
    }

    public JTable getTableMonster() {
        return tableMonster;
    }

    public void setTableMonster(JTable tableMonster) {
        this.tableMonster = tableMonster;
    }

    public JTable getTablePelatih() {
        return tablePelatih;
    }

    public void setTablePelatih(JTable tablePelatih) {
        this.tablePelatih = tablePelatih;
    }

    public JButton getPerbaharuiBtn() {
        return perbaharuiBtn;
    }

    public void setPerbaharuiBtn(JButton perbaharuiBtn) {
        this.perbaharuiBtn = perbaharuiBtn;
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kembaliBtn;
    private javax.swing.JButton pecatBtn;
    private javax.swing.JButton perbaharuiBtn;
    private javax.swing.JButton rekrutBtn;
    private javax.swing.JTable tableMonster;
    private javax.swing.JTable tablePelatih;
    // End of variables declaration//GEN-END:variables
}