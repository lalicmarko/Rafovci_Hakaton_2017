package view;

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

	@Override
	public void initialize() {
		  usernameLabel = new JLabel();
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
	}

	@Override
	public void addingOnComponent() {
		
	}

}
