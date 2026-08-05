 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            // Same diagonal
            if ((x1 + y1 == x2 + y2) || (x1 - y1 == x2 - y2)) {
                System.out.println(1);
            }
            // Same color
            else if ((x1 + y1) % 2 == (x2 + y2) % 2) {
                System.out.println(2);
            }
            // Different colors
            else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}