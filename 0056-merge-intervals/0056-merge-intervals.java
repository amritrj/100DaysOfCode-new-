class Solution {
    public int[][] merge(int[][] intervals) {
         if (intervals.length <= 1)
			return intervals;
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        List<int[]> ans=new ArrayList<>();
        int now[]=intervals[0];
        ans.add(intervals[0]);
        for(int next[]:intervals){
            if(next[0]<=now[1]){
                now[1]=Math.max(now[1],next[1]);
            }
            else{
                now=next;
                ans.add(now);
            }
        }
        int[][] arr=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++)
            arr[i]=ans.get(i);
        return arr;
    }
}