class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char i:s.toCharArray()){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }

        for(char i:t.toCharArray()){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }

        for(char i:map1.keySet()){
            if(!map1.get(i).equals(map2.get(i))){
                return false;
            }
        }

        return true;
    }
}