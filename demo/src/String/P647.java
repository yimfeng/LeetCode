package String;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P647 {
    public static void main(String[] args) {

    }
    // 使用动态规划进行遍历
    public int countSubstrings_1(String s){
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int ans = 0;
        for (int j = 0; j < len; j++) {
            for (int i = 0; i <= j; i++) {
                if(s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i+1][j-1])){
                    dp[i][j] = true;
                    ans++;
                }
            }
        }
        return ans;
    }
}
