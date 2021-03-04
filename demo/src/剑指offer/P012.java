package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2021-02-27 12:59 下午
 * @desc:
 */
public class P012 {
    public static void main(String[] args) {

    }
    private int m;
    private int n;
    private boolean[][] visit;
    private int[][] directions = {{-1,0}, {0,1}, {1,0}, {0,-1}};
    private char[][] board;
    private String word;
    public boolean exist(char[][] board, String word) {
        m = board.length;
        if(m == 0)
            return false;
        n = board[0].length;
        visit = new boolean[m][n];
        this.board = board;
        this.word = word;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(dfs(i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(int x, int y, int start) {
        if (start == word.length())
            return board[x][y] == word.charAt(start);
        if(board[x][y] == word.charAt(start)){
            visit[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int newx = x + directions[i][0];
                int newy = y + directions[i][1];
                if(isArea(newx, newy) && visit[newx][newy] == false){
                    if(dfs(newx, newy, start+1))
                        return true;
                }
            }
            visit[x][y] = false;
        }
        return false;
    }

    private boolean isArea(int x, int y){
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}
