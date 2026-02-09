package Tree;

class Trie {
    private static class Node {
        Node[] children = new Node[26];
        boolean end;
    }

    private Node root = new Node();

    public void insert(String word) {
        Node node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) node.children[c - 'a'] = new Node();
            node = node.children[c - 'a'];
        }
        node.end = true;
    }

    public boolean search(String word) {
        Node node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) return false;
            node = node.children[c - 'a'];
        }
        return node.end;
    }

    public boolean startsWith(String prefix) {
        Node node = root;
        for (char c : prefix.toCharArray()) {
            if (node.children[c - 'a'] == null) return false;
            node = node.children[c - 'a'];
        }
        return true;
    }

    // Test
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("apple");
        t.insert("app");
        System.out.println(t.search("app"));      // true
        System.out.println(t.search("apple"));    // true
        System.out.println(t.search("appl"));     // false
        System.out.println(t.startsWith("ap"));   // true
        System.out.println(t.startsWith("bat"));  // false
    }
}
