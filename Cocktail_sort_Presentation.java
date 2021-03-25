
package cocktail_sort_presentation;

import java.util.Scanner;


public class Cocktail_sort_Presentation 
{

    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        Algorithms_class sort = new Algorithms_class();
        System.out.print("Enter Number of Element in Data Set : ");
        int size = input.nextInt();
        int mstrList[];
        int bblList[];
        int cocktaillist[];
        int comblist[];
        
        
        //Create a Master List
        mstrList = new int[size];
        bblList = new int[size];
        comblist = new int[size];
        
        cocktaillist = new int[size];
        for(int i=0; i<size; i++)
        {
            mstrList[i] = (int)(Math.random()*100);
            bblList[i] = mstrList[i];
            comblist[i] = mstrList[i];
            cocktaillist[i] = mstrList[i];
        }
        
        char choice;            
        while(true)
        {
            System.out.println("\n########## SORTING MENUE ##########");
            System.out.println("\t1. Bubble Sort    (B/b) ");
            System.out.println("\t2. Cocktail Sort (C/c) ");
            System.out.println("\t2. Report  (R/r) ");
            System.out.println("\t2. Comb Sort (m/M) ");
            System.out.println("\t5. Exit Programe  (E/e) ");
            System.out.println("------------------------------------");
            System.out.print("Enter Your Choice (C/B/R) : ");
            
            choice =  (input.next()).charAt(0);
            
            if(choice == 'B' || choice == 'b')     
            {
                // COMMENT THE ... LINES FOR DIG-DATA
               // System.out.println("\n------------------------------------"); //.....
               // System.out.print("\nList Before Sort       : ");             //.....
              //  sort.PrintList(bblList);                                    //.....
                sort.BubbleSort(bblList);            
               // System.out.print("\nList After Bubble Sort : ");           //.....
                //sort.PrintList(bblList);                                  //.....
                //System.out.println("\n------------------------------------"); //.....
                
            }
            else if(choice == 'C' || choice == 'c') //make it cocktail sort 
            {
                //System.out.println("\n------------------------------------");  //.....
                //System.out.print("\nList Before Sort          : ");           //.....
                //sort.PrintList(cocktaillist);                                     //.....
                sort.CocktailSort(cocktaillist);
                //System.out.print("\nList After cocktail Sort : ");         //.....
                //sort.PrintList(cocktaillist);                                   //.....
                //System.out.println("\n------------------------------------"); //.....
                
            }
            else if(choice == 'M' || choice == 'm') //make it cocktail sort 
            {
                //System.out.println("\n------------------------------------");  //.....
                //System.out.print("\nList Before Sort          : ");           //.....
                //sort.PrintList(comblist);                                     //.....
                sort.CombSort(comblist);
                //System.out.print("\nList After cocktail Sort : ");         //.....
                //sort.PrintList(comblist);                                   //.....
                //System.out.println("\n------------------------------------"); //.....
                
            }
            
            else if(choice == 'R' || choice == 'r')
            {
                sort.PrintReport(bblList);
            }
            else
            {
                System.out.println("\n--------------------------------");
                System.out.println("Programe Exiting");
                System.out.println("\n--------------------------------");
                System.exit(0);
            }
        }
    }
}
