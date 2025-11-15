class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        
        return dp[nums.length - 1];
    }
}

//Approach:
// - Define dp[i] as the maximum money that can be robbed by i houses
// - dp[0] = nums[0] (only one house)
// - dp[1] = max(nums[0], nums[1]) (the more profitable of the two houses)

//Recurrence relation:
// - dp[i] = math(dp[i - 1], dp[i - 2] + nums[i])
// - dp[i - 1] means skip the current house
// - dp[i - 2] + nums[i] means take the current house
// - Choose the more profitable option

//Time Complexity is O(n)
//Space Complexity is O(n)

//This problem taught me how DP can handle choice scenarios. It is important to carefully define the state dp[i]
//and make sure the recurrence relation handles both possibilities (rob or skip)
