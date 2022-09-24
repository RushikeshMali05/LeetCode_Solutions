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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode node = new ListNode();
        node.next = head;
        ListNode temp = head;
        ListNode prev = node;
        
        if( head == null || head.next == null ){
            return head;
        }
        
        while(temp.next!=null){
            
            if(temp.val == temp.next.val){
                
                temp.next = temp.next.next;
                
            } else {
                            
                temp = temp.next;

            }
            
        }        
        
        return head;
    }
}