import java.util.Scanner;

public class App113 {
    public static void main (String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;

        while (a * a <= n) {
            System.out.println(a * a);
            a = a + 1;
        }
    }
}
