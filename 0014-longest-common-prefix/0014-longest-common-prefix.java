class Solution {
    public String longestCommonPrefix(String[] strs) {
         String prefix = strs[0];
        for(int i = 1; i<strs.length; i++){
            // If it doesnt matches with prefix
            // i will trim the prefix String by one character
            // and again go into loop for checking the current with prefix
            // The loop will run util prefix string gets trimmed to 0 characters
            // Suppose if it matches while loop breaks and next word in the String array will come
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }return prefix;
    }
}