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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        // we are creating two new Linkedlists 1- odd Linked List 2- evnLinkedlist


        ListNode oddHead = new ListNode(0); // creating a new Node with value zero -- odd head
        ListNode evenHead = new ListNode(0); // creating a new Node with value zero -- evnhead

        ListNode odd = oddHead; // we are starting oddlist
        ListNode even = evenHead; // we are starting the evenlist

        // here the point is we will traverse through the given original Linkedlist
        // during traversal odd check even check
        // we will add the oddNodes to the created odd LinkedList
        // we will add the evenNodes to the created even LinkedList

        ListNode current =  head;
        int count = 1;
        while(current!=null){
            if(count % 2 == 0) {
                even.next = current;
                even = even.next;
            } else {
                odd.next = current;
                odd = odd.next;
            }
            current = current.next;
            count++;
        }
         even.next = null;
        odd.next = evenHead.next;

        return oddHead.next;

        
    }
}