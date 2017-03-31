package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import interfaces.Initialize;

public class RegisterNowPanel extends JPanel implements Initialize {

	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JLabel nameLabel;
	private JLabel surnameLabel;
	private JLabel ageLabel;
	private JLabel emailLabel;
	private JLabel loactionLabel;
	private JTextField usernameTextField;
	private JTextField passwordTextField;
	private JTextField nameTextField;
	private JTextField surnameTextField;
	private JTextField ageTextField;
	private JTextField emailTextField;
	private JComboBox<Object> locationComboBox;
	private JButton registerNowButton;

	@Override
	public void initialize() {
		  usernameLabel = new JLabel("Username: ");
		  passwordLabel= new JLabel();
		  nameLabel= new JLabel();
		  surnameLabel= new JLabel();
		  ageLabel= new JLabel();
		  emailLabel= new JLabel();
		  loactionLabel= new JLabel();
		  usernameTextField = new JTextField();
		  passwordTextField= new JTextField();
		  nameTextField= new JTextField();
		  surnameTextField= new JTextField();
		  ageTextField= new JTextField();
		  emailTextField= new JTextField();
		  locationComboBox = new JComboBox<>();
		  registerNowButton = new JButton();
	}

	@Override
	public void addingOnComponent() {
		add(usernameLabel,"cell 0 0");
		add(passwordLabel,"cell 0 0");
		add(nameLabel,"cell 0 0");
		add(surnameLabel,"cell 0 0");
		add(ageLabel,"cell 0 0");
		add(emailLabel,"cell 0 0");
		add(locationComboBox,"cell 0 0");
		add(registerNowButton,"cell 0 0");
		
	}
	
	
}
