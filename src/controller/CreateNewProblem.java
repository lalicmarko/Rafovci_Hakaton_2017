package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.NewProblemWindow;

public class CreateNewProblem extends AbstractActionEditor{

	
	
	
	public void actionPerformed(ActionEvent arg){
		
		NewProblemWindow newProblemWindow = new NewProblemWindow();
		newProblemWindow.setVisible(true);
	}
}
