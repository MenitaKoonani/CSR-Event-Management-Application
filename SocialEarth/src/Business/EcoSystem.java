package Business;

import Business.Event.Event;
import Business.Event.EventDirectory;
import Business.Network.NetworkDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author ragha
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private NetworkDirectory networkDirectory;
    private EventDirectory eventDirectory;
    public HashMap<UserAccount, ArrayList<Event>> registeredUsers;
    public static int counter = 4000;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        this.networkDirectory = new NetworkDirectory();
        this.eventDirectory = new EventDirectory();
        this.registeredUsers = new HashMap<UserAccount, ArrayList<Event>>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public void setNetworkDirectory(NetworkDirectory networkDirectory) {
        this.networkDirectory = networkDirectory;
    }

    public EventDirectory getEventDirectory() {
        return eventDirectory;
    }

    public void setEventDirectory(EventDirectory eventDirectory) {
        this.eventDirectory = eventDirectory;
    }

    public HashMap<UserAccount, ArrayList<Event>> getRegisteredUsers() {
        return registeredUsers;
    }

    public void addRegisteredEventUser(UserAccount account, Event event) {
        ArrayList<Event> eventList = new ArrayList<>();
        if (registeredUsers != null) {
            Set<UserAccount> userAccountList = registeredUsers.keySet();
            if (!userAccountList.isEmpty()) {
                if (userAccountList.contains(account)) {
                    if (!registeredUsers.get(account).contains(event)) {
                        registeredUsers.get(account).add(event);
                    }
                } else {
                    eventList.add(event);
                    registeredUsers.put(account, eventList);
                }
            } else {
                eventList.add(event);
                registeredUsers.put(account, eventList);
            }
        } else {
            eventList.add(event);
            registeredUsers.put(account, eventList);
        }
    }

    public boolean checkIfUsernameIsUnique(String username) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }
}
