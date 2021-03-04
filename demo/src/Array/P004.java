package Array;

/**
 * @author: yimfeng
 * @date: 2021-02-03 8:25 下午
 * @desc: 寻找两个正序数组的中位数
 */
public class P004 {
    public static void main(String[] args) {

    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if(len1 == 0 && len2 == 0)
            return 0;
        double left1 = 0, right1 = nums1[len1-1];
        double left2 = 0, right2 = nums2[len2-1];

    }
}
