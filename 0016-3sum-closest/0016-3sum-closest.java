class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = nums[0]+nums[1]+nums[2];
        int sum = 0;
        int diff = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                sum = nums[i]+nums[r]+nums[l];
                if(Math.abs(sum-target)<Math.abs(closestSum-target)){
                    closestSum = sum;
                }

                if(sum>target){
                    r--;
                }else if(sum<target){
                    l++;
                }else{
                    return sum;
                }

            }
        }
        return closestSum;
    }
}