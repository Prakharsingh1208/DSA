class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max_area = 0;
        while(l<r){
            int rvalue = height[r];
            int lvalue = height[l];
            int width = r-l;
            max_area = Math.max(max_area,width*Math.min(rvalue,lvalue));
            if(rvalue>lvalue){
                l++;
                continue;
            }
            r--;
        }
        return max_area;
    }
}