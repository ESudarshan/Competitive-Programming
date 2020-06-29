class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        if(m == 0) {
            return;
        }
        int n = board[0].length;
        for(int i=0; i<m; i++) {
            if(board[i][0] == 'O') {
                dfs(i, 0, m, n, board);
            }
            if(board[i][n-1] == 'O') {
                dfs(i, n-1, m, n, board);
            }
        }
        for(int j=0; j<n; j++) {
            if(board[0][j] == 'O') {
                dfs(0, j, m, n, board);
            }
            if(board[m-1][j] == 'O') {
                dfs(m-1, j, m, n, board);
            }
        }
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j] == 'Q') {
                    board[i][j] = 'O';
                } else if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }  
            }
        }
    }
    
    private void dfs(int i, int j, int m, int n, char[][] board) {
        if(i<0 || i>=m || j<0 || j>=n) {
            return;
        }
        if(board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'Q';
        dfs(i-1, j, m, n, board);
        dfs(i, j+1, m, n, board);
        dfs(i+1, j, m, n, board);
        dfs(i, j-1, m, n, board);        
    }
    
}