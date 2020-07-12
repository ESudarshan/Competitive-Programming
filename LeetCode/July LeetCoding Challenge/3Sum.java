class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        threeSum(nums, 0, n, new ArrayList<>(), res);
        return res;
    }
    
    private void threeSum(int[] nums, int i, int n, List<Integer> list, List<List<Integer>> res) {
        if(list.size() == 3) {
            if(list.get(0)+list.get(1)+list.get(2) == 0) {
               addUniqueList(list, res);
            }
            return; 
        }
        if(i == n) {
            return;
        }
        List<Integer> list1 = new ArrayList<>(list);
        threeSum(nums, i+1, n, list1, res);
        List<Integer> list2 = new ArrayList<>(list);
        list2.add(nums[i]);
        threeSum(nums, i+1, n, list2, res);
    }
    
    private void addUniqueList(List<Integer> list, List<List<Integer>> res) {
        boolean found= false;
        for(List<Integer> l : res) {
            if(new HashSet(list).equals(new HashSet<>(l))) {
                found =true;
                break;
            }
        }
        if(!found) {
            res.add(list);
        }
    }
 }