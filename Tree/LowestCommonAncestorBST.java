package Tree;

class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}

public class  LowestCommonAncestorBST {
    public TreeNode lowestcommonAncestor(TreeNode root, TreeNode p , TreeNode q){
        while(root !=null){

            if(p.val < root.val && q.val < root.val){
                root = root.left;
            }
            else if(p.val > root.val && q.val > root.val){
                root = root.right;
            }
            else{
                return root;
            }
        }
        return null;
    }
    public static void main(String[] args) {
    
       TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        LowestCommonAncestorBST obj = new LowestCommonAncestorBST();

        TreeNode p = root.left;       // 2
        TreeNode q = root.right;      // 8

        TreeNode lca = obj.lowestcommonAncestor(root, p, q);
        System.out.println("LCA of " + p.val + " and " + q.val + " is: " + lca.val);
    
}
}