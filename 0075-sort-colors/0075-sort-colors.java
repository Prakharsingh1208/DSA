class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0;i<nums.length-1;i++){

            int c =i+1;
            int min=i;

            while(c<nums.length){
                
                if(nums[min]>nums[c]){
                    min =c;
                }
                c++;
            }

            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }
}

