class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int max = 0;
        int right = height.length-1;
        while(left<right){
            int heights = Math.min(height[left],height[right]);
            int width = right - left;
            max = Math.max(heights*width, max);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}