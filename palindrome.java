
package binaryconversion;

public class palindrome
{
    Stack st ;
    
    public palindrome(int s)
    {
        st = new Stack(s);
    }
    
    void checkPalindrome(String str){
        String newStr="";
        for (int i=0; i<str.length(); i++){
            st.push(str.charAt(i));
        }
        for(int j=st.top; j>=0; j--){
            newStr += st.arr[j];
        }
        
        if(str.equals(newStr))
            System.out.println("True");
        else 
            System.out.println("False");
        
    }
    
}
