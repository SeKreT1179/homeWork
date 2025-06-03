import java.util.Scanner;

public class App265 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int min = scanner.nextInt();
        int n = scanner.nextInt();

        if (k >= n) {
            min = min * 2;
            System.out.print(min);
        } else if ((k < n)) {
            n = (n * 2 + k - 1) / k;
            min = min * n;
            System.out.print(min);
        }
    }
}