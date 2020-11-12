package Array;

import java.util.ArrayList;
import java.util.List;

public class P054 {
    public static void main(String[] args) {

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int m = matrix.length;
        if(m == 0)
            return new ArrayList<>();
        int n = matrix[0].length;
        int d = 0;
        boolean[][] visited = new boolean[m][n];
        int x = 0;
        int y = 0;
        List<Integer> res = new ArrayList<>();
        while(res.size() < m * n){
            res.add(matrix[x][y]);
            visited[x][y] = true;
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx < m && nx >=0 && ny < n && ny >=0 && !visited[nx][ny] ){
                x = nx;
                y = ny;
            }else {
                d = (d + 1) % 4;
                nx = x + dx[d];
                ny = y + dy[d];
                x = nx;
                y = ny;
            }
        }
        return res;
    }
}
