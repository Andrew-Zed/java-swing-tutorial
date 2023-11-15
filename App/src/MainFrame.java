import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton btn;
    private TextPanel textPanel;
    public MainFrame() throws HeadlessException {

        super("Hello World");

        setLayout(new BorderLayout());

        btn = new JButton("Click Me!");

        textPanel = new TextPanel();

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.appendText("Hello\n");
            }
        });

        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);


        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);





//        JLabel jLabel1 = new JLabel("Username: ");
//        add(jLabel1);
//
//        JTextField t1 = new JTextField(20);
//        add(t1);
//
//        JLabel jLabel2 = new JLabel("Password: ");
//        add(jLabel2);
//        JTextField t2 = new JTextField(20);
//        add(t2);
//
//        JButton b1 = new JButton("Submit");
//        b1.setBounds(100, 100, 100, 50);
//        add(b1);

    }
}
