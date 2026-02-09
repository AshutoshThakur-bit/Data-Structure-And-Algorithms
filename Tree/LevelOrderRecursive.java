package Tree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class LevelOrderRecursive {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        traverse(root, 0, result);
        return result;
    }

    // Helper recursive function
    private void traverse(TreeNode node, int level, List<List<Integer>> result) {
        if (node == null) return;

        // If this level is encountered first time, add a new list
        if (result.size() == level) {
            result.add(new ArrayList<>());
        }

        // Add current node value to its level list
        result.get(level).add(node.val);

        // Recursive calls for left and right subtrees
        traverse(node.left, level + 1, result);
        traverse(node.right, level + 1, result);
    }

    public static void main(String[] args) {
        LevelOrderRecursive tree = new LevelOrderRecursive();

        // Example Tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> levels = tree.levelOrder(root);

        System.out.println("Level Order Traversal (Recursive):");
        for (List<Integer> level : levels) {
            System.out.println(level);
        }
    }
}
