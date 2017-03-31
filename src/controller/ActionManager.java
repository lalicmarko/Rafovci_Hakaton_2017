package controller;

public class ActionManager {

	private ViewProblemsFeed viewProblemsAction;
	private VoteAction voteAction;
	private RegisterChildAction registerChildAction;
	
	
	public ActionManager()  {
	   	initialiseActions();
	   }
	
	private void initialiseActions(){
		
		viewProblemsAction = new ViewProblemsFeed();
		voteAction = new VoteAction();
		registerChildAction = new RegisterChildAction();
	}
	
	
}
