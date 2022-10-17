class Solution {
    public int myAtoi(String s) {
        if(s==null) return 0;
        s = s.trim(); 
        if(s.length()==0) return 0;
        int sgn = 1;
        long ans = 0; 
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;
        if(s.charAt(0)=='-') sgn = -1; 
        int i = (s.charAt(0)=='+' || s.charAt(0)=='-') ? 1 : 0;
        while(i<s.length()){
            if(!Character.isDigit(s.charAt(i))) break;
            ans = ans * 10 + (s.charAt(i)-'0'); 
            if(sgn == -1 && ans*-1 < MIN) return MIN; 
            if(sgn == 1 && ans > MAX) return MAX;
            i++;
        }
        return (int)ans*sgn; 
        
    }
}