package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import interfaces.Initialize;

public class MainFrame extends JFrame implements Initialize {

	private PanelContainers panelContainers;
	private Toolbar toolbar;
	private static MainFrame instance = null;
	private LoginPanel loginPanel;
	private RightScrollPane rightScrollPane;
	private NewProblemWindow newProblemWindow;

	private MainFrame() {
	}
	// private void initialise(){
	// setTitle("Greenify");
	// setSize(new Dimension(800,800));
	// setLocationRelativeTo(null);
	// setLayout(new BorderLayout());
	// setVisible(true);
	// }

	public static MainFrame getInstance() {
		if (instance == null) {
			instance = new MainFrame();
			instance.initialize();
		}
		return instance;
	}

	@Override
	public void initialize() {
		newProblemWindow = new NewProblemWindow();
		panelContainers = new PanelContainers();
		rightScrollPane = new RightScrollPane();
		organizeFrame();
		addingOnComponent();
	}

	@Override
	public void addingOnComponent() {
		add(rightScrollPane, BorderLayout.CENTER);

	}

	public void organizeFrame() {
		setTitle("Moja aplikacija");
		toolbar = new Toolbar();
		toolbar.setFloatable(false);
		setSize(new Dimension(800, 800));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		getContentPane().add(toolbar, BorderLayout.WEST);
	}

	public PanelContainers getPanelContainers() {
		return panelContainers;
	}

	public RightScrollPane getRightScrollPane() {
		return rightScrollPane;
	}
	public NewProblemWindow getNewProblemWindow() {
		return newProblemWindow;
	}
}