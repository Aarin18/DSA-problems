class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int i = 0; i < accounts.length; i++ ){
            int costome = 0;

            for(int j = 0 ; j < accounts[i].length; j++){
                costome += accounts[i][j];
            }

            if(costome > max){
                max = costome;
            }
        }
        return max;
    }
}