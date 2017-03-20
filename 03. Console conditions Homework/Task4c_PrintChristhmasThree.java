package pkg03.console.applications;

import java.util.Scanner;

public class Task4c_PrintChristhmasThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int stars = 1;
        String dashes = "";
        for (int row = 0; row < n - 2; row++) {
            String repeat = repeatStr("*", stars);
            dashes = repeatStr(" ", (n - stars / 2));
            stars += 2;
            System.out.println(dashes + repeat + dashes);
        }
        System.out.println(repeatStr(" ", n) + "*" + repeatStr(" ", n));
        System.out.println(repeatStr(" ", n - 1) + "***" + repeatStr(" ", n - 1));

    }
//    Create a method that returns string which is repeated
    public static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
