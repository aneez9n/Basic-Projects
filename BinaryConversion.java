
package binaryconversion;
import java.util.Scanner;

public class BinaryConversion {

    public static void main(String[] args) //manage accordingly.
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Size Of the Stack : ");
        int s = input.nextInt();
        //Conversion con = new Conversion(s);
        InfixToPostfix in = new InfixToPostfix(s);
        //palindrome pl = new palindrome(s);
        
        //System.out.print("Enter a Number to Convert : ");
        //int num = input.nextInt();
        
        //con.conversion(num);
        in.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i");
        //in.test("((a+b)*(c/d))");
        
        //System.out.print("Enter a String : ");
        //String str = input.next();
       // pl.checkPalindrome(str);
    }
    
}
