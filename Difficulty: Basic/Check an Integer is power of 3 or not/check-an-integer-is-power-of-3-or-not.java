//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPowerof3(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String isPowerof3(int N){
        // code here
        // Input is integer N
        // Output is String
        // I have to return String "Yes" if N is a power of 3
        // else i have to return "NO" if N is not a power of 3
        // N will be greater than 1
        // Logic to be devised
        // How do i calculate if N is a power of 3
        // N is the resultant of 3powerSomething
        
        double b = (double) N;
        double a =  3.0;
        double powerOf3 = Math.log10(b) / Math.log10(a);
        if(powerOf3 - (int)powerOf3 == 0 ){
            
        return "Yes";
        }
        return "No";
    }
}