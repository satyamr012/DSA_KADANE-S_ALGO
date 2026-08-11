class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int best = nums[0];
        int low = nums[0];
        for(int i=1;i<nums.length;i++){
            int self = nums[i];
            int temp1 = best * nums[i];
            int temp2 = low * nums[i];
            best = Math.max (self , Math.max (temp1,temp2));
            low = Math.min (self , Math.min (temp1,temp2));
            ans = Math.max (ans , Math.max (best , low));
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna