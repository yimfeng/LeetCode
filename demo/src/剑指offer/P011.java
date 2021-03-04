package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2021-03-04 2:23 下午
 * @desc:
 */
public class P011 {
    public static void main(String[] args) {

    }
    public int minArray(int[] numbers) {
        int len = numbers.length;
        if(len == 0)
            return 0;
        int left = 0, right = len-1;
        while(left < right){
            int mid = left + (right - left) >> 1;
            if(numbers[mid] == numbers[left])
                left++;
            else if(numbers[mid] < numbers[left])
                right = mid;
            else
                left = mid + 1;
        }
        return numbers[left];
    }
}
