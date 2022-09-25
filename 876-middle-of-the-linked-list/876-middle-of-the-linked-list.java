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
public ListNode middleNode(ListNode head) {
    if(head.next==null || head.next.next==null)
        return head.next==null?head:head.next;
    int size=0,mid=0;
    ListNode curr=head;
    while(curr!=null){
        size++;
        curr=curr.next;
    }
    mid=size/2+1;
    for(int i=1;i<mid;i++){
        head=head.next;
    }
    return head;
}
}