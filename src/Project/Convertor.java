package Project;

package Project;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Predefined amount in Rupees
        double rupees = 1000; // Example: You can change this value as needed

        // Conversion rate from INR to USD (example rate: 1 INR = 0.012 USD)
        double conversionRate = 0.012;

        // Convert Rupees to Dollars
        double dollars = rupees * conversionRate;

        // Output the result
        System.out.println(rupees + " INR is equal to " + dollars + " USD");
    }
}
