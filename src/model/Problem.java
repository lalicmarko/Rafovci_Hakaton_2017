package model;

import java.util.ArrayList;

public class Problem {

	private String problemTitle;
	private String problemDescription;
	private ArrayList<String> imageLocations;
	private int vote;
	private boolean donationsApproved;
	private double donationsMeter;
	
	public Problem(String title, String desc, int vote, boolean bool){
		this.problemTitle = title;
		this.problemDescription = desc;
		this.vote = vote;
		this.donationsApproved = bool;
	}
	public Problem(){
		
	}
	
	
	public ArrayList<String> getImageLocations() {
		return imageLocations;
	}
	public void setImageLocations(ArrayList<String> imageLocations) {
		this.imageLocations = imageLocations;
	}
	public String getProblemDescription() {
		return problemDescription;
	}
	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}
	public int getVote() {
		return vote;
	}
	public void setVote(int vote) {
		this.vote = vote;
	}
	public String getProblemTitle() {
		return problemTitle;
	}
	public void setProblemTitle(String problemTitle) {
		this.problemTitle = problemTitle;
	}
	public double getDonationsMeter() {
		return donationsMeter;
	}
	public void setDonationsMeter(double donationsMeter) {
		this.donationsMeter = donationsMeter;
	}
	
}
