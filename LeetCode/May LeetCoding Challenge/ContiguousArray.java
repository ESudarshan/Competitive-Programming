class Solution {
    public int findMaxLength(int[] nums) {
        int maxLen = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        int currentLen = 0;            
        for(int i=0; i<n; i++) {
            currentSum += nums[i] == 0 ? -1 : 1;
            if(currentSum == 0) {
                currentLen = i + 1;
            } else if(map.containsKey(currentSum)) {
                int k = map.get(currentSum);
                currentLen = i - k;
            } else {
                map.put(currentSum, i);
            }
            maxLen = Math.max(maxLen, currentLen);
        }
        return maxLen;
    }
}