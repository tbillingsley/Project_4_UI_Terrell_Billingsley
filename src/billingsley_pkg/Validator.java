/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package billingsley_pkg;


/**
 *
 * @author Terrell
 */
import java.util.*;
import javax.swing.*;

public class Validator {
    public static Double getValidDouble(Scanner sc, String prompt)
    {
        double d = 0;
        boolean isValid = false; //assign isValid to false
        while (isValid == false) //compare isValid is false?
        { //start of while loop
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
               d=sc.nextDouble(); //if input is an integer, assign the integer to d
               isValid = true;
            }
            else
            {
                System.out.println("Invalid input. Try again. \n");
            }
            //clear user input from memory
            sc.nextLine(); //discard invalid input
        }
        
        return d;
    } //end of isValidDouble method

    static boolean isDoubleTextField(JTextField jTextField1, String oops_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
