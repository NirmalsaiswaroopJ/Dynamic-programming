public int helper(int start, int end, int[] nums) { // Tabulation method
        int[] dp = new int[nums.length]; 
        dp[start] = nums[start]; 
        dp[start + 1] = Math.max(nums[start], nums[start + 1]); 
        
        for (int i = start + 2; i <= end; i++) {
            int pick = nums[i] + dp[i - 2]; 
            int notPick = dp[i - 1]; 
            dp[i] = Math.max(pick, notPick); 
        }
        return dp[end]; 
}
public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0; 
        if (n == 1) return nums[0]; 
        if (n == 2) return Math.max(nums[0], nums[1]); 
        return Math.max(helper(0, n - 2, nums), helper(1, n - 1, nums)); //Important to include start once and exclude end once.
}
