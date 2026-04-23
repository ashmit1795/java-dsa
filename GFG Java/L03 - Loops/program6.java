/*
    WAP to find a number is composite or not.
*/

import java.util.Scanner;

class program6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number 'n': ");
            int n = sc.nextInt();

            if (n <= 1) {
                System.out.println(n + " is neither prime nor composite.");
                sc.close();
                return;
            }

            boolean isComposite = false; // that means number is not composite(i.e. prime)
            int count = 0;
            for (int i = 2; i*i <= n; i++) { // we can run loop till root(n), this will reduce the no. of iterations futher
                count++;
                if (n % i == 0) {
                    isComposite = true;
                    break;
                }
            }

            if (isComposite) {
                System.out.println(n + " is a composite number.");
            } else {
                System.out.println(n + " is a prime number.");
            }
            System.out.println("Loop Ran: "+ count);

            sc.close();
        }
}
