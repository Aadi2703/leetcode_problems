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
        ListNode fast = head ;
        ListNode slow = head;
        while(fast != null && fast.next!= null){
            slow = slow.next; // ik br move kr rhe 
            fast = fast.next.next; //do br move kr rhe 
        
        if(slow == fast){
            return true; 
        }
        }
        return false;
    }
}