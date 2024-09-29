public class Main{
    public int fibo_dpm(int n, int[] dp){ // memoization
        if(dp[n] != -1){
            return dp[n];
        }
        if(n <= 1){
            return n;
        }
        dp[n] = fibo_dpm(n-1, dp) + fibo_dpm(n-2, dp);
        return dp[n];
    }
    
    public int fibo_dpt(int n){ // tabulation
        int[] dp = new int[n+1];
        dp[0] = 0;
        if (n>= 1){
            dp[1] = 1;
        }
        for(int i = 2; i<= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
