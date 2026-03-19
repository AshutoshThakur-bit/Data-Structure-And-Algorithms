import java.util.*;

class Node{
    public int val;
    public List<Node> neighbor;

    public Node(){
        val = 0;
        neighbor = new ArrayList<>();
    }
    public Node(int _val){
        val = _val;
        neighbor = new ArrayList<>();
    }
}
class cloneGraph{
    private HashMap<Node, Node> map = new HashMap<>();
    public Node cloneeGraph(Node node){
        if(node == null) return null;

        if(map.containsKey(node)){
           return map.get(node);
        }

        Node clone = new Node(node.val);
        map.put(node, clone);


        for(Node neighbors : node.neighbor){
            clone.neighbor.add(cloneeGraph(neighbors));
        }
        return clone;
    }
}