class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        // How can i keep track of the opened parantheses
        // intially string will be empty

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                
                // This condition signifies the openbrace which is coming is innrermost
                if(count>0){
                    sb.append(s.charAt(i));
                }
                count++;

            }else{
                count--;
                if(count>0){
                    sb.append(s.charAt(i));
                }
                

            }
        }return sb.toString();
    }
}