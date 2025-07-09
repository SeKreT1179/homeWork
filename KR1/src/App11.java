import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        String res = ((num > 10) && (100 > num)) ?  "YES" : "NO";

        System.out.println(res);
    }
}