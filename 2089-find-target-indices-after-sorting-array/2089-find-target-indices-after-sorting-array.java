class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0, a = 0;
        for (int n : nums) {
            if (n == target) count++;
            if (n < target) a++;
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(a++);
        }
        return result;
        
    }
}