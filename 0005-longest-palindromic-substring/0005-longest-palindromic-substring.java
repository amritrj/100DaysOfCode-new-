class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        int low,high;
        int x=s.length();
        for(int i=0;i<x;i++)
        {
            low=i;
            high=i+1;
            
            while(low>=0 && high<x && s.charAt(low)==s.charAt(high))
            {
                if((end-start)<(high-low))
                {
                    start=low;
                    end=high;
                }
                low--;
                high++;
            }
            low=i;
            high=i+2;
            while(low>=0 && high<x && s.charAt(low)==s.charAt(high))
            {
                if((end-start)<(high-low))
                {
                    start=low;
                    end=high;
                }
                low--;
                high++;
            }
        }
        return s.substring(start,end+1);
        
    }
}