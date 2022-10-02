class Solution {
    public boolean isPowerOfFour(int n) {
       if(Math.pow(4,(int)((Math.log(n)/Math.log(4))))==n && n!=0)
           return true;
        else
            return false;
        
    }
}