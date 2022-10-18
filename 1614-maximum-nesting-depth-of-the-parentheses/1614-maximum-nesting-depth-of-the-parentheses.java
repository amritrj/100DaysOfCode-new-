class Solution {
    public int maxDepth(String s) {
        int dp = 0;
        int mx = 0;
        for(int i = 0;i < s.length();i++) {
            if(s.charAt(i) == '(') {
                dp++;
            } else if(s.charAt(i) == ')') {
                dp--;
            }
            mx = dp > mx ? dp : mx;
        }
        
        return mx;
        
    }
}