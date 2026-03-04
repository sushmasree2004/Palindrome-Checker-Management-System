
/**
 * Use Case 10 : Case-Insensitive & Space-Ignored Palindrome
 *
 * Description :
 * This class checks whether a string is palindrome
 * after preprocessing the input string.
 *
 * Logic:
 * -- Remove spaces and symbols
 * -- Convert to lower case
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * Author  : Sushma Sree
 * Version : 10
 */

import java.util.*;

public class UseCaseTenPalindromeCheckerApp 
{
    public static void main(String args[]) 
    {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Preprocess: remove non-alphanumeric characters and convert to lowercase
        
        String processed = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the processed string
        
        String reversed = new StringBuilder(processed).reverse().toString();

        System.out.print("Is this a Palindrome ? ");
        if (processed.equals(reversed)) 
        {
            System.out.println("True");
        } 
        else 
        {
            System.out.println("False");
        }
    }
}
