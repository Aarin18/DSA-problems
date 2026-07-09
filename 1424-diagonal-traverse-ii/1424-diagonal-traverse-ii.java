class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int totalele = 0;
        int max = 0;
        int nRow = nums.size();
        for (int r = 0; r < nRow; r++) {
            int rSize = nums.get(r).size();
            totalele += rSize;
            if (r + rSize - 1 > max) {
                max = r + rSize - 1;
            }
        }
        int[] counts = new int[max + 1];
        for (int r = 0; r < nRow; r++) {
            int rSize = nums.get(r).size();
            for (int c = 0; c < rSize; c++) {
                counts[r + c]++;
            }
        }
        int currentiDx = 0;
        for (int i = 0; i <= max; i++) {
            int temp = counts[i];
            counts[i] = currentiDx;
            currentiDx += temp;
        }
        int[] result = new int[totalele];
        for (int r = nRow - 1; r >= 0; r--) {
            int rSize = nums.get(r).size();
            for (int c = 0; c < rSize; c++) {
                int diag = r + c;
                result[counts[diag]] = nums.get(r).get(c);
                counts[diag]++; 
            }
        }

        return result;
    }
}