
/**
 * Use Case 9 : Recursive Palindrome Checker
 * 
 * 
 * Description :
 * This class checks whether a string is palindrome
 * using Recursion
 * 
 * 
  
   Characters are compared from the outer positions
   moving inward using recursive calls
   

 * 
 * Base Case:
 * 
 * --All characters are matched or
 * -- mismatched found
 * 
 * This shows divide and conquer
 * using method recursion
 
 * 
 * 
 * Author  : Sushma Sree
 * Version : 9
 * 
 */

import java.util.*;



public class UseCaseNinePalindromeCheckerApp 
{
    public static void main(String args[]) 
    {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        
        boolean isPalindrome=check(s,0,s.length()-1);

        
         
         
                

        
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
    
    private static boolean check(String s,int start,int end)
    {
    	  if(s.charAt(start)!=s.charAt(end))
    	  {
    		  return false;
    	  }
    	  else if(start>end)
    	  {
    		  return true;
    	  }
    	  
    	  return check(s,start+1,end-1);
    }
}
