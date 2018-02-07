package Business.ChatAPI;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.Message;

public class RefreshRosterList implements MessageListener {

    XMPPConnection connection;

    public RefreshRosterList(String newcomer) {
        connection = GoogleTalkChatLogin.connection;
        System.out.println("in add to list refresh");
        connection.getChatManager().createChat(newcomer, this);
    }

    @Override
    public void processMessage(Chat arg, Message msg) {

        if (msg.getType() == Message.Type.chat) {
            new ReceiveChatListener(msg.getBody(), arg);
            arg.removeMessageListener(this);
        }
    }
}
