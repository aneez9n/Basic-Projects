
package exceptionhandling;

import java.util.*;

public class AgeInputVer1 
{
    private static final String DEFAULT_MESSAGE = "Your age: ";
    private Scanner scanner;
    
    public AgeInputVer1()
    {
        scanner = new Scanner(System.in);
    }
    public int getAge() 
    {
        return getAge(DEFAULT_MESSAGE);
    }
    
    public int getAge(String prompt) 
    {
        System.out.print(prompt);
        int age = scanner.nextInt();
        return age;
    }

    
}
