package view;

import java.awt.Dimension;

import javax.swing.JToolBar;

import controller.ActionManager;
import controller.CreateNewProblem;
import controller.RegisterChildAction;
import controller.ViewProblemsFeed;

public class Toolbar extends JToolBar {

	private ViewProblemsFeed viewProblems;
	private RegisterChildAction registerChildAction;
	private CreateNewProblem createNewProblem;
	
	public Toolbar(){
		super();
		setOrientation(VERTICAL);
		add(ActionManager.getInstance().getViewProblemsAction());
		addSeparator(new Dimension(15, 30));
		add(ActionManager.getInstance().getRegisterChildAction());
		addSeparator(new Dimension(15, 30));
		add(ActionManager.getInstance().getCreateNewProblem());
		
		
		
		
		
		
	}
	
	
}
