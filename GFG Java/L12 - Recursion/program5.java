/*
Liner Power using Recursion
*/

import java.util.Scanner;

class program5 {
    static int noOfCalls = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter exponent: ");
        int b = sc.nextInt();
        System.out.println("Result: " + pow(a, b));
        System.out.println(noOfCalls);
        sc.close();
    }

    // 5^10 will have 11 recursive calls
    // static int pow(int a, int b) {
    //     noOfCalls++;
    //     return b == 0 ? 1 : a * pow(a, b - 1);
    // }

    // Less no. of recursive calls - half then above - e.g. 5^10 will have 4 recursive calls
    static int pow(int a, int b) {
        if (b == 0)
            return 1;

        int call = pow(a, b / 2);
        noOfCalls++;
        if (b % 2 == 0) {
            return call * call;
        } else {
            return call * call * a;
        }
    }
}
