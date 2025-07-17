/* import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0,1,0,2,0,3,0,4,0,5};
        List<Integer> ans = findCoins(nums);
        System.out.println(ans);
    }
    public static List<Integer> findCoins(int[] numsWays) {
        int n = numsWays.length;
        int[] arr = new int[n+1];
        arr[0] = 1;

        List<Integer> ans = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if(numsWays[i-1] < 1) continue;

            int[] temp = arr.clone();
            for(int j=i; j<=n; j++) {
                temp[j] += temp[j-i];
            }

            boolean isValid = true;
            for(int k=1; k<=n; k++) {
                if(temp[k] <= numsWays[k-1]) {
                    continue;
                } else {
                    isValid = false;
                    break;
                }
            }

            if(isValid) {
                ans.add(i);
                arr = temp;
            }
        }

        for(int i=0; i<n; i++) {
            if(numsWays[i] != arr[i+1]) {
                return new ArrayList<>();
            }
        }

        return ans;
    }
} */