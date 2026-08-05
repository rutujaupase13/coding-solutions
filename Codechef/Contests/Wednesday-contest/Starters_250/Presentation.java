import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int totalSlides = 20;
        int moreSlides = totalSlides - N;

        System.out.println(moreSlides);
    }
}