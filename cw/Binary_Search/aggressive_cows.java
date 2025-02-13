package Binary_Search;
import java.util.*;
public class aggressive_cows {
    static Boolean isPossible(int[] arr, int cows, int minDistance){
        int n = arr.length,cnt = 0,lastStall = arr[0];
        for(int i=0 ; i<n ; i++){
            if(arr[i] - lastStall >= minDistance){
                cnt ++;
                lastStall = arr[i];
            }
        }
        return cnt >= cows;
    }
    static int binarySearch(int[] arr, int cows){
        int n = arr.length;
        Arrays.sort(arr);

        int low = 1;
        int high = arr[n-1]- arr[0];
        int ans = 1;

        while(low<=high){
            int mid = low + (high - low)/2;
            if(isPossible(arr, cows, mid)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] arr = {1,2,4,8,9};
        int cows = 3;
        System.out.println(binarySearch(arr, cows));
        in.close();
    }
}
