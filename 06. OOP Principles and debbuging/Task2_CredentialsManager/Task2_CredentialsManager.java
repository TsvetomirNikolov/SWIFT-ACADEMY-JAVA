package pkg06.oop.principles.and.debbugind.Task2_CredentialsManager;

import java.util.Scanner;

public class Task2_CredentialsManager {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line;
        Credentials[] credentials = new Credentials[200];
        int credentialsCounter = 0;
        while (!(line = scan.nextLine()).equalsIgnoreCase("END")) {
            String[] split = line.split(" ");
            String command = split[0];
            String username = split[1].trim();
            String oldPassword = split[2].trim();
            switch (command.toUpperCase()) {
                case "ENROLL":
                    credentials[credentialsCounter++] = new Credentials(username, oldPassword);
                    System.out.println("ENROLL success");
                    break;
                case "CHPASS":
                    for (int i = 0; i < credentialsCounter; i++) {
                        String source = credentials[i].getUsername();
                        if (source.equalsIgnoreCase(username)) {
                            boolean changePasswordSuccessful = credentials[i].changePassword(oldPassword, split[3].trim());
                            if (changePasswordSuccessful) {
                                System.out.println("CHPASS success");
                            } else {
                                System.out.println("CHPASS fail");
                            }
                            break;
                        }
                    }
                    break;
                case "AUTH":
                    for (int i = 0; i < credentialsCounter; i++) {
                        String source = credentials[i].getUsername();

                        if (source.equalsIgnoreCase(username)) {
                            if (credentials[i].matchPassword(oldPassword)) {
                                System.out.println("AUTH success");
                            } else {
                                System.out.println("AUTH fail");
                            }
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }
        }
    }
}
