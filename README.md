# Java Basics – Initial Programs

This repo contains my first steps with Java 🚀  
I’m learning the basics of the language, OOP concepts, and preparing for DSA.  

## How to Run
1. Compile the program:
   ```bash
   javac Calculator.java

## Contents
1. `Matrix.java` → Transpose of a matrix
2. `Calculator.java` → Simple calculator with add, sub, mul, div methods
3.  `TwoSum.java` -> O(n) solution using HashMap instead of 2 for loops
4.  `PlusOne.java` -> This is problem number 66 on leetcode. 
   We get an integer array as input and we have to add 1 to the number and return the changed array. For example: [1,2,3]->[1,2,4]
   - I used a simple logic wherein these things are checked:
      - if the number is less than 9, then just add 1
      - if the number is 9, then change that to 0 and continue the loop
      - if all the numbers are 9, then we will have to create a new array with size n+1 and then make the 0th index as 1
5. `ArrayStringSort.java` -> This problem is for sorting an integer array, a string array and just a string itself. It uses pre-defined method (methods are assoicated with objects while functions are not) to do the same and prints the output.
6. `SumOfArray.java` -> This is a simple for loop based program that calculates the sum of the digits in an array. The higher implementation of this program is the `TwoSum.java` which is alredy in this repo!
7. `Formatting.java` -> Since I had trouble while solving a `double` formatting easy question, I typed out this simple program to remember that it is in fact pretty simple.
8. `CompareTo.java` -> I found out the proper functioning of the `compareTo` function in java and wanted to check how I can write a program based on it. So, this program will be for checking if the given 3 strings are in lexicographic order using compareTo. Normally we could have just used `Arrays.sort()` method to sort the strings easily, but let's check out the use of this compare to function!
9. `Largest.java` -> This is a simple problem to find the largest element in an array
10. `SecondLargest.java` -> I kept making a mistake because I didnt update the value of secondmax. So it kept being forgotten. When i get a new maximum value, the previous maximum becomes the secondmax value.
11. `ReverseString.java` -> I did it normally by creating a stringbuilder. but we could use two pointers to do the same. but i used that approach for the next problem.
12. `StringPalindrome.java` -> This i used two pointers method to solve and I added my own edge case wherein i wanted to ignore the case of the string. I directly converted the string to a new lowercase string. instead we could also use `Character.toLowerCase()` for the same.
13. `MoveZeros.java` -> I first used two pointer approach but then realized it want necessary. Then i used a new approach called the Slow and Fast pointer. so `i` moves slow whereas `left` moves fast. `i` scans every element, but `left` only looks for the next non-zero element.
14. `ArraySorted.java` -> This was pretty simple. I used a boolean variable and solved it. We can do so without boolean as well. Instead we just check each number input and return false if it isnt greater than the previous one. 
15. `RemoveDuplicates.java` -> This was difficult because I kept messing up the `left` and `i` pointers. It basically uses 2 pointers where one reads and the other checks where to write the new element. We check one element with the next until both are not equal are being equal. if they are not equal we replace the initial value with the new element
16. `RemoveElement.java` -> played with the same pattern as remove duplicates, except here we checked the value that was given
17. `DutchNationalFlag.java` -> this was a new concept for 3-way partitioning where we used 3 variables, namely low, mid and high. `mid` acted as the scanner 
18. `SlidingWindow.java` -> a new pattern that i learned and it was really interesting for a fixed sized window. 
19. `Kadanes.java` -> kadanes algorithm is very easy to use and can be helpful for cases where we have to find the max/min subarray. it doesnt have a fixed boundary or window size and is therefore different from sliding window. 
20. `RunningMin.java` -> this pattern is useful for questions where we require the best possible scenario like keeping track of the least value till a specific element and calculating the best profit of all these.
21. `BinarySearch.java` -> used when searching for a specific number out of a sorted array. we use low, mid and high variables for the same.
22. `HashingMap.java` -> just a simple usage of hashmap
23. `FirstDup.java` -> using hashset we can easily find the first repeating element.