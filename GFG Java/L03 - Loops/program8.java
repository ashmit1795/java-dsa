/*
    Ques: Count digits of a number
*/

import java.util.Scanner;

class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 'n': ");
        int n = sc.nextInt();

        int count = 0;
        do {
            n /= 10;
            count++;
        } while(n != 0) ;

        System.out.println("No. of digits = " + count);

        sc.close();
    }
}
