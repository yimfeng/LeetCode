package Array;

public class P011 {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height){
        int p = 0, q = height.length - 1, ans = 0;
        while(p < q){
            ans = height[p] < height[q] ? Math.max((q - p) * height[p++], ans) : Math.max((q - p) * height[q--], ans);
        }
        return ans;
    }
}
