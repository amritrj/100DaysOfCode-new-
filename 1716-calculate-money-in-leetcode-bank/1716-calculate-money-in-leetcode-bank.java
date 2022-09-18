class Solution {
    public int totalMoney(int n) {
        int s=0;
        int count=n%7;
        int st=(n/7)+1;
        while(count-->0){
            s+=st++;
        }
        int c=n/7;
        if(n>7)s+= 28*c + (c*(c-1)/2)*7 ;
        return s;
        
    }
}