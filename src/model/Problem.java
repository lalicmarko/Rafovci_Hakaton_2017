package model;

public class Problem {

	private String problemTitle;
	private String problemDescription;
	private String imageLocation;
	private int vote;
	private boolean donationsApproved;
	private double donationsMeter;
	
	public Problem(String title, String desc, String imgLoc, int vote, boolean bool){
		this.problemTitle = title;
		this.problemDescription = desc;
		this.imageLocation = imgLoc;
		this.vote = vote;
		this.donationsApproved = bool;
	}
	public Problem(){
		
	}
	
	
	public String getImageLocation() {
		return imageLocation;
	}
	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
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
