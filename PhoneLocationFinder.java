import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class PhoneLocationFinder {

    public static void main(String[] args) {
        // Assuming you received a phone number
        String phoneNumber = "+123456789"; // Input from user
        // Call the function to find the location
        findLocationByPhoneNumber(phoneNumber);
            JSONObject jsonInput = new JSONObject();
            jsonInput.put("phoneNumber", phoneNumber);

            // Sending the request
    }

    public static void findLocationByPhoneNumber(String phoneNumber) {
        String apiKey = "YOUR_API_KEY"; // Your actual API key
        String apiUrl = "https://api.example.com/location"; // Hypothetical API URL

        try {
            // Create URL object
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Authorization", "Bearer " + apiKey);
            conn.setDoOutput(true);

            // Prepare JSON input
            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInput.toString().getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Read the response
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                    StringBuilder response = new StringBuilder();
                    String responseLine;
                    while ((responseLine = br.readLine()) != null) {
                        response.append(responseLine.trim());
                    }
                    // Assume the API returns latitude and longitude
                    JSONObject jsonResponse = new JSONObject(response.toString());
                    double latitude = jsonResponse.getDouble("latitude");
                    double longitude = jsonResponse.getDouble("longitude");

                    // Now open the location on Google Maps
                    openWebPage(latitude, longitude);
                }
            } else {
                System.out.println("Error: " + conn.getResponseCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void openWebPage(double latitude, double longitude) {
        try {
            String googleMapsUrl = String.format("https://www.google.com/maps?q=%f,%f", latitude, longitude);
            Desktop.getDesktop().browse(new URL(googleMapsUrl).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
