package Array;

import java.util.*;

public class P015 {
    public static void main(String[] args) {

    }
    // 回溯导致有几个点不能通过
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len == 0)
            return res;
        Deque<Integer> path = new ArrayDeque<>();
        Arrays.sort(nums); // 排序，方便后面的剪枝
        dfs(nums, len,0,0, path, res);
        return res;
    }
    private void dfs(int[] nums, int len, int value, int start, Deque<Integer> path, List<List<Integer>> res){
        if(value == 0 && path.size() == 3)
            res.add(new ArrayList<>(path));
        for (int i = start; i < len; i++) {

            if(nums[i] + value > 0 || path.size() > 3)  //剪枝
                break;
            if(i > start && nums[i] == nums[i-1]) //防止有重复的数据，导致结果产生重复的子集
                continue;

            path.addLast(nums[i]);
            dfs(nums, len, value + nums[i], i+1, path, res);
            path.removeLast();
        }
    }

    // 排序+双指针法
    public List<List<Integer>> threeSum_1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        if(len == 0)
            return res;
        for (int i = 0; i < len; i++) {
            if(nums[i] > 0)
                break;
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int L = i + 1;
            int R = len - 1;
            while(L < R){
                int sum = nums[L] + nums[i] + nums[R];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while(L < R && nums[L] == nums[L+1])
                        L++;
                    while(L < R && nums[R] == nums[R-1])
                        R--;
                    L++;
                    R--;
                }
                else if(sum < 0) L++;
                else R--;
            }
        }
        return res;
    }
}
