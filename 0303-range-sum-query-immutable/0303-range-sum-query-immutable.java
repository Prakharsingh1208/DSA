class NumArray {
    private HashMap<Integer,Integer> map;

    public NumArray(int[] nums) {
        map = new HashMap<>();
        map.put(-1,0);
        for(int i =0; i<nums.length; i++){
            map.put(i,map.getOrDefault(i-1,0)+nums[i]);
        }
    }
    
    public int sumRange(int left, int right) {
        return map.get(right) - map.get(left-1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */