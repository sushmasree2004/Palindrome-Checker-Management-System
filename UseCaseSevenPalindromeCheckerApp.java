
/**
 * Use Case 7 : Deque-Based Optimized Palindrome Checker
 * 
 * 
 * Description :
 * This class checks whether a string is palindrome
 * using DEQUE(Double Ended Queue )
 * 
 * 
  
   Characters are inserted into DEQUE and
   then compared by removing elements from both ends
 * 
 * --removeFirst()
 * --removeLast()
 * 
 * This provides front-to-back efficient approach
 
 * 
 * 
 * Author  : Sushma Sree
 * Version : 7
 * 
 */

import java.util.*;



public class UseCaseOnePalindromeCheckerApp 
{
    public static void main(String args[]) 
    {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        
        boolean isPalindrome=true;

        //Create  DEQUE to Store characters
        
        Deque<Character> deque=new ArrayDeque<>();
        
        
         //push each character of the Deque
         
         for(char ch:s.toCharArray())
         {
        	    deque.addLast(ch);
         }
         
         
         // compare till deque is Empty 
         
         while(!deque.isEmpty())
         {
        	   char first=deque.removeFirst();  // front of deque
        	   char last;
        	   if(!deque.isEmpty())
        	   {
        		   last=deque.removeLast();// rear of deque
        		   if(first!=last)
            	   {
            		   isPalindrome=false;
            		   break;
            	   }
        	   }
        	   else
        	   {
        		   continue;
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
