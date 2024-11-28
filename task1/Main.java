import java.util.Arrays;


public class Main{
    public static void main(String[] args) {
        int size = 5;
        int pyramid[][] = new int[size][];
        int k = 1;
        
        for(int i=0; i < size; i++){
            pyramid[i] = new int[i + k++];
        }

        for(int i=0; i < size; i++){
            for(int j=0; j < pyramid[i].length; j++){
                pyramid[i][j] = 1;
            }
        }

        int spaces = k;
        for(int i=0; i < size; i++){
            while(k-- > i){
                System.out.print("   ");
            }
            System.out.println(Arrays.toString(pyramid[i]));
            k = spaces;
        }   

        System.out.println("");

        for(int i=size-1; i > -1; i--){
            while(k-- > i){
                System.out.print("   ");
            }
            System.out.println(Arrays.toString(pyramid[i]));
            k = spaces;
        }             
    }
}