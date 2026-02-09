package LinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class MergeKList {

    public static ListNode mergerList(ListNode list1, ListNode list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val <= list2.val){
            list1.next = mergerList(list1.next, list2);
            return list1;
        }else{
            list2.next = mergerList(list1, list2.next);
            return list2;
        }

    }

    public static ListNode mergeKlist(ListNode [] lists){
        if(lists == null || lists.length == 0) return null;

       ListNode merged = lists[0];
       for(int i =1; i<lists.length; i++){
            merged =   mergerList(merged, lists[i]);
       }
       return merged;
    }


    public static void print(ListNode head){

        while(head != null){
            System.out.println(head.val + "--> ");
            head = head.next;
        }
        System.out.println("null ");
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(7);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(8);

        ListNode l3 = new ListNode(3);
        l3.next = new ListNode(6);
        l3.next.next = new ListNode(9);

        ListNode[] lists = new ListNode[]{l1, l2, l3};

        ListNode merged = mergeKlist(lists);
        print(merged);


        
    }
    
}
