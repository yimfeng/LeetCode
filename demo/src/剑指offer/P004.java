package 剑指offer;

public class P004 {
    public static void main(String[] args) {

    }
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int rows = matrix.length;
        int columns = matrix[0].length;
        if(rows > 0 && columns > 0){
            int row = 0;
            int column = columns - 1;
            while(row < rows && column >= 0){
                if(matrix[row][column] == target)
                    return true;
                else if(matrix[row][column] > target)
                    column--;
                else
                    row++;
            }
        }
        return false;
    }
}
