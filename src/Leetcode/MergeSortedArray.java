package Leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String... Args){
        int [] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));

    }
//    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]

    static int[] merge(int[] nums1, int m, int[] nums2, int n){
//        int i = nums1.length;
//        int count=0;
//        while(count<nums2.length){
//            nums1[m+count]= nums2[count];
//            count++;
//        }
////        Arrays.sort(nums1);
//        for (int a = 1; a <=nums1.length-1; a++){
//            count=0;
//            while (count<nums1.length){
//                if(nums1[a]<=nums1[count]){
//                    int temp=nums1[count];
//                    nums1[count]=nums1[a];
//                    nums1[a]=temp;
//
//                }
//                count++;
//            }
//        }
        int i = m - 1;        // last valid element in nums1
        int j = n - 1;        // last element in nums2
        int k = m + n - 1;    // last index of nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining elements of nums2 (if any)
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        return nums1;
    }
}
