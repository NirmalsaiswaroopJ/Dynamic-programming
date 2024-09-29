def fibo_dpm(n, dp = None): #Memoization method
  if dp is None:
    dp = [-1] * (n+1)
  if n <= 1:
    return n
  if dp[n] != -1:
    return dp[n]
  dp[n] = fibo_dpm(n-1, dp) + fibo_dpm(n-2,dp)
  return dp[n]

def fibo_dpt(n, dp = None): #Tabulation method
  if dp is None:
    dp = [-1] * (n+1)
    dp[0] = 0
    dp[1] = 1
    for i in range(2, n+1):
      dp[i] = dp[i-1] + dp[i-2]
    return dp[n]
