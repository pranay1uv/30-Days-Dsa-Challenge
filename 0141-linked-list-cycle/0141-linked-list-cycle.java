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
        // Input is head
        // Output is boolean
        // i have to check whether there is a loop in aLL or not
        // if there is loop. return Yes otherwise return NO
        // Range of Nodes in the given Linkedlist
        // 0 Nodes to 10000 Nodes
        // if there is 0 Nodes -- there will be No Loop
        // if there is 1 Nodes -- there will be No Loop
        // if there is 2 or more Nodes -- there will be a loop(possibilty)
        // what is Loop in LL 
        // In a Linkedlist of N number of Nodes
        // in any Node of LL there may be a loop through which we can 
        // connect to the other node directly
        // Internally, pos is used to denote the index of the node that tail's next pointer is connected to.    
          // Note  that pos is not passed as a parameter.
          // In a LL tail is connected to any of the previous Nodes 
          // the position or index of that node is given to us
        // Logic to to be Devised
        // I have to traverse through the LinkedList to the endNode
        // inside endNode there is next variable , inside it there is loop connection

        ListNode temp = head;
        Set<ListNode> set = new HashSet<>();
        while(temp!=null){
            set.add(temp);
            if(set.contains(temp.next)){
                return true;
            }
            temp = temp.next;
        }return false;
        
    }
}