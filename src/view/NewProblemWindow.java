package view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import net.miginfocom.swing.MigLayout;

public class NewProblemWindow extends JFrame{

	private JTextField problemTitleTf;
	private JTextArea problemDescriptionTa;
	private JTextField problemImgLocationTf;
	private JButton loadImageLoactionBtn;
	private JRadioButton radioButton;
	
	public NewProblemWindow(){
		
		setTitle("Add new problem");
		setSize(new Dimension(600,600));
		setLocationRelativeTo(null);
		
		getContentPane().setLayout(new MigLayout("", "[][86.00][grow][]", "[][][20.00][72.00][][132.00,grow][]"));
		
		JLabel labelProblemTitle = new JLabel("Problem titile:");
		getContentPane().add(labelProblemTitle, "cell 1 0");
		
		problemTitleTf = new JTextField();
		getContentPane().add(problemTitleTf, "cell 2 0, grow");
		
		loadImageLoactionBtn = new JButton("Load image");
		getContentPane().add(loadImageLoactionBtn, "cell 1 2");
		
		JLabel labelProblemDescription = new JLabel("Problem description:");
		getContentPane().add(labelProblemDescription, "cell 1 4");
		
		JTextPane textPane = new JTextPane();
		getContentPane().add(textPane, "cell 2 4 1 2,grow");
		
	}
}
