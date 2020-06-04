class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        int res = 0;
        while(i < n) {
            res ^= nums[i];
            i++;
        }
        return res;
    }
}