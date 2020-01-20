/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Airliner.AirlinerDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Airliner.Airliner;
import javax.swing.JOptionPane;

/**
 *
 * @author manja
 */
public class manageAirlinerPanel extends javax.swing.JPanel {
private JPanel containerPanel;
private AirlinerDirectory airlineDirectory;
    /**
     * Creates new form manageAirlinerPanel
     */
     public manageAirlinerPanel(JPanel containerPanel, AirlinerDirectory airlineDirectory) {
        initComponents();
        this.containerPanel = containerPanel;
        this.airlineDirectory = airlineDirectory;
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblairliner = new javax.swing.JTable();
        btnaddAirliner = new javax.swing.JButton();
        btnDeleteAirliner = new javax.swing.JButton();
        btnUpdateAirliner = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Airliner");

        tblairliner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner", "Number of Airplanes registered"
            }
        ));
        jScrollPane2.setViewportView(tblairliner);

        btnaddAirliner.setText("Add New Airliner");
        btnaddAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddAirlinerActionPerformed(evt);
            }
        });

        btnDeleteAirliner.setText("Delete Airliner");
        btnDeleteAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAirlinerActionPerformed(evt);
            }
        });

        btnUpdateAirliner.setText("Update Airliner");
        btnUpdateAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAirlinerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUpdateAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnaddAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(285, 285, 285)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(136, 136, 136)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(256, 256, 256))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaddAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(519, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddAirlinerActionPerformed
        // TODO add your handling code here:
        newAirlinerPanel newap = new newAirlinerPanel(containerPanel,airlineDirectory);
        containerPanel.add("newAirlinerPanel", newap);
        CardLayout layout = (CardLayout)containerPanel.getLayout();
        layout.next(containerPanel);
    }//GEN-LAST:event_btnaddAirlinerActionPerformed

    private void btnDeleteAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAirlinerActionPerformed
        int selectedRow = tblairliner.getSelectedRow();
        if(selectedRow >= 0)
        {
            Airliner airlinertodel = (Airliner)tblairliner.getValueAt(selectedRow, 0);
            airlineDirectory.deleteAirliner(airlinertodel);
            JOptionPane.showMessageDialog(null, "Airliner deleted successfully");
            populateTable();
        }
        else
            JOptionPane.showMessageDialog(null, "Please select the airliner to be deleted");
    }//GEN-LAST:event_btnDeleteAirlinerActionPerformed

    private void btnUpdateAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAirlinerActionPerformed
        int selectedRow = this.tblairliner.getSelectedRow();
        if(selectedRow>=0){
            UpdateAirlinerPanel uap = new UpdateAirlinerPanel(this.containerPanel,(Airliner) this.tblairliner.getValueAt(selectedRow, 0));
            this.containerPanel.add("UpdateAirlinerPanel", uap);
            CardLayout layout = (CardLayout) this.containerPanel.getLayout();
            layout.next(this.containerPanel);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select the airliner to be updated.");
        }
    }//GEN-LAST:event_btnUpdateAirlinerActionPerformed
                                           
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)tblairliner.getModel();
        dtm.setRowCount(0);
        
        
        for(Airliner ar : airlineDirectory.getLstAirliner())
        {
            //System.out.println(ar.getFleet().getLstAirplane().size());
            Object[] row = new Object[2];
            
            row[0]=ar;
            row[1]=ar.getFleet().getLstAirplane().size();
            dtm.addRow(row);
        }
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteAirliner;
    private javax.swing.JButton btnUpdateAirliner;
    private javax.swing.JButton btnaddAirliner;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblairliner;
    // End of variables declaration//GEN-END:variables

    
}
                         

    
