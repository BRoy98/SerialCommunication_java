
public class mainForm extends javax.swing.JFrame
{
    Communicator communicator = null;
    String logText;
    public mainForm()
    {
        initComponents();
        btnSend.setEnabled(false);
        txtbSend.setEnabled(false);
        txtbRecive.setEnabled(false);
        btnDisconnect.setEnabled(false);
        autoScroll.setEnabled(false);
        btnClear.setEnabled(false);
        createObjects();
        communicator.refreshPort();
        setCombo();
    }
    
    private void createObjects()
    {
        communicator = new Communicator(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtbSend = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        baudCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbRecive = new javax.swing.JTextArea();
        autoScroll = new javax.swing.JCheckBox();
        btnConnect = new javax.swing.JButton();
        btnDisconnect = new javax.swing.JButton();
        comLabel = new java.awt.Label();
        baudLabel = new java.awt.Label();
        btnRefresh = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtbStat = new java.awt.Label();
        comCombo = new javax.swing.JComboBox();
        txtbSendCount = new javax.swing.JTextField();
        baudLabel1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Serial Communication");
        setMinimumSize(new java.awt.Dimension(758, 476));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        baudCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtbRecive.setEditable(false);
        txtbRecive.setColumns(20);
        txtbRecive.setRows(5);
        jScrollPane1.setViewportView(txtbRecive);

        autoScroll.setText("Auto Scroll");
        autoScroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoScrollActionPerformed(evt);
            }
        });

        btnConnect.setText("Connect");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        btnDisconnect.setText("Disconnect");
        btnDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisconnectActionPerformed(evt);
            }
        });

        comLabel.setText("COM Port");

        baudLabel.setText("x times:");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtbStat.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        comCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        baudLabel1.setText("Baud Rate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(baudCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autoScroll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDisconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtbSend)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(baudLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtbSendCount, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtbStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(baudLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(546, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSend)
                        .addComponent(txtbSendCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(baudLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(comLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRefresh)
                        .addComponent(btnConnect)
                        .addComponent(btnDisconnect)
                        .addComponent(btnClear))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(baudCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(autoScroll)
                        .addComponent(comCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(txtbStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(450, Short.MAX_VALUE)
                    .addComponent(baudLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)))
        );

        baudLabel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        communicator.refreshPort();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        // TODO add your handling code here:
        communicator.connect();
        if(communicator.getConnected() == true)
        {
            if (communicator.initIOStream() == true)
            {
                communicator.initListener();
            }
        }
    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisconnectActionPerformed
        // TODO add your handling code here:
        if(communicator.getConnected() == true)
        {
            communicator.disconnect();
        }
    }//GEN-LAST:event_btnDisconnectActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtbRecive.setText(null);
        logText = "Text cleared.";
        txtbStat.setText(logText);
    }//GEN-LAST:event_btnClearActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        communicator.disconnect();
    }//GEN-LAST:event_formWindowClosing

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        String sData = txtbSend.getText();
        String sCount = txtbSendCount.getText();
        try {
            int count = Integer.valueOf(sCount);
            for(int i = 0; i <= count; i++) {
                communicator.writeData(sData);
            }
        } catch(Exception e) {
            e.printStackTrace();
            communicator.writeData(sData);
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void autoScrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoScrollActionPerformed
        // TODO add your handling code here:
        if(autoScroll.isSelected() == true)
        {
            logText = "Autoscroll enebled.";
            txtbStat.setText(logText);
        }
        else if (autoScroll.isSelected() == false)
        {
            logText = "Autoscroll disabled.";
            txtbStat.setText(logText);
        }
    }//GEN-LAST:event_autoScrollActionPerformed

    
    public void setCombo()
    {
        baudCombo.removeAllItems();
        baudCombo.addItem("300");
        baudCombo.addItem("1200");
        baudCombo.addItem("2400");
        baudCombo.addItem("4800");
        baudCombo.addItem("9600");
        baudCombo.addItem("14400");
        baudCombo.addItem("19200");
        baudCombo.addItem("28800");
        baudCombo.addItem("38400");
        baudCombo.addItem("57600");
        baudCombo.addItem("115200");
        baudCombo.setSelectedItem(null);
        comCombo.setSelectedItem(null);
        //baudCombo.getItemCount();
    }
    
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new mainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox autoScroll;
    public javax.swing.JComboBox baudCombo;
    private java.awt.Label baudLabel;
    private java.awt.Label baudLabel1;
    public javax.swing.JButton btnClear;
    public javax.swing.JButton btnConnect;
    public javax.swing.JButton btnDisconnect;
    public javax.swing.JButton btnRefresh;
    public javax.swing.JButton btnSend;
    public javax.swing.JComboBox comCombo;
    private java.awt.Label comLabel;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea txtbRecive;
    public javax.swing.JTextField txtbSend;
    public javax.swing.JTextField txtbSendCount;
    public java.awt.Label txtbStat;
    // End of variables declaration//GEN-END:variables
}
