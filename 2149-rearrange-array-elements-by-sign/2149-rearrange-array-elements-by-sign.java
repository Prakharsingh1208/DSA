class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                list.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
        }

        int c=0;
        while(c<nums.length){
            if(c==0){
                nums[c]=list.get(0);
            }else{
                nums[c]= list.get(c/2);
            }
            c+=2;
        }

        c=1;
        while(c<nums.length){
            nums[c]= list2.get(c/2);
            c+=2;
        }

        return nums;

    }
}