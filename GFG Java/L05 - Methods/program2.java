/*
Take 'n' and 'r' as input and print nCr and nPr
*/

import java.util.Scanner;

class program2 {
    static int fact(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }

        return fact;
    }

    static double nCr(int n, int r) {
        return (fact(n) / (fact(r) * fact(n - r)));
    }

    static double nPr(int n, int r) {
        return (fact(n) / fact(n - r));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, r;
        System.out.print("Enter 'n': ");
        n = sc.nextInt();
        System.out.print("Enter 'r': ");
        r = sc.nextInt();

        System.out.println("nPr = " + nPr(n, r));
        System.out.println("nCr = " + nCr(n, r));

        sc.close();
        
    }
}
