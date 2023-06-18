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
    public ListNode rotateRight(ListNode head, int k) {
        //base or edge cases
        if(head==null||head.next==null||k==0) return head;
        
        //finding the length of linked list
        ListNode curr = head;
        int len = 1;
        while(curr.next!=null){
            len++;
            curr = curr.next;
        }
        
        //connect the last node to head 
        curr.next = head;
        k = k%len;
        k = len-k;
        while(k-->0) curr= curr.next;
        
        //break the conection 
        head = curr.next;
        curr.next = null;
        
        return head;
    }
}