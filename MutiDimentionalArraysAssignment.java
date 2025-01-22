public class MutiDimentionalArraysAssignment{
	public static void main(String args []){
		int [] []numbers = {{3,4,5},{4,5,6},{8,9,0}};
		for(int []n:numbers)
		{
			for(int element:n)
			{
				System.out.print(element +" ");
			}
			System.out.println();
		}
	}
}
