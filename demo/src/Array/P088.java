package Array;

public class P088 {
    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = 0, q = 0;
        while(p < m && q < n){
            if(nums1[p] <= nums2[q])
                p++;
            if(nums1[p] > nums2[q]){
                Insert(nums1, m, p);
                q++;
            }
        }
    }
    private void Insert(int[] nums, int m, int index){
        for(int i=m-1; i>index; i--){
            nums[i] = nums[i-1];
        }
    }
}
