class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Inside the string s 
        // any character should have only one mapping
        // suppose a character is repeated in s, 
        // then that character should have the same mapping of firstOccurence
        // bcoz the same character 
        Map<Character,Character> mapS = new HashMap<>();
        Map<Character,Character> mapT = new HashMap<>();
        boolean value = true;
        for(int i = 0; i<s.length(); i++){
            mapS.put(s.charAt(i),t.charAt(i));
            mapT.put(t.charAt(i),s.charAt(i));
        }
        for(int j = 0; j<s.length(); j++){
            Character sChar = s.charAt(j);
            Character tChar = t.charAt(j);

            if(mapS.containsKey(sChar)){
                if(t.charAt(j) == mapS.get(sChar)){
                    value = true;
                }else{
                    return false;
                }
            }

            if(mapT.containsKey(tChar)){
                if(s.charAt(j) == mapT.get(tChar)){
                    value = true;
                }else{
                    return false;
                }
            }
        }return value;
       
        
        
    }
}