import java.awt.Desktop;
import java.net.URI;

public class GoogleMapsOpener {

    public static void main(String[] args) {
        // Example coordinates for the location (latitude and longitude)
        double latitude = 37.7749;  // Change these values to the desired location
        double longitude = -122.4194; // Change these values to the desired location

        // Create the Google Maps URL
        String googleMapsUrl = String.format("https://www.google.com/maps?q=%f,%f", latitude, longitude);

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