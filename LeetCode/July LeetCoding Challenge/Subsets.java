class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        subsets(nums, 0, n, new ArrayList<>(), res);
        return res;
    }
    
    private void subsets(int[] nums, int i, int n, List<Integer> list, List<List<Integer>> res) {
        if(i == n) {
            res.add(list);
            return;
        }
        List<Integer> list2 = new ArrayList<>(list);
        subsets(nums, i+1, n, list2, res);
        List<Integer> list1 = new ArrayList<>(list);
        list1.add(nums[i]);
        subsets(nums, i+1, n, list1, res);
    }
    
}