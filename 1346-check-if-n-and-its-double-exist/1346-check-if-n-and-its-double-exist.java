class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int ans = 2 * arr[i];
            int lo = 0, hi = arr.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if(arr[mid] == ans && mid != i) return true;
                else if (arr[mid] < ans) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        return false;
    }
}