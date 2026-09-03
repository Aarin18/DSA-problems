class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0;
        int r = 0;

        for(int n : nums){
            l = Math.max(l, n);
            r += n;
        }
        while(l < r){
            int mid = l + (r - l) / 2;

            int part = 1;
            int sum = 0;

            for(int n : nums){
                if(sum + n > mid){
                    part++;
                    sum = n;
            }else{
                sum += n;
                }
            }
        
            if(part > k){
            l = mid + 1;
            }else{
                r = mid;
            }
        }
        
        return l;
    }
}
