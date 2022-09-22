class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int a = num;
            num = 0;
            while (a > 0) {
                num = num + (a % 10);
                a = a / 10;
            }
        }
        return num;
    }
}