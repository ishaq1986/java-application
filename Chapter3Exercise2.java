import java.util.Scanner;

public class Chapter3Exercise2{ //class created
	public static void main(String[] args){ //main method created
		
		
		Chapter3Exercise2.gasMileage();
		Chapter3Exercise2.creditLimit();
		Chapter3Exercise2.salesCommission();
		Chapter3Exercise2.largestNumber();
		
	}
	
	public static void gasMileage(){ //method created
		Scanner scan = new Scanner(System.in);
		
		// variables created
		int miles;
		int gallons;
		int sumMiles = 0;
		int sumGallons = 0;
		double sumMilesPerGallon = 0;
		
		// iterate over number of miles and gallons
	while (true) {
		System.out.print("Enter number of miles or -1 to stop : ");
		miles = scan.nextInt();
		
		System.out.print("Enter number of gallons: ");
		gallons = scan.nextInt();
		
			// check for sentinel value
			if (miles == -1 ) {
				break;
			}
			
			sumMiles += miles;
			sumGallons += gallons;
			double milesPerGallon = (double) miles/gallons;
			sumMilesPerGallon += milesPerGallon;
			System.out.printf("The miles per gallon of this trip is: %.2fMPG%n",milesPerGallon);
		
	}
	System.out.printf("The miles per gallon of all trips is: %.2fMPG%n", sumMilesPerGallon);
	
}

	public static void creditLimit() {
		 
        Scanner scan = new Scanner(System.in);

        // Input number of customers
        System.out.print("Enter the number of customers: ");
        int numberOfCustomers = scan.nextInt();

        for (int i = 1; i <= numberOfCustomers; i++) {
            System.out.printf("Customer %d:%n", i);

            // Input account details
            System.out.print("Enter account number: ");
            int accountNumber = scan.nextInt();

            System.out.print("Enter balance at the beginning of the month: ");
            int beginningBalance = scan.nextInt();

            System.out.print("Enter total charges this month: ");
            int charges = scan.nextInt();

            System.out.print("Enter total credits this month: ");
            int credits = scan.nextInt();

            System.out.print("Enter credit limit: ");
            int creditLimit = scan.nextInt();

            // Calculate new balance
            double newBalance = (double)beginningBalance + charges - credits;

            // Display new balance
            System.out.printf("Account %d: New balance is %f%n", accountNumber, newBalance);

            // Check if credit limit is exceeded
            if (newBalance > creditLimit) 
                System.out.println("Credit limit exceeded.");
            
        }
	}

    public static void salesCommission() {
        Scanner scanner = new Scanner(System.in);

        // Item prices
        final double item1 = 239.99;
        final double item2 = 129.75;
        final double item3 = 99.95;
        final double item4 = 350.89;

        // Base weekly pay and commission rate
        final double weeklyPay = 200.00;
        final double commissionRate = 0.09;

        // Initialize total sales
        double totalSales = 0;

        while (true) {
            System.out.print("Enter item number (1 to 4) or -1 to finish: ");
            int itemNumber = scanner.nextInt();

            if (itemNumber == -1) {
                break; // Exit the loop when input is -1
            }

            if (itemNumber == 1) {
                totalSales += item1;
            } else if (itemNumber == 2) {
                totalSales += item2;
            } else if (itemNumber == 3) {
                totalSales += item3;
            } else if (itemNumber == 4) {
                totalSales += item4;
            } else {
                System.out.println("Invalid item number. Please enter a number between 1 and 4.");
            }
        }

        // Calculate total earnings
        double commission = totalSales * commissionRate;
        double totalEarnings = weeklyPay + commission;

        // Display results
        System.out.printf("Total sales: $%.2f%n", totalSales);
        System.out.printf("Total earnings: $%.2f%n", totalEarnings);

        scanner.close();
    }

    public static void largestNumber() {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;            // Counter to track the number of inputs
        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer

        while (counter < 10) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt(); // Input the current number

            // Update largest if the current number is greater
            if (number > largest) {
                largest = number;
            }

            counter++; // Increment the counter
        }

        // Display the largest number
        System.out.printf("The largest number is: %d%n", largest);

        scanner.close(); // Close the scanner
    }
	
    public static void twoLargestNumbers() {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;        // Initialize to the smallest possible value
        int secondLargest = Integer.MIN_VALUE; // Initialize to the smallest possible value
        int counter = 0;                        // Counter to track inputs

        while (counter < 10) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            // Update largest and second largest
            if (number > largest) {
                secondLargest = largest; // Move the current largest to second largest
                largest = number;        // Update the largest
            } else if (number > secondLargest && number != largest) {
                secondLargest = number; // Update second largest only
            }

            counter++; // Increment counter
        }

        // Display results
        System.out.printf("The largest number is: %d%n", largest);
        System.out.printf("The second largest number is: %d%n", secondLargest);

        scanner.close(); // Close the scanner
    }
	
	
}