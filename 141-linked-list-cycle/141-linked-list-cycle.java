/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        
        if(fast == null || fast.next == null || fast.next.next == null){
            return false;
        }
        
        while(fast!=null && fast.next!=null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow){
                return true;
            } 
            
        }
        return false;
    }
}