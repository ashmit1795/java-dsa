/*
Problem Statement: Write a program that reverses a given string (in-place).

Input :  "hello"
Output :  "olleh"
Explanation :  Each character of the string is reversed.

Input :  "I am iron man"
Output :  "nam nori ma i"
Explanation :  Each character of the string is reversed.
*/

public class program7 {
    public static void main(String[] args) {
        System.out.println(reverse("I am iron man"));
        System.out.println(reverse("hello"));
    }
    
    static String reverse(String str) {
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }
}
