class Solution {
    boolean isFound = false;
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(board[i][j] == word.charAt(0)) {
                    char temp = board[i][j];
                    board[i][j] = '$';
                    dfs(board, i, j, word, 0);
                    board[i][j] = temp;
                }
            }
        }

        return isFound;
    }

    public void dfs(char[][] board, int i, int j, String word, int index) {
        int n = board.length;
        int m = board[0].length;
        if(index+1 == word.length()) {
            isFound = true;
            return;
        }
        if(i > 0) {
            if(board[i-1][j] == word.charAt(index+1)) {
                char temp = board[i-1][j];
                board[i-1][j] = '$';
                dfs(board, i-1, j, word, index+1);
                board[i-1][j] = temp;
            }
        }
        if(i < n-1) {
            if(board[i+1][j] == word.charAt(index+1)) {
                char temp = board[i+1][j];
                board[i+1][j] = '$';
                dfs(board, i+1, j, word, index+1);
                board[i+1][j] = temp;
            }
        }
        if(j > 0) {
            if(board[i][j-1] == word.charAt(index+1)) {
                char temp = board[i][j-1];
                board[i][j-1] = '$';
                dfs(board, i, j-1, word, index+1);
                board[i][j-1] = temp;
            }
        }
        if(j < m-1) {
             if(board[i][j+1] == word.charAt(index+1)) {
                char temp = board[i][j+1];
                board[i][j+1] = '$';
                dfs(board, i, j+1, word, index+1);
                board[i][j+1] = temp;
            }  
        }
    }
}
