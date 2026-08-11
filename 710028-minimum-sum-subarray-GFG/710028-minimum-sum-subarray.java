class Solution {
    static int smallestSumSubarray(int a[], int size) {
        int ans = a[0];
        int best = a[0];
        for(int i=1;i<a.length;i++){
            int temp = best + a[i];
            int self = a[i];
            best = (temp > self) ? self : temp;
            if(ans>best)    ans = best;
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna