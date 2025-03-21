package Linear_Search;
public class _03_Find_Minimum{
  static int getMin(int[] arr){
    int min = Integer.MAX_VALUE;
    for(int i=0 ; i<arr.length ; i++){
      if(arr[i] < min) min = arr[i];
    }
    return min;
  }
  public static void main(String[] args) {
    int[] num = {1,2,3,4};
    System.out.println(getMin(num));
  }
}