
/**
 * Use Case 4 : Character Array-Based Palindrome Check
 * 
 * 
 * Description :
 * This class checks whether a string is palindrome
 * by converting the String to CharacterArray and 
 * Comparing the characters using the two-pointer-technique
 * 
 * 
 * Application,
 * --Converts string to char Array
 * --Uses start and end pointers
 * --Compares characters efficiently
 * --Displays result
 * 
 * 
 * Author  : Sushma Sree
 * Version : 4
 * 
 */

import java.util.*;



public class UseCaseFourPalindromeCheckerApp 
{
    public static void main(String args[]) 
    {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        
        boolean isPalindrome=true;

        // convert to character array
        char ch[]=s.toCharArray();
        
        int start=0;
        int end=ch.length-1;
        
        
        while(start<end)
        {
        	   if(ch[start]!=ch[end])
        	   {
        		   isPalindrome=false;
        		   break;
        	   }
        	   start++;
        	   end--;
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
