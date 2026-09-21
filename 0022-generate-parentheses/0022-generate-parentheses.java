class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(n, n, "", list);
        return list;
    }
    
    public void helper(int left, int right, String s, List<String> list) {
        if (left == 0 && right == 0) {
            list.add(s);
            return;
        }
        
        if (left > 0) {
            helper(left - 1, right, s + "(", list);
        }
        
        if (right > left) {
            helper(left, right - 1, s + ")", list);
        }
    }
}