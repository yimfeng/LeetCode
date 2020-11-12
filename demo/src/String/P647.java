package String;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P647 {
    public static void main(String[] args) {

    }
    public int countSubstrings(String s) {
        List<List<String>> res = new ArrayList<>();
        int sum = 0;
        int len = s.length();
        if(len == 0)
            return 0;
        Deque<String> path = new ArrayDeque<>();
        dfs(s, len, 0, path, res);

    }
    private void dfs(String s, int len, int index, Deque<String> path,List<List<String>> res){
        res.add(new ArrayList<>(path));
        for (int i = index; i < len; i++) {
            path.addLast(s.charAt(i));
            dfs(s, len, index+1, path, res);
            path.removeLast();
        }
    }
    private boolean judge(String s){
        int len = s.length();
        for (int i = 0; i < len/2; i++) {
            if(s[i] != s[len-i-1])
                return false;
        }
        return true;
    }
}
