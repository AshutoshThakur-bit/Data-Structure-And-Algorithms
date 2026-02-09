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

public class SameTree {

    public boolean isSametree(TreeNode p, TreeNode q){

        //if both null
        if(p == null && q == null) return true;

        //if one is null
        if(p==null || q == null) return false;

        if(p.val != q.val) return false;

        return isSametree(p.left, q.left) && isSametree(p.right, q.right);
    }
    public static void main(String[] args) {
        SameTree tree = new SameTree();

        //one tree
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        //second tree
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println("Are both tree are same: " + tree.isSametree(p, q));
        

    }
    
}
