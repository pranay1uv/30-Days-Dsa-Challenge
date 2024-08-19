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
            String S = read.readLine();
          

            Solution ob = new Solution();
            System.out.println(ob.onesComplement(S,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String onesComplement(String S,int N){
        //code here
        // Input is String of lenght N
        // OutPut is String
        // i have to return the BinaryString in the negated form
        // logic to be devised 
        // traverse the String from 0 to n-1
        // if 1 -- 0
        // else -- 1
        char[] chArray = S.toCharArray();
        for(int i = 0;i<chArray.length; i++){
            if(chArray[i] == '1'){
                chArray[i] = '0';
            }else{
                chArray[i] = '1';
            }
        }return S.valueOf(chArray);
    }
}