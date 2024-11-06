class Solution { // Memoization approach
    static int helper(int ind, int capacity, int val[], int wt[], int dp[][]){
        if(ind == 0){
            if(wt[ind] <= capacity){
                return val[ind];
            } else{
                return 0;
            }
        }
        if(dp[ind][capacity] != -1) return dp[ind][capacity];
        int notpick = 0 + helper(ind-1, capacity, val, wt, dp);
        int pick = Integer.MIN_VALUE;
        if(wt[ind] <= capacity){
            pick = val[ind] + helper(ind-1, capacity-wt[ind], val, wt, dp);
        }
        return dp[ind][capacity] = Math.max(pick, notpick);
    }
    // Function to return max value that can be put in knapsack of capacity.
    static int knapSack(int capacity, int val[], int wt[]) {
        int n = val.length;
        int[][] dp = new int[n][capacity+1];
        for(int i = 0; i< n; i++){
            for(int j = 0; j< capacity+1; j++){
                dp[i][j] = -1;
            }
        }
        return helper(n-1, capacity, val, wt, dp);
        
    }
}
