class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minWindow = Integer.MAX_VALUE;
        int currentSum = 0;
        int left = 0;
        int right = 0;

        for(right = 0; right < nums.length; right++){
            currentSum += nums[right];

            while (currentSum >= target){
                minWindow = Math.min(minWindow, right - left + 1);
                currentSum = currentSum - nums[left];
                left++;

            }
        }

    return minWindow == Integer.MAX_VALUE ? 0 : minWindow;
    }
}