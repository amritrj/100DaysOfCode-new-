class Solution {
    boolean vis[], res=true;
    List[] arr;
    public boolean canFinish(int nc, int[][] preq) {
        vis=new boolean[nc];
        arr=new List[nc];
        for(int i=0;i<nc; arr[i]=new ArrayList<Integer>(), i++);
        for(int[] conn: preq) arr[conn[1]].add(conn[0]);

        boolean pvis[]=new boolean[nc];        
        for(int i=0;i<nc;i++)
            if(!vis[i])
                dfs(i, pvis);
        return res;
    }
    private void dfs(int node, boolean[] pvis){
        if(!res || vis[node]) return;
        if(pvis[node]){
            res=false;
            return;
        }
        pvis[node]=true;
        for(Object adj: arr[node])
            dfs((Integer)adj, pvis);
        pvis[node]=false;
        vis[node]=true;
    }
}