class Solution {
    public int minFlipsMonoIncr(String s) {
        int ans = 0, a = 0;
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == '0') ans = Math.min(a,ans+1);
            else a++;
        }
        return ans;
    }
}
