//11.	Imagine a scenario where you are managing information about countries and their capitals using a HashMap. Perform the following tasks:
//●	Initialize a HashMap called countryCapitals to store the capitals of different countries. Add at least five country-capital pairs.
//●	Implement a method called printMap that takes a HashMap and prints all the key-value pairs.
//●	Implement a method called getCapital that takes a country name as a parameter and returns its capital from the countryCapitals map.
//●	Implement a method called containsCapital that takes a capital name as a parameter and returns whether that capital exists in the countryCapitals map.
//●	Iterate through the countryCapitals map and print each country and its capital.

import java.util.HashMap;

public class Ques11{
    public static void main(String[] args) {
        // Create a HashMap to store country-capital pairs
        HashMap<String, String> countryCapitals = new HashMap<>();

        // Add at least five country-capital pairs
        countryCapitals.put("United States", "Washington, D.C.");
        countryCapitals.put("United Kingdom", "London");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("India", "New Delhi");

        // Print the entire map
        printMap(countryCapitals);

        // Example usage of getCapital and containsCapital methods
        String country = "France";
        System.out.println("Capital of " + country + ": " + getCapital(countryCapitals, country));
        String capital = "Tokyo";
        System.out.println(capital + " exists in the map: " + containsCapital(countryCapitals, capital));
    }

    // Method to print all key-value pairs in the map
    private static void printMap(HashMap<String, String> map) {
        for (String country : map.keySet()) {
            System.out.println(country + ": " + map.get(country));
        }
    }

    // Method to get capital by country name
    private static String getCapital(HashMap<String, String> map, String country) {
        return map.getOrDefault(country, "Capital not found");
    }

    // Method to check if a capital exists in the map
    private static boolean containsCapital(HashMap<String, String> map, String capital) {
        return map.containsValue(capital);
    }
}

	



