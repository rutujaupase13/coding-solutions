import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int total = 0;

            // Brute force: calculate cost for each month
            for (int i = 1; i <= N; i++) {
                if (i <= 3) {
                    total += X;
                } else {
                    total += Y;
                }
            }

            System.out.println(total);
        }

        sc.close();
    }
}