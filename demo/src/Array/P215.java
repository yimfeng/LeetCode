package Array;


/**
 * @author: yimfeng
 * @date: 2020-12-27 11:50 上午
 * @desc: 数组中的第K个最大元素
 */
public class P215 {
    public static void main(String[] args) {

    }
    // 使用堆排序进行计算
    public int findKthLargest(int[] nums, int k) {
        int heapSize = nums.length;
        bulidMaxheap(nums, heapSize);
        for (int i = nums.length - 1; i < heapSize - k + 1; i++) {
            swap(nums, 0 ,i);
            --heapSize;
            maxHeapify(nums, 0, heapSize);
        }
        return nums[0];
    }
    private void bulidMaxheap(int[] nums, int heapSize){
        for (int i = heapSize/2; i >= 0 ; i--) {
            maxHeapify(nums, i, heapSize);
        }
    }
    public void maxHeapify(int[] a, int i, int heapSize){
        int l = i * 2 + 1, r = i * 2 + 2, largest = i;
        if (l < heapSize && a[l] > a[largest]) {
            largest = l;
        }
        if (r < heapSize && a[r] > a[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(a, i, largest);
            maxHeapify(a, largest, heapSize);
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    // 使用快排进行计算
    public int findKthLargest_1(int[] nums, int k){
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int target = len - k;
        while(true){
            int index = partition(nums, left, right);
            if(index == target)
                return nums[index];
            else if(index < target)
                left = index + 1;
            else
                right = index - 1;
        }
    }
    public int partition(int[] nums, int left, int right){
        int pivot = nums[left];
        int j = left;
        for (int i = left; i<= right; i++) {
            if(nums[i] < pivot){
                j++;
            }
        }
        swap_1(nums, j, left);
        return j;
    }
    private void swap_1(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
