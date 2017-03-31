package model.users;

public class User extends AbstractUser{

	public User(String username, String password){
		super(username, password);
		
		setCreateLocation(true);
		setCreateProblem(true);
		setCreateRedAlertProblem(true);
		setDonate(true);
		setViewPosts(true);
	}
	
	
	
}
