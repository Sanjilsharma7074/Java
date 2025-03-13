package Arrays;

public class Left_Rotate_an_array_by_one_place{
    static int[] rotate (int[] nums){
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length-1] = temp;
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println("Before rotation: ");
        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i] +" ");
        }
        System.out.println();
        rotate(nums);
        System.out.println("After rotation: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

// ? TC - O(N)

// * SC - Are we using any extra space ? NO - Hence, SC = O(1)
// *      We are doing everything in the given array itself.

// ! But yes, we are modifying the array, so the space used too solve the problem is O(N)

//? Conclusion - Space used in your algorithm is O(N), since we are using the already given array to solve the problem , but the extra space that we are using is O(1)

// ! Space used in the algoithm in order to solve the problem- O(N) , Extra space used - O(1)