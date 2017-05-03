package pkg10.data.structuress;

import java.util.Scanner;

public class Task4_CountryTour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input; i++) {
            String[] arrayInput = scanner.next().split(" ");
            int distanceInDays = Integer.parseInt(arrayInput[0]);
            int foodFromTown = Integer.parseInt(arrayInput[1]);
        }
    }
}
