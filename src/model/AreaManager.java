package model;

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
	
	public ArrayList<Area> getAreas() {
		return areas;
	}
	
}
