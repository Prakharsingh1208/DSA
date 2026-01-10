class Solution {

    public int searchHelper(int[] nums, int target,int start, int end){
        int half = start + (end-start)/2;
        if(end < start ){
            return -1;
        }
        if(target>nums[half]){
            return searchHelper(nums,target,half+1,end);
        }else if(target<nums[half]){
            return searchHelper(nums,target,0,half-1);
        }else{
            return half;
        }
    }
    public int search(int[] nums, int target) {
        return searchHelper( nums, target,0,nums.length-1);
    }
}