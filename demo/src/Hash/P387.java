package Hash;

import java.util.HashMap;

public class P387 {
    public static void main(String[] args) {

    }
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = s.length();
        int num = 0;
        for (int i = 0; i < len; i++) {
            num = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i),++num);
        }
        for (int i = 0; i < len; i++) {
            if(map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
