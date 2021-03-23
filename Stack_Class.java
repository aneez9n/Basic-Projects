
package scope_operator_validation;

public class Stack_Class 
{
    int size;
    char List[];
    int top;
    
    public Stack_Class(int s)
    {
        this.size = s;
        this. List = new char[size];
        this.top = -1;
    }
    // underflow
    public boolean is_empty()
    {
        return top == -1;
    }
    //oveflow
    public boolean is_full()
    {
        return top == List.length - 1;
    }
    //insertion
    public void push(char num)
    {
        if(is_full())
        {
           // System.out.println(" can not add, already full");
        }
        else
        {
            
            top++;
            List[top] = num;
        }
    }
    //deletion
    public char pop()
    {
        char entry = 'm';
        if(is_empty())
        {
           //System.out.println("Stack is empty. Can not remove element.");
        }
        else
        {
            entry = List[top--];
        }
        return entry;
    }
    public char peak()
    {
        return List[top];
    }
}
