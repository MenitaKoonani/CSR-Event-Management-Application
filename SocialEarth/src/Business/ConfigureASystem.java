package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Zone.Zone;

/**
 *
 * @author ragha
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
//        createEmployee(String name, Zone zone, String city, String address) {
        Network newNetwork = system.getNetworkDirectory().createAndAddNetwork("United States of America");
        Zone newZone = newNetwork.getZoneDirectory().createAndAddZone("Boston");
//        Enterprise newEnterprise = newZone.getEnterpriseDirectory().createAndAddEnterprise("Child Care", Enterprise.EnterpriseType.ChildWelfare);
//        newEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Admin);
        Employee employee1 = system.getEmployeeDirectory().createEmployee("Raghavi", newZone, "Unknown", "Unknown");
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("Raghavi", "raghavi", employee1, new SystemAdminRole());

        Employee employee2 = system.getEmployeeDirectory().createEmployee("Menita", newZone, "Unknown", "Unknown");
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("Menita", "menita", employee2, new SystemAdminRole());

        Employee employee3 = system.getEmployeeDirectory().createEmployee("Divya", newZone, "Unknown", "Unknown");
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("Divya", "divya", employee3, new SystemAdminRole());

        return system;
    }

}
