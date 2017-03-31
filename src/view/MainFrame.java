package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private Toolbar toolbar;
	private static MainFrame instance = null;
	
	private MainFrame(){
		
	}
	private void initialise(){
		setTitle("Greenify");
		setSize(new Dimension(800,800));
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setVisible(true);
	}
	public static MainFrame getInstance(){
		if(instance == null){
			instance = new MainFrame();
			instance.initialise();
		}
		return instance;
	}
}