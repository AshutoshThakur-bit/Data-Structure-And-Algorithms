package Tree;
class TreeNode{
    int val;
    TreeNode left; 
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        left= null;
        right = null;
    }
}

public class MaxPathSumBinaryTree {
    int maxsum = Integer.MIN_VALUE;

    public int maxpathsum (TreeNode root){
        maxgain(root);
        return maxsum;

    }
    public int maxgain(TreeNode root){
        if(root == null) return 0;

        int leftgain = Math.max(maxgain(root.left),0);
        int rightgain = Math.max(maxgain(root.right), 0);

        int currentval = root.val + leftgain + rightgain;

        maxsum = Math.max(maxsum, currentval);

        return root.val + Math.max(leftgain, rightgain);
    }
    public static void main(String[] args) {
         MaxPathSumBinaryTree tree = new MaxPathSumBinaryTree();

        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Maximum Path Sum: " + tree.maxpathsum(root)); // Output: 42
    }
    
}
