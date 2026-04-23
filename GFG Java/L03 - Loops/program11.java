import java.util.Scanner;

class program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 'n': ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial not possible.");
        }

        int fact = 1;
        // while (n != 0) {
        //     fact *= n;
        //     n--;
        // }

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial is: " + fact);

        sc.close();
    }
}
