package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import model.ProblemManager;
import view.MainFrame;
import view.NewProblemWindow;

public class CreateNewProblem extends AbstractActionEditor{

	public CreateNewProblem(){
//			putValue(SMALL_ICON, loadIcon("images/feed32.png"));
			putValue(NAME, "Create Problem");
			putValue(SHORT_DESCRIPTION, "Create Problem");
	}
	
	public void actionPerformed(ActionEvent arg){
		
		
		NewProblemWindow newProblemWindow = MainFrame.getInstance().getNewProblemWindow();
		newProblemWindow.setVisible(true);
	}
}
