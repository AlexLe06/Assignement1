package numberconverter;
import java.util.Scanner;

/**
 *
 * @author Le Nguyen Tan Alex
 */
public class NumberConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        
        
        System.out.print("Please enter a 4-digits Octal number: ");
        String num = userInput.nextLine();
        System.out.println(" ");
        char firstNum = num.charAt(3); //starting from far right
        char secondNum = num.charAt(2);
        char thirdNum = num.charAt(1);
        char lastNum = num.charAt(0);// ending with the one the far left
        
        int firstNumInt = firstNum - '0';
        int secondNumInt= secondNum - '0';
        int thirdNumInt = thirdNum - '0';
        int lastNumInt = lastNum - '0';
        
        
        double equation = 
                (firstNumInt * Math.pow(8,0))+
                (secondNumInt * Math.pow(8,1))+
                (thirdNumInt * Math.pow(8,2))+
                (lastNumInt * Math.pow(8,3));
        
        
        System.out.printf("%-15s : %s\n", "Octal number", num);
        System.out.printf("%-15s : %.0f\n", "Decimal number", equation);
    }
    
}
