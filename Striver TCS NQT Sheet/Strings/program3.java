/*
Problem Statement: Given a character, Find the ASCII value of the character.

Example 1:
Input:
    c = 'A'  
Output:
    65  
Explanation:
    The ASCII value of 'A' is 65.

Example 2:
Input:
    c = 'e'  
Output:
    101  
Explanation:
    The ASCII value of 'e' is 101.
*/

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        System.out.println("The ASCII value of '" + c + "' is " + (int) c + ".");
        
        sc.close();
    }
}
