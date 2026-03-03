
/**
 * Use Case 6 : Queue + Stack Based Palindrome Check
 * 
 * 
 * Description :
 * This class checks whether a string is palindrome
 * using TWO different data structure
 * 
 * 
 * --Queue (FIFO - First in First Out )
 * --Stack (LIFO - Last in First Out )
   
   Characters are inserted into both structures and then
   compared by removing from the front of the queue and
   top of the stack
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
 * Version : 6
 * 
 */

import java.util.*;



public class UseCaseSixPalindromeCheckerApp 
{
    public static void main(String args[]) 
    {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        
        boolean isPalindrome=true;

        //Create  a Stack to store characters in LIFO Order
         Stack<Character>  st=new Stack<>();
         
         
         
       //Create  a Queue to store characters in FIFO Order        
         Queue<Character> q=new LinkedList<>();
         
         
         
         
         
         //push each character of the string into Stack and Queue
         
         for(char ch:s.toCharArray())
         {
        	    st.push(ch);
        	    q.offer(ch);
         }
         
         
         // compare till queue is Empty 
         
         while(!q.isEmpty())
         {
        	   char top=st.pop();  // top of the stack
        	   char front=q.poll();// front of the queue
        	   
        	   if(top!=front)
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
