class Solution {
    
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        for(int i= n-1;i>=0;i--){
            int take = 0;
            int leave = 0;
            take = nums[i];
            if(i+2<n) take += dp[i+2];
            if(i+1<n) leave = dp[i+1];
            dp[i] = Math.max(take,leave);
        }
        return dp[0];
    }
}
