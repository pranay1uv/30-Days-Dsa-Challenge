class Solution {
    public int maxDepth(String s) {
        // Input is String which is valid parantheses string
        // output is int
        // I have to return the max number of nested parantheses in string
        // At the edn of string traversal i can easily find the nesting depth of parantheses
        int maxValue = Integer.MIN_VALUE;
        int depth = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                depth += 1;
            }else if(s.charAt(i) == ')'){
                maxValue = Math.max(maxValue,depth);
                depth -= 1;
            }else{
                depth = depth;
                maxValue = Math.max(maxValue,depth);
            }
        }
        return maxValue;
    }
}