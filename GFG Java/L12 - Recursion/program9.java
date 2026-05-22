/*
    Fibonacci Series
*/

import java.util.Scanner;

class program9 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();

        printFibonacci(n);

        sc.close();
    }

    // Function to print fibonacci series upto 'n'
    static void printFibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
        }
    }

    // Function to find nth Fibonacci Number using recursion
    static int nthFibonacci(int n) {
        return 1;
    }
}
