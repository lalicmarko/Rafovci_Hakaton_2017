package model;

import java.util.ArrayList;

import model.areas.Area;

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
}
