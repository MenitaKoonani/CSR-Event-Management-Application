/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;


public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.EventManagement.getValue())){
            organization = new EventManagemnetOrg();
            organizationList.add(organization);
        }
         if (type.getValue().equals(Type.TransportManagement.getValue())){
            organization = new TransportOrganization();
            organizationList.add(organization);
        }
           if (type.getValue().equals(Type.FinanceManagement.getValue())){
            organization = new FinanceOrganization();
            organizationList.add(organization);
        }
       
        return organization;
    }
}