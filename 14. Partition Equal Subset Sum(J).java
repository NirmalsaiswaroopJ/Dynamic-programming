static boolean helper(int i, int target, int nums[], Boolean[][] dp) {
        if (target == 0) return true;
        if (i == 0) return nums[i] == target; 
        if (dp[i][target] != null) return dp[i][target];

        boolean notPick = helper(i - 1, target, nums, dp);
        boolean pick = false;
        
        if (nums[i] <= target) {
            pick = helper(i - 1, target - nums[i], nums, dp);
        }

        return dp[i][target] = pick || notPick;
    }

    public boolean canPartition(int[] nums) {
        int tot = 0;
        int n = nums.length;
        for (int num : nums) {
            tot += num;
        }
        
        if (tot % 2 != 0) {
            return false; 
        }
        
        Boolean[][] dp = new Boolean[n][tot / 2 + 1]; 
        return helper(n - 1, tot / 2, nums, dp);
    }
