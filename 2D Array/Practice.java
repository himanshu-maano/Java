public class Practice {
    public static void findNum (int arr[][], int key) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j] == key) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void sumRow (int nums[][], int row) {
        int sum = 0;
        for(int col=0; col<nums[0].length; col++) {
            sum += nums[row][col];
        }
        System.out.println(sum);
    }

    
    public static void transpose (int nums[][], int trans[][]) {
       
       for(int i=0; i<nums.length; i++) {
        for(int j=0; j<nums[0].length; j++) {
            trans[j][i] = nums[i][j];
        }
       }
    }

    public static void printArray (int nums[][]) {
        System.out.println("Transpose matrix is : ");
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main (String[] agrs) {
        // int arr[][] =  { {4,7,8},{8,8,7} };
        // findNum(arr, 7);
        int nums[][] = { {1,4,9},
                         {11,4,3},
                         {2,2,3} };
        // sumRow(nums, 1);
        int trans[][] = new int [nums[0].length][nums.length];
        
        printArray(nums);
        transpose(nums, trans);
        printArray(trans);
    }
}