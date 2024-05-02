import java.util.*;


public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Step 1: Currency Selection
            System.out.println("Enter the base currency:");
            String baseCurrency = sc.nextLine().toUpperCase();

            System.out.println("Enter the target currency:");
            String targetCurrency = sc.nextLine().toUpperCase();

            // Create a CurrencyConverter object
            CurrencyConverter converter = new CurrencyConverter(baseCurrency, targetCurrency);

            // Step 3: Amount Input
            System.out.println("Enter the amount to convert from " + baseCurrency + " to " + targetCurrency + ":");
            double amount = sc.nextDouble();

            // Step 4: Currency Conversion
            double convertedAmount = converter.convert(amount);

            // Step 5: Display Result
            System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } 
    }
}

class CurrencyConverter {
    private String baseCurrency;
    private String targetCurrency;

    public CurrencyConverter(String baseCurrency, String targetCurrency) {
        this.baseCurrency = baseCurrency;
        this.targetCurrency = targetCurrency;
    }

    // Method to fetch exchange rate from an API (You need to implement this method)
    public double getExchangeRate() {
        // Implement this method to fetch exchange rates from an API
        // For demonstration, returning a hardcoded exchange rate
        // Replace this with actual API call
        return 1.2; // Assuming 1 base currency = 1.2 target currency
    }

    // Method to convert currency
    public double convert(double amount) {
        double exchangeRate = getExchangeRate();
        return amount * exchangeRate;
    }
}

