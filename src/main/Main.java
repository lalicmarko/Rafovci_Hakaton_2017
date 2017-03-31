package main;

import view.MainFrame;
import view.NewProblemWindow;

public class Main {

	public static void main(String[] args) {
		
		MainFrame mainFrame = MainFrame.getInstance();
		
		NewProblemWindow npw = new NewProblemWindow();
		npw.setVisible(true);
		
	}
}
