import java.util.Scanner;

public class Chapter4Excercise {

    public static void findSmallestValue() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values to input for Smallest Value: ");
        int numValues = input.nextInt();

        if (numValues <= 0) {
            System.out.println("Please enter a positive number of values.");
            return;
        }

        System.out.print("Enter the first value: ");
        int smallest = input.nextInt();

        for (int i = 1; i < numValues; i++) {
            System.out.print("Enter the next value: ");
            int currentValue = input.nextInt();
            if (currentValue < smallest) {
                smallest = currentValue;
            }
        }

        System.out.println("The smallest value is: " + smallest);
    }

    public static void productOfOddIntegers() {
        int product = 1;
        for (int i = 1; i <= 15; i += 2) {
            product *= i;
        }
        System.out.println("The product of odd integers from 1 to 15 is: " + product);
    }

    public static void factorials() {
        System.out.println("Number\tFactorial");
        System.out.println("------\t---------");

        for (int i = 1; i <= 20; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println(i + "\t" + factorial);
        }
        System.out.println("\nCalculating the factorial of 100 is difficult because the result is a very large number that exceeds the capacity of even the 'long' data type. You would need to use a data type or library capable of handling arbitrary-precision arithmetic (like BigInteger in Java).");
    }

    public static void compoundInterestModified() {
        double principal = 1000.0;
        int years = 10;

        System.out.println("Interest Rate\tYear\tAmount on deposit");
        for (double rate = 0.05; rate <= 0.10; rate += 0.01) {
            System.out.printf("%.2f%%\t\t\t", rate * 100);
            for (int year = 1; year <= years; year++) {
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d\t\t%.2f\n", year, amount);
                if (year == 1)
                    System.out.printf("\t\t\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner mainInput = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nChoose an exercise to run:");
            System.out.println("1. Find Smallest Value");
            System.out.println("2. Product of Odd Integers");
            System.out.println("3. Factorials");
            System.out.println("4. Modified Compound Interest");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = mainInput.nextInt();

            switch (choice) {
                case 1:
                    findSmallestValue();
                    break;
                case 2:
                    productOfOddIntegers();
                    break;
                case 3:
                    factorials();
                    break;
                case 4:
                    compoundInterestModified();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        mainInput.close();
    }
}