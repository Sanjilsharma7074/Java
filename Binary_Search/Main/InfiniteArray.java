package Main;

public class InfiniteArray {
// Q.  To find the Position of an Element in an Infinite Sorted Array

    static int ans(int[] arr, int target){
        //irst find the range 
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range 
        while(target>arr[end]){
            int temp = end + 1;
            // double the box value
            // new end = previous_end + length of the array * 2
            end = end + 2*(end - start + 1);
            start = temp;
        }
        return BinarySearch(arr, target, start, end);
    }
    static int BinarySearch(int[] arr, int target,int start, int end) {
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]) start = mid+1;
            else if(target<arr[mid]) end = mid - 1;
            else return target;
        }
        return arr[start];
    }
    public static void main(String[] args) {
       int[] arr = {3, 5, 7 , 9 , 10 , 90, 100, 130, 140, 160, 170};
       int target =  11;
       System.out.println(ans(arr, target));
    }
}
