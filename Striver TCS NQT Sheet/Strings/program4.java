/*
Problem Statement: Given a String, write a program to remove vowels from the String.

Input: str = “take u forward”
Output: "tk  frwrd" 
Explanation: All vowels are removed from the given String.

Input: str = “I am very happy today” 
Output: "m vry hppy tdy"
Explanation: All vowels are removed from the given String.

*/
public class program4 {
    public static void main(String[] args) {
        System.out.println(removeVowels("take u forward"));
        System.out.println(removeVowels("I am very happy today"));
    }
    
    static String removeVowels(String str) {
        int n = str.length();
        str = str.toLowerCase();

        String cleaned = "";

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            } else {
                cleaned += ch;
            }
        }

        return cleaned.trim();
    }
}
