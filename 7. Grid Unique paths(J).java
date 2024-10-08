public int uniquePaths(int m, int n) { // Memoization
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return findPaths(m - 1, n - 1, dp);
    }
    private int findPaths(int m, int n, int[][] dp) {
        if (m == 0 && n == 0) {
            return 1;
        }
        if (m < 0 || n < 0) {
            return 0;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        int left = findPaths(m - 1, n, dp);
        int up = findPaths(m, n - 1, dp);
        dp[m][n] = left + up;
    
        return dp[m][n];
}

public int uniquePaths(int m, int n) { // Tabulation
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;  
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;  
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int left = dp[i][j - 1];  
                int up = dp[i - 1][j];    
                dp[i][j] = left + up;     
            }
        }
        return dp[m - 1][n - 1];
}
