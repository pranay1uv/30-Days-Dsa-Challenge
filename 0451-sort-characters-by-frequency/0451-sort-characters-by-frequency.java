class Solution {
    public String frequencySort(String s) {
        // Input is String s
        // outout is string
        // now i have to sort it in the decreasing order 
        // based on the frequency of characterss
        // How can i count the frequency of characters in a string
        // i can make use of hashmap with keys and values
        // if at all i find any iteration element in the hashmap
        // i will increase its frequency by 1
        // if i dont find it in the hashmap
        // i will add the character as a key and value as 1
        // Now after frequency of characters, what should i do

        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        StringBuilder builder = new StringBuilder();
        while(!map.isEmpty()){
            int maxValue = 0;
            char maxChar = 'a';
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                if(entry.getValue() > maxValue){
                    maxValue = entry.getValue();
                    maxChar = entry.getKey();
                }
            }
            for(int i = 0; i < maxValue; i++){
                builder.append(maxChar);
            }
            map.remove(maxChar);

        }return builder.toString();

        


    }
}