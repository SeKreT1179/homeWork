import java.util.Scanner;

public class App3059 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;

        while (a <= n) {
            System.out.println(a);
            a = a * 2;
        }
    }
}