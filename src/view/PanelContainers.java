package view;

import interfaces.Initialize;

public class PanelContainers implements Initialize {

	private LoginPanel loginPanel;
	private RegisterNowPanel registerNowPanel;
	public PanelContainers() {
		initialize();
	}
	@Override
	public void initialize() {
		loginPanel = new LoginPanel();
		registerNowPanel = new RegisterNowPanel();
		
	}
	@Override
	public void addingOnComponent() {
		
		
	}
	public LoginPanel getLoginPanel() {
		return loginPanel;
	}
	public RegisterNowPanel getRegisterNowPanel() {
		return registerNowPanel;
	}
	
	
	
}
