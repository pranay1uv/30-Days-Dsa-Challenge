class Solution {
    public String removeOuterParentheses(String s) {
        // Valid Parentheses means full not half and half
        // OuterMost parentheses should be removed acc to the prob stmnt
        // For Example : ()() 
        // Here above parentheses are outermost bcoz they are not enclosed in any parentheses
        // the soln for above example is "" ->empty bcoz outermost parantheses should be removed
        // Ultimately i should return String Not the stack
        // Here the point is adding to the string is writing the answer
        // if stack is not empty only then i will write the character to the ansstring
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                if(st.size()>0){
                    sb.append(s.charAt(i));
                }
                st.push('(');
            }else{
                st.pop();
                if(st.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }return sb.toString();

    }
}