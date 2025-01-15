/* 3.17 (Gas Mileage) 
Drivers are concerned with the mileage their automobiles get. One driver has kept track of several 
trips by recording the miles driven and gallons used for each tankful. 
Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip. 
The program should calculate and display the miles per gallon obtained for each trip and 
print the combined miles per gallon obtained for all trips up to this point. 
All averaging calculations should produce floating-point results. Use class Scanner and sentinel-controlled 
repetition to obtain the data from the user. */
import java.util.Scanner;


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
}
}