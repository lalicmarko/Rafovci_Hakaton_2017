package model.users;

import java.io.Serializable;
import java.util.ArrayList;

import model.areas.Area;

public abstract class AbstractUser implements Comparable<AbstractUser>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	
	private String name;
	private String surname;
	private String email;
	
	private int numberOfVotes;
	
	private ArrayList<Area> areas;
	
//	dozvole
	private boolean viewPosts;
	private boolean createProblem;
	private boolean createLocation;
	private boolean donate;
	private boolean createRedAlertProblem;
	
	
	public AbstractUser(String username, String password, String name, String surname, String email){
		
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.email = email;
		
	}
	
	public AbstractUser(String username, String password){
		
		this.username = username;
		this.password = password;
		
		numberOfVotes = 0;
		
		viewPosts = false;
		createProblem = false;
		createLocation = false;
		donate = false;
		createRedAlertProblem = false;
		
	}
	
	public void upvote(){
		numberOfVotes++;
	}
	public void downvote(){
		numberOfVotes--;
		if (numberOfVotes < 0){
			System.err.println("Korisnik "+ username +" ima manje od 0 glasova, resetuje se na 0");
			numberOfVotes = 0;
		}
	}
	
	public void addArea(Area area){
		if (areas.contains(area)){
			System.err.println("Vec je dodata ta oblast");
			return;
		}
		areas.add(area);
	}
	public void removeArea(Area area){
		if (!areas.contains(area)){
			System.err.println("Ta oblast ne postoji u ovom korisniku");
			return;
		}
		areas.remove(area);
	}
	
	//autogenerated
	
	public int getNumberOfVotes() {
		return numberOfVotes;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setViewPosts(boolean viewPosts) {
		this.viewPosts = viewPosts;
	}

	public void setCreateProblem(boolean createProblem) {
		this.createProblem = createProblem;
	}

	public void setCreateLocation(boolean createLocation) {
		this.createLocation = createLocation;
	}

	public void setDonate(boolean donate) {
		this.donate = donate;
	}

	public void setCreateRedAlertProblem(boolean createRedAlertProblem) {
		this.createRedAlertProblem = createRedAlertProblem;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public boolean isViewPosts() {
		return viewPosts;
	}

	public boolean isCreateProblem() {
		return createProblem;
	}

	public boolean isCreateLocation() {
		return createLocation;
	}

	public boolean isDonate() {
		return donate;
	}

	public boolean isCreateRedAlertProblem() {
		return createRedAlertProblem;
	}

	@Override
	public String toString() {
		return "Korisnik:"+ username;
	}
}

