package Linear_Search;
import java.util.*;

public class _04_Search_in_2D_Array {
  static boolean search(int[][] arr, int target){
    for(int[] x : arr){
      for(int y: x){
        if (target == y) return true;
      }
    }
    return false;
  }
  static int[] search2(int[][] arr, int target){
    for(int i=0 ; i<arr.length ; i++){
      for(int j=0 ; j<arr[i].length ; j++){
        if(arr[i][j] == target){
          return new int[]{i,j};
        }
      }
    }
    
    return new int[] { -1, -1 };
}
  public static void main(String[] args) {
    int[][] arr = {
      {23,4,21},
      {12,14,18,20,34},
      {78,79,80},
      {38,45}
    };
    int target = 34;
    int[] ans = search2(arr,target); // formaat of teh returned value would be {row,col}
    System.out.println(Arrays.toString(ans));
  }
}
