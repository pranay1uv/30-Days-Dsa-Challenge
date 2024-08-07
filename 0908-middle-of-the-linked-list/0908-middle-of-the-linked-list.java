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
        // Input is Node - headNode
        // Output is Node
        // i have to return the middle node of a linkedlist
        // if No of nodes is even , middle node will be one , so no prob
        // if it is odd , there will be two middle nodes 
        // in that case i have to return second middle node
        // Logic to be devised
        // first thing is i have to calculate the no of nodes in the LL
        // from the examples i have found that if i divide the No of Nodes
        // Then quotient + 1 will be middle Node either it is od or evn

        ListNode temp = head;
        int count = 0;
        for(int i = 0; temp!=null;i++){
            count++;
            temp = temp.next;
        }
        int middleNode = count/2 + 1;
        ListNode tempr = head;
        for(int i = 1; i<=middleNode; i++){
            if(i==middleNode){
                return tempr;
            }
            tempr = tempr.next;


        }return tempr;
    }
}