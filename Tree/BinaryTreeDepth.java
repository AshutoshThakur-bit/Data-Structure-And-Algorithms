package Tree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        left = null;
        right = null;
    }
}

public class BinaryTreeDepth{
    public int maxdepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftdepth = maxdepth(root.left);
        int rightdepth = maxdepth(root.right);

        return 1+ Math.max(leftdepth, rightdepth);
    }
    public static void main(String[] args) {
        BinaryTreeDepth tree = new BinaryTreeDepth();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.print("Maximum depth: " + tree.maxdepth(root));
        
    }

}