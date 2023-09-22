/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Doctor;
import model.Insurance;
import model.Patient;

/**
 *
 * @author hotra
 */
public class insuranceCoverageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PaientJPanel
     */
    Patient patient = new Patient();
    Insurance insurance = new Insurance();
    public insuranceCoverageJPanel(Patient patient, Insurance insurance) {
        initComponents();
        this.patient = patient;
        this.insurance = insurance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitle2 = new javax.swing.JLabel();
        lblInsuranceDeductable = new javax.swing.JLabel();
        lblInsuredBy = new javax.swing.JLabel();
        lblInsuranceID = new javax.swing.JLabel();
        lblAddlBenefits = new javax.swing.JLabel();
        lblInsurancePremiumYearly = new javax.swing.JLabel();
        txtInsuranceDeductable = new javax.swing.JTextField();
        txtInsuredBy = new javax.swing.JTextField();
        txtInsuarnceIdentificationNumber = new javax.swing.JTextField();
        txtInsuranceYearlyPremium = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        lblTitle2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("Insurance Coverage");
        lblTitle2.setToolTipText("");

        lblInsuranceDeductable.setText("Deductable:");

        lblInsuredBy.setText("Insured By:");

        lblInsuranceID.setText("Identification Number:");

        lblAddlBenefits.setText("Additional Benifits:");

        lblInsurancePremiumYearly.setText("Premium Yearly:");

        txtInsuranceDeductable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsuranceDeductableActionPerformed(evt);
            }
        });

        txtInsuredBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsuredByActionPerformed(evt);
            }
        });

        txtInsuarnceIdentificationNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsuarnceIdentificationNumberActionPerformed(evt);
            }
        });

        txtInsuranceYearlyPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsuranceYearlyPremiumActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(lblTitle2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInsuranceID)
                            .addComponent(lblInsurancePremiumYearly)
                            .addComponent(lblInsuredBy)
                            .addComponent(lblInsuranceDeductable)
                            .addComponent(lblAddlBenefits))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtInsuarnceIdentificationNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInsuredBy, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInsuranceYearlyPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtInsuranceDeductable, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(btnSave)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(lblTitle2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInsuredBy)
                    .addComponent(txtInsuredBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInsuranceID)
                    .addComponent(txtInsuarnceIdentificationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInsurancePremiumYearly)
                    .addComponent(txtInsuranceYearlyPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInsuranceDeductable)
                    .addComponent(txtInsuranceDeductable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddlBenefits)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtInsuranceDeductableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsuranceDeductableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInsuranceDeductableActionPerformed

    private void txtInsuredByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsuredByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInsuredByActionPerformed

    private void txtInsuarnceIdentificationNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsuarnceIdentificationNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInsuarnceIdentificationNumberActionPerformed

    private void txtInsuranceYearlyPremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsuranceYearlyPremiumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInsuranceYearlyPremiumActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        
        // Insurance Coverage Info
        insurance.setDeductable(txtInsuranceDeductable.getText());
        insurance.setIdentificationNumber(txtInsuarnceIdentificationNumber.getText());
        insurance.setInsuredBy(txtInsuredBy.getText());
        insurance.setPremiumYearly(txtInsuranceYearlyPremium.getText());
        insurance.setAddlBenefits(jTextArea1.getText());
        patient.setInsurance(insurance);
                
        JOptionPane.showMessageDialog(this, "Insurance Coverage details are saved");
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAddlBenefits;
    private javax.swing.JLabel lblInsuranceDeductable;
    private javax.swing.JLabel lblInsuranceID;
    private javax.swing.JLabel lblInsurancePremiumYearly;
    private javax.swing.JLabel lblInsuredBy;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JTextField txtInsuarnceIdentificationNumber;
    private javax.swing.JTextField txtInsuranceDeductable;
    private javax.swing.JTextField txtInsuranceYearlyPremium;
    private javax.swing.JTextField txtInsuredBy;
    // End of variables declaration//GEN-END:variables
}
