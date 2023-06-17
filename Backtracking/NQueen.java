class NQueen {
    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        
        // initialize the empty board
        // here board.length is equal to n
        
        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<n; j++) {
                board[i][j] = 'x';    
            }
        }
        
        // place Queen at all possible places
        nQueens(board, 0);
        
        
    }
    
    public static void nQueens(char[][] board, int row) {
        // base condition
        if(row == board.length) {
            printBoard(board);
            return;
        }
        
        for(int col = 0; col<board.length; col++) {

            // check first is it safe to put the queen at this position
            if(isSafe(board, row, col)) {
                // this code will give all permutations where Queen can be placed without thinking about attack
                board[row][col] = 'Q';
                nQueens(board, row + 1);
                board[row][col] = 'x';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // we need to check three paths from where upper queens can attack the current queen.

        // check vertical up (i = row-1 because we dont want to check the current row)
        for(int i = row-1; i>=0; i--) {
            //going vertically up by just reducing row number
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        // check diagonal left upward
        for(int i = row-1, j = col-1; i>=0 && j>=0; i--, j--) {
            // taking the path diagonally left up by reducing row and col.
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        // check diagonally right upward - by decreasing row number and increasing column number
        // try to visualize in head what am i trying to do here
        for(int i = row-1, j = col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    
    public static void printBoard(char[][] board) {
        System.out.println("------------chess board---------------");
        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<board.length; j++) {
                System.out.print(board[i][j] + ",");   
            }
            System.out.println();
        }
    }
}
