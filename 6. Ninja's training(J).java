public int helper(int ind, int last, int arr[][], int dp[][]) { // Memoization
        if(ind == 0){
            int maxi = 0;
            for(int i = 0; i<3; i++){
                if(i != last){
                    maxi = Math.max(maxi, arr[ind][i]);
                }
            }
            return maxi;
        }
        if (dp[ind][last] != -1) return dp[ind][last];
        int maxi = 0;
        for (int task = 0; task < 3; task++) {
            if (task != last) {
                int point = arr[ind][task] + helper(ind - 1, task, arr, dp);
                maxi = Math.max(point, maxi);
            }
        }
        return dp[ind][last] = maxi;
    }
    public int maximumPoints(int arr[][], int N) {
        int M = arr[0].length; 
        int[][] dp = new int[N][M+1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= M; j++) {
                dp[i][j] = -1; 
            }
        }
        return helper(N - 1, M, arr, dp);  
    }

public int maximumPoints(int[][] arr, int N) { // Tabulation solution
        if (N == 0) return 0; // No days, no points

        int[][] dp = new int[N][3];

        // Base case: First day points
        for (int j = 0; j < 3; j++) {
            dp[0][j] = arr[0][j];
        }

        // Fill the dp table
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = arr[i][j] + Math.max(dp[i-1][(j+1) % 3], dp[i-1][(j+2) % 3]);
            }
        }

        return Math.max(dp[N-1][0], Math.max(dp[N-1][1], dp[N-1][2]));
    }
