class Solution {
    public int maxProduct(int[] nums) {
        int maxOne = 0;
        int maxTwo = 0;

        for( int n : nums){
            if(n > maxOne){
                maxTwo = maxOne;
                maxOne = n;
            }else if(n > maxTwo){
                maxTwo = n;
            }
        }
        return (maxOne - 1) * (maxTwo - 1);
    }

}