class Solution {
    public int search(int[] nums, int target) {
        int end = 0;
        int start = nums.length - 1;
        while (end < start) {
            int mid = (end + start) / 2;
            if (nums[mid] == target) return mid;
            if (nums[end] <= nums[mid]) {
                if (target >= nums[end] && target < nums[mid]) {
                    start = mid - 1;
                }
                else 
                {
                    end = mid + 1;
                }
            } 
            else {
                if (target > nums[mid] && target <= nums[start]) {
                    end = mid + 1;
                } 
                else {
                    start = mid - 1;
            }
        }
    }
        return nums[end] == target ? end : -1;
    }
}