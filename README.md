# Palindrome-Checker-Management-System


Use Case 1 :Application Entry and Welcome Message

Description :
This class represents the entry point of the
Palindrome Checker Management System




Use Case 2 : Hardcoded Palindrome Validation

Description :
This class represents the basic palindrome validation using
a hardcoded string value

Application,
--Stores a predefined string
--Compares characters from both ends
--Determines whether the string is Palindrome
--Display the result on Console



Use Case 3 : Palindrome Check Using String Reverse

Description :
This class checks whether a string is palindrome
by reverse the String and
Compare it with original value

Application,
--Iterates the string in reverse order
--Builds a reverse version
--Compares original and reversed strings
--Displays result



Use Case 4 : Character Array-Based Palindrome Check

Description :
This class checks whether a string is palindrome
by converting the String to CharacterArray and
Comparing the characters using the two-pointer-technique

Application,
--Converts string to char Array
--Uses start and end pointers
--Compares characters efficiently
--Displays result



Use Case 5 : Stack-Based Palindrome Checker


Description :

This class checks whether a string is palindrome

using a Stack data Structure which follow LIFO Principle


Application,

--Pushes characters into a Stack

--Pops them in reverse order

--Compares with original sequence

--Display the result




Use Case 6 : Queue + Stack Based Palindrome Check


Description :

This class checks whether a string is palindrome

using TWO different data structure

--Queue (FIFO - First in First Out )

--Stack (LIFO - Last in First Out )

Characters are inserted into both structures and 
then compared by removing from the front of the queue 
and top of the stack


Application,

--Pushes characters into a Stack

--Pops them in reverse order

--Compares with original sequence

--Display the result






Use Case 7 : Deque-Based Optimized Palindrome Checker

Description :
This class checks whether a string is palindrome
using DEQUE(Double Ended Queue )
Characters are inserted into DEQUE and then compared by removing elements from both ends *

--removeFirst()

--removeLast()

This provides front-to-back efficient approach






Use Case 8 : Linked List-Based Palindrome Checker

Description :
This class checks whether a string is palindrome
using LinkedList
Characters are added to the list and the compared by removing elements from both ends

--removeFirst()

--removeLast()

This shows how LinkedList supports

for double ended operations




Use Case 9 : Recursive Palindrome Checker

Description :
This class checks whether a string is palindrome
using Recursion
Characters are compared from the outer positions moving inward using recursive calls

Base Case:

--All characters are matched or

-- mismatched found

This shows divide and conquer

using method recursion







Use Case 10 : Case-Insensitive & Space-Ignored Palindrome

Description :
This class checks whether a string is palindrome
after preprocessing the input string.

Logic:
-- Remove spaces and symbols
-- Convert to lower case

Example:
"A man a plan a canal Panama"



Use Case 11 : Object-Oriented Palindrome Service

Description :
This class checks whether a string is palindrome
using object-oriented design and two-pointer logic.

Logic:
Preprocess input (remove spaces/symbols, lowercase)
Initialize pointers: start = 0, end = length-1
Compare characters while moving inward



Use Case 12 : Strategy Pattern for Palindrome Algorithms (Advanced)

Description :
This class checks how different palindrome
validation algorithms can be selected dynamically
at run time using Design Pattern

Logic:
Defines a PalindromeStrategy interface
Implements a concrete Stack Based Strategy
Injects the strategy at run time
Executes the selected algorithm




Use Case 13 : Performance Comparison

Description :
This class measures and compares the execution
performance of palindrome validation algorithms.

Logic:
Uses multiple palindrome strategy implementations
Captures execution start and end time
Calculates total execution duration
Displays benchmarking results


Author : Sushma Sree


