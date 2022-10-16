import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;

public class HarpTuning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String I = scan.nextLine(); // instructions
        scan.close();
        Matcher m = Pattern.compile("([A-Ta-t]{1,20})([+-]{1})([0-9]{1,})").matcher(I);

        while(m.find()) {
            System.out.println(m.group(1) + " " + (m.group(2).equals("+") ? "tighten" : "loosen") + " " + m.group(3));
        }
    }
}