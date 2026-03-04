package palindrome;
/**
 * Use Case 12 : Strategy Pattern for Palindrome Algorithms (Advanced)
 *
 * Description :
 * This class checks how different palindrome
 * validation algorithms can be selected dynamically
 * at run time using Design Pattern
 *
 * Logic:
 * - Defines a PalindromeStrategy interface
 * - Implements a concrete Stack Based Strategy
 * - Injects the strategy at run time
 * - Executes the selected algorithm
 *
 * Author  : Sushma Sree
 * Version : 12
 */

import java.util.*;


interface PalindromeStrategy 
{
    boolean check(String input);
}

// Stack Based Approach
class StackStrategy implements PalindromeStrategy 
{
    @Override
    public boolean check(String input) 
    {
        // Preprocess: remove non-alphanumeric and lowercase
        String processed = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        for (char c : processed.toCharArray()) 
        {
            stack.push(c);
        }

        // Compare by popping from stack
        for (char c : processed.toCharArray()) 
        {
            if (c != stack.pop()) 
            {
                return false;
            }
        }
        return true;
    }
}

//  Two-pointer palindrome check
class TwoPointerStrategy implements PalindromeStrategy 
{
    @Override
    public boolean check(String input) 
    {
        String processed = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = processed.length() - 1;
        while (start < end) 
        {
            if (processed.charAt(start) != processed.charAt(end)) 
            {
                return false;
            }
            
            start++;
            end--;
        }
        return true;
    }
}

// Context class that uses a strategy
class PalindromeService 
{
    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public PalindromeService(PalindromeStrategy strategy) 
    {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) 
    {
        return strategy.check(input);
    }
}

// Main Application
public class UseCaseTwelvePalindromeCheckerApp 
{
    public static void main(String args[]) 
    {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Choose strategy dynamically
        PalindromeService service = new PalindromeService(new StackStrategy());
        boolean result = service.checkPalindrome(s);

        System.out.print("Is this a Palindrome ? ");
        System.out.println(result ? "True" : "False");

        // Try another strategy
        PalindromeService service2 = new PalindromeService(new TwoPointerStrategy());
        boolean result2 = service2.checkPalindrome(s);

        System.out.print("Using Two-Pointer Strategy: ");
        System.out.println(result2 ? "True" : "False");
    }
}
