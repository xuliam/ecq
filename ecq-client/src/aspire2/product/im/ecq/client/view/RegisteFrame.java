package aspire2.product.im.ecq.client.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisteFrame extends JFrame {

    private LoginFrame loginFrame;

    private JPanel contentPanel = new JPanel();

    private JLabel nicknameLabel = new JLabel("NAME");

    private JTextField nicknameField = new JTextField();

    private JLabel passwordLabel = new JLabel("Password");

    private JPasswordField passwordField = new JPasswordField();

    private JLabel repasswordLabel = new JLabel("Confirm");

    private JPasswordField repasswordField = new JPasswordField();

    private JLabel sexLabel = new JLabel("Gender");

    private JRadioButton maleRadioButton = new JRadioButton("Male");

    private JRadioButton femaleRadioButton = new JRadioButton("Female");

    private JButton registeButton = new JButton("Register");

    private JButton cancelButton = new JButton("Cancel");


    public RegisteFrame(LoginFrame frame){
        this.loginFrame = frame;
        init();
        setVisible(true);
    }

    public void init(){
        setSize(430,330);
        setTitle("Register");
        setLocationRelativeTo(null);
        setContentPane(contentPanel);
        contentPanel.setLayout(null);
        configureNicknameLabel();
        configureNicknameField();
        configurePasswordLabel();
        configurePasswordField();
        configureRepasswordLable();
        configureRepasswordField();
        configureSexLabel();
        configureSexRadioButton();
        configureRegesteButton();
        configureCancelButton();
        installComponents();
        installListeners();
    }

    public void installListeners() {
        registeButton.addActionListener(new RegisteHandler());
        cancelButton.addActionListener(new CancelHandler());
    }

    private class CancelHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            RegisteFrame.this.dispose();
            loginFrame.setVisible(true);
        }
    }

    private class RegisteHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //check the input statues


            //complete register

        }
    }


    public void configureCancelButton() {
        cancelButton.setBounds(335,225,90,30);
        cancelButton.setContentAreaFilled(false);
    }

    public void configureRegesteButton() {
        registeButton.setBounds(250,225,90,30);
        registeButton.setContentAreaFilled(false);

    }

    public void configureSexRadioButton() {
        maleRadioButton.setBounds(100,175,160,35);
        femaleRadioButton.setBounds(220,175,160,35);
    }

    private void configureSexLabel() {
        sexLabel.setBounds(10,175,80,35);
        sexLabel.setHorizontalAlignment(JLabel.RIGHT);
    }

    private void configureRepasswordLable() {
        repasswordLabel.setBounds(10,125,80,35);
        repasswordLabel.setHorizontalAlignment(JLabel.RIGHT);
    }

    private void configureRepasswordField() {
        repasswordField.setBounds(100,125,238,35);
    }

    private void configurePasswordField() {
        passwordField.setBounds(100,75,238,35);
    }

    private void configurePasswordLabel() {
        passwordLabel.setBounds(10,75,80,35);
        passwordLabel.setHorizontalAlignment(JLabel.RIGHT);
    }

    public void configureNicknameLabel(){

        nicknameLabel.setBounds(10,25,80,35);
        nicknameLabel.setHorizontalAlignment(JLabel.RIGHT);
    }

    public void configureNicknameField(){

        nicknameField.setBounds(100,25,238,35);
    }

    public void installComponents(){
        contentPanel.add(nicknameLabel);
        contentPanel.add(nicknameField);
        contentPanel.add(passwordLabel);
        contentPanel.add(passwordField);
        contentPanel.add(repasswordField);
        contentPanel.add(repasswordLabel);
        contentPanel.add(sexLabel);
        contentPanel.add(maleRadioButton);
        contentPanel.add(femaleRadioButton);
        contentPanel.add(registeButton);
        contentPanel.add(cancelButton);
    }

    public static void main(String[] args) {
        new RegisteFrame(null);
    }
}
