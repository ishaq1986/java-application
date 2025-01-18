import java.security.SecureRandom;

public class DiceRoll {
	public static void main (String args []){
		
		SecureRandom randomnumbers = new SecureRandom();
		
		int dieRoll = randomnumbers.nextInt(6) +1;
		
		System.out.printf("You rolled a: %d",+dieRoll);
	}	
}	