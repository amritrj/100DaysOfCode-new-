class Solution {
    public int numberOfSteps(int num) {
        int a = num;
        int b = 0;
        
        while(a > 0){
            ++b;
            a = a % 2 == 0 ? a  / 2 : a - 1;
        }
        return b;
    }
}