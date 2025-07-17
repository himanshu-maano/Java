public class PairsIn {
    public static void printPairs(int nums[]) {
        int n = nums.length;

        // time complexity -> O(n^2)

        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                System.out.print("(" + nums[i] + "," + nums[j] + ")");
            }
            System.out.println();
        }

        // Sum of n number -> (n*(n+1))/2
        // 
        // Sum of (n-1) number -> (n*(n-1))/2
        
        System.out.print("Total no. of pairs : " + (n*(n-1))/2);
    }
    public static void main( String agrs[]) {
        int nums[] = {2, 3, 4, 6, 9};
        printPairs(nums);
    }
}
