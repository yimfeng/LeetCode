package String;

/**
 * @author: yimfeng
 * @date: 2021-02-03 9:27 下午
 * @desc:
 */
public class P014 {
    public static void main(String[] args) {

    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null)
            return null;
        int len = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < len; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if(i == strs[j].length() || strs[j].charAt(i) != ch)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
    public String longestCommonPrefix1(String[] strs){
        if(strs.length == 0 || strs == null)
            return "";
        String str = strs[0];
        int len = str.length();
        int size = strs.length;
        for (int i = 1; i < size; i++) {
            int j;
            for (j = 0; j < len && j < strs[i].length(); j++) {
                if(str.charAt(j) != strs[i].charAt(j))
                    break;
            }
            str = str.substring(0, j);
            if(str.equals(""))
                return "";
        }
        return str;
    }
}
