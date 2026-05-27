/*
Print array recursively
*/

class program11 {

    public static void main(String[] args) {
        int[] arr = { 10, 13, 14, 16, 77, 88, 79, 26 };
        printArray(arr, 0);
    }

    // static void printArray(int arr[], int lastIdx) {
    //     if (lastIdx == 0) {
    //         System.out.print(arr[0] + " ");
    //         return;
    //     }
    //     printArray(arr, lastIdx - 1);
    //     System.out.print(arr[lastIdx] + " ");
    // }

    static void printArray(int arr[], int idx) {
        if (idx == arr.length)
            return;
        printArray(arr, idx + 1);
        System.out.print(arr[idx] + " ");
    }
}