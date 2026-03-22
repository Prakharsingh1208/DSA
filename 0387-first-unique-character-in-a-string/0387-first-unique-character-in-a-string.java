class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        // 1. Build frequency map
        for (char a : s.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        // 2. Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            // Using i directly instead of a separate count variable
            if (map.get(s.charAt(i)) == 1) { 
                return i;
            }
        }

        return -1;
    }
}