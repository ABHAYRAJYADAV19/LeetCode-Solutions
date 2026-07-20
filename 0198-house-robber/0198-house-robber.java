class Solution {
    int[] dp;

    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return maxRob(nums, n - 1);
    }
    private int maxRob(int[] nums, int i) {
        if (i < 0) return 0;
        if (i == 0) return nums[0];
        if (dp[i] != -1){
            return dp[i];
        }
        dp[i] =Math.max(nums[i]+maxRob(nums,i-2),maxRob(nums,i-1));
        return dp[i];
    }
}