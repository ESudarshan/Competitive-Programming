class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if(s.charAt(i-1) == t.charAt(j-1)) {
                        dp[i][j] = 1 + dp[i-1][j-1];    
                    } else {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }
        }
        if(dp[m][n] != m) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        int i=m;
        int j=n;
        while(i>0 && j>0) {
             if(s.charAt(i-1) == t.charAt(j-1)) {
                sb.append(s.charAt(i-1));
                i--;
                j--;
            } else {
                if(dp[i][j-1] > dp[i-1][j]) {
                    j--;
                } else {
                    i--;
                }
            }    
        }
        String lcs = sb.reverse().toString();
        if(lcs.equals(s)) {
            return true;
        }
        return false;
    }
}