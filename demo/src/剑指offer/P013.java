package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2021-03-03 8:43 上午
 * @desc:
 */
public class P013 {
    private int m;
    private int n;
    private int k;
    private int count = 1;
    private boolean[][] visit;
    private int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
    public int movingCount(int m, int n, int k) {
        visit = new boolean[m][n];
        this.m = m;
        this.n = n;
        this.k = k;
        dfs(0, 0);
        return count;
    }
    private void dfs(int x, int y){
        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int new_x = x + directions[i][0];
            int new_y = y + directions[i][1];
            if(isArea(new_x, new_y) && visit[new_x][new_y] == false){
                count++;
                dfs(new_x, new_y);
            }
        }
        visit[x][y] = false;
    }
    private boolean isArea(int x, int y){
        int L1 = 0, L2 = 0, R1 = 0, R2 = 0;
        if(x >= 0 && x < 10)
            L1 = x;
        if(y >= 0 && y < 10)
            L2 = y;
        if(x >= 10 && x < 100){
            L1 = x % 10;
            L2 = x / 10;
        }
        if(y >= 10 && y < 100){
            R1 = y % 10;
            R2 = y / 10;
        }
        if(x == 100)
            L1 = 1;
        if(y == 100)
            R1 = 1;
        return x >= 0 && x < m && y >= 0 && y < n && (L1 + L2 + R1 + R2) <= k;
    }
}
