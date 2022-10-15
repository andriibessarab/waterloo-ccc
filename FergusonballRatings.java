import java.util.Scanner;

public class FergusonballRatings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // # of players
        int R = 0; // # of players w/ star rating

        for (int i = 0; i < N; i++) {
            int g = scan.nextInt(); // goals
            int f = scan.nextInt(); // fouls

            int r = g * 5 - f * 3; // calc rating

            if (r > 40) R++; // R++ if star rating
        }
        scan.close();
        System.out.println(R + " " + (N == R ? "+" : ""));
    }
}