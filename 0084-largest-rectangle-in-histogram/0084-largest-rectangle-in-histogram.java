class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] lLess = new int[n];  
        int[] rLess = new int[n]; 
        
        lLess[0] = -1; 
        for (int i = 1; i < n; i++) {
            int p = i - 1;
            while (p >= 0 && heights[p] >= heights[i]) {
                p = lLess[p];
            }
            lLess[i] = p;
        }
        
        rLess[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            int p = i + 1;
            while (p < n && heights[p] >= heights[i]) {
                p = rLess[p];
            }
            rLess[i] = p;
        }
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            int width = rLess[i] - lLess[i] - 1;
            int area = heights[i] * width;
            max = Math.max(max, area);
        }
        
        return max;
    }
}
