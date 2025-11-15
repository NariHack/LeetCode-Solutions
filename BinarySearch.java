class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;

        while (low <= high){
            int middle = (low + high) / 2;
            if (nums[middle] == target) return middle;
            else if (nums[middle] < target) low = middle + 1;
            else high = middle - 1;
        }
        return - 1;

    }
}

//Approach:
// - Use binary search
// - Start with two points:
//   - low = 0 (beginning of array)
//   - high = nums.length - 1 (end of array)
// - Every step:
//   - Compute middle with average of low and high
//   - If nums[middle] = target, then return middle (this means middle is the index of target)
//   - If nums[middle] < target, move low to middle + 1 (only search the right half of the array)
//   - If nums[middle] > target, move high to middle - 1 (only search the left half of the array)
// - Continue until low > high (meaning we searched the entire array)
// - If nothing is found, return -1
//This approach requires a sorted array (which the question does provide)

//Time Complexity is O(log n)
//Space Complexity is O(1)

//This problem taught me how to use binary search to reduce time complexity, which (in this scenario) is much
//faster than a linear search
