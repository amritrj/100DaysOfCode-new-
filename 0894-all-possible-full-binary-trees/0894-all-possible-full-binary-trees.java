class Solution {
    Map<Integer, List<TreeNode>> memo = new HashMap<>();
    
    public List<TreeNode> allPossibleFBT(int n) {
        if (!memo.containsKey(n)) {
            List<TreeNode> list = new LinkedList<>();
            if (n == 1) {
                list.add(new TreeNode(0));
            } else if (n % 2 == 1) {
                for (int i = 0; i < n; ++i) {
                    int j = n - 1 - i;
                    for (TreeNode left: allPossibleFBT(i)) {
                        for (TreeNode right: allPossibleFBT(j)) {
                            TreeNode root = new TreeNode(0);
                            root.left = left;
                            root.right = right;
                            list.add(root);
                        }
                    }
                }
            }
            memo.put(n, list);
        }
        return memo.get(n);
    }
}