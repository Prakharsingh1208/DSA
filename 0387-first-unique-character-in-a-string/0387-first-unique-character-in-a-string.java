class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char a:s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        int count =0;
        for(int i = 0;i<s.length();i++){
            if(map.get(s.charAt(i)).equals(1)){
                return count;
            }
            count++;
        }

        return -1;
    }
}