
/**
 * Use Case 8 : Linked List-Based Palindrome Checker
 * 
 * 
 * Description :
 * This class checks whether a string is palindrome
 * using LinkedList
 * 
 * 
  
   Characters are added to the list and the 
   compared by removing elements from both ends
   

 * 
 * --removeFirst()
 * --removeLast()
 * 
 * This shows how LinkedList supports 
 * for double ended operations
 
 * 
 * 
 * Author  : Sushma Sree
 * Version : 8
 * 
 */

import java.util.*;



public class UseCaseEightPalindromeCheckerApp 
{
    public static void main(String args[]) 
    {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        
        boolean isPalindrome=true;

        //Create   to LinkedList tore characters
        
        LinkedList<Character> list=new LinkedList<>();
        
        
         //push each character to LinkedList
         
         for(char ch:s.toCharArray())
         {
        	    list.addLast(ch);
         }
         
         
         // compare till  one or zero elements remain
         
         while(!list.isEmpty())
         {
        	   char first=list.removeFirst();  // front of list
        	   char last;
        	   if(!list.isEmpty())
        	   {
        		   last=list.removeLast();// rear of list
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
