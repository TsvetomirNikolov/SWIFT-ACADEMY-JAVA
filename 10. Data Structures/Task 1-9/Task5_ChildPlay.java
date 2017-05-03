package pkg10.data.structuress;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5_ChildPlay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        List<Integer> listChildrens = new ArrayList<>();
        int countRounds = 0;
        int counter = 0;
        for (int i = 0; i < input; i++) {
            listChildrens.add(scanner.nextInt());
        }
        for (int i = listChildrens.size() - 1; i > 1; i--) {
            counter = listChildrens.size();
            if (listChildrens.get(i) > listChildrens.get(i - 1)) {
                listChildrens.remove(i);
            }
            if (listChildrens.size() != counter) {
                countRounds++;
            }
        }
        System.out.println(countRounds);
    }
}
