package Arrays.Union_of_two_sorted_arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Brute {
  static List<Integer> sortedArray(int[] a,int[] b,int n, int m){
    List <Integer> union = new ArrayList<>();
    int i=0;
    int j=0;
    while(i<n && j<m){
      if(a[i]<=b[j]){
        if(union.size()==0 || !union.get(union.size()-1).equals(a[i])){
          union.add(a[i]);
        }
        i++;
      }
      else{
        if (union.size() == 0 || !union.get(union.size() - 1).equals(b[j])) {
          union.add(b[j]);
        }
        j++;
      }
      }
    while (i < n) {
      if (union.size() == 0 || !union.get(union.size() - 1).equals(a[i])) {
        union.add(a[i]);
      }
      i++;
    }
    while (j < m) {
      if (union.size() == 0 || !union.get(union.size() - 1).equals(b[j])) {
        union.add(b[j]);
      }
      j++;
    }
    return union;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of first array : ");
    int n = sc.nextInt();
    int[] a=new int[n];
    for(int i=0 ;i<n ;i++){
      a[i]=sc.nextInt();
    }
    System.out.print("Enter the length of second array : ");
    int m = sc.nextInt();
    int[] b=new int[m];
    for(int j=0 ; j<m ; j++){
      b[j]=sc.nextInt();
    }

    List<Integer> union = sortedArray(a, b, n, m);
    System.out.print("Union Array is as followed : ");
    for (int i = 0; i < union.size(); i++) {
      System.out.print(union.get(i)+" ");
    }
    sc.close();
  }
}
