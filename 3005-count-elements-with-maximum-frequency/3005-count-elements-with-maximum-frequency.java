class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int max = 0;

        for(int n : nums){
            freq[n]++;
            if(freq[n] > max){
                max = freq[n];
            }
        }

        int total = 0;
        for(int f : freq){
            if(f == max){
                total += max;
            }
        }
        return total;
    }
}