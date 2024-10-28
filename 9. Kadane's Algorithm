public int maxSubArray(int[] nums) { //Tabulation approach
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        int maxNumber = nums[0];
        for(int i = 1; i< n; i++){
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
            maxNumber = Math.max(maxNumber, dp[i]);
        }
        return maxNumber;
        
}
