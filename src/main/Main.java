package main;

import model.AreaManager;
import model.UserManager;
import view.MainFrame;
import view.NewProblemWindow;

public class Main {

	public static void main(String[] args) {
		
		UserManager.getInstance().loadUsers();
		AreaManager.getInstance().loadAreas();
		
		UserManager m = UserManager.getInstance();
//		MainFrame mainFrame = MainFrame.getInstance();
//		
//		NewProblemWindow npw = new NewProblemWindow();
//		npw.setVisible(true);
//		mainFrame.setVisible(true);
		
		m.printAllUsers();
		
		m.logInUser("Maza", "123");
		
		System.out.println(m.getCurrUser().isCreateLocation());
	}
}
