/*
Problem Statement: Write a program to remove all characters from a string except alphabets in a given string.

Input: str = "take12% *&u ^$#forward”
Output: “takeuforward”
Explanation: All characters except alphabets are removed.

Input: str1 = “Java&C++" 
Output: “JavaC”
Explanation: All characters except alphabets are removed.
*/
public class program6 {
    public static void main(String[] args) {
        System.out.println(clean("take12% *&u ^$#forward"));
    }
    
    static String clean(String str) {
        int n = str.length();

        String cleaned = "";

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)) {
                cleaned += ch;
            }
        }

        return cleaned;
    }
}
