/*
 * Mouner Dabjan 
 * 20/02/2020
 * The purpose of this program is to compare the square of the square root of any number
 */
package roundingerror;
import javax.swing.*;
/**
 *
 * @author User
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // the variable needed
        String input;
        double Usernumber;
        double error;
        double RoundOffError;
        
        // ask the user for the number
        input = JOptionPane.showInputDialog("Enter your number"); 
        
        // change the string to a double value
        Usernumber = Double.parseDouble(input);
      
        // store the user's number in another variable to use to calculate the round off error
        error = Double.parseDouble(input);
        
        // apply the math methods to that number ( square of the square root)
        Usernumber = Math.sqrt(Usernumber); 
        Usernumber = Math.pow(Usernumber,2);
        
        // find the round off - subtract the original from the number after the operations
       RoundOffError = Usernumber - error; 
      
       
       // print the results
        System.out.println("The square of the square root of the number input is " + Usernumber );
        System.out.println("The Round of error is " + RoundOffError);
    }
    
}
