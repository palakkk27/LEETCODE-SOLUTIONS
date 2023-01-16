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
        ListNode slow = head; // initially slow and fast are pointing to head 
        ListNode fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;// increment by one
            fast = fast.next.next;// increment by 2

            // if they are equal then it means cycle does exist
            if(slow==fast){ 
                return true;
            }

        }   
            return false;
    }
}