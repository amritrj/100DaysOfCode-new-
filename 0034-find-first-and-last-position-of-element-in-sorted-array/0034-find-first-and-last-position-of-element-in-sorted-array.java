class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fin[]={-1,-1};
        fin[0]=fun(nums,target,true);
        if(fin[0]!=-1)
            fin[1]=fun(nums,target,false);
        return fin;
    }
    int fun(int[] nums,int target,boolean findStartIndex){
        int start=0,end=nums.length-1;
        int fin=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                start=mid+1;
            else{
                fin=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return fin;
        
    }
}