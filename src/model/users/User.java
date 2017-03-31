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
	
	public User(String username, String password, String name, String surname, String email){
		
		super(username, password, name, surname, email);

		setCreateLocation(true);
		setCreateProblem(true);
		setCreateRedAlertProblem(true);
		setDonate(true);
		setViewPosts(true);
	}
	

	@Override
	public int compareTo(AbstractUser user) {
		if (user.getNumberOfVotes() < getNumberOfVotes()) return 1;
		else if (user.getNumberOfVotes() < getNumberOfVotes()) return -1;
		else return 0;
	}
	
	
	
}
