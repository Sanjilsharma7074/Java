package Linear_Search;

// ! Find whether the element "14" is present in the array or not.

public class Que1 {
  public static void main(String[] args) {
    int[] arr = {1,2,4,10,14,34};
    boolean flag = false;
    for(int i=0 ; i<6 ; i++){
      if(arr[i] == 14){
        flag = true;break;
      }
      else flag= false;
    }
    if(flag) System.out.println("true");
    else System.out.println("false");
  }
}
