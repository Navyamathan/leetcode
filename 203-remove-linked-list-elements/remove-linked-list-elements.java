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
        if(head == null) return null;
        
        while(head != null && head.val == v)
        {
            head = head.next;
        }

        ListNode current = head;
        while(current != null && current.next != null)
        {
            if(current.next.val == v)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }
        }

        return head; 

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