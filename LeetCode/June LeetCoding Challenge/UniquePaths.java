class Solution {
    
    int[][] mem;
    
    public int uniquePaths(int m, int n) {
        mem = new int[m][n];
        for(int[] a : mem) {
            Arrays.fill(a, -1);
        }
        return solve(m-1, n-1);
    }
    
    private int solve(int m, int n) {
        if(m == 0 || n == 0) {
            return 1;
        }
        if(mem[m][n] != -1) {
            return mem[m][n];
        }
        mem[m][n] = solve(m-1, n) + solve(m, n-1);
        return mem[m][n];
    }
}