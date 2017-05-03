package Task1_FileStructure;

import java.nio.file.FileSystemException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1_FileStructure {

    private FolderObject buttonDemoProject = new FolderObject("ButtonDemoProject", null, null);

    public static void main(String[] args) throws FileSystemException {
        Task1_FileStructure fileStructure = new Task1_FileStructure();
        Scanner scanner = new Scanner(System.in);
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("END")) {
            String[] arr = input.split(" ");
            switch (arr[0]) {
                case "Mkdir":
                    fileStructure.
                    break;
                case "touch":
                    break;
            }
        }
    }

    public void checkCharacters(String name) throws FileSystemException {
        String checkedCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()_!.&/";
        for (char obj : name.toCharArray()) {
            if (checkedCharacters.contains(String.valueOf(obj))) {
                throw new FileSystemException("Invalid name specified");
            } else if (name.contains(" ")) {
                throw new FileSystemException("Invalid name specified");

            } else if (name.length() > 6) {
                throw new FileSystemException("Invalid name specified");
            }
        }
    }
}
