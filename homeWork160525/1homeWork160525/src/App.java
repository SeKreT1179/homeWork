import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int a;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int n1 = n % 10;
        int n2 = (n / 10) % 10;
        int n3 = n / 100;

        a = n1 + n2 + n3;

        System.out.print(a);
    }
}
