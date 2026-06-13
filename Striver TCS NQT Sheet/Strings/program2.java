/*
Problem Statement: Given a string, write a program to count the number of vowels, consonants, and spaces in that string.

Example 1:
Input: string str="Take u forward is Awesome"
Output: 
Vowels: 10
Consonants: 11
White spaces: 4

Example 2:
Input: string str="India won the cricket match"
Output:
Vowels: 8
Consonants: 15
White spaces: 4
*/

class program2 {
    public static void main(String[] args) {
        count("Take u forward is Awesome");
        System.out.println();
        count("India won the cricket match");
    }
    
    static void count(String str) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        int spacesCount = 0;

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } else if (ch == ' ') {
                spacesCount++;
            } else if(ch >= 'a' && ch <= 'z' ) { // !
                consonantsCount++;
            }
        }

        System.out.println("Vowels = " + vowelsCount);
        System.out.println("Consonants = " + consonantsCount);
        System.out.println("Whitespaces = " + spacesCount);
    }
}
