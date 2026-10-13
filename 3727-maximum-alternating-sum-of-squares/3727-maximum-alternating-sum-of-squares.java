class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] s = new long[nums.length];

        for(int i = 0; i < nums.length; i++){
            s[i] = nums[i] * nums[i];
        } 
        Arrays.sort(s);

        long r = 0;
        for(long x : s){
            r += x;
        }
        for(int i = 0; i <nums.length/2; i++){
            r -= 2 * s[i];
        }
        return r;
    }
}