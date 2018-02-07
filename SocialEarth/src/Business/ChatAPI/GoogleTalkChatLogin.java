package Business.ChatAPI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;

@SuppressWarnings("serial")
public class GoogleTalkChatLogin extends JFrame {

    public static JFrame frame;
    boolean isAdmin = false;
//	JPasswordField pass;
    JButton connect;
    public static XMPPConnection connection;
    Collection<RosterEntry> list;
    public static ArrayList<String> buGoogleTalkChatLoginns;

    public GoogleTalkChatLogin() {
        set_layout_login_page();
    }

    public GoogleTalkChatLogin(boolean isAdmin) {
        this.isAdmin = isAdmin;
        set_layout_login_page();
    }

    void set_layout_login_page() {

        frame = new JFrame("LOGIN");

        final JPasswordField pass;
        final JTextField u_name;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel1 = new JPanel();
        final JPanel main = new JPanel();
        JPanel panel2 = new JPanel();
        JButton login = new JButton();

        Container pane = frame.getContentPane();

        pane.setLayout(new BorderLayout());
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));

        panel1.add(new JLabel("     USERNAME    "));
        u_name = new JTextField("", 15);
        panel1.add(u_name);
        panel1.add(new JLabel("      "));

        main.add(new JLabel("   "));
        main.add(panel1);
        main.add(new JLabel("   "));

        panel2.add(new JLabel("     PASSWORD   "));
        pass = new JPasswordField("", 15);
        if (isAdmin) {
            u_name.setText("socialearthglobalcause@gmail.com");
            pass.setText("socialEarth123");
        }

        pass.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {

                try {
                    String uname, pas;
                    if (isAdmin) {
                        uname = "socialearthglobalcause";
                        if (uname.indexOf("@gmail.com") < 0) {
                            uname += "@gmail.com";
                        }
                        pas = "socialEarth123";
                    } else {
                        uname = u_name.getText();
                        if (uname.indexOf("@gmail.com") < 0) {
                            uname += "@gmail.com";
                        }
                        pas = pass.getText();
                    }
                    main.setVisible(false);
                    frame.removeAll();
                    frame.setTitle("BUDDY LIST");
                    new RetrieveRosterList(uname, pas);
                } catch (XMPPException ex) {
                    Logger.getLogger(GoogleTalkChatLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        panel2.add(pass);
        panel2.add(new JLabel("      "));
        main.add(panel2);

        main.add(new JLabel("   "));

        login = new JButton("Login");

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                try {
                    String uname = u_name.getText();
                    if (uname.indexOf("@gmail") < 0) {
                        uname += "@gmail.com";
                    }
                    String pas = pass.getText();

                    main.setVisible(false);
                    frame.removeAll();
                    frame.setTitle("BUDDY LIST");
                    new RetrieveRosterList(uname, pas);
                } catch (XMPPException ex) {
                    Logger.getLogger(GoogleTalkChatLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        main.add(login);
        pane.add(main, BorderLayout.NORTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new GoogleTalkChatLogin();

    }

//Below this ...two classes are file transfer related........Not implemented properly....
    public class receive_file implements Runnable {

        public receive_file() {

            new Thread(this).start();
        }

        @Override
        public void run() {

        }
    }

    public class sendfileto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String file_path = JOptionPane.showInputDialog("enter the path of file");

        }
    }

}
