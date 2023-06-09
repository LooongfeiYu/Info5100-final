/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package src;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Shipment;
import model.ShipmentDirectory;

/**
 *
 * @author User
 */
public class TrackingPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrackingPanel
     */
    public TrackingPanel() {
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

        titleLabel = new javax.swing.JLabel();
        trackNumLabel = new javax.swing.JLabel();
        trackNumField = new javax.swing.JTextField();
        trackButton = new javax.swing.JButton();
        shipperAccLabel = new javax.swing.JLabel();
        driverIDLabel = new javax.swing.JLabel();
        driverIDField = new javax.swing.JTextField();
        destinationLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        statusTable = new javax.swing.JTable();
        shipperNameField = new javax.swing.JTextField();
        destinationField = new javax.swing.JTextField();
        recipientsNameField = new javax.swing.JTextField();
        recipientsNameLabel = new javax.swing.JLabel();

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setText("Tracking");

        trackNumLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        trackNumLabel.setText("Tracking Number:");

        trackButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        trackButton.setText("Track");
        trackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackButtonActionPerformed(evt);
            }
        });

        shipperAccLabel.setText("Shipper Name");

        driverIDLabel.setText("DriverID");

        destinationLabel.setText("Destination");

        statusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Location", "Arrival data", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(statusTable);

        recipientsNameLabel.setText("Recipients Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(trackNumLabel)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(shipperAccLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(recipientsNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(trackNumField)
                            .addComponent(shipperNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(recipientsNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addComponent(trackButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(destinationLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(destinationField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(driverIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(driverIDLabel)))
                            .addGap(177, 177, 177))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titleLabel)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trackNumLabel)
                    .addComponent(trackNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trackButton))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(shipperNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shipperAccLabel))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(recipientsNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recipientsNameLabel))
                .addGap(28, 28, 28)
                .addComponent(driverIDLabel)
                .addGap(18, 18, 18)
                .addComponent(driverIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinationLabel)
                    .addComponent(destinationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void trackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackButtonActionPerformed
        // TODO add your handling code here:
        for (Shipment s: ShipmentDirectory.getInstance().getShipment()){
            DefaultTableModel model = (DefaultTableModel) statusTable.getModel();
            model.setRowCount(0);
            String[] arrival = {"",""};
            if (trackNumField.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Please tracking number cannot be empty!");
            } else if (s.getTrackingNum() == Integer.parseInt(trackNumField.getText())){
                int size = s.getArrivals().size();
                for (int i = 0; i < size; i++ ){
                    Object[] row = new Object[3];
                    row[0]=arrival[0];
                    row[1]=arrival[1];
                    row[2]=s.getStatus();
                }
                
                
                shipperNameField.setText(s.getShipper());
                recipientsNameField.setText(s.getRecipients());
                driverIDField.setText(s.getDriverID()+"");
                destinationField.setText(s.getDesAddress());
            } else {
                JOptionPane.showMessageDialog(this, "Tracking number not found");
            }
        }
    }//GEN-LAST:event_trackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField destinationField;
    private javax.swing.JLabel destinationLabel;
    private javax.swing.JTextField driverIDField;
    private javax.swing.JLabel driverIDLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField recipientsNameField;
    private javax.swing.JLabel recipientsNameLabel;
    private javax.swing.JLabel shipperAccLabel;
    private javax.swing.JTextField shipperNameField;
    private javax.swing.JTable statusTable;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton trackButton;
    private javax.swing.JTextField trackNumField;
    private javax.swing.JLabel trackNumLabel;
    // End of variables declaration//GEN-END:variables
}
