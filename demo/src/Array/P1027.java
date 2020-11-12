package Array;

public class P1027 {
    public static void main(String[] args) {

    }
    public boolean uniqueOccurrences(int[] arr) {
        int[] hashTable = new int[2001];
        int[] nums = new int[2001];
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int index = temp + 1000;
            hashTable[index] ++;
        }
        for (int i = 0; i < 2001; i++) {
            if(hashTable[i] != 0){
                int num = hashTable[i];
                if(nums[num] >= 1)
                    return false;
                else
                    nums[num]++;
            }
        }
        return true;
    }
}
