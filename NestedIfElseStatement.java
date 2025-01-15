import java.util.Scanner;


public class NestedIfElseStatement{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score;
		String name;
		
		System.out.print(" Enter Your name:  " );
		name = scan.nextLine();
		
		System.out.print(" Enter your score:  ");
		score = scan.nextInt();
		
		if(score > 90)//and(score<=100);
			System.out.println(name + "   your grade is Outstanding ");
		
		else if(score >= 75)
			System.out.println(name + "   your grade is Excellent ");
		
		else if(score >= 55)
			System.out.println(name + "   your grade is Good  ");
		
		else if(score >=45 )
			System.out.println(name + "  your grade is Average ");
		
		else 
			System.out.println(name + "  your grade is very poor ");
		
		
		
		
		
		
	}
}