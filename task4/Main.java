import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("rows: ");
        int rows = scanner.nextInt();
        System.out.print("cols: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = (int) (Math.random() * 10);

        System.out.println("matrix:");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        System.out.print("exclude row " + rows);
        int excludeRow = scanner.nextInt() - 1;
        System.out.print("exclude col " + cols);
        int excludeCol = scanner.nextInt() - 1;

        int[][] minor = new int[rows - 1][cols - 1];
        for (int i = 0, minorRow = 0; i < rows; i++) {
            if (i == excludeRow) continue;
            for (int j = 0, minorCol = 0; j < cols; j++) {
                if (j == excludeCol) continue;
                minor[minorRow][minorCol++] = matrix[i][j];
            }
            minorRow++;
        }

        System.out.println("Minor:");
        for (int[] row : minor) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}