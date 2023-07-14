class Solution {
    public int longestSubsequence(int[] a, int di) {
        Map<Integer,Integer>mp=new HashMap<>();
        int m=0;
        for(int i=0;i<a.length;i++)
        {
            int d=a[i]-di;
            if(mp.containsKey(d))
            {
                mp.put(a[i],mp.get(d)+1);
            }
            else
            {
                mp.put(a[i],1);
            }
            m=Math.max(m,mp.get(a[i]));
        }
        return m;
    }
}