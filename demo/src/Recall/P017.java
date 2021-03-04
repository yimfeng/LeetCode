package Recall;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yimfeng
 * @date: 2021-02-03 8:27 下午
 * @desc: 电话号码的字母组合
 */
public class P017 {
    public static void main(String[] args) {

    }
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        int len = digits.length();
        if(len == 0)
            return list;
        String[] digitsMap = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        dfs(digits, digitsMap, len, 0, "", list);
        return list;
    }
    private void dfs(String digits, String[] digitsMap, int len, int start, String s, List<String> list){
        if(start == len){
            list.add(s);
            return;
        }
        String str = digitsMap[digits.charAt(start) - '2'];
        int strlen = str.length();
        for (int i = 0; i < strlen; i++) {
            dfs(digits, digitsMap, len, start+1, s + str.charAt(i), list);
        }
    }
}
