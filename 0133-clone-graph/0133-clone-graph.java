class Solution {
    Node[] copyNodes = new Node[100];
    
    public Node cloneGraph(Node node) 
    {
        if (node == null) return null;
        
        int ind = node.val-1;  
        if (copyNodes[ind] == null) 
        {
            copyNodes[ind] = new Node(node.val); 
            for (Node neighbor : node.neighbors) 
                copyNodes[ind].neighbors.add(cloneGraph(neighbor));
        }
        return copyNodes[ind]; 
    }
}