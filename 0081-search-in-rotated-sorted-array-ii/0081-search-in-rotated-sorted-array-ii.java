class Solution {
    public boolean search(int[] nums, int target) {
        int strt = 0, a = nums.length - 1;
        while(strt <= a) {
          int mid = strt + (a - strt) / 2;
          if(nums[mid] == target)
              return true;
          if(nums[strt] == nums[mid] && nums[mid] == nums[a]) {
                strt ++;
                a --;
            }
          else if(nums[strt] <= nums[mid]) {
              if(target >= nums[strt] && target <= nums[mid])
              a = mid - 1;

              else
              strt = mid + 1;
          }
          else {
              if(target <= nums[a] && target >= nums[mid])
              strt = mid + 1;
              else
              a = mid - 1; 
          }
      }
      return false;
    }
}