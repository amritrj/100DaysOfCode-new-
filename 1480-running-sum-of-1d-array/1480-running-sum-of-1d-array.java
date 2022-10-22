class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int res = 0;
        for(int i=0;i<nums.length;i++){
            res = res + nums[i];
            result[i] = res;
        }
        return result;
    }
}
