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

public class SubtreeOfAnotherTree {
    public  boolean isSubtree(TreeNode root, TreeNode subroot){
        if(subroot == null) return true;
        if(root == null) return false;

        if(issametree(root, subroot)) return true;

        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);

    }
    private static boolean issametree(TreeNode s, TreeNode t){
        if(s == null && t == null) return true;

        if(s==null || t == null ) return false;

        return (s.val == t.val) && issametree(s.left, t.left) && issametree(s.right, t.right);

    }

    public static void main(String[] args) {
         TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        // Create subtree (subRoot)
        TreeNode subroot = new TreeNode(4);
        subroot.left = new TreeNode(1);
        subroot.right = new TreeNode(2);

        // Create object and test
        SubtreeOfAnotherTree solution = new SubtreeOfAnotherTree();
        System.out.println("Is Subtree: " + solution.isSubtree(root, subroot));
    }
    
}
