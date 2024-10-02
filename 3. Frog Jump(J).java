public class Main{ // Memoization method
    public int helper(int ind, int[] arr), int[] dp){
        if (ind == 0) return 0;
        if (dp[ind] != -1) return dp[ind];
        int min1 = helper(ind-1, arr, dp) + Math.abs(arr[ind-1] + arr[ind]);
        int min2 = Integer.MAX_VALUE;
        if(ind > 1){
            min2 = helper(ind-2, arr, dp) + Math.abs(arr[ind-2] + arr[ind]);
        }
        dp[ind] = Math.min(min1, min2);
        return dp[ind];
    }
    public int minimumEnergy(int arr[], int N) {
        int[] dp = new int[N];  
        for (int i = 0; i < N; i++) {
            dp[i] = -1;  
        }
        return helper(N - 1, arr, dp);  
    }
}

class Solution { // Tabulation method
    public int helper(int index, int arr[], int dp[]) {
        if (index == 0) return 0; 
        dp[0] = 0;  
        
        for (int i = 1; i <= index; i++) {  
            int min1 = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            int min2 = Integer.MAX_VALUE;
            if (i > 1) {
                min2 = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
            }
            dp[i] = Math.min(min1, min2);  
        }
        return dp[index];  
    }
    public int minimumEnergy(int arr[], int N) {
        int[] dp = new int[N];  
        return helper(N - 1, arr, dp);  
    }
}
