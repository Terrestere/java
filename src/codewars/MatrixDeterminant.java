package codewars;

public class MatrixDeterminant {
    public static void main(String[] args) {

        int[][] A = {{1, 2, 5},
                     {3, 4, 6},
                     {3, 5, 8}
        };

        System.out.println(determinant(A));

    }

    public static int determinant(int[][] matrix) {
        int n = matrix.length;
        if (n == 1) return matrix[0][0];
        int ans = 0;
        int[][] B = new int[n - 1][n - 1];
        int l = 1;
        for (int i = 0; i < n; ++i) {
            int x = 0, y = 0;
            for (int j = 1; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    if (i == k) continue;
                    B[x][y] = matrix[j][k];
                    ++y;
                    if (y == n - 1) {
                        y = 0;
                        ++x;
                    }
                }
            }
            ans += l * matrix[0][i] * determinant(B);
            l *= (-1);
        }
        return ans;
    }
}
