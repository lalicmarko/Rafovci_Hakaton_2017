package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import interfaces.Initialize;
import net.miginfocom.swing.MigLayout;

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
	private MigLayout migLayout;
	
	public RegisterNowPanel() {
		initialize();
	}
	@Override
	public void initialize() {
		  usernameLabel = new JLabel("Username: ");
		  passwordLabel= new JLabel("Password");
		  nameLabel= new JLabel("Name: ");
		  surnameLabel= new JLabel("Surname: ");
		  ageLabel= new JLabel("Age: ");
		  emailLabel= new JLabel("Email: ");
		  loactionLabel= new JLabel("Location: ");
		  usernameTextField = new JTextField(20);
		  passwordTextField= new JTextField(20);
		  nameTextField= new JTextField(20);
		  surnameTextField= new JTextField(20);
		  ageTextField= new JTextField(20);
		  emailTextField= new JTextField(20);
		  locationComboBox = new JComboBox<>(someLocations());
		  registerNowButton = new JButton("Register Now");
		  migLayout = new MigLayout();
		  addingOnComponent();
	}

	@Override
	public void addingOnComponent() {
		setLayout(migLayout);
		add(usernameLabel,"cell 0 0");
		add(passwordLabel,"cell 0 1");
		add(nameLabel,"cell 0 2");
		add(surnameLabel,"cell 0 3");
		add(ageLabel,"cell 0 4");
		add(emailLabel,"cell 0 5");
		add(loactionLabel,"cell 0 6");
		add(usernameTextField,"cell 1 0");
		add(passwordTextField,"cell 1 1");
		add(nameTextField,"cell 1 2");
		add(surnameTextField,"cell 1 3");
		add(ageTextField,"cell 1 4");
		add(emailTextField,"cell 1 5");
		add(locationComboBox,"cell 1 6");
		add(registerNowButton,"cell 1 7");
	}
	
	public Object[] someLocations(){
		Object[] objects = {"Vracar","Vozdovac","Novi Beograd","Palilula","Zvezdara"};
		return objects;
	}
}
