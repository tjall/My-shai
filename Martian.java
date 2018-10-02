
/***
 * driver Tyler Allen
 */
import java.util.Random;
import java.util.Scanner;
public class Martian extends Entity {
	
	public Martian(int x, int y, int h){
		super(x,y,h);
	}
	
	public void initiateBattle(Shia s) {
		Random rnd = new Random();
		boolean result = RockPaperScissors(s);
		Scanner kbd = new Scanner(System.in);
		
		if((result == true)&& this.health == 0)  {
			Location shiaLoc = s.getLoc();
			s.moveTo(loc.getX(), loc.getY());
			new Mars(shiaLoc.getX(),shiaLoc.getY());
			System.out.println("You stand over the alein victorious! SCORE ONE FOR THE BOYS BACK HOME!");
		}
		else if((result == true) && this.health != 0) {
			System.out.println("The Alien still Stands not yet completely defeated! \nWill you engage in another round of life or death Rock Papper Scissors?!");
			String response = kbd.nextLine();
			if(response.contains("yes")) {
				initiateBattle(s);
				
			}
			else {
				
				s.move();
			}
			
		}
		else if(result != true) {
			System.out.print("Hollywood Super Star Shai LaBeouf has lost in Rock Papper Scissors!\n"
					+ "Does Shai wish to try agian to continue trying to beat this alein scum?");
			String response = kbd.nextLine();
			if(response.contains("yes")) {
				initiateBattle(s);
			}
			else if(response.contains("no")){
				s.move();
				
			}
		}
	}
	
	
	
}