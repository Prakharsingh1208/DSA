class Solution {
    public int longestConsecutive(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();

        // for(int i:nums){
        //     set.add(i);
        // }

        // int max =0;
        // for(int num:set){
        //     if(!set.contains(num-1)){
        //         int currentNum = num;
        //         int count=1;
        //         while(set.contains(currentNum+1)){
        //             currentNum++;
        //             count++;
        //         }
        //         max=Math.max(count,max);
        //     }
            
        // }

        // return max;



        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }

        int max=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int count = 1;
                int currentNum = n;
                while(set.contains(currentNum+1)){
                    count++;
                    currentNum++;
                }
                max=Math.max(max,count);
            }
        }

        return max;


    }
}