/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ics4ufinalproject;

/**
 *
 * @author evan-
 */
public class Help extends javax.swing.JFrame {

    /**
     * Creates new form Help
     */
    public Help() {
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
        okBtn = new javax.swing.JButton();
        howLbl = new javax.swing.JLabel();
        rightInfo = new javax.swing.JLabel();
        leftInfo = new javax.swing.JLabel();
        rightInfo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        okBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        okBtn.setText("Ok");

        howLbl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        howLbl.setText("How to play");

        rightInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rightInfo.setText("2. Right Arrow key or D = Move right");

        leftInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        leftInfo.setText("1. Left Arrow key  or A = Move Left");

        rightInfo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rightInfo1.setText("3. Up Arrow key or W = Throw cow");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rightInfo)
                    .addComponent(rightInfo1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(howLbl)
                        .addComponent(leftInfo)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addComponent(okBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(howLbl)
                .addGap(59, 59, 59)
                .addComponent(leftInfo)
                .addGap(18, 18, 18)
                .addComponent(rightInfo)
                .addGap(18, 18, 18)
                .addComponent(rightInfo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(okBtn))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel howLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel leftInfo;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel rightInfo;
    private javax.swing.JLabel rightInfo1;
    // End of variables declaration//GEN-END:variables
}
