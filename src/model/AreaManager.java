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
	
public void saveArea(String path){
		
		try {
			FileOutputStream fOut = new FileOutputStream(path);
			ObjectOutputStream oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(areas);	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void loadArea(String path){
		
		try {
			FileInputStream fIn = new FileInputStream(path);
			ObjectInputStream oIn = new ObjectInputStream(fIn);
			areas = (ArrayList<Area>)oIn.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
