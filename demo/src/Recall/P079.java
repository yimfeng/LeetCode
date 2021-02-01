package Recall;

/**
 * @author: yimfeng
 * @date: 2021-02-01 3:56 下午
 * @desc:
 */
public class P079 {
    public static void main(String[] args) {

    }
    private boolean[][] marked;
    private String word;
    private char[][] board;
    private int[][] direction = {{-1,0}, {0,-1}, {0,1}, {1,0}};
    private int m;
    private int n;
    public boolean exist(char[][] board, String word){
        m = board.length;
        if(m == 0)
            return false;
        n = board[0].length;
        marked = new boolean[m][n];
        this.word = word;
        this.board = board;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(dfs(i, j, 0))
                    return true;
            }
        }
        return false;
    }
    private boolean dfs(int x, int y, int start){
        if(start == word.length() - 1)
            return board[x][y] == word.charAt(start);
        if(board[x][y] == word.charAt(start)){
            marked[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int newx = x + direction[i][0];
                int newy = y + direction[i][1];
                if(inArea(newx, newy) && !marked[newx][newy]){
                    if(dfs(newx, newy, start+1))
                        return true;
                }
            }
            marked[x][y] = false;
        }
        return false;
    }
    private boolean inArea(int x, int y){
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}
