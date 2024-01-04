/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.doctor;

import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.organizationpkg.Organization;
import business.userAccountpkg.UserAccount;
import business.workQueuepkg.SendDataToDoctorWorkRequest;
import business.workQueuepkg.SendDataToPatientRequest;
import business.workQueuepkg.WorkRequest;
import java.awt.CardLayout;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrivatsanaragund
 */
public class DoctorTreatmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorTreatmentJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private Organization organization;

    public DoctorTreatmentJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.ecoSystem = ecoSystem;
        display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnPrescribeMedic = new javax.swing.JButton();
        btnLabTest = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        txtPayment = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAppointments = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Patient Appointments History");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 31, -1, 41));

        btnBack.setBackground(new java.awt.Color(102, 102, 255));
        btnBack.setText("<Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 685, 66, -1));

        btnPrescribeMedic.setBackground(new java.awt.Color(102, 102, 255));
        btnPrescribeMedic.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnPrescribeMedic.setText("Prescribe Medicines");
        btnPrescribeMedic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrescribeMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrescribeMedicActionPerformed(evt);
            }
        });
        add(btnPrescribeMedic, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 347, 242, 56));

        btnLabTest.setBackground(new java.awt.Color(102, 102, 255));
        btnLabTest.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnLabTest.setText("Send to Lab Test");
        btnLabTest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLabTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabTestActionPerformed(evt);
            }
        });
        add(btnLabTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 421, 242, 57));

        btnPayment.setBackground(new java.awt.Color(102, 102, 255));
        btnPayment.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnPayment.setText("Request Payment");
        btnPayment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });
        add(btnPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 550, 182, 65));
        add(txtPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 565, 128, 39));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Amount to be paid:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 568, -1, 28));

        tblAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Gender", "Day", "Time Slot", "Symptons", "Allergies"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAppointments);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 102, 761, 227));

        txtComments.setColumns(20);
        txtComments.setRows(5);
        jScrollPane2.setViewportView(txtComments);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 347, 513, 131));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLabTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLabTestActionPerformed

    private void btnPrescribeMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrescribeMedicActionPerformed
        // TODO add your handling code here:
        Date currentDate = new Date();
        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof SendDataToDoctorWorkRequest) {
                SendDataToDoctorWorkRequest sendDataRequest = (SendDataToDoctorWorkRequest) workRequest;
                String msg = txtComments.getText();
                sendDataRequest.setResolveDate(currentDate);
                sendDataRequest.setReqResult(msg);

            }
        }
        JOptionPane.showMessageDialog(null, "Data Sent", "success", JOptionPane.PLAIN_MESSAGE);

        DoctorPrescribeMedicinesJPanel panel = new DoctorPrescribeMedicinesJPanel(userProcessContainer, userAccount, organization, enterprise, ecoSystem);
        userProcessContainer.add("DoctorPrescribeMedicinesJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPrescribeMedicActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaymentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLabTest;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnPrescribeMedic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAppointments;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JTextField txtPayment;
    // End of variables declaration//GEN-END:variables

    private void display() {
        DefaultTableModel model = (DefaultTableModel) tblAppointments.getModel();
        model.setRowCount(0);

        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof SendDataToDoctorWorkRequest) {
                SendDataToDoctorWorkRequest sendDataRequest = (SendDataToDoctorWorkRequest) workRequest;

                Object[] row = new Object[10];
                //rowData[0] = workRequest.getMessage();
                row[0] = sendDataRequest.getPatientName();
                row[1] = sendDataRequest.getPage();
                row[2] = sendDataRequest.getPgender();
                row[3] = sendDataRequest.getDay();
                row[4] = sendDataRequest.getTimeslot();
                row[5] = ((SendDataToDoctorWorkRequest) workRequest).getMedication();
                row[6] = ((SendDataToDoctorWorkRequest) workRequest).getAllergies();

                model.addRow(row);
            }

        }
    }
}
