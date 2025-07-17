// Given the array nums after the possible rotation and an integer target, 
// return the index of target if it is in nums, or -1 if it is not in nums.
// Example 1: 
//          Input: 
//               nums = [4, 5, 6, 7, 0, 1, 2], target = 0 
//               Output: 4 


package Assigment;

public class Q2 {

    public static int searchNum (int nums[], int target) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] agrs) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 8;
        System.out.print("target is at index " + searchNum(nums, target));
    }
}
