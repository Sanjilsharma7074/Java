package Linear_Search;

public class _05_Max_in_2D_Array {
  static int getMax(int[][] num){
    int max = Integer.MIN_VALUE;
    for(int i=0 ; i<num.length ; i++){
      for(int j=0 ; j<num[i].length ; j++){
        if(num[i][j] > max) max = num[i][j];
      }
    }
    return max;
  }
  public static void main(String[] args) {
    int[][] num = {
      {11,14,16},
      {21,24,56,78},
      {23,45}
    };
    int ans = getMax(num);
    System.out.println(ans);
  }
}
