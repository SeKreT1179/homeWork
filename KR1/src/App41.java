import java.util.Scanner;

public class App41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] ar1 = new int[5][4];
        int[][] ar2 = fillArrayRandomInt(ar1);

        printArray(ar1);
        int[] sumColumnArray = sumColumnArray(ar1);
        printArray(sumColumnArray);
    }

//__________________________________________________________________________________________________//
//с помощью этой части коды мы заполняем масив
    public static int[][] fillArrayRandomInt(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 150);
            }
        }
        return array;
    }

//__________________________________________________________________________________________________//

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

//__________________________________________________________________________________________________//

    public static int[] sumColumnArray(int[][] array) {
        int[] res = new int[array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                res[j] += array[i][j];
            }
        }
        return res;
    }

//__________________________________________________________________________________________________//

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}
