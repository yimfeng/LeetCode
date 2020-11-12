package Array;

public class P011 {
    public static void main(String[] args) {

    }
    int maxarea = 0;
    public int maxArea(int[] height) {
        int temp = 0;
        int len = height.length;
        int p = 0, q = len-1;
        while(p != q){
            if(height[p] > height[q]){
                temp = height[q] * (q - p);
                q--;
            }
            else{
                temp = height[p] * (q - p);
                p++;
            }
            if(temp > maxarea)
                maxarea = temp;
        }
        return maxarea;
    }
}
