package String;

/**
 * @author: yimfeng
 * @date: 2020-12-25 8:04 下午
 * @desc: 整数反转
 */
public class P007 {
    public static void main(String[] args) {

    }
    public int reverse(int x) {
        int number = 0;
        while(x != 0){
            int pop = x % 10;
            if(number > Integer.MAX_VALUE/10 || number == Integer.MAX_VALUE/10 && pop > 7)
                return 0;
            if(number < Integer.MIN_VALUE/10 || number == Integer.MIN_VALUE/10 && pop < -8)
                return 0;
            number = number * 10 + pop;
            x = x/10;
        }
        if(number > 2147483647 && number < -2147483648)
            return 0;
        return number;
    }
}
