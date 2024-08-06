//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }
}


// } Driver Code Ends
/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        // input is head Node
        // Output is intger
        // i have to return the number of nodes in alinkedlist
        // number of nodes in alinkedlist is nothing but length
        // Logic to be devised
        // i have to maek use of the head to proced further
        // i have to initate a count variable to 1
        // becoz we r starting from head
        // now i have to check whether current node is null or not
        // How can i cheack adn proced further
        // using while loop i will check whether current node is null or not
        // if it is not null i will go to the next node by current.next
        // now current.nextNode i.e 2nd node will go for checking in loop
        int count = 0;
        Node currentNode = head;
        while(currentNode!=null){
            count++;
            currentNode = currentNode.next;
        }return count; 
    }
}

//{ Driver Code Starts.

class LinkedList {

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
            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            Solution ob = new Solution();
            System.out.println(ob.getCount(head));
        }
    }
}

// } Driver Code Ends