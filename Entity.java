
/*
 * Entity.java
 * Basic entity class. Currently without mechanics. Placeholder
 * @author Steven Giang
 * nav Tyler Allen
 * @version 20171116
 * 
 */
import java.util.Random;
import java.util.Scanner;
public class Entity {
	
	public Location loc;
	private int handThrown;
	public int health;
	private int x, y;
	
	public Entity(int x, int y, int h){
		Random rnd = new Random();
		
		this.x = x;
		this.y = y;
		
		loc.setLoc(x,y);
		this.health = h;
		this.handThrown = 0;
		
	}
	public boolean RockPaperScissors(Shia s){
		Scanner kbd = new Scanner(System.in);
		Random rnd = new Random();
		boolean player_win = false;
		boolean winner_found = false;
		
		 while(winner_found == false){
			 System.out.println("Come at me bruh Rock! Paper! Scissors....SHOOT!");
				int playerHandThrown = kbd.nextInt();
				handThrown = rnd.nextInt(3);
				/***
				 * 0 = rock
				 * 1 = paper
				 * 2 = scissors 
				 */
			 if(this.handThrown == 1 && playerHandThrown == 0){
				 s.subHeath();	
				 winner_found = true;
			 }
			 if(this.handThrown == 0 && playerHandThrown == 1){
				 winner_found = true;
				 this.health --;
				 return player_win == true;
			 }
			 if(this.handThrown == 2 && playerHandThrown == 1){
				 winner_found = true;
				 s.subHeath();	 
			 }
			 if(this.handThrown == 1 && playerHandThrown == 2){
				 winner_found = true;
				 this.health--;	 
				 return player_win == true;
			 }
			 if(this.handThrown == 0 && playerHandThrown == 2){
				 winner_found = true;
				 s.subHeath();	 
			 }
			 if(this.handThrown == 2 && playerHandThrown == 0){
				 winner_found = true;
				 this.health --;
				 return player_win == true;
			 }
			 
			 
		 }
		 
		
		 
		 return player_win;
		 
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setHealth(int h) {
		this.health = h;
	}
	
	
}