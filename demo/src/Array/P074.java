package Array;

/**
 * @author: yimfeng
 * @date: 2021-02-18 10:49 上午
 * @desc:
 */
public class P074 {
    public static void main(String[] args) {

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if(m == 0)
            return false;
        int n = matrix[0].length;
        int left = 0, right = m-1;
        while(left < right){
            int mid = left + (right-left+1)/2;
            if(matrix[mid][0] > target)
                right = mid-1;
            else if(matrix[mid][0] < target)
                left = mid;
            else
                return true;
        }
        int start = 0, end = n-1;
        while(start < end){
            int mid = start + (end-start+1)/2;
            if(matrix[left][mid] == target)
                return true;
            else if(matrix[left][mid] > target)
                end = mid - 1;
            else
                start = mid;
        }
        return matrix[left][start] == target;
    }
}
