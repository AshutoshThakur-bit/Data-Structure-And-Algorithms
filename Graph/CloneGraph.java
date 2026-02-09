package Graph;
import java.util.*;

class Node{
    int val;
    List<Node> neighbors;

    Node(int val){
        this.val = val;
        neighbors = new ArrayList<>();
    }
}
public class CloneGraph {

    public static Node cloneGraph(Node node){
        if(node == null) return null;
       
        Map <Node, Node> map = new HashMap<>();

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        map.put(node, new Node(node.val));

        while(!queue.isEmpty()){
          Node current = queue.poll();

         for(Node neighbor : current.neighbors){
            if(!map.containsKey(neighbor)){

                map.put(neighbor, new Node(neighbor.val));
                queue.add(neighbor);
            }

            map.get(current).neighbors.add(map.get(neighbor));
         }

        }
        return map.get(node);
    }

     public static void printGraph(Node node){
        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();

        visited.add(node);
        queue.offer(node);

        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.println("node" + current.val + "neighbor");

            for(Node neighbor: current.neighbors){
                System.out.println(neighbor.val+ " ");
                if(!visited.contains(neighbor)){

                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
            System.out.println();
        }
     }

     public static void main(String[] args) {
         Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        // Clone the graph
        Node clonedGraph = cloneGraph(node1);

        // Print original and cloned graph
        System.out.println("Original Graph:");
        printGraph(node1);

        System.out.println("\nCloned Graph:");
        printGraph(clonedGraph);
     }
    
}
