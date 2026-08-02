class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        List<Integer>[] diag = new ArrayList[m + n - 1];
        for(int i = 0 ; i < diag.length;i++){
            diag[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < m ; i++){
            for(int j = 0; j < n; j++){
                diag[i+j].add(mat[i][j]);
            }
        }
        int[] ans = new int[m * n];
        int index = 0;
        for(int k = 0; k < diag.length ; k++){
            List<Integer> list = diag[k];

            if(k % 2 == 0){
                for(int i = list.size() - 1 ; i >= 0 ; i-- ){
                    ans[index++] = list.get(i);
                }
            }else{
                for (int i = 0; i < list.size(); i++) {
                    ans[index++] = list.get(i);
                }
            }
        }
        return ans;
    }
}