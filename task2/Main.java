import java.util.Arrays;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Random r = new Random();
        double array[][] = new double[5][5];

        for(int i=0; i < array.length; i++){
            for(int j=0; j < array[i].length; j++){
                array[i][j] = r.nextDouble(-5, 5);
                if(i%2 != 0 || j%2 != 0){
                    array[i][j] = Math.pow(array[i][j], 2);
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
}