class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int mn = 0;
        int max = 1000000000;
        while (mn +1< max) {
            int mid = (max - mn)/2 + mn;
            int count = 0;
            for (int a: nums) {
                count+=(a-1)/mid;
            }
            if (count <= maxOperations) {
                max = mid;
            } else{
                mn = mid;
            }
        }
        return max;
    }
}