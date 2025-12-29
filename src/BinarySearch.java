public class BinarySearch {
        public static void main(String ...Args){
            int[] nums={1,3,5,6,8};
            int target=5;
            System.out.println(BinarySearch(nums,target));
        }
        static int BinarySearch(int[] nums, int target) {
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
            return -1;
        }
}
