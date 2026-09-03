class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;

        for(int p : piles){
            r = Math.max(r, p);
        }
        int rev = r;

        while(l < r){
            int mid = l + (r - l) / 2;

            int total = 0;

            for(int p : piles){
                total += (p + mid - 1) / mid;
            }
            if(total <= h){
                rev = mid;
                r = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return rev ;
    }
}