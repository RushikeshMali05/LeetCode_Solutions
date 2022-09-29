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
    public ListNode detectCycle(ListNode head) {
     
        ListNode fast = head;
        ListNode slow = head;
        ListNode entry = head; 
        
       // if(fast == null && head.next == null) return null;

        
        while(fast!=null && fast.next!=null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            
            if(slow == fast){

                
                
                while(slow != entry){
                    
                    
                    entry = entry.next;
                    slow = slow.next;
                    
                }
                return slow;
                            
            } 
            

            
        }
        
        return null;
        
    }
}