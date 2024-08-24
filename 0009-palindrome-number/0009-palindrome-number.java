class Solution {
    public boolean isPalindrome(int x) {
        // Input is Integer X
        // Output is boolean
        // I have to return true if x is a palindrome number else return false
        // what is a palindrome number 
        // generally we read the number from left to right
        // so after reversing the number it reads same as earlier
        // then it is palindrome
        // Logic to be devised
        // i wil convert the integer x into String
        // then reverse the string
        // after reversing i should check the content in earlier string with the reversed string
        // constraints should be considered
        // when reversing the integer it may overflow
        String s  = String.valueOf(x);
        StringBuilder ss = new StringBuilder(s);
        String sss = ss.reverse().toString();
        if(sss.equalsIgnoreCase(s)){
            return true;
        }
        return false;
    }
}