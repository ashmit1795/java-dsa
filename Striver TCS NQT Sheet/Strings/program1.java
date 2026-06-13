/*
Problem Statement: Given a string, check if the string is palindrome or not. A string is said to be palindrome if the reverse of the string is the same as the string.

Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

Example 2:
Input: Str = “TAKE U FORWARD”
Output: Not Palindrome
Explanation: String when reversed is not the same as string.
*/

class program1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("malayalam"));
        System.out.println(isPalindrome("ABCDCBA"));
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome("Madam, in Eden, I'm Adam"));
    }

    // static boolean isPalindrome(String str) {
    //     int left = 0, right = str.length() - 1;

    //     while (left < right) {
    //         if (!Character.isLetterOrDigit(str.charAt(left)))
    //             left++;
    //         else if (!Character.isLetterOrDigit(str.charAt(right)))
    //             right--;
    //         else if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
    //             return false;
    //         } else {
    //             left++;
    //             right--;
    //         }
    //     }

    //     return true;
    // }

    static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        String cleaned = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                cleaned += ch;
            }
        }
    
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }
    
        return cleaned.equals(reversed);
    }
    
    static String reverseString(String str) {
        StringBuilder rev = new StringBuilder(str);
        return rev.reverse().toString();
    }
}
