package view;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import interfaces.Initialize;


public class LoginPanel extends JPanel implements Initialize {

	private JButton loginButton;
	private JPanel loginpanel;
	private JTextField userTextField;
	private JTextField passwordTextField;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JLabel registerLabel;
	private JDialog mydialog;
//	private MigLayout migLayout;
	private JLabel wrongPassword;
	public LoginPanel() {
		initialize();
		boundsSetting();
		addingOnComponent();
		
	}

	@Override
	public void initialize() {
		loginButton = new JButton("Log In");
		loginpanel = new JPanel();
		userTextField = new JTextField(10);
		passwordTextField = new JPasswordField(10);
		registerLabel = new JLabel("Register now!");
		usernameLabel = new JLabel("Username: ");
		passwordLabel = new JLabel("Password");
		wrongPassword = new JLabel("");
//		migLayout = new MigLayout("",
//								  "40[]10[]10[]20",
//								  "20[]10[]10[]10[]10[]");
	}

	@Override
	public void addingOnComponent() {
//		loginpanel.setLayout(migLayout);
		loginpanel.add(usernameLabel,"cell 0 1");
		loginpanel.add(passwordLabel,"cell 0 2");
		loginpanel.add(userTextField,"cell 1 1");
		loginpanel.add(passwordTextField,"cell 1 2");
		loginpanel.add(loginButton, "cell 1 3");
		loginpanel.add(wrongPassword, "cell 2 3");
		loginpanel.add(registerLabel,"cell 1 4");
		
		add(loginpanel);
	}

	public void boundsSetting(){
		userTextField.setBounds(70, 30, 100, 20);
		passwordTextField.setBounds(70, 65, 100, 20);
		loginButton.setBounds(98, 119, 98, 20);
		registerLabel.setBounds(108, 152, 98, 20);
		usernameLabel.setBounds(20, 28, 80, 20);
		passwordLabel.setBounds(20, 63, 80, 20);
	}
	public JLabel getRegisterLabel() {
		return registerLabel;
	}

	public void setRegisterLabel(JLabel registerLabel) {
		this.registerLabel = registerLabel;
	}

	public JButton getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(JButton loginButton) {
		this.loginButton = loginButton;
	}

	public JPanel getLoginpanel() {
		return loginpanel;
	}

	public void setLoginpanel(JPanel loginpanel) {
		this.loginpanel = loginpanel;
	}

	public JTextField getUserTextField() {
		return userTextField;
	}

	public void setUserTextField(JTextField userTextField) {
		this.userTextField = userTextField;
	}

	public JTextField getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(JTextField passwordTextField) {
		this.passwordTextField = passwordTextField;
	}

	public JLabel getUsernameLabel() {
		return usernameLabel;
	}

	public void setUsernameLabel(JLabel usernameLabel) {
		this.usernameLabel = usernameLabel;
	}

	public JLabel getPasswordLabel() {
		return passwordLabel;
	}

	public void setPasswordLabel(JLabel passwordLabel) {
		this.passwordLabel = passwordLabel;
	}

	public JDialog getMydialog() {
		return mydialog;
	}

	public void setMydialog(JDialog mydialog) {
		this.mydialog = mydialog;
	}



}
