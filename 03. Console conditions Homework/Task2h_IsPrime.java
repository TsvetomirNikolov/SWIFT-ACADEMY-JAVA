package pkg03.console.applications;

import java.util.Scanner;

public class Task2h_IsPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = Integer.parseInt(scanner.nextLine());
        System.out.println(IsPrime(inputDigit));
    }
//     Create a method that returns boolean variable which in different cases is true or false

    public static boolean IsPrime(int inputDigit) {
        boolean checkPrimes = true;
        if (inputDigit < 2) {
            checkPrimes = false;
        } else {
            checkPrimes = true;
            for (int start = 2; start <= Math.sqrt(inputDigit); start++) {
                if (inputDigit % start == 0) {
                    checkPrimes = false;
                    break;
                }
            }
        }
        return checkPrimes;
    }
}
