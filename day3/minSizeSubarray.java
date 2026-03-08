class Solution {
    // first sliding  window quesiton
    public int minSubArrayLen(int target, int[] nums) {
        int min_range = Integer.MAX_VALUE; // Safer than length+1
        int left = 0;
        int sum = 0;

        // The "Mover" (Right pointer) expands the window
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // Add new element (Feed the window)

            // While the window is valid (sum >= target), try to shrink it from the left
            while (sum >= target) {
                // Check if this is the new smallest length
                min_range = Math.min(min_range, right - left + 1);

                // SHRINK PHASE: Remove the left element and move left forward
                sum -= nums[left]; 
                left++;
            }
        }

        // Check if we never found a valid subarray
        return (min_range == Integer.MAX_VALUE) ? 0 : min_range;
    }
}
