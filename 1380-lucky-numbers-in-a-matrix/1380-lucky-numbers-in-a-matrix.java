class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rMin = new int[m];
        for(int i = 0 ; i < m ; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < n ; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
            rMin[i] = min;
        }
        int[] cMax = new int[n];
        for(int j = 0 ; j < n ; j++){
            int max = Integer.MIN_VALUE;
            for(int i = 0 ; i < m ; i++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
            cMax[j] = max;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rMin[i] && matrix[i][j] == cMax[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }
    return result;
    }
}