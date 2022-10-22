class Solution {
    public int[] runningSum(int[] nums) {
        int l = nums.length;
        int[] result = new int[l];
        int rs = 0;
        for(int i=0;i<nums.length;i++){
            rs = rs + nums[i];
            result[i] = rs;
        }
        return result;
    }
}
