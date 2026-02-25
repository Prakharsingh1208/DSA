class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        
        dp[0] = 1; 
        dp[1] = 1; 
        
        for (int nodes = 2; nodes <= n; nodes++) {
            for (int root = 1; root <= nodes; root++) {
                int leftCount  = dp[root - 1];      
                int rightCount = dp[nodes - root];   
                dp[nodes] += leftCount * rightCount;
            }
        }
        
        return dp[n];

    }
}