/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortedinsertionpractice;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eapple
 */
public class Sortedinsertionpractice 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner input = new Scanner(System. in);
        System.out.println("enter size of your array : ");
        int size = input.nextInt();
        MyArray  objectarray = new MyArray(size);
        
        
        
         
        
        
        boolean run = true ;
        
        int operation=0;
        while(operation!=7)
        { 
            
            
            
            
            
            
           
            System.out.println(" \n HELLO AGAIN \n");
            System.out.println("press 1 to fill the array with elements ");
            System.out.println("press 2 to find an element in the array ");
            System.out.println("press 3 to delete an element from the array ");
            System.out.println("press 4 to modify the array ");
            System.out.println("press 5 to show the array ");
            System.out.println("press 6 to insert to the array ");
            System.out.println("press 7 to EXIT the Operations ");
            
            try
            {
                System.out.println("WHAT OPERATION DO YOU WANT TO DO? ");
                operation = input.nextInt();
            }
            catch (InputMismatchException e)
            {
                input.next(); //remove the leftover garbage
                //from the input buffer
                System.out.println("Invalid Entry Please enter  only from 1 to 6.");
            }
            
            
          
                
            
            
            
            if(operation==1)
            {
               objectarray.FillSortedArray();
            }
            if(operation==2)
            {
                if(objectarray.fillindex ==-1)
                {
                    System.out.println(" Array is empty yet ! ");
                    run = false;
                    
                }
                else
                {
                    objectarray.FindElement();
                }
            }
            if(operation==3)
            {
                if(objectarray.fillindex==-1)
                {
                    System.out.println(" Array is empty yet ! ");
                    run = false;
                    
                }
                else
                {
                    objectarray.DeleteElement();
                }
            }
            if(operation==4)
            {
                if(objectarray.fillindex==-1)
                {
                    System.out.println(" Array is empty yet ! ");
                    run = false;
                    
                }
                else
                {
                    objectarray.Modify();
                }
            }
            if(operation==5)
            {
                if(objectarray.fillindex==-1)
                {
                    System.out.println(" Array is empty yet ! ");
                    run = false;
                    
                }
                else
                {
                    objectarray.display();
                }
            }
            if(operation==6)
            {
                if(objectarray.fillindex==-1)
                {
                    System.out.println(" Array is empty yet ! ");
                    run = false;
                    
                }
                else
                {
                    objectarray.insert();
                }
            }
            
            if(operation==7)
            {
                System.out.println("Thanks for Using Array Application ");
                break;
            }
        }
    }
}
