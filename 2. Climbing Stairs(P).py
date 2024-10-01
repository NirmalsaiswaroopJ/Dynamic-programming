def dp_csm(steps): #Memoization
    dp = [-1] * (steps+1)
    if steps == 0:
        return 1
    if steps == 1:
        return 1
    if dp[steps] != -1:
        return dp[steps]
    dp[steps] = dp_csm(steps - 1) + dp_csm(steps - 2)
    return dp[steps]

def dp_cst(steps): #Tabulation
    if steps == 0:
        return 1  
    elif steps == 1:
        return 1 
    dp = [-1] * (steps + 1)
    dp[0] = 1
    dp[1] = 1 
    for i in range(2, steps + 1):
        dp[i] = dp[i-1] + dp[i-2]
    return dp[steps]
