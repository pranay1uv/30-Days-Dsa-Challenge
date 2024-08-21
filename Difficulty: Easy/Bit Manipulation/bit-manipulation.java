//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int i = sc.nextInt();

            Solution obj = new Solution();
            obj.bitManipulation(n, i);
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        // Input is Integer num , i
        // num is 32 bit unsigned integer 
        // i is an Integer
        // Output is void - i need not return anything
        // i have to get the ith bit set the ith bit & clear the ith bit
        // Logic to be devised
        // Firrst of all i have to conver the num into binaryform
        // So i will have the binaryForm of num in String 
        // Now i have to traverse the string
        // retrieve the value at position i and print it
        // i have to set the bit at position i to 1 if it is 0 
        // convert the this to decimal number if needed and print it
        // finally print the number after clearing ith bit
        StringBuilder s = new StringBuilder("");
         int n = num&(1<<(i-1));
        //int n = (num>>(i-1))&1;
        System.out.print(n!=0?1:0);
        
        if(n!=0)
        System.out.print(" "+num);
        else
        System.out.print(" "+(num+(1<<(i-1))));
        
        if(n==0)
        System.out.print(" "+num);
        else
        System.out.print(" "+(num-(1<<(i-1))));
        }
        
}


