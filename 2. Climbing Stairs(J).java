public class Main{
    public int dp_csm(int steps, int[] dp){ //Memoization
        for (int i = 0; i <= steps; i++) {
            dp[i] = -1;
        }
        if (steps == 0) return 1;
        if (steps == 1) return 1;
        if (dp[steps] != -1) return dp[steps];
        
        dp[steps] = dp_csm(steps - 1, dp) + dp_csm(steps - 2, dp);
        return dp[steps];
    }
    public int dp_cst(int steps){ // Tabulation
        int[] dp = new int[steps+1];
        if (steps == 0) return 1;
        if(steps == 1) return 1;
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i<= steps; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[steps];
    }
}
