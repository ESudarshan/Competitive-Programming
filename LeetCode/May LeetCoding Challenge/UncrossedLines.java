class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int a = A.length;
        int b = B.length;        
        int[][] dp = new int[a + 1][b + 1];
        for(int i = 0; i < a+1; i++) {
            for(int j = 0; j < b+1; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if(A[i-1] == B[j-1]) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[a][b];
    }
}