class Solution {
    public int numTrees(int n) {
        if(n == 0 || n == 1 || n == 2) {
            return n;
        }
        int ways = 0;
        for(int i=0; i<n; i++) {
            int left = numTrees(i);
            left = left == 0 ? 1 : left;
            int right = numTrees(n-i-1);
            right = right == 0 ? 1 : right;
            ways += left * right;
        }
        return ways;
    }
}