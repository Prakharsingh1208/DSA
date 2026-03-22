class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char a:s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        int count =0;
        for(char a:s.toCharArray()){
            if(map.get(a).equals(1)){
                return count;
            }
            count++;
        }

        return -1;
    }
}