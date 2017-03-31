package model;

import java.util.ArrayList;

import model.users.AbstractUser;
import model.users.User;

public class UserManager {
	
	private ArrayList<AbstractUser> users;
	
	private static UserManager instance;
	
	private UserManager(){
		users = new ArrayList<AbstractUser>();
	}
	
	public static UserManager getInstance() {
		
		if(instance == null){
			instance = new UserManager();
		}
		
		return instance;
	}
	
	
	public void addUser(String username, String password){
		
		for (AbstractUser u : users){
			if (u.getUsername().equals(username)){
				System.err.println("User already exists");
			}
		}
		users.add(new User(username, password));
		
	}
	
	public AbstractUser getUser(String username){
		for (AbstractUser u : users){
			
			if (u.getUsername().equals(username)){
				return u;
			}
			
		}
		System.err.println("Nepostojeci korisnik");
		return null;
	}
	
	public void upvoteUser(String username){
		
		for (AbstractUser u : users){
			if (u.getUsername().equals(username)){
				u.upvote();
			}
		}
		
	}
	
	public void downvoteUser(String username){
		
		for (AbstractUser u : users){
			if (u.getUsername().equals(username)){
				u.downvote();
			}
		}
		
	}
	
	public ArrayList<AbstractUser> getUsers() {
		return users;
	}
	
	public void saveUsers(){
//		users.
	}
	
}

