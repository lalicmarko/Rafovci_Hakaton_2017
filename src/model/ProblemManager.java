package model;

import java.util.ArrayList;

public class ProblemManager {

	private static ProblemManager instance = null;
	private ArrayList<Problem> problems = new ArrayList<Problem>();

	private ProblemManager(){
		
	}
	
	private void addProblem(Problem problem){
		if(!problems.contains(problem)){
			problems.add(problem);
		}
	}
	private void removeProblem(Problem problem){
		if(problems.contains(problem)){
			problems.remove(problem);
		}
	}
	
	public static ProblemManager getInstance() {
		if(instance == null){
			instance = new ProblemManager();
		}
		return instance;
	}
	public ArrayList<Problem> getProblems() {
		return problems;
	}
}
