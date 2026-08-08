class Solution {
    public int[] replaceElements(int[] arr) {
        int max_r = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = max_r;
            max_r = Math.max(max_r, temp);
        }
        return arr;
    }
}