package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class CycleLinkedList {
    Node head;

    // Function to detect cycle
    public boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move by 1
            fast = fast.next.next;     // move by 2

            if (slow == fast) {        // cycle detected
                return true;
            }
        }
        return false;                  // no cycle
    }

    public static void main(String[] args) {
        CycleLinkedList list = new CycleLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        // Create a cycle for testing: 4 -> 2
        list.head.next.next.next.next = list.head.next;

        if (list.hasCycle()) {
            System.out.println("Cycle detected!");
        } else {
            System.out.println("No cycle.");
        }
    }
}
