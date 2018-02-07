/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EventManagemnetOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.EventManagerRole.ManageWorkRequestPanel;
import userinterface.UserRole.RegisterForEvent;
import userinterface.UserRole.UserWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class UserRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new UserWorkAreaJPanel(userProcessContainer, account, (EventManagemnetOrg) organization, enterprise, business);
    }

}
