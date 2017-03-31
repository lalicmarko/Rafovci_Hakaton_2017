package controller;

public class ActionManager {

	private ViewProblemsFeed viewProblemsAction;
	private VoteAction voteAction;
	
	
	public ActionManager()  {
	   	initialiseActions();
	   }
	
	private void initialiseActions(){
		
		viewProblemsAction = new ViewProblemsFeed();
		voteAction = new VoteAction();
	}
	
	
}
