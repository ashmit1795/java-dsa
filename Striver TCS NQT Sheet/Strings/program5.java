/*
Problem Statement: Given a string, write a program to remove all the whitespaces from the string.

Input:  str = “take U forward”
Output: "takeUforward"
Explanation: All the whitespaces are removed.

Input: str = “How are you doing”
Output: "Howareyoudoing"
Explanation: All the whitespaces are removed.
*/

class program5 {
    public static void main(String[] args) {
        System.out.println(removeSpaces("How are you doing?"));
    }
    
    static String removeSpaces(String str) {
        int n = str.length();

        String cleaned = "";
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch != ' ')
                cleaned += ch;
        }

        return cleaned.trim();
    }
}
