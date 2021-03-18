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
public class MyArray 
{
    int fillindex = -1;
    Scanner input = new Scanner(System. in);
    int size;
    int list[];
    public MyArray(int s)
    {
        size = s;
    }
    public void FillSortedArray()
    {
        list = new int [size];
       for(int i=0; i<list.length; i++)
        {
            int baag = 0;
            System.out.println("enter "+i+" element of your array");
            int num = input.nextInt();
            list[i] = num;
            fillindex++;
            try
            {
                if(fillindex == -1)
                {
                    System.out.println("The array is empty filhal ");
                }
                else if(fillindex == list.length - 1)
                {
                    System.out.println("you can not insert, because the array is full fihal");
                }
                else
                {
                    for(int j =0; j<=list.length; j++)
                    {
                        for(int k=j+1; k<=list.length; k++)
                        {
                            if(list[j] > list[k])
                            {
                                // phyton logic list[j] + list[k] == list[k] + list[j];
                            }
                        }
                    }
                }
            }
            catch (InputMismatchException e) 
            {
            
                input.next();
                System.out.println("Invalid input in sorting method");
            }
        }
    }
    
    public void FindElement()
    {
        try
        {
            int flag=0;
            System.out.println("which element you want to find");
            int find = input.nextInt();
            for(int i =0; i<list.length; i++)
            {   
                if(list[i]==find)
                {
                    System.out.println(find +" is found at index "+i);
                    flag = 1;
                }
            }
            if(flag ==0)
            {
                System.out.println(find +" is not found in the array");
            }
        }
        catch (InputMismatchException e) 
        {
            
            input.next();
            System.out.println("Input is invalid.\n" +"Please enter digits only");
        }
    }
    
    public void DeleteElement()
    {
        try
        {
            System.out.println("which element you want to delete");
            int element = input.nextInt();
            int deleteindex = -1;
            for(int i = 0; i<list.length; i++)
            {                    
                if(element == list[i])
                {
                    list[i] = 0;
                    deleteindex = i;
                    fillindex --;
                    break;
                }
            }
            if (deleteindex != -1)
            {
                int key = 0;
                for(int i = deleteindex; i<list.length; i++)
                { 
                    if(i == deleteindex)
                    {
                        key = list[i+1];
                        list[i]= key;
                    }
                    else//below here indent
                    {
                        if(i==list.length-1)
                        {
                            list[i] = -1;
                        }
                        else
                        {
                            key = list[i+1];
                            list[i] = key;
                        }
                    }
                }
            }
            else
            {
                System.out.println("could not find the element " + element);
            }
        }
        catch (InputMismatchException e) 
        {
            input.next();
            System.out.println("invalid inputtttttttt ");
        }
    }
    void Modify()
    {
        try
        {
            System.out.println("at what index you want to make change");
            int index = input.nextInt();
            System.out.println("what do you want to insert at " + index);
            int modify = input.nextInt();
            for(int i=0; i<list.length; i++)
            {
                if (list[index]== i)
                {
                    list[index]= modify;
                    break;
                }
            }
            }
            catch(Exception e)
            {
                System.out.println("Array na bahar shwi rora !!! \n sam shaaaa !!  ");
            }
            }   
            public void display()
            {
                System.out.println("array elements are: ");
                for(int i=0;i<list.length;i++)
                {
                 System.out.print(list[i]+" ");
                }
    }
            
    public void insert()
    {
        try
        {
            System.out.println("what do you want to insert " );
            int insert = input.nextInt();
            if(fillindex == -1)
            {
                System.out.println("The array is empty ");
            }
            else if(fillindex == list.length-1)
            {
                System.out.println("you can not insert, because the array is full ");
                
            }
            else if(fillindex < list.length)
            {
                fillindex ++;
                list[fillindex] = insert;
            }
        }
        catch(Exception e)
        {
            {
                System.out.println("wran input !!!!!!!!!!!!!!!!  ");
            }
        }
    }
}
