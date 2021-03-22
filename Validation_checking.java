
package scope_operator_validation;


public class Validation_checking 
{
    int s;
    Stack_Class st = new Stack_Class(s);
    public void validation(String exp)
    {
        for(int i = 0; i<exp.length(); i++)
        {
            char temp = exp.charAt(i);
            if(temp == '(' || temp == ')' || temp == '{' || temp == '}' || temp == '[' || temp == ']')
            {
               if(temp == '(' || temp == '{' || temp == '[')
               {
                   st.push(temp); //append oppening operator to the stack
               }
               else //closing
               {
                   if(st.is_empty())
                   {
                       System.out.println("Invalid 1");
                   }
               // do it on monday..
               }
            }
            else
            {
                i++;
            }
        }
        
    }
//fix this 
}
