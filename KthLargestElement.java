package arraysAndStrings;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Bubble sort
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // kth largest element
        return nums[k - 1];
    }

    public static void main(Stringx[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("Kth largest: " + sol.findKthLargest(nums, k)); // Output: 5
    }
}
