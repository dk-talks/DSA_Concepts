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

          // this code will give all permutations where Queen can be placed without thinking about attack
            board[row][col] = 'Q';
            nQueens(board, row+1);
            board[row][col] = 'x';
        }
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
