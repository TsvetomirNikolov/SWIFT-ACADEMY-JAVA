package Task3_FileManagement;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3_FileManagement {

    private static List<String> _files = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            }
            String[] arrayInput = input.split(" ");
            switch (arrayInput[0]) {
                case "MAKE":
                    break;
                case "MOVE":
                    break;
                case "INFO":
                    break;
                case "EXEC":
                    break;
                case "DEL":
                    break;
                case "COPY":
                    break;
                case "MOD":
                    break;
            }
        }
    }
}
