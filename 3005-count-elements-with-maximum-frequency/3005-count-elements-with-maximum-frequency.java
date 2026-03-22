class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int a : nums){
            map.put(a,map.getOrDefault(a,0)+1);
            max = Math.max(max,map.get(a));
        }

        int result = 0;
        for(int n:map.values()){
            if(n==max){
                result+=n;
            }
        }
        
        return result;
    }
}