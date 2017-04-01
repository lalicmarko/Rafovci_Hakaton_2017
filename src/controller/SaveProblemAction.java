package controller;

import java.awt.event.ActionEvent;

import model.Problem;
import model.ProblemManager;
import view.MainFrame;

public class SaveProblemAction extends AbstractActionEditor {
	private String title;
	private String description;
	private String imageLocation;
	private boolean donationsApproved;
	private boolean redAlertApproved;
	private double donationsMeter;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Problem problem = new Problem();
		
		ProblemManager problemManager = ProblemManager.getInstance();
//		title = 
		
		
	}

}
