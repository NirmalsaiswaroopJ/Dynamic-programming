def frogjump_m(ind, arr, dp): #Memoization
    if ind == 0:
        return 0
    if dp[ind] != -1:
        return dp[ind]
    min1 = frogjump_m(ind-1, arr, dp) + abs(arr[ind-1] - arr[ind])
    min2 = float('inf')
    if(ind>1):
        min2 = frogjump_m(ind - 2, arr, dp) + abs(arr[ind-2] - arr[ind])
    dp[ind] = min(min1, min2)
    return dp[ind]

def minimumEnergy(arr):
    N = len(arr)
    dp = [-1] * N 
    return frogjump_m(N-1, arr, dp)

def frogjump_t(ind, arr, dp): #Tabulation
    dp = [-1] * (ind + 1)
    dp[0] = 0 
    for i in range(1, ind+1):
        min1 = dp[i-1] + abs(arr[i-1] - arr[i])
        min2 = float('inf')
        if(i>1):
            min2 = dp[i-2] + abs(arr[i-2] - arr[i])
        dp[i] = min(min1, min2)
    return dp[ind]
    
def minimumEnergy(arr):
    N = len(arr)
    return frogjump_t(N - 1, arr)
