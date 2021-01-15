package String;

import javax.swing.*;

/**
 * @author: yimfeng
 * @date: 2021-01-15 1:38 下午
 * @desc: 给你一个字符串 s，找到 s 中最长的回文子串。
 */
public class P005 {
    public static void main(String[] args) {

    }
    // 动态规划
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        int maxLen = 1;
        int begin = 0;
        boolean[][] dp = new boolean[len][len];
        char[] charArrays = s.toCharArray();

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if(charArrays[i] != charArrays[j])
                    dp[i][j] = false;
                else{
                    if(j - i < 3)
                        dp[i][j] = true;
                    else{
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if(dp[i][j] && j - i + 1 > maxLen){
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, maxLen);
    }

    //从中间扩散
    public String longestPalindrome_1(String s) {
        int len = s.length();
        if(len < 2)
            return s;

        int maxLen = 1;
        String res = s.substring(0,1);
        for (int i = 0; i < len - 1; i++) {
            String oddstr = centerSpread(s, i ,i);
            String evenstr = centerSpread(s, i, i+1);
            String str = oddstr.length() > evenstr.length() ? oddstr : evenstr;
            if(str.length() > maxLen){
                maxLen = str.length();
                res = str;
            }
        }
        return res;
    }
    private String centerSpread(String s, int left, int right){
        int len = s.length();
        int i = left;
        int j = right;
        while(i >= 0 && j < len){
            if(s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else
                break;;
        }
        return s.substring(i+1, j);
    }
}
