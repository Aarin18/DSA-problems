class Solution {
    public int maximumCandies(int[] candies, long k) {
        long total = 0; 
        int max = 0;
        
        for (int pile : candies) {
            total += pile;
            if (pile > max) {
                max = pile;
            }
        }
        
        if (total < k) {
            return 0;
        }
        
        int l = 1;
        int h = max;
        int ans = 0;
        
        while (l <= h) {
            int mid = l + (h - l) / 2;
            long getMid = 0; 
            for (int pile : candies) {
                getMid += (pile / mid);
            }
            
            if (getMid >= k) {
                ans = mid;
                l = mid + 1; 
            } else {
                h = mid - 1; 
            }
        }
        
        return ans;
    }
}
