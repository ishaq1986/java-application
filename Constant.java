 /* write a java program to create a class called constant
 with a static variable pie  initialized to the value of pie create a method called area to calculate the area of a circle  and display
the radious should be inputed by the user
Write a java program to create a class called bank account, with variable account number balance and interest rate provide static method to get and set the static
 variables create several bank account object and print there detailes along the variables
 */
import java.util.Scanner;

public class Constant{
	
	static final double pieValue = 3.142;
	static int age;

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in); 
		System.out.println ("Enter radius of circle: " );
		int radius = scan.nextInt();
		
		Constant.area(radius);
		
		// Scanner old = new Scanner(System.in);
		// System.out.println("Enter Age: ");
		// int age = old.nextInt(); 
		
		
		Constant.check();
		
		
	}
	public static void area(int radius){
		 
		 double areaOfCircle =pieValue * radius * radius; 
		System.out.printf("the area of the circle is %.2f\n",areaOfCircle);
		
	}
	public static void check(){
		
		Scanner old = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = old.nextInt();
		
		if(age >= 18)
			System.out.println("Yes, you are an adult");
		else
			System.out.print("You are still a teenager");
		
	}
} 