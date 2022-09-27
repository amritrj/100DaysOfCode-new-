class Solution {
    public boolean isHappy(int n) {
         int square = 0;
        while(n>9){
            while(n!=0){
                int rem = n % 10;
                square += Math.pow(rem,2);
                n = n/10;
            }
            n=square;
            square=0;
        }
        if(n == 1 || n==7){
            return true;
        }
        else{
            return false;
        }
    }
}