
/**
 * Use Case 5 : Stack-Based Palindrome Checker
 * 
 * 
 * Description :
 * This class checks whether a string is palindrome
 * using a Stack data Structure which follow LIFO Principle

 * 
 * 
 * Application,
 * --Pushes characters into a Stack
 * --Pops them in reverse order
 * --Compares with original sequence
 * --Display the result
 * 
 * 
 * Author  : Sushma Sree
 * Version : 5
 * 
 */

import java.util.*;



public class UseCaseFivePalindromeCheckerApp 
{
    public static void main(String args[]) 
    {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        
        boolean isPalindrome=true;

        //Create  a Stack to store characters
         Stack<Character>  st=new Stack<>();
         
         
         //push each character of he string into stack
         
         for(char ch:s.toCharArray())
         {
        	    st.push(ch);
         }
         
         
         //Iterate again through original string
         
         for(char ch: s.toCharArray())
         {
        	     char top=st.pop();
        	     if(ch!=top)
        	     {
        	    	   isPalindrome=false;
        	    	   break;
        	     }
         }
         
         
        
        

        
        System.out.print("Is this a Palindrome ? ");

        if (isPalindrome) 
        {
            System.out.println("True ");
        } 
        else 
        {
            System.out.println("False ");
        }
        
    }
}
