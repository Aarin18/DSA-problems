class Solution {
    public boolean predictTheWinner(int[] nums) {
        return maxDif(nums, 0, nums.length - 1) >= 0;
    }
    private int maxDif(int[] nums, int i, int j){
        return (i == j) ? nums[i] : Math.max(nums[i] - maxDif(nums, i+1, j),nums[j] - maxDif(nums, i, j -1));
    }
}