static int f(int i, int j, int[] arr, int[][] dp){ // Memoization Approach
        if(i == j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int mini = Integer.MAX_VALUE;
        for(int k = i; k< j; k++){
            int steps = arr[i-1] * arr[k] * arr[j] + f(i,k,arr,dp) + f(k+1,j,arr,dp);
            if(steps < mini){
                mini = steps;
            }
            
        }
        return dp[i][j] = mini;
}
static int matrixMultiplication(int arr[]) {
     int n = arr.length;
     int[][] dp = new int[n][n];
     for(int i = 0; i< n; i++){
          for(int j = 0; j < n; j++){
              dp[i][j] = -1;
          }
     }
     return f(1, n-1, arr, dp);
}
      
