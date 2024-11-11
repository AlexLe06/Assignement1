package balancecalculator;
import java.util.Scanner;

/**
 *
 * @author tanal
 */
public class BalanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter your initial balance: ");
        double balance = userInput.nextDouble();
        System.out.println("Please enter the annual interest rate: ");
        double interestRate = userInput.nextDouble();
        System.out.println("Please enter the number of years the clients wants to save the money in the bank: ");
        int years = userInput.nextInt();
        System.out.println(" ");
        
        
        double calc = balance * Math.pow((1 + (interestRate/100)), years);
        
        System.out.printf("%-21s : %.2f$\n", "Initial Balance", balance);
        System.out.printf("%-21s : %.2f%%\n", "Annual Interest Rate", interestRate);
        System.out.printf("%-21s : %s\n", "Saving Years", years);
        System.out.println("--------------------------------");
        System.out.printf("%s : %.2f$\n", "Balance after " + years + " years",  calc );
        
        
    }
    
}
