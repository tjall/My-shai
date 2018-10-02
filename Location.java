
/**
 * V20171116
 * @author Dean Roos
 * Location.java
 */

public class Location {

	private int x;
	private int y;
	
	public Location(){
		this.x = 0;
		this.y = 0;
	}
	public Location(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}
	
	public void moveX(int m){
		x += m;
	}
	
	public void moveY(int m){
		y += m;
	}
	
	public void setLoc(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "(" + x + ", " + y + ")";
	}
}
