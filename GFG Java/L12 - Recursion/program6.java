/*
Reverse a number using recursion
*/

import java.util.Scanner;

class program6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.println(reverse(n, 0));

        sc.close();
    }
    
    static int reverse(int num, int reversed) {

        if (num == 0)
            return reversed;
        
        int lastDigit = num % 10; // extract the last digit
        int remaining = num / 10;
        reversed = reversed * 10 + lastDigit; // position the lastDigit correctly
        
        return reverse(remaining, reversed); // reverse the remaining part of the number
    }
}
