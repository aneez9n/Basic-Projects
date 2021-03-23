
package scope_operator_validation;
import java.util.Scanner;

public class Scope_Operator_Validation 
{

    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the expected size of the expression to be checked ");
        int  s = in.nextInt();
        
        
        
        System.out.println("Enter the expression to be checked ");
        String Expression = in.next();
        
        Validation_checking vd = new Validation_checking();
        vd.validation(Expression);
        
        //something is wrong
        
        
    }

}
