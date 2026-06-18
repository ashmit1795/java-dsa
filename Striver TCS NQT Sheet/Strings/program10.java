/*
Problem Description: Given a string, write a program to capitalize the first and last character of each word of that string.

Input: str = "take u forward is awesome"
Output: “TakE U ForwarD IS AwesomE”
Explanation: We get the result after capitalizing the first and last character of each word of a string.

Input: str = "I am a boy"
Output: "I AM A BoY" 
Explanation: First and last letter of each word is capitalized.
*/

class program10 {
    public static void main(String[] args) {
        System.out.println(capitalizeFirstLast("I am a boy"));
        System.out.println(capitalizeFirstLast("take u forward is awesome"));
    }
    
    static String capitalizeFirstLast(String str) {
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = capitalizeFirstLastInWord(arr[i]);
        }

        String result = String.join(" ", arr);

        return result;
    }

    static String capitalizeFirstLastInWord(String word) {
        StringBuilder sb = new StringBuilder(word);
        int n = word.length();
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        sb.setCharAt(n - 1, Character.toUpperCase(sb.charAt(n - 1)));

        return sb.toString();
    }
}
