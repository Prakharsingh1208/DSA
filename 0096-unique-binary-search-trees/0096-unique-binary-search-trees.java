class Solution {
    public int numTrees(int n) {
        // dp[i] = number of unique BSTs with i nodes
        int[] dp = new int[n + 1];
        
        // Base cases
        dp[0] = 1; // empty tree
        dp[1] = 1; // single node
        
        // Fill dp bottom-up
        for (int nodes = 2; nodes <= n; nodes++) {
            for (int root = 1; root <= nodes; root++) {
                int leftCount  = dp[root - 1];      // nodes to the left of root
                int rightCount = dp[nodes - root];   // nodes to the right of root
                dp[nodes] += leftCount * rightCount;
            }
        }
        
        return dp[n];

    }
}