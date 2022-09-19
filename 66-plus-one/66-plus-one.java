class Solution {
    public int[] plusOne(int[] digits) {
        int a = 1;
       int[] b = new int[digits.length+1];
       for(int i = digits.length - 1; i >= 0; i--)
       {
           if(digits[i] == 9 && a == 1)
           {
               b[i+1] = 0;
           }
           else
           {
               b[i+1] = digits[i] + a;
               a = 0;
           }
       }
       if(a == 1)
       {
           b[0] = 1;
           return b;
       }
       return Arrays.copyOfRange(b,1,b.length);
        
    }
}