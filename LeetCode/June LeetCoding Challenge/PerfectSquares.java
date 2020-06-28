class Solution {
    
    int[] mem;
    
    public int numSquares(int n) {
        mem = new int[n+1];
        Arrays.fill(mem, -1);
        return solve(n);
    }
    
    private int solve(int n) {
        if(n == 1) {
            return 1;
        }
        if(mem[n] != -1) {
            return mem[n];
        }
        int res = n;
        for(int i = 1; i*i <= n; i++) {
            res = Math.min(res, 1 + solve(n-i*i));
        }
        mem[n] = res;
        return res;
    }
}