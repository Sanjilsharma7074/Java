package Arrays.Union_of_two_sorted_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Optimal {
  static List<Integer> sortedArray(int[] a, int[] b, int n, int m){

    Set<Integer> union = new TreeSet<>();
    
    for (int num : a) union.add(num);
    for (int num : b) union.add(num);
    return new ArrayList<>(union);
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

    List<Integer> unionList = sortedArray(a, b, n, m);
    System.out.print("Union Array is as followed : ");
    for(int num:unionList){
      System.out.print(num+" ");
    }
    sc.close();
  }
}
