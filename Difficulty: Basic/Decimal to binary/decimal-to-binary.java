//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int N = sc.nextInt();
			Solution obj = new Solution();
			obj.toBinary(N);
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
void toBinary(int N) {
    int ans=0;
    String s="";
    while(N>0){
        ans=N%2;
        s+=ans;
        N/=2;
    }
    for(int j = s.length()-1 ; j >= 0 ; j--){
            System.out.print(s.charAt(j));
        }
}
}