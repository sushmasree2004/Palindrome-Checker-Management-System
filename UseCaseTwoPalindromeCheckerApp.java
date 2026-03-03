package palindrome;
/**
 * Use Case 2 : Hardcoded Palindrome Validation 
 * 
 * 
 * Description :
 * This class represents the basic palindrome validation using
 * a hardcoded string value
 * 
 * 
 * Application,
 * --Stores a predefined string
 * --Compares characters from both ends
 * --Determines whether the string is Palindrome 
 * --Display the result on Console
 * 
 * 
 * Author  : Sushma Sree
 * Version : 2
 */

import java.util.*;
public class UseCaseTwoPalindromeCheckerApp 
{
		    public static void main(String args[]) 
		    {
		    	    System.out.println("Enter the String : ");
	            Scanner sc = new Scanner(System.in);
	            String s = sc.nextLine();
	            
	            
	            boolean isPalindrome = true;

	        for (int i = 0; i < s.length() / 2; i++) 
	        {
	            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) 
	            {
	                isPalindrome = false;
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
	            System.out.println("Fale ");
	        }
	    }
	

}
