package Graph;
import java.util.*;

public class BFS{

    private Map <Integer, List<Integer>> adjlist = new HashMap<>();

    public void addEdge(int src, int desc){
        adjlist.putIfAbsent(src, new ArrayList<>());
        adjlist.putIfAbsent(desc, new ArrayList<>());

        adjlist.get(src).add(desc);
        adjlist.get(desc).add(src);

    }

    public void bfs(int start){
        Set <Integer> visited = new HashSet<>();
        Queue <Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.offer(start);

        System.out.print("BFS Traversal");

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println(node + " ");


            for(int neighbor : adjlist.getOrDefault(node, new ArrayList<>())){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

    }
    public static void main(String[] args) {

        BFS graph = new BFS();
        graph.addEdge(0,1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        // 0 से BFS शुरू करें
        graph.bfs(0);
        
    }
    
}
