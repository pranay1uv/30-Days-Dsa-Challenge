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
    public ListNode detectCycle(ListNode head) {
        // Inpput is ListNode head
        // Output is ListNode 
        // I have to return the Node where the cycle begins
        // 

        ListNode temp = head;
        Set<ListNode> set = new HashSet<>();
        while(temp!=null){
            set.add(temp);
            temp = temp.next;
            if(set.contains(temp)){
                return temp;
            }

        }return null;
        
    }
}