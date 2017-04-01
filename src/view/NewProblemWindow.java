package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import net.miginfocom.swing.MigLayout;

public class NewProblemWindow extends JDialog{

	private JTextField problemTitleTf;
	private JTextArea problemDescriptionTa;
	private JTextField problemImgLocationTf;
	private JButton loadImageLoactionBtn;
	private JRadioButton rbRequired;
	private JRadioButton rbNotRequired;
	private JRadioButton rbAlert;
	private JRadioButton rbNotAlert;
	private JLabel imageLocation;
	private ButtonGroup buttonDonationsGroup;
	private ButtonGroup buttonRedAlertGroup;
	private JLabel lblRedAlert;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JButton saveButton;
	private JButton btnSave;
	
	public NewProblemWindow(){
		
		initialiseGui();
	}
	public void initialiseGui(){
		setTitle("Add new problem");
		setSize(new Dimension(600,600));
		setModal(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[31.00][86.00][123.00][366.00][][94.00]", "[][][][20.00][][][][][][72.00][][][184.00][92.00][87.00]"));
	
		JLabel labelProblemTitle = new JLabel("Problem titile:");
		getContentPane().add(labelProblemTitle, "cell 1 1");
		
		problemTitleTf = new JTextField();
		getContentPane().add(problemTitleTf, "cell 2 1 2 1,grow");
		
		loadImageLoactionBtn = new JButton("Load image");
		getContentPane().add(loadImageLoactionBtn, "cell 1 3");
		
		imageLocation = new JLabel("Image Location");
		getContentPane().add(imageLocation, "cell 2 3 2 1");
		
		separator_2 = new JSeparator();
		getContentPane().add(separator_2, "cell 0 4 6 1,grow");
		
		JLabel lblDonations = new JLabel("Donations");
		getContentPane().add(lblDonations, "cell 1 6");
		
		lblRedAlert = new JLabel("Red Alert:");
		rbAlert = new JRadioButton("Alert");
		
		separator = new JSeparator();
		separator.setBackground(Color.GRAY);
		separator.setForeground(Color.GRAY);
		
		JLabel labelProblemDescription = new JLabel("Problem description:");
	
		
		JTextPane textPane = new JTextPane();
		
		rbRequired = new JRadioButton("Required");
		rbNotRequired = new JRadioButton("Not Required");
		
		rbAlert = new JRadioButton("Alert");
		rbNotAlert = new JRadioButton("Ordinary");
		
		buttonDonationsGroup = new ButtonGroup();
		buttonDonationsGroup.add(rbNotRequired);
		buttonDonationsGroup.add(rbRequired);
		
		buttonRedAlertGroup = new ButtonGroup();
		buttonRedAlertGroup.add(rbAlert);
		buttonRedAlertGroup.add(rbNotAlert);
		
	
		btnSave = new JButton("Save");
		
		separator_1 = new JSeparator();
		separator_1.setBackground(Color.GRAY);
		separator_1.setForeground(Color.GRAY);
		
		getContentPane().add(separator_1, "cell 0 13 6 1,grow");
		getContentPane().add(separator, "cell 0 10 6 1,grow");
		getContentPane().add(rbRequired, "cell 2 6,alignx left");
		getContentPane().add(lblRedAlert, "cell 1 8");
		getContentPane().add(rbAlert, "cell 2 8,alignx left");
		getContentPane().add(labelProblemDescription, "cell 1 11");
		getContentPane().add(textPane, "cell 2 11 2 2,grow");
		getContentPane().add(rbNotRequired, "cell 3 6");
		getContentPane().add(rbNotAlert, "flowx,cell 3 8,alignx left");
		getContentPane().add(btnSave, "cell 5 14");
	}
	public JTextField getProblemTitleTf() {
		return problemTitleTf;
	}
	public JTextArea getProblemDescriptionTa() {
		return problemDescriptionTa;
	}
	public JTextField getProblemImgLocationTf() {
		return problemImgLocationTf;
	}
	public JButton getLoadImageLoactionBtn() {
		return loadImageLoactionBtn;
	}
	public JRadioButton getRbRequired() {
		return rbRequired;
	}
	public JRadioButton getRbNotRequired() {
		return rbNotRequired;
	}
	public JRadioButton getRbAlert() {
		return rbAlert;
	}
	public JRadioButton getRbNotAlert() {
		return rbNotAlert;
	}
	public JLabel getImageLocation() {
		return imageLocation;
	}
	public ButtonGroup getButtonDonationsGroup() {
		return buttonDonationsGroup;
	}
	public ButtonGroup getButtonRedAlertGroup() {
		return buttonRedAlertGroup;
	}
	public JLabel getLblRedAlert() {
		return lblRedAlert;
	}
	public JRadioButton getRdbtnNewRadioButton() {
		return rdbtnNewRadioButton;
	}
	public JRadioButton getRdbtnNewRadioButton_1() {
		return rdbtnNewRadioButton_1;
	}
	public JSeparator getSeparator() {
		return separator;
	}
	public JSeparator getSeparator_1() {
		return separator_1;
	}
	public JSeparator getSeparator_2() {
		return separator_2;
	}
	public JButton getSaveButton() {
		return saveButton;
	}
	public JButton getBtnSave() {
		return btnSave;
	}
	

}
