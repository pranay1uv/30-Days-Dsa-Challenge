class Solution {
    public boolean isPalindrome(String s) {
        s.replaceAll(" ","");
        s.replaceAll("[^A-Za-z0-9]","");
        StringBuilder sb = new StringBuilder();
        char[] carray = s.toCharArray();
        for(char c : carray){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        if(sb.toString().equals(sb.reverse().toString())){
            return true;
        }return false;

    }
}