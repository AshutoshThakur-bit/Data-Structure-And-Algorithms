package Graph;

import java.util.*;

public class DFSExample {
    private Map<Integer, List<Integer>> adjlist = new HashMap<>();

    public void addedge(int src, int dest){

        adjlist.putIfAbsent(src, new ArrayList<>());
        adjlist.putIfAbsent(dest, new ArrayList<>());

        adjlist.get(src).add(dest);
        adjlist.get(dest).add(src);

    }
    public void dfs(int node, Set<Integer> visited){
        visited.add(node);
        System.out.println(node+ " ");

        for(int neighbor : adjlist.getOrDefault(node, new ArrayList<>())){
            if(!visited.contains(neighbor)){
                dfs(neighbor, visited);

            }
        }

    }
    public static void main(String[] args) {
        DFSExample graph = new DFSExample();

         graph.addedge(0, 1);
        graph.addedge(0, 2);
        graph.addedge(1, 3);
        graph.addedge(2, 4);
        graph.addedge(3, 4);
        graph.addedge(4, 5);

        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS Traversal: ");
        graph.dfs(0, visited); 
        
    }
}
