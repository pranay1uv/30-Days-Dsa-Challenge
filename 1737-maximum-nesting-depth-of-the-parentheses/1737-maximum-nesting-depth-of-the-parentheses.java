class Solution {
    public int maxDepth(String s) {
        int maxValue = 0;
        int depth = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                depth += 1;
            }else if(s.charAt(i) == ')'){
                maxValue = Math.max(maxValue,depth);
                depth -= 1;
            }
        }
        return maxValue;
    }
}