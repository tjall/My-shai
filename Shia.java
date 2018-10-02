
import java.util.Scanner;

/**
 * The class for our player named Shia
 * @author Dean Roos
 * V20171130
 */

public class Shia extends Item{
 private int hunger;
 private int health;
 private boolean hasRover;
 private boolean hasWon;
 
 public Shia(int x, int y){
  hunger = 10;
  health = 5;
  hasRover = false;
  hasWon = false;
  //moveTo(x,y);
 }
 
 public void setRover(){
  hasRover = true;
 }
 
 public void subHeath(){
  health--;
 }
 
 public void subHunger(){
  hunger--;
 }
 
 public void incHunger(){
   hunger += 5;
 }
 
 public int getHealth(){
  return health;
 }
 
 public int getHunger(){
  return hunger;
 }
 
 public boolean getHasWon(){
	 return hasWon;
 }
 
  public void move(){
   Scanner in = new Scanner(System.in);
   try { 
     System.out.println("Enter \"N\", \"S\", \"E\", or \"W\" to move.");
     String m1 = in.nextLine();
     in.close();
     String m = m1.toUpperCase();
     if (!(m.equals("N") || m.equals("S") || m.equals("E") || m.equals("W"))){
       throw new Exception("Invalid imput.");
     }
     System.out.println("Nice");
     if (m.equals("N")){
   loc.moveY(1);
  } else if (m.equals("S")){
   loc.moveY(-1);
  } else if (m.equals("W")){
   loc.moveX(-1);
  } else if (m.equals("E")){
   loc.moveX(1);
  }
  //loc.toString();
   }
   catch(Exception e){
     System.out.println(e.getMessage());
     move();
   }
   
 }
 
}