package Leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String... args){
        int[] s = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(s,2));
        System.out.println(Arrays.toString(s)+"jncjfnckfe");

    }
    static int removeElement(int[] nums, int val){
        //[0,1,2,2,3,0,4,2]
        int j=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;

    }
}
