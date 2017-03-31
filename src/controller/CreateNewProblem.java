package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.NewProblemWindow;

public class CreateNewProblem extends AbstractAction{

	
	
	
	public void actionPerformed(ActionEvent arg){
		
		NewProblemWindow newProblemWindow = new NewProblemWindow();
		newProblemWindow.setVisible(true);
	}
}
