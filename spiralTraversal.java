import java.util.Scanner;

public class spiralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Assuming square matrix for now
        int[][] arr = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Spiral Traversal
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        System.out.println("Spiral Order:");
        while (top <= bottom && left <= right) {

            // Traverse left to right
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++;

            // Traverse top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            //  Traverse right to left (only if top <= bottom)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--;
            }

            // 4Traverse bottom to top (only if left <= right)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }

        sc.close();
    }
}
