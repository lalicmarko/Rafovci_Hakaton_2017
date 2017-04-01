package view;

import javax.swing.JScrollPane;

public class RightScrollPane extends JScrollPane{

	public RightScrollPane() {
		super(MainFrame.getInstance().getPanelContainers().getLoginPanel());
	}
}
