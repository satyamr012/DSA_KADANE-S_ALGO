class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int ans = Math.abs(nums[0]);
        int high = nums[0];
        int low = nums[0];
        for(int i=1;i<nums.length;i++){
            int c1 = nums[i];
            int c2 = nums[i] + high;
            int c3 = nums[i] + low;
            high = Math.max(c1, Math.max(c2,c3));
            low = Math.min(c1,Math.min(c2,c3));
            ans = Math.max (Math.abs(ans) , Math.max(Math.abs(high) , Math.abs(low)));
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna