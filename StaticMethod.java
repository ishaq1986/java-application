import java.util.Scanner;

public class StaticMethod{
	public static void main(String[] args){
						
		StaticMethod.sum(); 
		StaticMethod.sum2(20 , 70);
		StaticMethod.divide(100 , 50);
		System.out.println(StaticMethod.product());
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Fullname: ");
		String name = scan.nextLine();
		
		 System.out.println(StaticMethod.personName(fullName)); 
		
	}
	public static void sum() {
		int x = 50;
		int y = 30;
		int total = x + y;
		
		System.out.printf("Sum of the two numbers is %d ", total);
	} 
	public static void sum2(int x, int y){
		int total = x + y;
		
		System.out.printf("\nThe secound sum of the two number is %d",total);
	}
	public static void divide(int x, int y){
		double total = (double)x/y;
		
		System.out.printf("\nThe sum of division is %f%n",total);
	}
	public static int product(){
		int x = 60;
		int y = 10;
		int total;
		return total = x * y;
	}
	public static  String personName(fullname){
		// String fullname = FirstName,LastName;
		return fullName;
	}
}
