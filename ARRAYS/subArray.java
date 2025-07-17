public class subArray {

    // there are 3 loops and 
    // loop run for n times,so
    // time complexity -> O(n^3) -->worst complexity
    
    // public static void print_subArray (int nums[]) {
    //     for(int i=0; i<nums.length; i++) {
    //         for(int j=i; j<nums.length; j++) {
    //             for(int k=i; k<=j; k++) { // Sub arrays
    //                 System.out.print(nums[k] + " ");
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     int n = nums.length;
    //     System.out.println("Total subArray : " + (n*(n+1))/2);
    // }


    // public static void subArray_Sum (int nums[]) {
    //     int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
    //     for(int i=0; i<nums.length; i++) {
    //         for(int j=i; j<nums.length; j++) {
    //             int sum = 0;
    //             for(int k=i; k<=j; k++) { // Sub arrays
    //                 sum += nums[k];  //sum of sub-array
    //             }
    //             System.out.print(sum); 
    //             System.out.println();
    //             if(sum > largest) {
    //                 largest = sum;
    //             }
    //             if (sum < smallest) {
    //                 smallest = sum;
    //             }
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("MAX subArray sum : " + largest);
    //     System.out.println("MIN subArray sum : " + smallest);
    // }

    public static void subArray_Sum (int nums[]) {  //time complexity -> O(n^2)
        int prefix_Array[] = new int[nums.length];
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
           sum += nums[i];
           prefix_Array[i] = sum;
        }
        int curSum = 0 , max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++) {
                curSum = i == 0 ? prefix_Array[j] : prefix_Array[j] - prefix_Array[i-1];
                if(curSum > max){
                    max = curSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max subArray sum : " + max);
    }



    // time complexity -> O(n)  i.e there is only loop which runs n times
    // space complexity -> O(1)
    // condition -> all elements of given array should 
    //              not be negative at least one num be +ve.
    
    public static void Kadanes_algorithm (int[] nums) {
        int cs = 0, ms = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            cs += nums[i];
            if(cs < 0) { // if current sum value is
                cs = 0;  // less than zero assigning current Sum zero
            }
            ms = Math.max(cs, ms);  // find max b/w cs & ms
        }
        System.out.println("Subarray maxSum : " + ms);
    }

    public static void main(String agrs[]) {
        int nums[] = {2, -3, 4, 7, 2, -9, -4};
        Kadanes_algorithm(nums);
    }
}
