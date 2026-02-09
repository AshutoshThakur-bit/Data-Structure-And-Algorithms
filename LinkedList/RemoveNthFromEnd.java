package LinkedList;

 class ListNode{
    int val;
    ListNode next =null;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class RemoveNthFromEnd {

    public static ListNode Removefromend(ListNode head, int n){
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        for(int i= 0; i<=n; i++){
            first = first.next;
        }

        while(first != null){
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummy.next;
    }


    public static void print(ListNode head){
        while(head != null){
            System.out.println(head.val + "--> ");
            head = head.next;
        }
        System.out.println("null ");

    }
    public static void main(String[] args) {
         ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        print(head);

        head = Removefromend(head, 2);  // Remove 2nd node from end

        System.out.println("After Removing Nth Node:");
        print(head);
    }
    
}
