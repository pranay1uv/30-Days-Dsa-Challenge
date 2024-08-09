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
    public boolean isPalindrome(ListNode head) {
        // input is ListNode head
        // Output is boolean
        // I have to return true if the LinkedlIst is palindrome
        // otherwise return false if LL is not palindrome
        // According to the examples i understand that 
        // values inside eachNode should be same from head to tail & tail to head
        // Logic to be devised
        // i have to crreate a stringBuilder class
        // Traverse the LinkedList from head to tail
        // append each element to the sb class
        // after the traversal is done
        // Now reverse the string and check if it is eqaul to the intital string
        // if it is equal return true otherwise return false
        ListNode temp = head;
        StringBuilder sb = new StringBuilder();
        while(temp!=null){
            sb.append(temp.val);
            temp = temp.next;
        }return sb.toString().contentEquals(sb.reverse());



        
    }
}