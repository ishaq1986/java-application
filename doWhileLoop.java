import java.util.Scanner;

public class doWhileLoop{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	
	int score;
	int sumOfScore = 0;
	double average;
	int i = 1;
	
	do{
		
		System.out.print("Enter score: ");
		score = scan.nextInt();
	
		sumOfScore += score;
		i++;
	}while(i <= 10);
	average = (double)sumOfScore/10;
	System.out.print(average);
	
	
	}
}
