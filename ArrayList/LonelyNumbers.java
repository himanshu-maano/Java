import java.util.*;

public class LonelyNumbers {
    public static void main(String[] args) {
        int[] nums = {1,3,2,3};

        System.out.println(isLonely(nums));
    }

    private static ArrayList<Integer> isLonely(int[] nums) {
        if(nums.length < 2) {
            return null;
        }
        int n = nums.length-1;
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1; i<nums.length-1; i++) {
            if(nums[i] == nums[i-1] || nums[i] == nums[i+1] || nums[i-1] == nums[i]-1 || nums[i+1] == nums[i]+1) {
                continue;
            }
            ans.add(nums[i]);
        }
        if(nums[0] != nums[1] && nums[1] != nums[0]+1) {
            ans.add(nums[0]);
        }
        if(nums[n] != nums[n-1] && nums[n-1] != nums[n]-1) {
            ans.add(nums[n]);
        }

        return ans;
    }
}
