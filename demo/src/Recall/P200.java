package Recall;

/**
 * @author: yimfeng
 * @date: 2021-02-01 9:03 下午
 * @desc:
 */
public class P200 {
    public static void main(String[] args) {

    }
    // 深度优先遍历
    private boolean[][] marked;
    private int island;
    private char[][] grid;
    private int m;
    private int n;
    private int[][] direction = {{-1,0}, {0,-1}, {0,1}, {1,0}};
    public int numIslands(char[][] grid) {
        m = grid.length;
        if(m == 0)
            return 0;
        n = grid[0].length;
        this.grid = grid;
        marked = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(marked[i][j] == false && grid[i][j] == '1') {
                    dfs(i, j);
                    island++;
                }
            }
        }
        return island;
    }
    private void dfs(int x, int y){
        marked[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newx = x + direction[i][0];
            int newy = y + direction[i][1];
            if(isArea(newx, newy) && grid[newx][newy] == '1' && marked[newx][newy] == false){
                dfs(newx, newy);
            }
        }
    }
    private boolean isArea(int x, int y){
        return x >= 0 && x < m && y >= 0 && y < n;
    }

}
