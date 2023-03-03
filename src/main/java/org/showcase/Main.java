package org.showcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String baseUrl = "https://jsonplaceholder.typicode.com/photos";

        while (true) {
            System.out.print("Enter an album ID (or 'q' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                // Send GET request to retrieve photos in the specified album
                int albumId = Integer.parseInt(input);
                String urlString = baseUrl + "?albumId=" + albumId;
                URL url = new URL(urlString);

                // Read response and convert to JSON array
                BufferedReader response = new BufferedReader(new InputStreamReader(url.openStream()));
                String jsonData;
                StringBuilder data = new StringBuilder();
                while ((jsonData = response.readLine()) != null) {
                    data.append(jsonData);
                }
                response.close();

                JSONArray albums = new JSONArray(data.toString());
                for (int i = 0; i < albums.length(); i++) {
                    JSONObject photo = albums.getJSONObject(i);
                    int id = photo.getInt("id");
                    String title = photo.getString("title");
                    System.out.println("["+id + "] " + title);
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
            catch (JSONException e) {
                System.out.println("Error parsing JSON data.");
            }
            catch (IOException e) {
                System.out.println("Error reading data from URL.");
            }
        }

        scanner.close();
        System.out.println("Exiting...");
    }
}