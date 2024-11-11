/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personalnfo;
import java.util.Scanner;

/**
 *
 * @author Le Nguyen Tan Alex
 */
public class Personalnfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = userInput.nextLine();
        System.out.print("Please enter your age: ");
        String age = userInput.nextLine();
        System.out.print("Please enter your gender: ");
        String gender = userInput.nextLine();
        System.out.print("Please enter you department: ");
        String depart = userInput.nextLine();
        System.out.print("Please enter the value of PI (3.1415926): ");
        String PI = userInput.nextLine();

        System.out.printf("%-15s : %s\n%-15s : %s\n%-15s : %s\n%-15s : %s\n%-15s : %s\n",
                "Name", name,"Age",  age,"Gender", gender,"Departement", depart, "PI", PI);
    }
    
}
