package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.users.AbstractUser;
import model.users.User;

public class UserManager {
	
	private ArrayList<AbstractUser> users;
	private AbstractUser currUser;
	
	private static UserManager instance;
	
	private UserManager(){
		users = new ArrayList<AbstractUser>();
		currUser = null;
	}
	
	public static UserManager getInstance() {
		
		if(instance == null){
			instance = new UserManager();
		}
		
		return instance;
	}
	
	
	public void addUser(String username, String password){
		
		if (containsUser(username)){
			System.err.println("User already exists");
			return;
		}
		users.add(new User(username, password));
	}
	
	public ArrayList<AbstractUser> getTopUsers(int nrOfUsers){
		
		ArrayList<AbstractUser> list = new ArrayList<AbstractUser>();
		
		for (int i = 0; i < nrOfUsers; i++){
			list.add(users.get(i));
		}
		
		return list;
		
	}
	
	public void logInUser(String username, String password){
		
		if (!containsUser(username)){
			System.err.println("Korisnik ne postoji!");
			return;
		}
		if (findUser(username).verify(password)) {
			
			currUser = findUser(username);
			System.out.println("Ulogovan je korisnik: "+ username);
		}
		else {
			
			System.out.println("Pogresna lozinka");
			
		}
		
	}
	
	public AbstractUser getUser(String username){
		return findUser(username);
	}
	
	public void upvoteUser(String username){
		findUser(username).upvote();
	}
	
	public void downvoteUser(String username){
		findUser(username).downvote();
	}
	
	public ArrayList<AbstractUser> getUsers() {
		return users;
	}
	
	public void saveUsers(){
		
		try {
			FileOutputStream fOut = new FileOutputStream("res/users.ser");
			ObjectOutputStream oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(users);	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void loadUsers(){
		
		try {
			FileInputStream fIn = new FileInputStream("res/users.ser");
			ObjectInputStream oIn = new ObjectInputStream(fIn);
			users = (ArrayList<AbstractUser>)oIn.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private AbstractUser findUser(String username){
		for (AbstractUser u : users){
			if (u.getUsername().equals(username)){
				return u;
			}
		}
		System.err.println("Nepostojeci korisnik");
		return null;
	}
	
	private boolean containsUser(String username){
		
		for (AbstractUser u : users){
			if (u.getUsername().equals(username)){
				return true;
			}
		}
		return false;
	}
	
	public void registerUser(String username, String password, String name, String surname, String email){
		
		if (containsUser(username)) {
			System.err.println("User already registered");
			return;
		}
		users.add(new User(username, password, name, surname, email));
		
	}
	
	public AbstractUser getCurrUser() {
		if (currUser == null){
			System.err.println("Nema ulogovanog korisnika");
			return null;
		}
		return currUser;
	}
	
	public void printAllUsers(){
		
		for (AbstractUser u : users){
			System.out.println(u.toString());
		}
		
	}
	
}

