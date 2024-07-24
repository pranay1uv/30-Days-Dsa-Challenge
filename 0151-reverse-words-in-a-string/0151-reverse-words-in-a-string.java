class Solution {
    public String reverseWords(String s) {
        // Input is String
        // Input String Contains sequence of words
        // It may contain leading spaces or trailing spaces
        // Output is String
        // I should reverse the string of words(i.e order of the words from right to left)
        // I should make sure the spaces between the words should be only one
        // The reversed String should not contain leading or trailing spaces
        // Logic to be divised
        // How can i split the String
        String[] stArray = s.trim().split("\\s+");
        String answerString = "";
        int length = stArray.length;
        for(int i = length-1; i>=0; i--){
            answerString = answerString.concat(stArray[i]);
            if(i>0){
                answerString = answerString.concat(" ");
            }
        }
        return answerString;
    }
}