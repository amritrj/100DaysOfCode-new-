class Solution {
    public void dfs(List<Character>[] adj, char node, char minCharacter, char [] visited)
    {
        visited[node - 'a'] = minCharacter;
        for(char near: adj[node - 'a'])
        {
            if(visited[near - 'a'] == '#')
            {
                dfs(adj, near, minCharacter, visited);
            }
        }
    }
    
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int n = s1.length();
        
        List<Character>[] adj = new List[26];
        for (int i = 0; i < 26; i++) 
        {
            adj[i] = new ArrayList<>();
        }
        
     
        for(int i = 0; i < n; i++)
        {
            adj[s1.charAt(i) - 'a'].add(s2.charAt(i));
            adj[s2.charAt(i) - 'a'].add(s1.charAt(i));
        }
        char [] visited = new char[26];
        for(int i = 0; i < 26; i++)
        {
            visited[i] = '#';
        }
        
       
        for(char c = 'a'; c <= 'z'; c++)
        {
            if(visited[c - 'a'] == '#')
            {
                dfs(adj, c, c, visited);
            }
        }
        String ans = "";
        for(int i = 0; i < baseStr.length(); i++)
        {
            ans += visited[baseStr.charAt(i) - 'a'];
        }
        
        return ans;
    }
}