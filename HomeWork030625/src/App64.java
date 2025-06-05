//Задача №64
//Входные данные
//        Сначала задано число N — количество элементов в массиве (1≤N≤100). Далее через пробел записаны N
//        чисел — элементы массива. Массив состоит из целых чисел.
//
//Выходные данные
//        Необходимо вывести все четные элементы массива (то есть те элементы, которые являются четными числами).

import java.util.Scanner;

public class App64 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
