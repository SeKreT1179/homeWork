import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gram;
        double kilo;

        kilo = 1000;

        gram = sc.nextDouble();

        System.out.println(gram / kilo);
    }
}
