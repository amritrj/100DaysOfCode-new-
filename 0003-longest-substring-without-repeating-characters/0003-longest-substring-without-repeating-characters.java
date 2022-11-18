class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] counts = new int[128];
        int start = 0, ab = 0;
        for (int end=0; end < s.length(); end++) {
            char c = s.charAt(end);
            while (counts[c] > 0) {
                counts[s.charAt(start)]--;
                start++;
            } 
            counts[c]++;
            ab = Math.max(ab, end - start + 1);
        }
        return ab;
    }
}