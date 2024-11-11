/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pricecaiculator;
import java.util.Scanner;
/**
 *
 * @author Le Nguyen Tan Alex
 */
public class PriceCaIculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        double price;
        double discount;
        double fedTax = 5;
        double provTax = 9.975;
        
        System.out.println("Please enter the item price: ");
        price = userInput.nextDouble();
        System.out.println("Please enter the discout ratio (5 for 5%): ");
        //To make it so that number change according to user input
        discount = userInput.nextDouble();
        
        double beforeTax = price - (price * (discount/100));
        double fedTaxPrice = (beforeTax * fedTax)/100; // Federeal tax on the dsicounted price
        double provTaxPrice = (beforeTax * provTax)/100; // Provincial tax on the discounted price
        double afterTax = beforeTax + (beforeTax * ((provTax + fedTax)/100));
        
        System.out.printf("%-17s : %.2f$\n", "Original Price", price);
        System.out.printf("%-17s : %.2f%%\n", "Discount Ratio", discount);
        System.out.printf("%-17s : %.2f$\n", "Price Before Tax" , beforeTax);
        System.out.println("-----------------------------");
        System.out.printf("%-17s : %.2f$\n", "Federal Tax", fedTaxPrice);
        System.out.printf("%-17s : %.2f$\n", "Provincial Tax", provTaxPrice);
        System.out.printf("%-17s : %.2f$\n", "Final Price", afterTax);
        
        
    }
    
}
