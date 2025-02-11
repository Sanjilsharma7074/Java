package _04_problems_on_functional_recursion;
import java.util.Scanner;
public class reverse_arr_1 {
    static void swap(int l, int r,int[] arr){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    static void reverse(int l, int r, int[] arr){
        if(l>=r){
            return;
        }
        swap(l,r,arr);
        reverse(l+1,r-1,arr);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];
        for(int i=0 ; i<len; i++){
            arr[i] = in.nextInt();
        }
        reverse(0,len-1,arr);
        System.out.println("Reversed Array is as Followed: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
