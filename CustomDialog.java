// Author   : Christian Dunn
// Date     : December 8th, 2016
// Purpose  : To create a GUI for the dialog box that is triggered
//            when a user selects to enter a text object to the 
//            paint program canvas.
// Compiler : NetBeans IDE 8.1

import java.awt.Font;

public class CustomDialog extends javax.swing.JDialog {

    public Font   font;
    public String text, fontStr;
    public int    size;
    
    public CustomDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        font    = null;
        text    = "No text Entered";
        fontStr = "Arial";
        size    = 12;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Options_Panel = new javax.swing.JPanel();
        SetDefaults_Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SetText_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Select_Panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Set Text");
        setMaximumSize(new java.awt.Dimension(300, 200));
        setMinimumSize(new java.awt.Dimension(300, 200));
        setResizable(false);

        Options_Panel.setPreferredSize(new java.awt.Dimension(300, 165));
        Options_Panel.setLayout(new java.awt.BorderLayout());

        SetDefaults_Panel.setMaximumSize(new java.awt.Dimension(300, 83));
        SetDefaults_Panel.setMinimumSize(new java.awt.Dimension(300, 83));
        SetDefaults_Panel.setPreferredSize(new java.awt.Dimension(300, 83));

        jLabel2.setText("Font :");

        jTextField1.setPreferredSize(new java.awt.Dimension(257, 20));

        jLabel3.setText("Size :");

        jTextField2.setMaximumSize(new java.awt.Dimension(257, 20));
        jTextField2.setMinimumSize(new java.awt.Dimension(257, 20));
        jTextField2.setPreferredSize(new java.awt.Dimension(257, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel4.setText("Valid fonts: Arial, Calibri, Verdana");

        javax.swing.GroupLayout SetDefaults_PanelLayout = new javax.swing.GroupLayout(SetDefaults_Panel);
        SetDefaults_Panel.setLayout(SetDefaults_PanelLayout);
        SetDefaults_PanelLayout.setHorizontalGroup(
            SetDefaults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetDefaults_PanelLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(SetDefaults_PanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SetDefaults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SetDefaults_PanelLayout.setVerticalGroup(
            SetDefaults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetDefaults_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SetDefaults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SetDefaults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Options_Panel.add(SetDefaults_Panel, java.awt.BorderLayout.PAGE_START);

        SetText_Panel.setMaximumSize(new java.awt.Dimension(300, 82));
        SetText_Panel.setMinimumSize(new java.awt.Dimension(300, 82));
        SetText_Panel.setPreferredSize(new java.awt.Dimension(300, 82));

        jLabel1.setText("Text :");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setMaximumSize(new java.awt.Dimension(275, 70));
        jTextArea1.setMinimumSize(new java.awt.Dimension(275, 70));
        jTextArea1.setPreferredSize(new java.awt.Dimension(275, 70));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout SetText_PanelLayout = new javax.swing.GroupLayout(SetText_Panel);
        SetText_Panel.setLayout(SetText_PanelLayout);
        SetText_PanelLayout.setHorizontalGroup(
            SetText_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetText_PanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );
        SetText_PanelLayout.setVerticalGroup(
            SetText_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetText_PanelLayout.createSequentialGroup()
                .addGroup(SetText_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        Options_Panel.add(SetText_Panel, java.awt.BorderLayout.CENTER);

        getContentPane().add(Options_Panel, java.awt.BorderLayout.PAGE_START);

        Select_Panel.setMaximumSize(new java.awt.Dimension(300, 45));
        Select_Panel.setMinimumSize(new java.awt.Dimension(300, 45));
        Select_Panel.setPreferredSize(new java.awt.Dimension(300, 45));

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Select_Panel.add(jButton1);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Select_Panel.add(jButton2);

        getContentPane().add(Select_Panel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        text = jTextArea1.getText();
        fontStr = jTextField1.getText();
        String check = fontStr.toUpperCase();
        if ((check != "ARIAL") || (check != "VERDANA") || (check != "CALIBRI"))
            fontStr = "Arial";
        size = Integer.parseInt(jTextField2.getText());
        font = new Font(fontStr, Font.PLAIN, size);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomDialog dialog = new CustomDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Options_Panel;
    private javax.swing.JPanel Select_Panel;
    private javax.swing.JPanel SetDefaults_Panel;
    private javax.swing.JPanel SetText_Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
