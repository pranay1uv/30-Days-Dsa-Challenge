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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null; //previous pointer
        ListNode cPtr = head; //current pointer
        ListNode nxt = null; //head pointer
        
        return reverse (cPtr, prev, nxt);
    }
    
    public ListNode reverse(ListNode cPtr, ListNode prev, ListNode nxt){
        if(cPtr == null){  //base condition
            return prev;
        }
        nxt = cPtr.next;
        cPtr.next = prev;
        prev = cPtr; 
        cPtr = nxt;
        
        return reverse(cPtr, prev, nxt);
    }
}