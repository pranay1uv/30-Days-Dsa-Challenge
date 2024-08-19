//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.binary_to_decimal(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int binary_to_decimal(String str) {
        // Code here
        int value = 0;
        int count = 0;
        for(int i = str.length()-1; i>=0; i--){
              //  System.out.println(Math.pow(2,i));
                value += Character.getNumericValue(str.charAt(i)) * Math.pow(2,count);
                count++;

            
           
        }return value;
    }
}