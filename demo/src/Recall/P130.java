package Recall;

/**
 * @author: yimfeng
 * @date: 2021-02-01 9:44 下午
 * @desc:
 */
public class P130 {
    public static void main(String[] args) {

    }
    private char[][] board;
    private int m;
    private int n;
    private boolean[][] visit;
    private int[][] directions = {{0,1}, {1,0}, {-1,0}, {0,-1}};
    public void solve(char[][] board) {
        m = board.length;
        if(m == 0)
            return;
        n = board[0].length;
        this.board = board;
        for (int i = 0; i < m; i++) {
            if(board[i][0] == 'O')
                dfs(i, 0);
            if(board[i][n-1] == 'O')
                dfs(i, n-1);
        }
        for (int i = 1; i < n-1; i++) {
            if(board[0][i] == 'O')
                dfs(0, i);
            if(board[m-1][i] == 'O')
                dfs(m-1, i);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 'O')
                    board[i][j] = 'X';
                else if(board[i][j] == 'A')
                    board[i][j] = 'O';
            }
        }
    }
    private void dfs(int x, int y){
        board[x][y] = 'A';
        for (int i = 0; i < 4; i++) {
            int newx = x + directions[i][0];
            int newy = y + directions[i][1];
            if(isArea(newx, newy) && board[newx][newy] == 'O'){
                board[newx][newy] = 'A';
                dfs(newx, newy);
            }
        }
    }
    private boolean isArea(int x, int y){
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}
