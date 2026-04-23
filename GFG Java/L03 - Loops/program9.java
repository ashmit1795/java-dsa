// Ques: Print sum of digits of a number

import java.util.Scanner;

class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 'n': ");
        int n = sc.nextInt();

        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum: " + (sum > 0 ? sum : -sum));

        sc.close();
    }
}
