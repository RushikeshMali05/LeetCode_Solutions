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
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy = new ListNode(0,head);
        ListNode curr = dummy;
        
        while(curr.next!=null && curr.next.next!=null){
            ListNode f_node = curr.next;
            ListNode s_node = curr.next.next;
            f_node.next = s_node.next;
            curr.next = s_node;
            curr.next.next = f_node;
            curr = curr.next.next;
            
        }
        
        return dummy.next;
        
    }
}