/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TransportRole;
import java.util.ArrayList;

/**
 *
 * @author raghavi
 */
public class TransportOrganization extends Organization{

    public TransportOrganization() {
        super(Organization.Type.TransportManagement.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TransportRole ());
        return roles;
    }
     
}