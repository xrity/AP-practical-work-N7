import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int[][] transposed = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = (int) (Math.random() * 10);

        System.out.println("start from ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                transposed[j][i] = matrix[i][j];

        System.out.println("after ops");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(transposed[i][j] + " ");
            System.out.println();
        }
    }
}
