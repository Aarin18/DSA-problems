class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 = 1;

        //marks 1st row andd 1st col
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                //mark the i row
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    //mark the j row
                    if(j != 0){
                        matrix[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                }
            }
        }
        //update the matrix without using the 1st row and 1st column
        for(int i = 1; i < n ; i++){
            for(int j = 1 ; j < m ; j++){
                if(matrix[i][0] == 0 ||matrix[0][j] == 0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int j = 0; j < m ; j++){
                matrix[0][j] =0;
            }
        }
        if(col0 == 0){
            for(int i = 0; i < n ; i++){
                matrix[i][0] =0;
            }
        }
        
    }
}