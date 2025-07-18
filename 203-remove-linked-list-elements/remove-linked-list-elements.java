/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode removeElements(ListNode head, int v) 
    {
        // ---> 3rd way (recursion (take all elements as head and iterate))

        if(head == null) return null;
        head.next = removeElements(head.next,v);
        return head.val == v ? head.next : head;



        // ---> 2nd way (2 while 1->head 2->elemnts)

        // if(head == null) return null;
        // while(head != null && head.val == v)
        // {
        //     head = head.next;
        // }
        // ListNode current = head;
        // while(current != null && current.next != null)
        // {
        //     if(current.next.val == v)
        //     {
        //         current.next = current.next.next;
        //     }
        //     else
        //     {
        //         current = current.next;
        //     }
        // }
        // return head; 



        // ---> 1st way (use dummy 0 index)

        // ListNode dummy = new ListNode(0,head);
        // ListNode current = dummy;
        // while(current.next != null)
        // {
        //     if(current.next.val == v)
        //     {
        //         current.next = current.next.next;
        //     }
        //     else
        //     {
        //         current = current.next;
        //     }
        // }
        // return dummy.next;
    }
}