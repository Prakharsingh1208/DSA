package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] a){
        int[]s= {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(s));
    }

    static int removeDuplicates(int[] nums){
        if(nums.length==0){return 0;}
        int j=1;
        for (int i =1;i<nums.length;i++){
            if (nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
