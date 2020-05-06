class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            int val = 1;            
            if(map.containsKey(num)) {
                val = map.get(num);
                val++;
            }
            if(val > n/2) {
                return num;
            }
            map.put(num, val);
        }
        return -1;
    }
}