class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int mn = 0;
        int mx = 1000000000;
        while (mn +1< mx) {
            int md = (mx - mn)/2 + mn;
            int count = 0;
            for (int a: nums) {
                count+=(a-1)/md;
            }
            if (count <= maxOperations) {
                mx = md;
            } else{
                mn = md;
            }
        }
        return mx;
    }
}