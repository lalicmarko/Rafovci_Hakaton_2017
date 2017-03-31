package model.users;

public abstract class AbstractUser {

	private String username;
	private String password;
	
//	dozvole
	private boolean viewPosts;
	private boolean createProblem;
	private boolean createLocation;
	private boolean donate;
	private boolean createRedAlertProblem;
//	private boolean 
	
	public AbstractUser(String username, String password){
		
		this.username = username;
		this.password = password;
		
		viewPosts = false;
		createProblem = false;
		createLocation = false;
		donate = false;
		createRedAlertProblem = false;
		
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
