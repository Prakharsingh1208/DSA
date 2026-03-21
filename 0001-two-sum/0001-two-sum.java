class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<=nums.length;i++){
            int r=i+1;
            while(r<nums.length){
                if(nums[i]+nums[r]==target){
                    return new int[] {i,r};
                }
                r++;
            }
        }
        return new int[] {0};
    }
}