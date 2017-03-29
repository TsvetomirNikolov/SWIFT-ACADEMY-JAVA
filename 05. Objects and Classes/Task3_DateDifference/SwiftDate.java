package pkg05.objects.and.classess.Task3_DateDifference;

import java.util.Scanner;

public class SwiftDate {

    int year;
    int month;
    int day;

    SwiftDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    void setYear(int year) {
        if (0 <= year && year <= 9999) {
            this.year = year;
        } else {
            // Bad practice
            System.out.println("sorry");
        }
    }

    boolean isLeapYear() {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    int getCentury() {
        int result = this.year / 100 + 1;
        return result;
    }

    int getDaysDifference(SwiftDate other) {
        int a = (14 - month) / 12;
        int y = year + 4800 - a;
        int m = month + 12 * a - 3;
        int differenceInDays = day + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045; // Algorithm from wikipedia.
        return differenceInDays;
    }

    String getInfo() {
        String result = String.format("%d %d %d - %d century", this.year, this.month, this.day, this.getCentury());
        if (this.isLeapYear()) {
            result += " It is a LEAP year";
        }
        return result;
    }

    public static void main(String[] args) {
//        We could use and read data with scanner
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        SwiftDate date1 = new SwiftDate(2016, 9, 26);
        SwiftDate date2 = new SwiftDate(year, month, day);
        int endResult = date1.getDaysDifference(date2) - date2.getDaysDifference(date2);
        System.out.println(Math.abs(endResult));
        System.out.println(date1.getInfo());
        System.out.println(date2.getInfo());
    }
}
