package Main;
import java.util.Scanner;
public class Main {

    static int binary_search(int[] arr,int target){
        int low = 0;
        int high = arr.length - 1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(target > arr[mid]){
                low = mid + 1;
            }
            else if (target < arr[mid]){
                high = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the length for your array: ");
        int len = in.nextInt();
        int[] arr = new int[len];
    
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Please enter the number whose index you want to find: ");
        int target = in.nextInt();
        int ans = binary_search(arr, target);
        System.out.println("The index of target number is : "+ans);
        in.close();
    }
}
