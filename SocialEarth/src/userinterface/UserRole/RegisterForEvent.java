/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Event.Event;
import Business.GoogleAPIs.GroupEmail;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.EventManagemnetOrg;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RoleWorkRequest;
import Business.Zone.Zone;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.TransportManagerRole.TransportRoleWorkAreaJPanel;

/**
 *
 * @author ragha
 */
public class RegisterForEvent extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EventManagemnetOrg organization;
    private EcoSystem system;
    private boolean flag = false;

    /**
     * Creates new form EventManager
     */
    public RegisterForEvent(JPanel userProcessContainer, UserAccount account, EventManagemnetOrg organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        populateEventComboBox();
    }

    private void populateEventComboBox() {
        eventNameField.removeAllItems();

        for (Event event : system.getEventDirectory().getEventList()) {
            eventNameField.addItem(event);
        }
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
        jLabel1 = new javax.swing.JLabel();
        registerForEventBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        EventDetailsPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        EventIDTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EventNameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        eventVenueTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EventDateTxt = new javax.swing.JTextField();
        RegStartTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RegEndTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        transportAvail = new javax.swing.JTextField();
        eventNameField = new javax.swing.JComboBox<>();
        backJButton = new javax.swing.JButton();
        requireTransportLabel = new javax.swing.JLabel();
        yesNeedTransport = new javax.swing.JRadioButton();
        noNeedTransport = new javax.swing.JRadioButton();

        jLabel1.setText("Select an Event : ");

        registerForEventBtn.setText("Register for event");
        registerForEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerForEventBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Register For Event");

        EventDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Event Details :");

        EventIDTxt.setEditable(false);

        jLabel4.setText("Event ID");

        jLabel5.setText("Event name");

        EventNameTxt.setEditable(false);

        jLabel6.setText("Venue");

        eventVenueTextField.setEditable(false);

        jLabel7.setText("Event Date");

        EventDateTxt.setEditable(false);

        RegStartTxt.setEditable(false);

        jLabel9.setText("Registration starts on");

        jLabel10.setText("Registration ends by");

        RegEndTxt.setEditable(false);

        jLabel11.setText("Transport Availability");

        transportAvail.setEditable(false);

        javax.swing.GroupLayout EventDetailsPanelLayout = new javax.swing.GroupLayout(EventDetailsPanel);
        EventDetailsPanel.setLayout(EventDetailsPanelLayout);
        EventDetailsPanelLayout.setHorizontalGroup(
            EventDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventDetailsPanelLayout.createSequentialGroup()
                .addGroup(EventDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EventDetailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(transportAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EventDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EventDetailsPanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(EventDetailsPanelLayout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(EventIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(EventDetailsPanelLayout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(EventNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(EventDetailsPanelLayout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(eventVenueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(EventDetailsPanelLayout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(EventDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(EventDetailsPanelLayout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jLabel9)
                            .addGap(80, 80, 80)
                            .addComponent(RegStartTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(EventDetailsPanelLayout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(80, 80, 80)
                            .addComponent(RegEndTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        EventDetailsPanelLayout.setVerticalGroup(
            EventDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventDetailsPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(EventDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EventIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(EventDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EventNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(EventDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventVenueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(EventDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EventDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(EventDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EventDetailsPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RegStartTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(EventDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EventDetailsPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(RegEndTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EventDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EventDetailsPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(transportAvail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        eventNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventNameFieldActionPerformed(evt);
            }
        });

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back3Blue.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        requireTransportLabel.setText("Do you need transportation?");

        buttonGroup1.add(yesNeedTransport);
        yesNeedTransport.setSelected(true);
        yesNeedTransport.setText("Yes! I need a ride!");

        buttonGroup1.add(noNeedTransport);
        noNeedTransport.setText("No Thank you!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(registerForEventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1)
                        .addGap(72, 72, 72)
                        .addComponent(eventNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(EventDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(requireTransportLabel)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yesNeedTransport)
                            .addComponent(noNeedTransport)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backJButton)))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(EventDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(requireTransportLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(yesNeedTransport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(noNeedTransport)))
                .addGap(43, 43, 43)
                .addComponent(registerForEventBtn)
                .addGap(65, 65, 65)
                .addComponent(backJButton)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerForEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerForEventBtnActionPerformed
        Event selectedEvent = (Event) eventNameField.getSelectedItem();
        RoleWorkRequest newRequest = new RoleWorkRequest();
        Random rand = new Random();
        newRequest.setWorkRequestId(rand.nextInt(50) + 1);
        newRequest.setSender(userAccount);
        newRequest.setUserAccount(userAccount);
        newRequest.setMessage(selectedEvent.getEventName());
        newRequest.setEventVenue(selectedEvent.getVenue());
        if (selectedEvent.isTransportAvail() == false) {
            newRequest.setNeedTransport(false);
        }
        newRequest.setNeedTransport(yesNeedTransport.isSelected());

        Organization org = null;
        for (Network eachNetwork : system.getNetworkDirectory().getNetworkList()) {
            for (Zone eachZone : eachNetwork.getZoneDirectory().getZoneList()) {
                for (Enterprise eachEnterprise : eachZone.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization eachOrg : eachEnterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (eachOrg instanceof EventManagemnetOrg) {
                            org = eachOrg;
                            break;
                        }
                    }
                }
            }
        }
        if (org != null) {
            org.getWorkQueue().addNewRequest(newRequest);
            userAccount.getWorkQueue().addNewRequest(newRequest);
        }
        system.addRegisteredEventUser(userAccount, selectedEvent);
        JOptionPane.showMessageDialog(null, "Successfully registered for the event!!");
        GroupEmail.sendMail(selectedEvent, userAccount);
    }//GEN-LAST:event_registerForEventBtnActionPerformed

    private void eventNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventNameFieldActionPerformed
        // populate the event details
        Event event = (Event) eventNameField.getSelectedItem();
        if (event != null) {
            EventIDTxt.setText(String.valueOf(event.getEventId()));
            EventNameTxt.setText(event.getEventName());
            eventVenueTextField.setText(event.getVenue());
            EventDateTxt.setText(event.getEventDate().toString());
            RegStartTxt.setText(event.getRegStartDate().toString());
            RegEndTxt.setText(event.getRegEndDate().toString());
            transportAvail.setText((event.isTransportAvail() == true) ? "Available" : "Not Availble");
            requireTransport(event.isTransportAvail() == true);
        }

    }//GEN-LAST:event_eventNameFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed
    public void requireTransport(boolean isVisible) {
        yesNeedTransport.setVisible(isVisible);
        noNeedTransport.setVisible(isVisible);
        requireTransportLabel.setVisible(isVisible);
    }

    private void yesNeedTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesNeedTransportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesNeedTransportActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EventDateTxt;
    private javax.swing.JPanel EventDetailsPanel;
    private javax.swing.JTextField EventIDTxt;
    private javax.swing.JTextField EventNameTxt;
    private javax.swing.JTextField RegEndTxt;
    private javax.swing.JTextField RegStartTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Object> eventNameField;
    private javax.swing.JTextField eventVenueTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton noNeedTransport;
    private javax.swing.JButton registerForEventBtn;
    private javax.swing.JLabel requireTransportLabel;
    private javax.swing.JTextField transportAvail;
    private javax.swing.JRadioButton yesNeedTransport;
    // End of variables declaration//GEN-END:variables
}