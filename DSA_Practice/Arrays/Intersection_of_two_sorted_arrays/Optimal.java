package Arrays.Intersection_of_two_sorted_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ! 2 pointer approach.
public class Optimal {
  static List<Integer> sortedArray(int[] a,int[] b, int n, int m){
    List <Integer> list = new ArrayList<>();

    return list;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of first array : ");
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print("Enter the length of second array : ");
    int m = sc.nextInt();
    int[] b = new int[m];
    for (int j = 0; j < m; j++) {
      b[j] = sc.nextInt();
    }

    List<Integer> union = sortedArray(a, b, n, m);
    System.out.print("Intersected Array is as followed : ");
    for (int i = 0; i < union.size(); i++) {
      System.out.print(union.get(i) + " ");
    }
    sc.close();
  }
}
