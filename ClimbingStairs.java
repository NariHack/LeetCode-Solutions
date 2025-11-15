class Solution {
    public int climbStairs(int n) {
        if (n < 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}

//Approach:
// - Define dp[i] as the number of ways to reach step i
// - dp[1] = 1 (only one way to reach first step)
// - dp[2] = 2 (two ways: 1 + 1, 2)

// - Recurrence relation:
//    dp[i] = dp[i - 1] + dp[i - 2]
//    to reach step i, you can come from step i-1 (1 step) or i-2 (2 steps)

//Time Complexity is O(n)
//Space Complexity is O(n)

//This question taught me how to use DP arrays. Instead of recalculating, we can store answers to smaller
//subproblems and build a final solution.
