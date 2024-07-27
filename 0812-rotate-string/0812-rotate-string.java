class Solution {
    public boolean rotateString(String s, String goal) {
       String sConcat = s+s;
       boolean value = true;
        if(s.length() == goal.length() && sConcat.contains(goal)){
            return true;
        }return false;
    }
}