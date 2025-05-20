import java.util.Scanner;
public class App2953 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.print(m / n + 1%(m % n + 1));

    }
}