//Задача №65
//Входные данные
//      Сначала задано число N — количество элементов в массиве (1≤N≤10000)
//
//Выходные данные
//      Необходимо единственное число - количество положительных элементов в массиве.

import java.util.Scanner;

public class App65 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > 0) {
                a = a + 1;

            }
        }
        System.out.print(a);
    }
}
