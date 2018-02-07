package Business.ChatAPI;

import java.util.Collection;

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Presence;

public class ChatClient {

    static Collection<RosterEntry> entries;

    public static void login(String userName, String password) throws XMPPException {

        ConnectionConfiguration config = new ConnectionConfiguration("talk.google.com", 5222, "gmail.com");
        GoogleTalkChatLogin.connection = new XMPPConnection(config);

        GoogleTalkChatLogin.connection.connect();
        GoogleTalkChatLogin.connection.login(userName, password);
    }

    public static void displayBuddyList() {
        Roster roster = GoogleTalkChatLogin.connection.getRoster();
        entries = roster.getEntries();
        String buddy = null;

        for (RosterEntry r : entries) {
            if (roster.getPresence(r.getUser()).isAvailable()) {
                System.out.print(roster.getPresence(r.getUser()).getFrom());
                buddy = r.toString();
            }
        }
    }

    public void disconnect() {
        GoogleTalkChatLogin.connection.disconnect();
    }

    public static void setstatus(String stas) {
        Presence presence = new Presence(Presence.Type.available);
        presence.setStatus(stas);
        String temp = presence.getStatus();
        System.out.println(temp);
        presence.setPriority(0);
        presence.setMode(Presence.Mode.available);
        // Send the presence packet through the connection
        String service = GoogleTalkChatLogin.connection.getServiceName();
        System.out.print(service);
        GoogleTalkChatLogin.connection.sendPacket(presence);
        // Sleep for 20 seconds
        try {
            Thread.sleep(20000);
        } catch (InterruptedException ex) {
        }
    }
}
