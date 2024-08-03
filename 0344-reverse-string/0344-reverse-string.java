class Solution {
    public void reverseString(char[] s) {
        // input is character array 
        // i have to modify the input array in place


       char temp = ' ';
       int si = 0;
       int ei = s.length-1;

        while(si < ei){
            temp = s[si];
            s[si] = s[ei];
            s[ei] = temp;
            si++;
            ei--;
        }
        
    }
}