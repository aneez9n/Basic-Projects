
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author admin
 */
public class AgeInputVer2 
{
    private static final String DEFAULT_MESSAGE = "Your age: ";
    private Scanner scanner;
    
    public AgeInputVer2()
    {
        scanner = new Scanner(System.in);
    }
    public int getAge() 
    {
        return getAge(DEFAULT_MESSAGE);
    }
  
    public int getAge(String prompt) 
    {
        int age=0;
        boolean keepGoing = true;
        while (keepGoing) 
        {
            System.out.print(prompt);
            try 
            {
                age = scanner.nextInt();
                keepGoing = false;
            } 
            catch (InputMismatchException e)
            {
                scanner.next(); //remove the leftover garbage
                //from the input buffer
                System.out.println("Invalid Entry.Please enter digits only.");
            }
        }
        return age;
    }
    
}