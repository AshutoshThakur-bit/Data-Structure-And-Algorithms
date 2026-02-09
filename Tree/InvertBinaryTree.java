package Tree;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        left = null;
        right= null;
    }
}

public class InvertBinaryTree {
    public TreeNode inverttree(TreeNode root){

        if(root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        inverttree(root.left);
        inverttree(root.right);

        return root;
    }
    public void inorder(TreeNode root){
        if(root == null) return ;
        inorder(root.left);
        System.out.println(root.val+ " ");
        inorder(root.right);

    }
    public static void main(String[] args) {
        InvertBinaryTree tree = new InvertBinaryTree();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

         System.out.print("Original Tree (Inorder): ");
        tree.inorder(root);

        tree.inverttree(root);

        System.out.print("\nInverted Tree (Inorder): ");
        tree.inorder(root);
        
    }
    
}
