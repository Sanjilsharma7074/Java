import java.util.ArrayList;
import java.util.Scanner;
public class Reverse{

  static  void swap(ArrayList<Integer> list,int index1, int index2){
    int temp = list.get(index1);
    list.set(index1,list.get(index2));
    list.set(index2,temp);
  }

  static void reverse(ArrayList<Integer> arr){
    int start = 0;
    int end = arr.size()-1;
    while(start<end){
      swap(arr,start,end);
      start++;
      end--;
    }
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList <Integer> list = new ArrayList<>();
    System.out.print("Enter the size of the list you want : ");
    int len = in.nextInt();
    for(int i=0 ; i<len ; i++){
      list.add(in.nextInt());
    }
    System.out.println(list);
    reverse(list);
    System.out.println(list);
    in.close();
  }
}