class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Integer key : map.keySet()) {
            if(map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }
}