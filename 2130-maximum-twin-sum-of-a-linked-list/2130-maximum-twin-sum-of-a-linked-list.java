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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int max = 0;
        
        //finding mid
        while( fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;   
        }
        
        
        //finding reverse
        ListNode nextNode, prev = null;
        
        while(slow!=null){
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        
        //finding max after adding twins nodes
        while(prev!=null){
            
            max = Math.max(max,head.val+prev.val) ;
            prev = prev.next;
            head = head.next;
        }
        
        return max;
        
    }
}