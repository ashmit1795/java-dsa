/*
HW: Take a number and print all of its factor.
*/

import java.util.Scanner;

class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 'n': ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i*i <= n; i++) {
            count++;
            if (n % i == 0) {
                System.out.print(i + " ");
                if(i != n/i) System.out.print(n/i + " ");
            }
        }

        System.out.println("\n Loop Ran: "+ count);

        sc.close();
    }
}
