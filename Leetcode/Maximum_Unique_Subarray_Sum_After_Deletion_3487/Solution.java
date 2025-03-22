package Leetcode.Maximum_Unique_Subarray_Sum_After_Deletion_3487;


import java.util.*;
class Solution {
  static boolean isNegative(int[] nums) {
    for (int x : nums) {
      if (x > 0) {
        return false;
      }
    }
    return true;
  }

  public int maxSum(int[] nums) {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> uniqueList = new ArrayList<>();
    ArrayList<Integer> noNeg = new ArrayList<>();
    int sum = 0;
    int max = Integer.MIN_VALUE;
    if (isNegative(nums)) {
      list.add(nums[0]);
      for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1])
          list.add(nums[i]);
      }
      for (int i = 0; i < list.size(); i++) {
        if (list.get(i) > max)
          max = list.get(i);
      }
      return max;

      // for(int i=0 ; i<list.size() ; i++){
      // sum+=list.get(i);
      // }
      // return sum;
    } else {
      list.add(nums[0]);
      for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1])
          list.add(nums[i]);
      }
      ;
      // for(int i=0 ; i<list.size() ; i++){
      // for(int j=i+1 ; j<list.size() ; j++){
      // if(list.get(i) == list.get(j)) list.remove(Integer.valueOf(list.get(j)));
      // }
      // }
      for (Integer num : nums) {
        if (!uniqueList.contains(num))
          uniqueList.add(num);
      }
      // System.out.println(list);
      for (int i = 0; i < uniqueList.size(); i++) {
        if (uniqueList.get(i) > 0)
          noNeg.add(uniqueList.get(i));
      }
      // System.out.println(noNeg);
      for (int i = 0; i < noNeg.size(); i++) {
        sum += noNeg.get(i);
      }
      return sum;
    }
  }
}
