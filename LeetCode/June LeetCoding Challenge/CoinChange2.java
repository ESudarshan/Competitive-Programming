class Solution {
    
    int[][] m;
    
    public int change(int amount, int[] coins) {
        int n = coins.length;
        m = new int[n+1][amount+1];
        for(int r[] : m) {
            Arrays.fill(r, -1);
        }
        return change(coins, n, amount);
    }
    
    private int change(int[] coins, int n, int amount) {
        if(amount == 0) {
            return 1;
        }
        if(n == 0) {
            return 0;
        }       
        if(m[n][amount] != -1) {
            return m[n][amount];
        }
        if(coins[n-1] <= amount) {
            m[n][amount] = change(coins, n, amount-coins[n-1]) + change(coins, n-1, amount);
        } else {
            m[n][amount] = change(coins, n-1, amount);
        }
        return m[n][amount];
    } 
}