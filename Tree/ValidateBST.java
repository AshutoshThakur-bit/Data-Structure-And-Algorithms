package Tree;

class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
public class ValidateBST {
    public  boolean isValidateBst(TreeNode root){
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public static boolean helper(TreeNode root, long min, long max){
        if(root == null) return true;

        if(root.val <= min || root.val >= max)return false;

        return helper(root.left, min, root.val) && helper(root.right, max, root.val);

    }
    public static void main(String[] args) {
          ValidateBST tree = new ValidateBST();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        System.out.println("Is valid BST? " + tree.isValidateBst(root));
    }
}
