/**
 * Name: Nilan C. Karunaratne
 * Date: February 6, 2026
 * Assignment: SDC230 In-Class Assignment: Calculating Sales
 * Description: A sales calculation tool that uses a switch statement to 
 * tally retail prices and calculates the average transaction amount.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Required header
        System.out.println("Nilan C. Karunaratne - Week 2 In-Class Assignment: Calculating Sales");
        
        Scanner input = new Scanner(System.in);
        
        double totalSales = 0.0;
        int transactionCount = 0;
        int productNumber = 0;

        while (true) {
            System.out.print("\nEnter product number (1-5) or -999 to quit: ");
            productNumber = input.nextInt();

            if (productNumber == -999) {
                break;
            }

            double unitPrice = 0.0;
            boolean isValid = true;

            // Switch statement to determine retail price
            switch (productNumber) {
                case 1:
                    unitPrice = 2.98;
                    break;
                case 2:
                    unitPrice = 4.50;
                    break;
                case 3:
                    unitPrice = 9.98;
                    break;
                case 4:
                    unitPrice = 4.49;
                    break;
                case 5:
                    unitPrice = 6.87;
                    break;
                default:
                    System.out.println("Invalid product number. Please try again.");
                    isValid = false;
                    break;
            }

            if (isValid) {
                System.out.print("Enter quantity sold: ");
                int quantity = input.nextInt();
                
                totalSales += (unitPrice * quantity);
                transactionCount++; // Increment transaction count for each valid entry
            }
        }

        // Final output
        if (transactionCount > 0) {
            double averageTransaction = totalSales / transactionCount;
            System.out.printf("\nFinal Total Sales: $%.2f", totalSales);
            System.out.printf("\nAverage Transaction Amount: $%.2f\n", averageTransaction);
        } else {
            System.out.println("\nNo valid transactions were recorded.");
        }

        input.close();
    }
}