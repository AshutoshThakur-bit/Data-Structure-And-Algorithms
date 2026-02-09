package LinkedList;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class MergeList {

    public static ListNode mergeList(ListNode list1 , ListNode list2){
        
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val <= list2.val){
            list1.next = mergeList(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeList(list1, list2.next);
            return list2;
        }
    }

    public static void print(ListNode head){
        while(head != null){
            System.out.println(head.val + "--> ");
            head = head.next;
        }
        System.out.println("null");

        
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode merger  = mergeList(list1, list2);
        print(merger);

        
    }
}
