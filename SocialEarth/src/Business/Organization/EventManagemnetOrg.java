/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EventManagerRole;
import Business.Role.Role;
import java.util.ArrayList;


public class EventManagemnetOrg extends Organization{

    public EventManagemnetOrg() {
        super(Organization.Type.EventManagement.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EventManagerRole());
        return roles;
    }
     
}