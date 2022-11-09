class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int index =0;
        int start =0;
        int end = n-1;
        
        while(index<=end && start<end){
            if(nums[index]==0)
            {
                nums[index] = nums[start];
                nums[start] =0;
                start++;
                index++;
            }
            else if(nums[index]==2)
            {
                nums[index] = nums[end];
                nums[end]  = 2;
                end--;
            }
            else
            index++;
        }
    }
}