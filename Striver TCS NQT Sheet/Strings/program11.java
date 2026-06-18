/*
Problem Statement: Problem Statement: Given a string, calculate the frequency of characters in a string.

Example 1:
Input: takeuforward
Output: a2 d1 e1 f1 k1 o1 r2 t1 u1 w1 
Explanation: Count of every character of string is printed.

Example 2:
Input: articles
Output: a1 c1 e1 i1 l1 r1 s1 t1 
Explanation: Count of every character of string is printed.
*/

import java.util.HashMap;
import java.util.Map;

class program11 {
    public static void main(String[] args) {
        countFreq("null");
    }
    
    static void countFreq(String str) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        char[] arr = str.toCharArray();
        for (char ch : arr) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println(freqMap);

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.print((char)entry.getKey() + "" + entry.getValue() + " ");
        }
    }
}
