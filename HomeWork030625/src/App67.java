//Задача №67
//Входные данные
//      Сначала задано число N — количество элементов в массиве (1≤N≤10000)
//Выходные данные
//      Необходимо вывести слово YES, если существует пара соседних элементов с одинаковыми знаками. В противном случае следует вывести слово NO.
import java.util.Scanner;


public class App67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < array.length; i++) {
            int past = i - 1;
            if (array[i] > 0 && array[past] > 0) {
                flag = true;
            } else if (array[i] < 0 && array[past] < 0) {
                flag = true;
            }
        }
        System.out.println(flag == true ? "YES" : "NO");

    }
}
