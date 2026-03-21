class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }

        int max =0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int count=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    count++;
                }
                max=Math.max(count,max);
            }
            
        }

        return max;
    }
}