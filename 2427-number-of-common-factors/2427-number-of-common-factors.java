class Solution {
    public int commonFactors(int a, int b){
        int max=Integer.max(b, a);
        int count=0;
        for (int i = 1; i <=max; i++){    
        if(a%i==0 && b%i==0)
        {
            count++;
        }
    }
        System.out.println(count);
        return count;
    }
}