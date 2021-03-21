/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.*;

public class ExceptionHandling 
{
    public static void main(String[] args) 
    {
        GregorianCalendar today;
        int age, thisYear, bornYr;
        String answer;
        Scanner scanner = new Scanner(System.in);
        //AgeInputVer1 input = new AgeInputVer1( );
        AgeInputVer2 input = new AgeInputVer2();
        //AgeInputVer3 input = new AgeInputVer3();
        age = input.getAge("How old are you? ");
        today    = new GregorianCalendar( );
        thisYear = today.get(Calendar.YEAR);
        bornYr   = thisYear - age;
        System.out.print("Already had your birthday this year? (Y or N) : ");
        answer = scanner.next();
        if (answer.equals("N") || answer.equals("n") )
        {
            bornYr--;
        }
        System.out.println("\nYou are born in " + bornYr);

    
    }
    
}
