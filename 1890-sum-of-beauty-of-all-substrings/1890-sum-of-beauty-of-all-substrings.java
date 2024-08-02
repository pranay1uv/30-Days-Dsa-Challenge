class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int maxSum = 0;
        
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];  // Frequency array for characters 'a' to 'z'
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                freq[ch - 'a']++;  // Increment frequency of current character
                
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        min = Math.min(min, freq[k]);
                        max = Math.max(max, freq[k]);
                    }
                }
                
                maxSum += max - min;  // Add the beauty of the current substring to the total sum
            }
        }
        
        return maxSum;
    }
}