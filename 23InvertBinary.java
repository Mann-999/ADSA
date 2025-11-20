class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class InvertBinary {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    static void printTree(TreeNode root) {
        if(root == null) return;
        java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            System.out.print(node.val + " ");
            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        Solution sol = new Solution();
        printTree(root);
        TreeNode inverted = sol.invertTree(root);
        printTree(inverted);
    }
}
