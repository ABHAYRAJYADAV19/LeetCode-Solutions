class Solution {
    public int maxProduct(int[] nums) {
        int smax = -1;
        int max = -1;

        for (int i = 0; i < nums.length; i++) {

            if (max < nums[i]) {
                smax = max;       // previous max becomes second max
                max = nums[i];    // update max
            } 
            else if (smax < nums[i]) {
                smax = nums[i];   // update only smax
            }
        }

        int ans = (max - 1) * (smax - 1);
        return ans;
    }
}