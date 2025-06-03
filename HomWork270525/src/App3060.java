import java.util.Scanner;

public class App3060 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;

        while (a < n) {
            a = a * 2;
        }
        if (a == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
