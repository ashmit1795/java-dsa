/*
GCD of two numbers
*/

import java.util.Scanner;

class program8 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        System.out.println(recursiveGCD(a, b));
        System.out.println(GCD(a, b));
        System.out.println(optimisedGCD(a, b));

        sc.close();
    }
    
    static int GCD(int a, int b) {
        int hcf = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    static int optimisedGCD(int a, int b) {
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    static int recursiveGCD(int a, int b) {
        if (b == 0)
            return a;

        return recursiveGCD(b, a % b);
    }
}
