package palindrome;
/**
 * Use Case 11 : Object-Oriented Palindrome Service
 *
 * Description :
 * This class checks whether a string is palindrome
 * using object-oriented design and two-pointer logic.
 *
 * Logic:
 * - Preprocess input (remove spaces/symbols, lowercase)
 * - Initialize pointers: start = 0, end = length-1
 * - Compare characters while moving inward
 *
 * Author  : Sushma Sree
 * Version : 11
 */

import java.util.*;

class PalindromeService 
{
    // checks whether the string is palindrome using two pointers
    public boolean checkPalindrome(String s) 
    {
    	
        // Preprocess: remove non-alphanumeric characters and convert to lower case
        String processed = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = processed.length() - 1;

        while (start < end) 
        {
            if (processed.charAt(start) != processed.charAt(end)) 
            {
                return false; // mismatch found
            }
            start++;
            end--;
        }
        
        return true; // all characters matched
    }
}

public class UseCaseTenPalindromeCheckerApp 
{
    public static void main(String args[]) 
    {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(s);

        System.out.print("Is this a Palindrome ? ");
        if (result) 
        {
            System.out.println("True");
        } 
        else 
        {
            System.out.println("False");
        }
    }
}
