package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NewProblemWindow extends JFrame{

	private JTextField problemTitle;
	private JTextArea problemDescription;
	private JTextField problemImgLocation;
	private JButton loadImageLoaction;
	private JTextField textField;
	
	public NewProblemWindow(){
		setTitle("Add new problem");
		getContentPane().setLayout(new BorderLayout(0, 0));
		textField = new JTextField();
		getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
	}
}
