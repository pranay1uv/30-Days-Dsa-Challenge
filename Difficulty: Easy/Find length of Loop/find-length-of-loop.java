//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class LinkedList {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void makeLoop(Node head, Node tail, int x) {
        if (x == 0) return;

        Node curr = head;
        for (int i = 1; i < x; i++) curr = curr.next;

        tail.next = curr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            int k = Integer.parseInt(br.readLine());
            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            makeLoop(head, tail, k);

            Solution ob = new Solution();
            System.out.println(ob.countNodesinLoop(head));
        }
    }
}

// } Driver Code Ends


/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

// Function should return the length of the loop in LL.

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        // Input is Node head
        // Output is Integer
        // If the loop is present in the linkedlist 
        // I have to return the number of nodes present in the linkedlist
        // here c is the Node position in the Linkedlist
        // this c Node will be connected to the lastNode of the LL to form a loop
        // This is nothing but tailNode next variable will have any of the prev node
        // Logic to be Devised
        // i should traverse through the Linkedlist 
        // But how i find the number of nodes in the loop
        // i can find the prevnode conncted to EndNode using hashSet
        Node temp = head;
        Map<Node,Integer> map = new HashMap<>();
        int count = 0;
        while(temp!=null){
            count++;
            map.put(temp,count);
            temp = temp.next;
            if(map.containsKey(temp)){
                return count - map.get(temp) +1;
            }
        }return 0;
        
    }
}