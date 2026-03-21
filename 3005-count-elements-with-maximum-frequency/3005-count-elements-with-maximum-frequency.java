class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i:nums){
            int count = map.getOrDefault(i,0)+1;
            map.put(i,count);
            max=Math.max(max,count);
        }
        int totalElement = 0;
        for(int count:map.values()){
            if(count==max){
                totalElement += count;
            }
        }

        return totalElement;
    }
}