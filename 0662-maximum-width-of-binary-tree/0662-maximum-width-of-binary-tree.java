class Solution {
    class Pair {
        TreeNode node;
        int state;
        Pair (TreeNode node, int state) {
            this.node = node;
            this.state = state;
        }
    }
    
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int maxWidth = 0;
        
        while (q.size() != 0) {
            int size = q.size();
            maxWidth = Math.max(maxWidth, Math.abs(q.peekFirst().state - q.peekLast().state) + 1);
            while (size-- > 0) {
                Pair rem = q.removeLast();
                if (rem.node.left != null) {
                    q.addFirst(new Pair(rem.node.left, 2 * rem.state + 1));
                }
                if (rem.node.right != null) {
                    q.addFirst(new Pair(rem.node.right, 2 * rem.state + 2));
                }
            }
        }
        return maxWidth;
    }
}