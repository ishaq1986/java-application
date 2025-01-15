import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String name;
		int score;
		
		System.out.print(" Enter name: ");
		name = scan.nextLine();
		
		System.out.print(" Enter score: ");
		score = scan.nextInt();
		
		switch(score/10){
			case 10:
			case 9:
					System.out.println(name + " Your grade is Outstanding");
					
			break;
			
			case 8:
			case 7:
			case 6:
					System.out.println(name + " Your grade is Excellent ");
			break;
			
			case 5:
					System.out.println(name + " Your grade is Good  " );
			break;
			
			case 4: 
					System.out.println(name + " Your grade is Averaga ");
			break;
			
			case 3:
			case 2:
			case 1:
					System.out.println(name + " Your grade is very poor ");
			break;
			
			default:
					System.out.print("Please Enter a valid input");
			
			
		}
	}
}