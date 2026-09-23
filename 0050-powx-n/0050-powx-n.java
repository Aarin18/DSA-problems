class Solution {
    public double myPow(double x, int n) {
        if (n == 0){
            return 1.0;
        } 
        
        if (n < 0){
            return 1.0/x * myPow(1.0 / x, -(n + 1)); 
        }
        if(n % 2 == 0){
            return myPow(x*x, n /2);
        }else{
            return x * myPow(x*x, n /2);

        }
    }
}