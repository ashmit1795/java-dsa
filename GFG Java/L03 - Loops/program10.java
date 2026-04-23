// Ques: Reverse of a number

import java.util.Scanner;

class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 'n': ");
        int n = sc.nextInt();

        int reverse = 0;
        int sum = 0;
        while (n != 0) {
            reverse *= 10;
            reverse += (n % 10);
            sum += (n % 10);
            n /= 10;
        }
        
        System.out.println("Reverse = " + reverse);
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
