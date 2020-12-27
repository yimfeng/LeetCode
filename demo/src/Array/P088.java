package Array;

public class P088 {
    public static void main(String[] args) {

    }
    // 自己写的
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num = new int[m+n];

        int i = 0;
        int j = 0;
        while(i != m+n && j != n){
            if(nums1[i] < nums2[j]){
                i++;
            }
            if(nums1[i] >= nums2[j]){
                for (int k = m+j; k > i; k--) {
                    nums1[k] = nums1[k-1];
                }
                nums1[i] = nums2[j];
                j++;
            }
        }
    }
    // 优化之后的
    public void merge_1(int[] nums1, int m, int[] nums2, int n){
        int p1 = m-1;
        int p2 = n-1;
        int p = m+n-1;
        while(p1 >= 0 && p2 >= 0)
            nums1[p--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        System.arraycopy(nums2, 0, nums1, 0, p2+1);
    }
}
