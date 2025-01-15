/* import java.util.Scanner;

public class GasMileageCalculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   


        double totalMiles = 0;
        double totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        int milesDriven = scanner.nextInt();

        while (milesDriven != -1) {
            System.out.print("Enter gallons used: ");
            int gallonsUsed = scanner.nextInt();

            double milesPerGallon = (double) milesDriven / gallonsUsed;
            totalMiles   
 += milesDriven;
            totalGallons += gallonsUsed;

            System.out.println("Miles per gallon for this trip: " + milesPerGallon);

            System.out.print("Enter miles driven (-1 to quit): ");
            milesDriven = scanner.nextInt();
        }

        if (totalGallons != 0) {
            double overallMilesPerGallon = totalMiles / totalGallons;
            System.out.println("Overall miles per gallon: " + overallMilesPerGallon);
        } else {
            System.out.println("No trips recorded.");
        }

        scanner.close();
    }
} */
/* import java.util.Scanner;

public class GasMileageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   


        double totalMiles = 0;
        double totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        int milesDriven = scanner.nextInt();

        while (milesDriven != -1) {
            System.out.print("Enter gallons used: ");
            int gallonsUsed = scanner.nextInt();

            double milesPerGallon = (double) milesDriven / gallonsUsed;
            totalMiles   
 += milesDriven;
            totalGallons += gallonsUsed;

            System.out.println("Miles per gallon for this trip: " + milesPerGallon);

            System.out.print("Enter miles driven (-1 to quit): ");
            milesDriven = scanner.nextInt();
        }

        if (totalGallons != 0) {
            double overallMilesPerGallon = totalMiles / totalGallons;
            System.out.println("Overall miles per gallon: " + overallMilesPerGallon);
        } else {
            System.out.println("No trips recorded.");
        }

        scanner.close();
    }
} */

import java.util.Scanner;

public class GasMileageCalculators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 


        double totalMiles = 0;
        double totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        int milesDriven = scanner.nextInt();

        while (milesDriven != -1) {
            System.out.print("Enter gallons used: ");
            int gallonsUsed = scan.nextInt();

            double milesPerGallon = (double) milesDriven / gallonsUsed;
			// update totalMiles;
			// update totalGallons;
            // totalMiles += milesDriven;
            // totalGallons += gallonsUsed;

            System.out.println("Miles per gallon for this trip: " + milesPerGallon);

            System.out.print("Enter miles driven (-1 to quit): ");
            milesDriven = scan.nextInt();
        }

        if (totalGallons != 0) {
            double overallMilesPerGallon = totalMiles / totalGallons;
            System.out.println("Overall miles per gallon: " + overallMilesPerGallon);
        } else {
            System.out.println("No trips recorded.");
        }

        scan.close();
    }
}