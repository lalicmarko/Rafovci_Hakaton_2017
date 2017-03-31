package model.areas;

import java.io.Serializable;

public class Area implements Serializable {
	
	private String title;
	
	public Area(String title){
		this.title = title;
	}
	
	
	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {
		return "Area: "+title;
	}
	
}
