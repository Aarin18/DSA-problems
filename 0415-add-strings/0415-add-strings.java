class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int i1 = num1.length() - 1;
        int i2 = num2.length() - 1;
        int c = 0;

        while(i1 >= 0 || i2 >= 0 || c == 1){
            int n1 = 0; 
            int n2 = 0; 

            if(i1 >= 0){
                n1 = num1.charAt(i1) - '0';
            }
            if(i2 >= 0){
                n2 = num2.charAt(i2) - '0';
            }

            int sum = n1 + n2 + c;
            ans.append(sum % 10);
            c = sum / 10;

            i1--;
            i2--;
            
        } 
        return ans.reverse().toString();

    }
}