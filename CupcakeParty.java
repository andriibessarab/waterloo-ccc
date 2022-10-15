import java.util.Scanner;

public class CupcakeParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();
        int S = scan.nextInt();
        scan.close();
        System.out.println(R * 8 + S * 3 - 28);
    }
}