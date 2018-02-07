/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Zone.ZoneDirectory;
import java.util.ArrayList;

public class Network {

    private String name;
    private ZoneDirectory zoneDirectory;

    public Network() {
        zoneDirectory = new ZoneDirectory();
    }

    public ZoneDirectory getZoneDirectory() {
        return zoneDirectory;
    }

    public void setZoneDirectory(ZoneDirectory zoneDirectory) {
        this.zoneDirectory = zoneDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
