package model.areas;

public class Area {
	
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
