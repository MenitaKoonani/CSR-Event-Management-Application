package Business.ChatAPI;

import java.util.Collection;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.Message;

public class ReceiverChatThreadListener implements MessageListener {

    XMPPConnection connection;
    Roster roster;
    Collection<RosterEntry> list;

    public ReceiverChatThreadListener() {

        connection = GoogleTalkChatLogin.connection;
        roster = connection.getRoster();
        list = roster.getEntries();

        for (RosterEntry r : list) {
            if (roster.getPresence(r.getUser()).isAvailable()) {
                String buddy = r.getUser();
                GoogleTalkChatLogin.connection.getChatManager().createChat(buddy, this);
                ///keep the end open for receiving chats from other buddies.....
            }
        }
    }

    public void processMessage(Chat arg, Message msg) {

        if (msg.getType() == Message.Type.chat) {
            new ReceiveChatListener(msg.getBody(), arg);
            arg.removeMessageListener(this);
        }
    }

}
