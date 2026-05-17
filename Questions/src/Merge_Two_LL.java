public class Merge_Two_LL {


    public static void main(String args[]){
        ListNode head1 = new ListNode(10);
        head1.next = new ListNode(20);
        head1.next.next = new ListNode(30);

        // --- CREATE LIST 2: 40 -> 50 -> 60 ---
        ListNode head2 = new ListNode(40);
        head2.next = new ListNode(50);
        head2.next.next = new ListNode(60);
        ListNode result = mergeTwoLists(head1, head2);
        printList(result);
    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i = list1;
        ListNode j = list2;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                k.next= i;
                i=i.next;
            }else{
                k.next= j;
                j=j.next;
            }
            k=k.next;
        }

        if(i==null){
            k.next=j;
        }else{
            k.next= i;
        }
        return dummy.next;

    }
}
class ListNode {
    int val;
    ListNode next;

    // Constructors
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
