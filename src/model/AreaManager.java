package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.areas.Area;
import model.users.AbstractUser;

public class AreaManager {

private ArrayList<Area> areas;
	
	private static AreaManager instance;
	
	private AreaManager(){
		areas = new ArrayList<Area>();
	}
	
	public static AreaManager getInstance() {
		
		if(instance == null){
			instance = new AreaManager();
		}
		
		return instance;
	}
	
	public void addArea(String title){
		if (containsArea(title)){
			System.err.println("Vec sadrzi oblast");
			return;
		}
		areas.add(new Area(title));
	}
	
	private boolean containsArea(String title){
		for (Area a : areas){
			if (title.equals(a.getTitle())){
				return true;
			}			
		}
		return false;
	}
	
	public ArrayList<Area> getAreas() {
		return areas;
	}
	
	public void saveAreas(){
		
		try {
			FileOutputStream fOut = new FileOutputStream("res/areas.ser");
			ObjectOutputStream oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(areas);	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void loadAreas(){
		
		try {
			FileInputStream fIn = new FileInputStream("res/areas.ser");
			ObjectInputStream oIn = new ObjectInputStream(fIn);
			areas = (ArrayList<Area>)oIn.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void printAllAreas(){
		for (Area a : areas){
			System.out.println(a.toString());
		}
	}
}
