import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton btn;
    private TextPanel textPanel;
    private Toolbar toolbar;

    public MainFrame() {

        super("Hello World");

        setLayout(new BorderLayout());

        toolbar = new Toolbar();

        btn = new JButton("Click Me!");

        textPanel = new TextPanel();

        toolbar.setTextPanel(textPanel);

        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }
}
