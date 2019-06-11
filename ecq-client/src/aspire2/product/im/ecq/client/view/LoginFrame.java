
package aspire2.product.im.ecq.client.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * TODO
 * @author xulian
 * @VERSION 1.0
 * @DATE 7/06/2019 4:19:38 pm
 * @remarks TODO
 */
public class LoginFrame extends JFrame{
	
	private JPanel contentPanel = new JPanel();
	private JPanel loginPanel = new JPanel();
	private JComboBox<String> accountComboBox = new JComboBox<>();
	private JPasswordField passwordField = new JPasswordField();
	private JCheckBox autoLoginCheckBox = new JCheckBox("AutoLogin");
	private JCheckBox rememberCheckBox = new JCheckBox("Remember PW");
	private JButton findButton = new JButton("Forget My Password");
	private JButton loginButton = new JButton("Login");
	private JButton registeButton = new JButton("Registe");
	private JButton loginCode = new JButton();
	private JLabel headLabel = new JLabel();
	private Color textColor = new Color(166,166,166);
	private Font textFont = new Font("Comic Sans MS", Font.PLAIN, 12);
	
	public LoginFrame() {
		init();
		setVisible(true);
	}
	
	public void init() {
		setSize(430,330);
		setTitle("Login");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setContentPane(contentPanel);
		contentPanel.setLayout(new BorderLayout());
		
		configureLoginPanel();
		
		configureAccountComboBox();
		
		configurePasswordField();
		
		configureAutoLoginCheckBox();
		
		configureRememberCheckBox();
		
		configureLoginButton();
		
		configureRegisteButton();
		
		configureHeadLabel();
		
		installComponents();

		installListener();
	}
	


	public void configureLoginPanel() {
		loginPanel.setBackground(Color.white);
		loginPanel.setPreferredSize(new Dimension(0,180));
		loginPanel.setLayout(null);
	}
	
	public void configureAccountComboBox() {
		accountComboBox.setBounds(90,30,238,35);
		accountComboBox.setBackground(Color.white);
		accountComboBox.setEditable(true);
		accountComboBox.setMaximumRowCount(3);
	}
	
	public void configurePasswordField() {
		passwordField.setBounds(90, 75, 238, 35);
		passwordField.setBackground(Color.white);
		
	}
	
	public void configureAutoLoginCheckBox() {
		autoLoginCheckBox.setBounds(87, 105, 98, 25);
		autoLoginCheckBox.setOpaque(false);
		autoLoginCheckBox.setFont(textFont);
		autoLoginCheckBox.setForeground(textColor);
	}
	
	public void configureRememberCheckBox() {
		rememberCheckBox.setBounds(180, 105, 150, 25);
		rememberCheckBox.setOpaque(false);
		rememberCheckBox.setForeground(textColor);
		rememberCheckBox.setFont(textFont);
	}
	
	public void configureLoginButton() {
		loginButton.setBounds(90, 135, 238, 35);
		loginButton.setForeground(Color.black);
		//Transparent
		loginButton.setContentAreaFilled(false);
	}
	
	public void configureRegisteButton() {
		registeButton.setBounds(15,150,60,20);
		registeButton.setContentAreaFilled(false);
		registeButton.setBorder(null);
		registeButton.setFocusPainted(false);
		registeButton.setForeground(textColor);
		registeButton.setFont(textFont);
	}

	public void configureHeadLabel() {
		headLabel.setBounds(170,80,65,65);
		headLabel.setOpaque(true);
		headLabel.setBackground(Color.RED);

	}
	
	public void installComponents() {
		loginPanel.add(accountComboBox);
		loginPanel.add(passwordField);
		loginPanel.add(autoLoginCheckBox);
		loginPanel.add(rememberCheckBox);
		loginPanel.add(loginButton);
		loginPanel.add(registeButton);
		contentPanel.add(loginPanel, BorderLayout.SOUTH);
		getLayeredPane().add(headLabel, JLayeredPane.DEFAULT_LAYER);
	}
	
	
	public void installListeners(){
		registeButton.addActionListener(new RegisteHandler());
		loginButton.addActionListener(new LoginHandler());
		}


	}

	private class RegisteHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e){

		}
	}

	private class LoginHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){

		}

	}

	public static void main(String[] args) {
		new LoginFrame();
	}
}
