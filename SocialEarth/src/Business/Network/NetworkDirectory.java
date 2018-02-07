/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ChildWelfareEnterprise;
import java.util.ArrayList;

/**
 *
 * @author ragha
 */
public class NetworkDirectory {

    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        networkList = new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public Network createAndAddNetwork(String name) {
        Network network = new Network();
        network.setName(name);
        networkList.add(network);
        return network;
    }
}
