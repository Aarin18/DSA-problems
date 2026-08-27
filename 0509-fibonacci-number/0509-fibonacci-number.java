class Solution {
    public int fib(int n) {
        if(n <= 1){
            return n;
        }
        int a = 0;
        int b = 1;
        int total = 0;

        for(int i = 2; i <= n; i++){
            total = a + b;
            a = b;
            b = total;
        }
        return total;
    }
}