
/**
 * Use Case 13 : Performance Comparison
 *
 * Description :
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * Logic:
 * - Uses multiple palindrome strategy implementations
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * Author  : Sushma Sree
 * Version : 13
 */

import java.util.*;

interface PalindromeStrategy 
{
    boolean check(String input);
}

// Strategy 1: Stack-based
class StackStrategy implements PalindromeStrategy 
{
    @Override
    public boolean check(String input) 
    {
        String processed = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        
        for (char c : processed.toCharArray()) 
        	stack.push(c);
        
        for (char c : processed.toCharArray()) 
        {
            if (c != stack.pop())
            	return false;
        }
        return true;
    }
}

// Strategy 2: Two-pointer
class TwoPointerStrategy implements PalindromeStrategy 
{
    @Override
    public boolean check(String input) 
    {
        String processed = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0, end = processed.length() - 1;
        
        while (start < end) 
        {
            if (processed.charAt(start) != processed.charAt(end))
            	return false;
            
            start++;
            end--;
        }
        return true;
    }
}

// Strategy 3: Reverse-string
class ReverseStrategy implements PalindromeStrategy 
{
    @Override
    public boolean check(String input) 
    {
        String processed = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        String reversed = new StringBuilder(processed).reverse().toString();
        
        return processed.equals(reversed);
    }
}

public class UseCaseThirteenPalindromeCheckerApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String : ");
        String s = sc.nextLine();

        // List of strategies
        List<PalindromeStrategy> strategies = Arrays.asList(
            new StackStrategy(),
            new TwoPointerStrategy(),
            new ReverseStrategy()
        );

        // Run each strategy and measure performance
        for (PalindromeStrategy strategy : strategies) 
        {
            long start = System.nanoTime();
            boolean result = strategy.check(s);
            long end = System.nanoTime();
            long duration = end - start;

            System.out.println(strategy.getClass().getSimpleName() +
                " => Result: " + result +
                ", Time: " + duration + " ns");
        }
    }
}
