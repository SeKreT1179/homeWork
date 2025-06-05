import java.util.Scanner;

public class App66 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < array.length; i++) {
            int c = i - 1;
            if (array[i] > array[c]) {
                a++;
            }
        }
        System.out.print(a);
    }
}

