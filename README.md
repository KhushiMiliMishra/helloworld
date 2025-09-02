# Java Basics – Initial Programs

This repo contains my first steps with Java 🚀  
I’m learning the basics of the language, OOP concepts, and preparing for DSA.  

## Contents
- `Matrix.java` → Transpose of a matrix
- `Calculator.java` → Simple calculator with add, sub, mul, div methods
- `TwoSum.java` -> O(n) solution using HashMap instead of 2 for loops
- `PlusOne.java` -> This is problem number 66 on leetcode. 
   We get an integer array as input and we have to add 1 to the number and return the changed array. For example: [1,2,3]->[1,2,4]
   - I used a simple logic wherein these things are checked:
      - if the number is less than 9, then just add 1
      - if the number is 9, then change that to 0 and continue the loop
      - if all the numbers are 9, then we will have to create a new array with size n+1 and then make the 0th index as 1
## How to Run
1. Compile the program:
   ```bash
   javac Calculator.java

