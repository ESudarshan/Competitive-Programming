class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int k = 0;
        while(i < n) {
            if(nums[i] != 0) {
                swap(nums, i, k);
                k++;
            }
            i++;
        }
    }
    private void swap(int[] nums, int i, int k) {
        int temp = nums[k];
        nums[k] = nums[i];
        nums[i] = temp;
    }
}