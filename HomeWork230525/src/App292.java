import java.util.Scanner;

public class App292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();

        if (a > b){
            System.out.print(a);
        } else {
            System.out.print(b);
        }
    }
}
