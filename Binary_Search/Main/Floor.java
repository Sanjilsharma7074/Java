package Main;

import java.util.Scanner;

public class Floor {

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target == arr[mid]){
                return mid;
            }
            else{
                end = mid-1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the length you want for your array: ");
        int len = in.nextInt();
        int[] arr = new int[len];

        for(int i=0 ;  i<arr.length ; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0 ;  i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Please enter the number whose largest <= (less than equal to) number you want to find: ");
        int target = in.nextInt();
        int ans = floor(arr, target);
        System.out.println(ans);
        in.close();
    }
}
