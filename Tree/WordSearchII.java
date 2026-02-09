package Tree;

import java.util.*;

class WordSearchII {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = null; // store word at end node
    }

    private TrieNode root;

    public WordSearchII(String[] words) {
        root = new TrieNode();
        for (String word : words) insert(word);
    }

    private void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null)
                node.children[c - 'a'] = new TrieNode();
            node = node.children[c - 'a'];
        }
        node.word = word;
    }

    public List<String> findWords(char[][] board) {
        Set<String> result = new HashSet<>();
        int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                dfs(board, i, j, root, result);

        return new ArrayList<>(result);
    }

    private void dfs(char[][] board, int i, int j, TrieNode node, Set<String> result) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return;

        char c = board[i][j];
        if (c == '#' || node.children[c - 'a'] == null) return;

        node = node.children[c - 'a'];
        if (node.word != null) result.add(node.word);

        board[i][j] = '#'; // mark as visited
        dfs(board, i + 1, j, node, result);
        dfs(board, i - 1, j, node, result);
        dfs(board, i, j + 1, node, result);
        dfs(board, i, j - 1, node, result);
        board[i][j] = c; // backtrack
    }

    public static void main(String[] args) {
        char[][] board = {
            {'o','a','a','n'},
            {'e','t','a','e'},
            {'i','h','k','r'},
            {'i','f','l','v'}
        };
        String[] words = {"oath","pea","eat","rain"};

        WordSearchII ws = new WordSearchII(words);
        System.out.println(ws.findWords(board));
    }
}

