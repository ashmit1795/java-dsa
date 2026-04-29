import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements in the first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        // input array elements
        System.out.print("Enter 1st sorted array: ");
        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();

        System.out.print("Enter no. of elements in the second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        // input array elements
        System.out.print("Enter 1st sorted array: ");
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();

        int n = n1 + n2;

        int[] res = new int[n];

        merge(res, arr1, arr2);

        System.out.print("After merging the two sorted arrays: ");
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");

        sc.close();
    }

    static void merge(int res[], int arr1[], int arr2[]) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j])
                res[k++] = arr1[i++];
            else
                res[k++] = arr2[j++];
        }

        while (i < arr1.length)
            res[k++] = arr1[i++];

        while(j < arr2.length) 
            res[k++] = arr2[j++];
    }
}
