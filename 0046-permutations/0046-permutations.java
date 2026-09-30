class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dis(0, nums, ans);
        return ans;
    }

    private void dis(int index, int[] nums, List<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> list = new ArrayList<>();

            for(int n : nums){
                list.add(n);
            }
            ans.add(list);
            return;
        }
        for(int i = index; i < nums.length; i++){
            swap(nums, index, i);
            dis(index + 1, nums, ans);
            swap(nums, index, i );
        }
    }

    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}