package palindrome;
/**
 * Use Case 3 : Palindrome Check Using String Reverse
 * 
 * 
 * Description :
 * This class checks whether a string is palindrome
 * by reverse the String and 
 * Compare it with original value
 * 
 * 
 * Application,
 * --Iterates the string in reverse order
 * --Builds a reverse version
 * --Compares original and reversed strings
 * --Displays result
 * 
 * 
 * Author  : Sushma Sree
 * Version : 3
 * 
 */

import java.util.*;



public class UseCaseThreePalindromeCheckerApp 
{
    public static void main(String args[]) 
    {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(s).reverse().toString();

        System.out.print("Is this a Palindrome ? ");
        if (s.equals(reversed)) 
        {
            System.out.println("True");
        } 
        
        else 
        {
            System.out.println("False");
        }
    }
}
