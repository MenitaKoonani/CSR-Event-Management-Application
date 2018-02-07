/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Zone;

import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author ragha
 */
public class ZoneDirectory {

    private ArrayList<Zone> zoneList;

    public ZoneDirectory() {
        this.zoneList = new ArrayList<Zone>();
    }

    public ArrayList<Zone> getZoneList() {
        return this.zoneList;
    }

    public Zone createAndAddZone(String name) {
        Zone zone = new Zone();
        zone.setName(name);
        zoneList.add(zone);
        return zone;
    }

}
