class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode now = root;
        Stack<TreeNode> stack = new Stack<>();
        while(now != null || stack.size() != 0)
        {
            while(now != null){
                stack.push(now);
                now = now.left;
            }
            now = stack.pop();
            res.add(now.val);
            now = now.right;
        }
        return res;   
    }
}