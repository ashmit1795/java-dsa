/*
Problem Statement: Given an algebraic expression, write a program to remove brackets from the algebraic expression.

Input: “a+((b-c)+d)”
Output: “a+b-c+d”
Explanation: Removed all the brackets from the algebric expression.

Input: “(((a-b))+c)” 
Output: “a-b+c”
Explanation: Removed all the brackets from the algebric expression.
*/

class program8 {
    public static void main(String[] args) {
        System.out.println(removeBrackets("a+((b-c)+d)"));
    }
    
    static String removeBrackets(String str) {
        int n = str.length();
        String cleaned = "";
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch != '(' && ch != ')') {
                cleaned += ch;
            }
        }

        return cleaned.trim();
    }
}
