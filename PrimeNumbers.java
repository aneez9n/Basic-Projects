
package primenumbers;
import java.util.Scanner;

public class PrimeNumbers 
{
//programm that finds the prime numbers within in a given range and its sum.
    
    public static void main(String[] args) 
    {   
        Scanner input = new Scanner(System. in);
        System.out.println("enter a start number ");
        int start = input.nextInt();
        System.out.println("enter a start number ");
        int end = input.nextInt();

        int sum= 0;
        
       for(int i=start; i <=end; i++ )
       {   
           boolean flag = true;
           for (int j=2; j<= i-1; j++)
           {
               if (i%j==0)
               {
                   flag = false;
                   break;
               }
            }
           if(flag ==true)
           {    
               sum+=i;
               System.out.println("Prime number is " +i);
            }
        } System.out.println(" the sum of Prime number is "+ sum);
    }
}
