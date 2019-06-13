package aspire2.product.im.ecq.client.view;

import javax.swing.*;
import java.awt.*;

/**
 * This is the ECQ chart mainFrame;
 */
public class MainFrame extends JFrame {

    private JPanel contentPanel = new JPanel(new BorderLayout());
    private JPanel personalPanel = new JPanel();
    private JLabel headLabel = new JLabel();
    private JLabel nicknameLabel = new JLabel();
    private JLabel signatureLabel = new JLabel();
    private JPanel mainPanel = new JPanel();
    private JTextField searchField = new JTextField();
    private JPanel relationListPanel = new JPanel();

    public MainFrame(){
        init();
        setVisible(true);
    }

    public void init(){
        setTitle("Main");
        setSize(300,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        configurePersonPanel();
        setContentPane(contentPanel);
        configureMainPanel();
        installComponents();

    }

    public void configureMainPanel() {
        configureSearchField();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.CYAN);
    }

    public void configureSearchField() {
        searchField.setPreferredSize(new Dimension(0,30));
    }

    public void configurePersonPanel() {
        configureHeadLabel();
        configurenicknameLabel();
        configureSignatureLabel();
        personalPanel.setPreferredSize(new Dimension(0,70));
        personalPanel.setBackground(Color.YELLOW);
        personalPanel.setLayout(null);
    }

    public void configureSignatureLabel() {
        signatureLabel.setBounds(85,35,150,15);
        signatureLabel.setText("I need a friend like you.");
    }

    public void configurenicknameLabel() {
        nicknameLabel.setBounds(85,5,100,30);
        nicknameLabel.setText("Tom");
    }

    public void configureHeadLabel() {
        headLabel.setBounds(20,5,55,55);
        headLabel.setBackground(Color.white);
        headLabel.setOpaque(true);
    }

    public void installComponents(){
        personalPanel.add(headLabel);
        personalPanel.add(signatureLabel);
        contentPanel.add(personalPanel, BorderLayout.NORTH);
        personalPanel.add(nicknameLabel);
        contentPanel.add(mainPanel);
        mainPanel.add(searchField, BorderLayout.NORTH);


    }

    public static void main(String[] args) {
        new MainFrame();

    }
}
