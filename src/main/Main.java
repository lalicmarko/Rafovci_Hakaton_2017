package main;

import model.UserManager;
import view.MainFrame;
import view.NewProblemWindow;

public class Main {

	public static void main(String[] args) {
		
		MainFrame mainFrame = MainFrame.getInstance();
		
		NewProblemWindow npw = new NewProblemWindow();
		npw.setVisible(true);
		mainFrame.setVisible(true);
	}
}