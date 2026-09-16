class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);

        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){
                int number = (i + j) % n;
                if(nums[number] > nums[i]){
                    ans[i] = nums[number];
                    break;
                }
            }
        }
        return ans;
    }
}