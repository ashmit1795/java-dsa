/*
Problem Statement: Given a string, print non-repeating characters of the string.

Example 1:
Input:
 string = "google"  
Output:
 l,e  
Explanation:
  Non-repeating characters are l, e.

Example 2:
Input:
 string = "yahoo"  
Output:
 y,a,h  
Explanation:
  Non-repeating characters are y, a, h.
*/

import java.util.HashSet;

class program12 {
    public static void main(String[] args) {
        printUniqueChar("yahoo");
    }
    
    static void printUniqueChar(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (set.contains(ch)) {
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }

        System.out.println(set);
    }
}
