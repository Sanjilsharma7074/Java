package Linear_Search;
// Search for 3 in range [1,4]

public class _02_Search_in_Range {
  static boolean linearSearch(int start, int end, int[] num, int target){
    if(num.length ==0) return false;
    for(int i= start ; i<end ; i++){
      if(num[i] == target) return true;
    }
    return false;
  }
  public static void main(String[] args) {
    int[] num = {1,2,3,23,34,56,67,54,89};
    int target = 3;
    System.out.println(linearSearch(1,3,num,target));
  }
}
