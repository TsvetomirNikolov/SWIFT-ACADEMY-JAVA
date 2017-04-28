package Task3_FileManagement;

import static java.lang.Compiler.command;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3_FileManagement {

    private static ArrayList<File> _files;

    public static void main(String[] args) {
        Task3_FileManagement fileManagement = new Task3_FileManagement();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equalsIgnoreCase("END")) {
            input = scanner.nextLine();
            String[] arrayInput = input.split(" ");
            switch (arrayInput[0]) {
                case "MAKE":
                    fileManagement.fileDirectories(arrayInput);
                    break;
                case "MOVE":
                    fileManagement.getFiles();
                    break;
                case "INFO":
                    fileManagement.getFiles();
                    break;
                case "EXEC":
                    fileManagement.getFiles();
                    break;
                case "DEL":
                    fileManagement.getFiles();
                    break;
                case "COPY":
                    fileManagement.executeCopy(arrayInput);
                    break;
                case "MOD":
                    fileManagement.getFiles();
                    break;
            }
        }
    }

    public void fileDirectories(String[] input) {
        if (input[3].equals("CONTENT") && input[1].endsWith(".avi") || input[1].endsWith(".mp3")) {
            Task3_FileManagement._files.add(new MediaContentFile(input[2], input[1], input[3]));
        } else {
            Task3_FileManagement._files.add(new DocumentContentFile(input[2], input[2], input[3]));
        }
    }

    public void executeCopy(String[] input) {
        Task3_FileManagement._files.add(new File(input[1], input[2]));
    }

    public ArrayList<File> getFiles() {
        return _files;
    }
}
