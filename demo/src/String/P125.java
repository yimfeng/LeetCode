package String;

/**
 * @author: yimfeng
 * @date: 2021-02-18 5:57 下午
 * @desc:
 */
public class P125 {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(String s) {
        StringBuffer sgood = new StringBuffer();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
                sgood.append(Character.toLowerCase(ch));
        }
        int left = 0, right = len-1;
        while(left < right){
            if(Character.toLowerCase(sgood.charAt(left)) != Character.toLowerCase(sgood.charAt(right)))
                return false;
            ++left;
            --right;
        }
        return false;
    }
}
