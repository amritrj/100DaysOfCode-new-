class Solution {
    public int longestSubarray(int[] nums) {
        int zeroIdx = -1;
        int i=-1;
        int j=0;
        int n = nums.length;
        int maxLen = 0;
        while(j<n){
            if(nums[j]==0){ //updating our starting point
                i=zeroIdx+1;
                zeroIdx=j;
            }
            maxLen = Math.max(maxLen,j-i);
            j++;
        }
        return maxLen==nums.length?maxLen-1:maxLen;
    }
}