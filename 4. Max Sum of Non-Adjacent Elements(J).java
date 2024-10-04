public class Main{ // Memoization
    public int helper(int ind, int[] arr, int[] dp){
        if(ind ==0) return arr[ind];
        if(ind<0) return 0;
        if(dp[ind] != -1) return dp[ind];
        
        int pick = arr[ind] + helper(ind-2, arr, dp);
        
        int notpick = 0 + helper(ind-1, arr, dp);
        
        return dp[ind] = Math.max(pick, notpick);
    }
    public int maxsumnonadjacentarr(int[] arr){
        int n = arr.length;
        if (n == 0) return 0;
        int[] dp = new int[n];
        for(int i = 0; i<n; i++){
            dp[i] = -1;
        }
        return helper(n-1, arr, dp);
    }
}

public class Main { // Tabulation
    public int helper(int n, int[] arr, int[] dp) {
        if (n == 0) return arr[0];
        if (n == 1) return Math.max(arr[0], arr[1]);
        
        dp[0] = arr[0]; 
        dp[1] = Math.max(arr[0], arr[1]); 
        
        for (int i = 2; i < n; i++) {
            int pick = arr[i] + dp[i - 2]; 
            int notpick = dp[i - 1]; 
            dp[i] = Math.max(pick, notpick); 
        }
        
        return dp[n - 1]; 
    }

    public int maxsumnonadjacentarr(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        if (n == 1) return arr[0]; 

        int[] dp = new int[n];
        return helper(n, arr, dp);
    }
}
