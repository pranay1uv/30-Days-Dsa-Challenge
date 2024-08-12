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
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> ali = new ArrayList<>();
        int count = 0;
        while(temp!=null){
            count++;
            ali.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(ali);
        temp = head;
        for(Integer element: ali){
            temp.val = element;
            temp = temp.next;
        }
        return head;


        
    }
}