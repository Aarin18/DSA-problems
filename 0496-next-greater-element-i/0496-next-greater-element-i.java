class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++){
            int target = nums1[i];
            int next = -1;
            int j = 0;
            
            while (nums2[j] != target){
                j++;
        } 

            while (j < nums2.length) {
                if (nums2[j] > target) {
                    next = nums2[j];
                    break;
                }
                j++;
            }
            nums1[i] = next;
        }
        return nums1;
    }
}
