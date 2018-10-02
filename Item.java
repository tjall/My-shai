
/*
 * Item.java
 * Abstract class for items to take spaces in the map
 * 
 * @driver Tyler
 * @nav Steven Giang
 * @version 2017 11 30
 * 
 */

public abstract class Item {
	
	private Location loc;
	
	public Location getLoc(){
		return this.loc;
	}
	
	public void moveTo(int x, int y){
		loc.setLoc(x, y);
	}
	
}