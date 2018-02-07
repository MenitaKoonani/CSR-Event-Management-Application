/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package userinterface.AdministrativeRole;

import Business.ChatAPI.GoogleTalkChatLogin;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import UserInterface.AdministrativeRole.ManageEmployeeJPanel;
import UserInterface.AdministrativeRole.ManageOrganizationJPanel;
import UserInterface.AdministrativeRole.ManageUserAccountJPanel;
import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    EcoSystem system;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.system = system;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        chatBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("My Work Area -Aminstrative Role");
        add(jLabel1);
        jLabel1.setBounds(202, 16, 396, 29);

        userJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        userJButton.setText("Manage User");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton);
        userJButton.setBounds(272, 237, 250, 49);

        manageEmployeeJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton);
        manageEmployeeJButton.setBounds(272, 182, 250, 39);

        manageOrganizationJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton);
        manageOrganizationJButton.setBounds(272, 111, 250, 50);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(58, 63, 120, 30);

        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(208, 73, 130, 20);

        chatBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        chatBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chaticon.png"))); // NOI18N
        chatBtn.setText("Answer Queries");
        chatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatBtnActionPerformed(evt);
            }
        });
        add(chatBtn);
        chatBtn.setBounds(272, 295, 250, 55);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sysadminPageIcon.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(1, 0, 860, 660);
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void chatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatBtnActionPerformed
        // TODO add your handling code here:
        GoogleTalkChatLogin googleTalkChatLogin = new GoogleTalkChatLogin(true);
    }//GEN-LAST:event_chatBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chatBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}