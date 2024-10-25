### Python version
def generate(numRows: int) -> List[List[int]]:
        dp = []
        if(numRows == 0): 
            return dp
        for i in range(numRows):
            row = []
            row = [1] * (i + 1)
            for j in range(1, i):
                row[j] = dp[i-1][j-1] + dp[i-1][j]
            dp.append(row)
        return dp
### What if we are asked only that indexed-row in that case we have the following code - 
def getRow(rowIndex: int) -> List[int]:
        dp = []
        if rowIndex == 0:
            return [1]
        for i in range(rowIndex+1):
            row = []
            row = [1] * (i+1)
            for j in range(1,i):
                row[j] = dp[i-1][j-1] + dp[i-1][j]
            dp.append(row)
        return dp[rowIndex]
