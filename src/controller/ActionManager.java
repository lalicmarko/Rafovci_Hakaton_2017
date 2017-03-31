package controller;

public class ActionManager {

	private ViewProblemsFeed viewProblemsAction;
	private VoteAction voteAction;
	private RegisterChildAction registerChildAction;
	private static ActionManager instance = null;
	
	private ActionManager()  {
	   	initialiseActions();
	   }
	
	private void initialiseActions(){
		
		viewProblemsAction = new ViewProblemsFeed();
		voteAction = new VoteAction();
		registerChildAction = new RegisterChildAction();
	}
	public static ActionManager getInstance(){
		if(instance == null){
			instance = new ActionManager();
			instance.initialiseActions();
		}
		return instance;
	}
	
	
	public RegisterChildAction getRegisterChildAction() {
		return registerChildAction;
	}
	public ViewProblemsFeed getViewProblemsAction() {
		return viewProblemsAction;
	}
	public VoteAction getVoteAction() {
		return voteAction;
	}
	
}
