/*
Problem: Given a string, calculate the sum of numbers in a string (multiple consecutive digits are considered one number)

Input :  string = "123xyz"
Output :  123
Explanation :  The only number is 123, so the sum = 123

Input :  string = "1xyz23"
Output :  24
Explanation :  Numbers are 1 and 23, sum = 24
*/

class program9 {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers1("123xyz"));
        System.out.println(sumOfNumbers1("1xyz23"));
    }
    
    static int sumOfNumbers1(String str) { 
        if (str == null || str.isEmpty()) {
            return 0; 
        }

        int sum = 0; 
        int tempNum = 0; 

        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 

            // If character is a digit, build the consecutive number
            if (Character.isDigit(ch)) { 
                tempNum = tempNum * 10 + (ch - '0'); 
            } else { 
                // If it's any other character, flush the accumulated number to sum
                sum += tempNum; 
                tempNum = 0; 
            } 
        } 

        // Flush any remaining number left over at the end of the string
        sum += tempNum; 

        return sum; 
    } 
}
