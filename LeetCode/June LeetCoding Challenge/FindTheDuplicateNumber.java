class Solution {
    public int findDuplicate(int[] nums) {
        int total = 0;
        for(int num : nums) {
            total += num;
        }
        int uniqueTotal = 0;
        for(int i=1; i<nums.length; i++) {
            uniqueTotal += i;
        }
        return total - uniqueTotal;
    }
}