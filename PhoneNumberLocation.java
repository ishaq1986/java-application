import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class PhoneNumberLocation {

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a phone number
        System.out.print("Enter the phone number to locate: ");
        String phoneNumber = scanner.nextLine();

        // For demonstration, we'll "locate" Port Harcourt, Nigeria for any input
        locatePhoneLocation(phoneNumber);

        scanner.close();
    }

    public static void locatePhoneLocation(String phoneNumber) {
        // Print the phone number for user reference
        System.out.println("Locating phone number: " + phoneNumber);

        // Define the location (Port Harcourt, Nigeria)
        String googleMapsUrl = "https://www.google.com/maps/search/?api=1&query=Port+Harcourt,+Rivers+State,+Nigeria";

        // Open the URL in the default web browser
        openWebPage(googleMapsUrl);
    }

    private static void openWebPage(String urlString) {
        try {
            Desktop desktop = Desktop.getDesktop();
            URI uri = new URI(urlString);
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}