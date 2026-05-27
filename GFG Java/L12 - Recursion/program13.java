/*
    Binary Search on Array using Recursion
*/

class program13 {

    public static void main(String[] args) {
        int[] arr = { 10, 13, 14, 16, 77, 88, 79, 26 };
        int n = arr.length;
        System.out.println(binarySearch(arr, 88, 0, n -1));

    }
    
    static int binarySearch(int[] nums, int target, int low, int high){
        if(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target) return mid;
            else if (target < nums[mid]) return binarySearch(nums, target, low, mid - 1);
            else return binarySearch(nums, target, mid + 1, high);
        } 
        return -1;
    }
}