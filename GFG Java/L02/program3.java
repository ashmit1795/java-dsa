/*
Ques: Take positive integer input and
print:

if number is divisible by 5
if number is divisible by 3
if number is divisible by 5 & 3 both
if number is not divisible by 5 or 3
*/

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Integer can't be negative");
        }

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(n + " is divisible by both 3 and 5");
        }else if (n % 3 == 0) {
            System.out.println(n + " is divisible by 3");
        }else if (n % 5 == 0) {
            System.out.println(n + " is divisible by 5");
        } else {
            System.out.println(n + " is not divisible by 3 or 5");
        }

        sc.close();
    }
}