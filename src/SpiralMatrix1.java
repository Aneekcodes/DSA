import java.util.*;

public class SpiralMatrix1 {
    static ArrayList<Integer> sp(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ans;

        int m = matrix.length;       // Number of rows
        int n = matrix[0].length;    // Number of columns

        // Define our 4 boundaries
        int top = 0;
        int bottom = m - 1;          // FIXED: Use m for rows
        int left = 0;
        int right = n - 1;           // FIXED: Use n for columns

        // FIXED: Changed to <= so we don't skip the center element
        while (top <= bottom && left <= right) {

            // 1. Move Right along the top row
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++; // Shrink the top boundary

            // 2. Move Down along the right column
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--; // Shrink the right boundary

            // 3. Move Left along the bottom row (Check if a row still exists)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]); // FIXED: Use bottom row index
                }
                bottom--; // Shrink the bottom boundary
            }

            // 4. Move Up along the left column (Check if a column still exists)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]); // FIXED: Use left column index
                }
                left++; // Shrink the left boundary
            }
        }
        return ans;
    }

    // FIXED: Standard Java main method signature must accept String[] args
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(sp(matrix)); // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}