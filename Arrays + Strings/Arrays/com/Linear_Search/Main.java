package Linear_Search;

// * Search in the array : return teh index if item found , otherwise if item not found return -1.

public class Main {

  static int linearSearch(int[] arr, int target){
    // edge cases
    if(arr.length == 0) return -1;
    for(int i=0 ; i< arr.length ; i++){
      if(arr[i] == target) return i;
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] num = {23,21,45,67};
    int ans = linearSearch(num, 21);
    System.out.println(ans);
  }
}
