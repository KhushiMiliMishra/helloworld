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


