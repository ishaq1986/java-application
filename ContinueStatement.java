public class ContinueStatement{
	public static void main(String[] args){
		
		int i = 0;
		while(i <= 10){
			i++;
			if (i == 5)
				continue;
			System.out.printf("%d ",i);
			System.out.println(' ');
			
		}
		System.out.println("This is the end of the loop");
	}
}