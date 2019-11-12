import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.util.*;

public class fusionMain {
Runtime rt = Runtime.getRuntime();
    String      appName     = "fusion";
    fusionMain     mainGUI;
    JFrame      newFrame    = new JFrame(appName);
    JButton     sendMessage;
    JTextField  messageBox;
    JTextArea   chatBox;
    JTextField  usernameChooser;
    JFrame      preFrame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager
                            .getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                fusionMain mainGUI = new fusionMain();
                mainGUI.preDisplay();
            }
        });
    }

    public void preDisplay() {
        newFrame.setVisible(false);
        preFrame = new JFrame(appName);
        usernameChooser = new JTextField(15);
        //JLabel chooseUsernameLabel = new JLabel("Pick a username:");
        JButton enterServer = new JButton("start fusion");
        enterServer.addActionListener(new enterServerButtonListener());
        JPanel prePanel = new JPanel(new GridBagLayout());

        GridBagConstraints preRight = new GridBagConstraints();
        preRight.insets = new Insets(0, 0, 0, 10);
        preRight.anchor = GridBagConstraints.EAST;
        GridBagConstraints preLeft = new GridBagConstraints();
        preLeft.anchor = GridBagConstraints.WEST;
        preLeft.insets = new Insets(0, 10, 0, 10);
        // preRight.weightx = 2.0;
        preRight.fill = GridBagConstraints.HORIZONTAL;
        preRight.gridwidth = GridBagConstraints.REMAINDER;

        //prePanel.add(chooseUsernameLabel, preLeft);
        prePanel.add(usernameChooser, preRight);
        //preFrame.add(BorderLayout.CENTER, prePanel);
        preFrame.add(BorderLayout.CENTER, enterServer);
        preFrame.setSize(300, 300);
        preFrame.setVisible(true);

    }

    public void display() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.BLUE);
        southPanel.setLayout(new GridBagLayout());

        messageBox = new JTextField(30);
        messageBox.requestFocusInWindow();

        sendMessage = new JButton("speak");
        sendMessage.addActionListener(new sendMessageButtonListener());

        chatBox = new JTextArea();
        chatBox.setEditable(false);
        chatBox.setFont(new Font("Serif", Font.PLAIN, 15));
        chatBox.setLineWrap(true);

        mainPanel.add(new JScrollPane(chatBox), BorderLayout.CENTER);

        GridBagConstraints left = new GridBagConstraints();
        left.anchor = GridBagConstraints.LINE_START;
        left.fill = GridBagConstraints.HORIZONTAL;
        left.weightx = 512.0D;
        left.weighty = 1.0D;

        GridBagConstraints right = new GridBagConstraints();
        right.insets = new Insets(0, 10, 0, 0);
        right.anchor = GridBagConstraints.LINE_END;
        right.fill = GridBagConstraints.NONE;
        right.weightx = 1.0D;
        right.weighty = 1.0D;

        southPanel.add(messageBox, left);
        southPanel.add(sendMessage, right);

        mainPanel.add(BorderLayout.SOUTH, southPanel);

        newFrame.add(mainPanel);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setSize(470, 300);
        newFrame.setVisible(true);
    }

    class sendMessageButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
        /*    if (messageBox.getText().length() < 1) {
                // do nothing
            } else if (messageBox.getText().equals(".clear")) {
                chatBox.setText("Cleared all messages\n");
                messageBox.setText("");
            } else {
                chatBox.append("<" + username + ">:  " + messageBox.getText()
                        + "\n");
                messageBox.setText("");
            }
            messageBox.requestFocusInWindow();*/
						try{
						BufferedReader br = new BufferedReader(new FileReader("javastart.txt"));
String line = null;
while ((line = br.readLine()) != null) {
	chatBox.append(line);
		chatBox.append("\n");
}}
catch(Exception e){}
						try{
              FileWriter fw=null;
              Scanner sc=null;
							chatBox.append("trying");
							rt.exec("cmd.exe /c java GreetingMaker");
              chatBox.append("1");
              rt.exec("python texttospeech.py greet.txt");
              fw=new FileWriter("info.txt");
              fw.write("yes");
              fw.close();
              chatBox.append("1");
              fw=new FileWriter("outputd.txt");
              fw.write("1001");
              fw.close();
              rt.exec("cmd.exe /c python testvoice.py");
              rt.exec("cmd.exe /c java eval1");
              sc=new Scanner(new File("outputd.txt"));
              int u=sc.nextInt();
              while(u==1001){
                u=sc.nextInt();
                chatBox.append( Integer.toString(u));
              }
              sc.close();
              switch(u){
                case 1:
                rt.exec("cmd.exe /c python /wait texttospeech.py info.txt");
                Thread.sleep(20);
                rt.exec("cmd.exe /c python /wait texttospeech.py googleinfo.txt");
                Thread.sleep(20);
                rt.exec("cmd.exe /c python /wait testvoice.py");
                Thread.sleep(20);
                rt.exec("cmd.exe /c python /wait googleit.py");
                break;
                case 2:
                rt.exec("cmd.exe /c python texttospeech.py info.txt");
                Thread.sleep(20);
                rt.exec("cmd.exe /c python texttospeech.py urlinfo.txt");
                Thread.sleep(20);
                rt.exec("cmd.exe /c python testvoice.py");
                Thread.sleep(20);
                rt.exec("cmd.exe /c python urlit.py");
                break;
                case 3:
                rt.exec("cmd.exe /c python texttospeech.py info.txt");
                Thread.sleep(20);
                rt.exec("cmd.exe /c python texttospeech.py calinfo.txt");
                Thread.sleep(20);
                rt.exec("cmd.exe /c start calc");
                break;
                case 4:
                rt.exec("cmd.exe /c python texttospeech.py info.txt");
                Thread.sleep(20);
                rt.exec("cmd.exe /c python texttospeech.py dirinfo.txt");
                Thread.sleep(20);
                rt.exec("cmd.exe /c dir > D:\\desktop\\cmds\\y.txt");
                Thread.sleep(20);
                rt.exec("cmd.exe /c java Read");
                Thread.sleep(20);
                sc=new Scanner(new File("output.txt"));
                while(sc.hasNextLine()){
                  chatBox.append(sc.nextLine());
                }
                sc.close();
                case 5:
                rt.exec("cmd.exe /c python texttospeech.py info.txt");
                Thread.sleep(20);
                rt.exec("cmd.exe /c python texttospeech.py chdirinfo.txt");
                Thread.sleep(20);
                rt.exec("cmd.exe /c dir > D:\\desktop\\cmds\\y.txt");
                Thread.sleep(20);
                rt.exec("cmd.exe /c java Read");
                Thread.sleep(20);
                sc=new Scanner(new File("output.txt"));
                while(sc.hasNextLine()){
                  chatBox.append(sc.nextLine());
                }
                sc.close();
                rt.exec("cmd.exe /c python texttospeech.py chdirinfo3.txt");
                Thread.sleep(20);
                System.out.print("enter the directory to which you what to go:");
                String s=null;
                if (messageBox.getText().length() < 1) {
                    // do nothing
                }
                else{
                  s=messageBox.getText();
                }
                sc.close();
                if(s!=null){
                    String t="cmd.exe /c cd ";
                    t=t+s;
                    rt.exec(t);
                    rt.exec("cmd.exe /c dir > D:\\desktop\\cmds\\y.txt");
                    Thread.sleep(20);
                    rt.exec("cmd.exe /c java Read");
                    Thread.sleep(20);
                    sc=new Scanner(new File("output.txt"));
                    while(sc.hasNextLine()){
                      chatBox.append(sc.nextLine());
                    }
                    sc.close();
                }
                break;
                case 6:
                rt.exec("cmd.exe /c python texttospeech.py info.txt");
                Thread.sleep(20);
                rt.exec("cmd.exe /c python texttospeech.py musicguid.txt");
                Thread.sleep(20);
                rt.exec("cmd.exe /c python music.py");
                Thread.sleep(20);
                sc = new Scanner(new File("musictoplay.txt"));
                String t=sc.next();
                sc.close();
                String play="cmd.exe /c start ";
                play=play+t;
                rt.exec(play);
                break;
              }
							chatBox.append("done..");
						}
						catch(Exception e){
							chatBox.append("done..");
						}
            messageBox.requestFocusInWindow();
        }
    }
    class enterServerButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
                preFrame.setVisible(false);
                display();
        }

    }
}
