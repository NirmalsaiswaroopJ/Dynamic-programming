public int minFallingPathSum(int[][] matrix) { // Tabulation approach
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for(int i = 0; i< n; i++){
            dp[0][i] = matrix[0][i];
        }
        for(int i = 1; i< n; i++){
            for(int j = 0; j< n; j++){
                int min_val = dp[i-1][j];
                if(j > 0){
                    min_val = Math.min(dp[i-1][j-1], min_val);
                }
                if(j < n-1){
                    min_val = Math.min(dp[i-1][j+1], min_val);
                }
                dp[i][j] = matrix[i][j] + min_val;
            }
        }
        int least = dp[n-1][0];
        for(int i = 1; i<n; i++){
            least = Math.min(least, dp[n-1][i]);
        }
        return least;
}
