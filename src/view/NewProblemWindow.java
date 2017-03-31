package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class NewProblemWindow extends JFrame{

	private JTextField problemTitle;
	private JTextArea problemDescription;
	private JTextField problemImgLocation;
	private JButton loadImageLoaction;
	
	public NewProblemWindow(){
		setTitle("Add new problem");
		getContentPane().setLayout(new MigLayout("", "[][grow][]", "[][][]"));
		
	}
}
