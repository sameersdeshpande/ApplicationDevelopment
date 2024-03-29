/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.helpSeeker;

import business.common.NeedHelp;
import business.organizationpkg.DepartmentsOrganization;
import business.personpkg.Volunteer;
import business.userAccountpkg.UserAccount;
import business.workQueuepkg.NeedHelpWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tejageetla
 */
public class SubmitHelpRequestJPanel extends javax.swing.JPanel {

    
     private NeedHelp needHelp;
     private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Volunteer volunteer;
    private DepartmentsOrganization organization;
    
    /**
     * Creates new form SubmitHelpRequestJPanel
     */
    public SubmitHelpRequestJPanel(JPanel userProcessContainer, UserAccount userAccount,Volunteer volunteer, NeedHelp needHelp, DepartmentsOrganization organization) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.volunteer = volunteer;
        this.organization = organization;
        this.needHelp = needHelp;
       
         populateVolunteerDetails();
         populateNeedHelpReqTable();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(153,197,85);
        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
     public void populateVolunteerDetails()
    {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                
        firstNameField.setText(volunteer.getFirstName());
        lastNameField.setText(volunteer.getLastName());
        dobField.setText(dateFormat.format(volunteer.getDob()));
        genderField.setText(volunteer.getGender());
    }
     
     public void populateNeedHelpReqTable()
     {
         helpNameTxtField.setText(needHelp.getHelp());
         serviceTypeTxtField.setText(needHelp.getServiceType());
        
     }
     
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageEnt3 = new javax.swing.JLabel();
        submitRequest = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        viewYourProfile = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        dobField = new javax.swing.JFormattedTextField();
        gender = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        LastName1 = new javax.swing.JLabel();
        commentsTextField = new javax.swing.JTextField();
        serviceTypeTxtField = new javax.swing.JTextField();
        viewYourProfile1 = new javax.swing.JLabel();
        firstName1 = new javax.swing.JLabel();
        gender1 = new javax.swing.JLabel();
        helpNameTxtField = new javax.swing.JTextField();
        submitHelpRequest = new javax.swing.JButton();
        cancelHelpRequest = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        manageEnt3.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt3.setText("Request Volunteer For Help:");

        submitRequest.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        submitRequest.setText("Submit Request toVolunteer For Help:");

        LastName.setText("Last Name:");

        genderField.setEnabled(false);

        dateOfBirth.setText("Date Of Birth ");

        lastNameField.setEditable(false);
        lastNameField.setEnabled(false);

        viewYourProfile.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile.setText("Volunteer Details:");

        firstName.setText("First Name:");

        dobField.setEnabled(false);

        gender.setText("Gender:");

        firstNameField.setEditable(false);
        firstNameField.setEnabled(false);

        LastName1.setText("Help Type:");

        serviceTypeTxtField.setEditable(false);
        serviceTypeTxtField.setEnabled(false);

        viewYourProfile1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile1.setText("Help Request Details:");

        firstName1.setText("Need Help:");

        gender1.setText("Comments:");

        helpNameTxtField.setEditable(false);
        helpNameTxtField.setEnabled(false);

        submitHelpRequest.setText("Submit");
        submitHelpRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitHelpRequestActionPerformed(evt);
            }
        });

        cancelHelpRequest.setText("Cancel");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(submitRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewYourProfile)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(dateOfBirth)
                                                .addComponent(LastName))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(gender)
                                            .addGap(12, 12, 12)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(genderField)
                                    .addComponent(lastNameField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dobField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(firstNameField))))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewYourProfile1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(LastName1)
                                            .addGap(51, 51, 51))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(gender1)
                                            .addGap(12, 12, 12)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(firstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(helpNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(commentsTextField)
                                        .addComponent(serviceTypeTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(submitHelpRequest)
                        .addGap(18, 18, 18)
                        .addComponent(cancelHelpRequest)))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(submitRequest)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewYourProfile)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstName)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LastName)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateOfBirth)
                            .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewYourProfile1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstName1)
                            .addComponent(helpNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LastName1)
                            .addComponent(serviceTypeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(commentsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender1))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitHelpRequest)
                    .addComponent(cancelHelpRequest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitHelpRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitHelpRequestActionPerformed
         if(commentsTextField.getText().trim().isEmpty())
        {
         JOptionPane.showMessageDialog(null, "Please Enter comments.", "warning",JOptionPane.WARNING_MESSAGE);
         return;
        }
        try
        {
            
        String message = commentsTextField.getText();
        
        NeedHelpWorkRequest needHelpWorkRequest = new NeedHelpWorkRequest();
        needHelpWorkRequest.setMessage("Need Help");
        needHelpWorkRequest.setSender(userAccount);
        needHelpWorkRequest.setStatus("Sent");
        needHelpWorkRequest.setNeedHelp(needHelp);
        needHelpWorkRequest.setComments(message);
        needHelpWorkRequest.setRequestDate(new Date());
        
        UserAccount volunteerAccount = null;
        if (organization!=null){
            for(UserAccount ua: organization.getUserAccountDirectory().getUserAccountList())
            {
                 if(ua.getPerson().getPersonId().equals(volunteer.getPersonId()))
                 {
                 volunteerAccount=ua;    
                 }
                
            }
            volunteerAccount.getWorkQueue().getWorkRequestList().add(needHelpWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(needHelpWorkRequest);
        }
         JOptionPane.showMessageDialog(null, "Request has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
         commentsTextField.setText("");
           
        }
         catch(NullPointerException e)
        {
         JOptionPane.showMessageDialog(null, "Unable to send request, Please try again !!", "warning", JOptionPane.WARNING_MESSAGE);
         return;
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, "Unable to send request, Please try again !!", "warning", JOptionPane.WARNING_MESSAGE);
         return;
        }
    }//GEN-LAST:event_submitHelpRequestActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RequestVolunteerForHelp requestVolunteerForHelp = (RequestVolunteerForHelp) component;
        requestVolunteerForHelp.populateHelpHistoryTable();
        requestVolunteerForHelp.populateNeedHelpListTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel LastName1;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton cancelHelpRequest;
    private javax.swing.JTextField commentsTextField;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JFormattedTextField dobField;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel firstName1;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel gender1;
    private javax.swing.JTextField genderField;
    private javax.swing.JTextField helpNameTxtField;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel manageEnt3;
    private javax.swing.JTextField serviceTypeTxtField;
    private javax.swing.JButton submitHelpRequest;
    private javax.swing.JLabel submitRequest;
    private javax.swing.JLabel viewYourProfile;
    private javax.swing.JLabel viewYourProfile1;
    // End of variables declaration//GEN-END:variables
}
