//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Input is string str
        // output is string
        // I have to reverse the string str
        // How do i reverse the string
        // i can use two pointer Algorithm 
        // start = 0; end = n-1
        // now condition should siffice bothe the pointers
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }return String.valueOf(ch);
        
    }
}