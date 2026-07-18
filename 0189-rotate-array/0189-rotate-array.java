class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0; i < n ; i++){
            int newindex = (i + k) % n;
            ans[newindex] = nums[i];

        }
        System.arraycopy(ans, 0, nums, 0, n);
    }
}