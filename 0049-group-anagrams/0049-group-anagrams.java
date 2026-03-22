class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(String a: strs){
            char[] chars = a.toCharArray();
            Arrays.sort(chars);
            String sortedkey = new String(chars);
            if(!map.containsKey(sortedkey)){
                map.put(sortedkey, new ArrayList<>());
            }
            map.get(sortedkey).add(a);
        }

        return new ArrayList<>(map.values());
    }
}