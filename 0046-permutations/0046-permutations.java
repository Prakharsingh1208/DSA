public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
        // Base case: If the current list size matches the input array, we found a permutation
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip if the element is already in the current path
            if (used[i]) continue;

            // Choose: Add the number and mark as used
            used[i] = true;
            tempList.add(nums[i]);

            // Explore: Recurse to find the next number
            backtrack(result, tempList, nums, used);

            // Un-choose: Backtrack by removing the last element and unmarking used
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
}