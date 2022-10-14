class Solution {
    public int findKthPositive(int[] arr, int k) {
        int a = 0, r = arr.length, m;
        while (a < r) {
            m = (a + r) / 2;
            if (arr[m] - 1 - m < k)
                a = m + 1;
            else
                r = m;
        }
        return a + k;
        
    }
}