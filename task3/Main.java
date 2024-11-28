import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matrix[][] = new int[5][5];

        System.out.println("Write ints");
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                System.out.println("index: " + i + " " + j);
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println();

        int result = 0;
        for(int i=0; i < matrix.length; i++){
                result += matrix[i][i]; 
        }    
        System.out.println("result" + result);

    }
}