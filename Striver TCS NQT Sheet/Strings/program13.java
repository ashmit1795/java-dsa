// Problem Statement: Given a String, find the largest word in the string.

class program13 {
    public static void main(String[] args) {
        System.out.println(maxLength("Google Doc"));
        System.out.println(maxLength("Microsoft Teams"));
    }
    
    static String maxLength(String str) {
        String[] arr = str.split(" ");
        int maxLength = Integer.MIN_VALUE;
        String maxWordString = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLength) {
                maxLength = arr[i].length();
                maxWordString = arr[i];
            }
        }

        return maxWordString;
    }
}
