import java.util.Random;
import java.util.Scanner;
/***
 * 
 * driver Tyler Allen
 *
 */
public class Food extends Entity {
	

	public Food(int x, int y, int h){
		super(x,y,h);
	}
	
	public void initiateBattle(Shia s) {
		Random rnd = new Random();
		Scanner kbd = new Scanner(System.in);
		boolean result = RockPaperScissors(s);
		if((result == true)&& this.health == 0) {
			System.out.println("HAHAHAHAHAHA its time to eat your hungry! JUST DO IT!");
			Location shiaLoc = s.getLoc();
			s.moveTo(loc.getX(), loc.getY());
			new Mars(shiaLoc.getX(),shiaLoc.getY());
			s.incHunger();
		}
		else if((result == true) && this.health != 0) {
			System.out.println("Your prey has yet to be finished off so you can eat it! \nWill you engage in another round of life or death Rock Papper Scissors?!");
			String response = kbd.nextLine();
			if(response.contains("yes")) {
				initiateBattle(s);
			}
			else {
				s.move();
			}
		}

		else if(result != true) {
			
			System.out.println("OH NO! It seems like the talking food knows JIU-JITSU!!! You(Hollywood Super Star and part-time cannibal Shai LaBeouf)"
					+ "\nhave been BODY SLAMMED!");
			
			int x = loc.getX();
			int y = loc.getY();
			
			int z = rnd.nextInt(6);
			int w = rnd.nextInt(6);
			
			loc.setLoc(z,w);
			new Mars(x,y);
			
			s.move();
		}
	}
  }


