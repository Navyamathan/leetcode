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
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) 
    {
        int max = -1;
        for(int num : nums)
        {
            max = max < num ? num : max;
        }

        boolean[] numBool = new boolean[max+1];
        for(int num : nums)
        {
            numBool[num] = true;
        }

        if(head == null) return null;
        ListNode dummy = new ListNode(0,head);
        ListNode current = dummy;
        while(current.next != null)
        {
            if(current.next.val < numBool.length && numBool[current.next.val] == true)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }
        }
        return dummy.next;
        
    }
}