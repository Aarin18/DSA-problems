class Solution {
    public boolean halvesAreAlike(String s) {
        String v = "aeiouAEIOU";
        int count = 0;
        int mid = s.length() / 2;

        for(int i = 0; i < mid ; i++){
            if(v.indexOf(s.charAt(i)) != -1){
                count++;
            }
            if(v.indexOf(s.charAt(i + mid)) != -1){
                count--;
            }
            
        }
    return count == 0;
    }

}