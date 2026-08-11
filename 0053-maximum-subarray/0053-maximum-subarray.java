class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int best = nums[0];
        for(int i=1;i<nums.length;i++){
            int temp = best + nums[i];
            int self = nums[i];
            best = (temp > self) ? temp : self;
            if(ans<best)    ans = best;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna