package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String ...Args){
        int[] nums={1,3,5,6,8};
        int target=2;
        System.out.println(searchInsert(nums,target));
    }
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid  = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return end+1;
    }
}
