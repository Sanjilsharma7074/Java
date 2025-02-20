package Main;
import java.util.Scanner;
public class Ceiling {
    static int ceiling(int[] arr, int upper){
        int start = 0;
        int end = arr.length-1;
        if(upper > arr[arr.length - 1]) return -1;
        while(start<=end){
        int mid = start+(end-start)/2;
          if (arr[mid]==upper){
            return mid;
          }
          else if(arr[mid]<upper){
        
            start = mid + 1;
          }
          else {
              end = mid - 1;
          }
        }
  
        return start;
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
        System.out.print("Please enter the number whose smallest >= (greater than equal to) number you want to find: ");
        int target = in.nextInt();
        int ans = ceiling(arr, target);
        System.out.println(ans);
        in.close();
    }
}
