package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import interfaces.Initialize;

public class MainFrame extends JFrame implements Initialize{

	private Toolbar toolbar;
	private static MainFrame instance = null;
	private LoginPanel loginPanel;
	private MainFrame(){
		initialize();
	}
//	private void initialise(){
//		setTitle("Greenify");
//		setSize(new Dimension(800,800));
//		setLocationRelativeTo(null);
//		setLayout(new BorderLayout());
//		setVisible(true);
//	}
	
	public static MainFrame getInstance(){
		if(instance == null){
			instance = new MainFrame();
			instance.initialize();
		}
		return instance;
	}
	@Override
	public void initialize() {
		loginPanel = new LoginPanel();
		organizeFrame();
		addingOnComponent();
	}
	@Override
	public void addingOnComponent() {
		add(loginPanel,BorderLayout.CENTER);
		
	}
	
	public void organizeFrame(){
		setTitle("Moja aplikacija");
		setSize(new Dimension(800,800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
	}
	
	public LoginPanel getLoginPanel() {
		return loginPanel;
	}
}