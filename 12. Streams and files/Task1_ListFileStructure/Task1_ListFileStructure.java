package Task1_ListFileStructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1_ListFileStructure {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        File file = new File(scan.nextLine());
        getDir(file);
    }

    public static void getDir(File file) {
        System.out.println(file.getPath());
        if (file.isDirectory()) {
            String[] folder = file.list();
            for (String fileName : folder) {
                File files = new File(file, fileName);
                getDir(files);
            }
        }
    }
}
