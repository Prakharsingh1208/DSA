class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i: nums){
            int count = map.getOrDefault(i,0)+1;
            map.put(i, count);
            max = Math.max(max,count);
        }

        int result = 0;
        for(int i : map.values()){
            if(i==max){
                result+=i;
            }
        }
        return result;
    }
}