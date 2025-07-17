

public class Trapping_Water {
    public static void trapped_Water (int height[]) {  // time complexity -> O(n)
        int bar = height.length;

        // calculate leftMax boundary -> array
        int leftMax[] = new int[bar];
        leftMax[0] = height[0];
        for(int i=1; i<bar; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // calculate rightMax boundary
        int rightMax[] = new int[bar];
        rightMax[bar-1] = height[bar-1];
        for(int i=bar-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // calculate waterTrapped
        int waterTrapped=0;
        for(int i=0; i<bar; i++) {
            // waterLevel = min(leftMax, rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Trapped water = waterLevel - height[i]/barLevel
            waterTrapped += (waterLevel - height[i]);
        }
        System.out.println("Water Trapped : " + waterTrapped);
    }
    public static void main (String[] agrs) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        trapped_Water(height);
    }
}
