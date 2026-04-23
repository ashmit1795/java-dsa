/* Ques: If cost price and selling price of an
item is input through the keyboard, write a
program to determine whether the seller
has made profit or incurred loss or no profit
no loss. Also determine how much profit he
made or loss he incurred.
*/

import java.util.Scanner;

class program2 {
    public static void main(String[] args) {
        double costPrice, sellingPrice;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        costPrice = sc.nextDouble();
        System.out.print("Enter selling price: ");
        sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice) {
            System.out.println("The seller has made profit.");
            System.out.println("Profit = " + (sellingPrice - costPrice));
            System.out.println("Profit % = "+ ((sellingPrice - costPrice)/costPrice)*100);
        } else if (sellingPrice < costPrice) {
            System.out.println("The seller has incurred loss.");
            System.out.println("Loss = " + (costPrice - sellingPrice));
            System.out.println("Loss % = " + ((costPrice - sellingPrice)/costPrice)*100);
        } else {
            System.out.println("Seller made no profit, no loss.");
        }

        sc.close();
    }
}
