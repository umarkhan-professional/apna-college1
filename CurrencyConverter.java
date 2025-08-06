import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rates (example rates, update as needed)
        double usdToInr = 83.0;
        double eurToInr = 90.0;
        double usdToEur = 0.85;

        System.out.println("Welcome to Currency Converter!");
        System.out.println("Choose conversion type:");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.println("3. USD to EUR");
System.out.print("Enter your choice(1/2/3):");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        double convertedAmount = 0;

        switch (choice) {
            case 1:
                convertedAmount = amount * usdToInr;
                System.out.println(amount + " USD = " + convertedAmount + " INR");
                break;
            case 2:
                convertedAmount = amount * eurToInr;
                System.out.println(amount + " EUR = " + convertedAmount + " INR");
                break;
            case 3:
                convertedAmount = amount * usdToEur;
                System.out.println(amount + " USD = " + convertedAmount + " EUR");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}