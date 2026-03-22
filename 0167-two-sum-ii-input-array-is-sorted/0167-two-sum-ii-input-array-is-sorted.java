class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int left = 0;
        // int right = numbers.length-1;
        // while(left<right){
        //     if(numbers[left]+numbers[right]<target){
        //         left++;
        //     }else if(numbers[left]+numbers[right]>target){
        //         right--;
        //     }else{
        //         return new int[]{left+1, right+1};
        //     }
        // }
        // return new int[]{0}; 

        int left = 0;
        int right = numbers.length -1;
        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }else{
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{0};

    }
}