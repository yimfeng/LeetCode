package String;

/**
 * @author: yimfeng
 * @date: 2020-12-25 7:51 下午
 * @desc: 回文数
 */
public class P009 {
    public static void main(String[] args) {

    }
    // 将int转化为string类型
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int len = s.length();
        for (int i = 0; i < len/2; i++) {
            if(s.charAt(i) != s.charAt(len - i -1))
                return false;
        }
        return true;
    }

    // 不转变为字符串仍进行处理
    public boolean isPalindrome_1(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int number = 0;
        while(x > number){
            number = number * 10 + x % 10;
            x = x/10;
        }
        return x == number || x == number/10;
    }
}
