public int uniquePathsWithObstacles(int[][] obstacleGrid) { // Tabulation approach
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                break; 
            }
            dp[i][0] = 1;
        }
        
        for (int j = 0; j < n; j++) {
            if (obstacleGrid[0][j] == 1) {
                break; 
            }
            dp[0][j] = 1;
        }
        
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0; 
                } else {
                    int left = dp[i-1][j];
                    int up = dp[i][j-1];
                    dp[i][j] = left + up;
                }
            }
        }
        return dp[m-1][n-1];
}
