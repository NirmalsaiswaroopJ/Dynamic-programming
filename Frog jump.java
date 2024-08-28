public static int frogJump(int n, int heights[]){
  if(n<=1) {
    return 0;
  }
  int[] dp = new int[n+1];
  dp[0] = 0;
  dp[1] = Math.abs(heights[1] - heights[0]);
  for(int i = 2; i< n; i++){
    int jumpone = dp[i-1] + Math.abs(heights[i] - heights[i-1]);
    int jumptwo = dp[i-2] + Math.abs(heights[i] - heights[i-2]);
    dp[i] = Math.min(jumpone, jumptwo);
    
  }
  return dp[n-1];
}
