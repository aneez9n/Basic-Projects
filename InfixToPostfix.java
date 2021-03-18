
package binaryconversion;

public class InfixToPostfix 
{
    Stack st ;
    
    public InfixToPostfix(int s)
    {
        st = new Stack(s);
    }
    public  int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 

    public void infixToPostfix(String str)
    {
        //done in lab 5 and 6.
    }
    
    public void test(String str)
    {
        char ch;    
        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            st.push(ch);
        }
        st.display();
    }
    
}
