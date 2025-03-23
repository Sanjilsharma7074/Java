package Leetcode.Maximum_Unique_Subarray_Sum_After_Deletion_3487;
import java.util.*;

public class Solution {
  static int maxContainers(int n, int w, int maxWeight) {
    int cross = n * n;
    while (cross * w > maxWeight) {
      cross--;
    }
    return cross;
  }
}