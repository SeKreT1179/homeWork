import java.util.Scanner;

public class App344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int i = a; a <= i && i <= b; i++) {
            if (i % d == c) {
                System.out.print(i + " ");
            }
        }
    }
}
