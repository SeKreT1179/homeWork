import java.util.Scanner;

public class App21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] line = new int[sc.nextInt()];


        for (int i = 0; i < line.length; i++) {
            line[i] = sc.nextInt();
        }

        int hv = line[0];

        for (int j = 0; j < line.length; j++) {
            if (line[j] < hv) {
                hv = line[j];
            }
        }
        System.out.println(hv);
    }
}