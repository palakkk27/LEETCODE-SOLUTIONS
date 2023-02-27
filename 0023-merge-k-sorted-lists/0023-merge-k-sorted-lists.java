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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> l = new ArrayList<Integer>();

        for(ListNode i:lists){
            while(i!=null){
                l.add(i.val);
                i = i.next;
            }
        }
        Collections.sort(l);

        ListNode head = new ListNode(0);
        ListNode h = head;

        for(int j:l){
            ListNode t = new ListNode(j);
            h.next =t;
            h=h.next;
        }
        h.next=null;
        return head.next;
    }
}