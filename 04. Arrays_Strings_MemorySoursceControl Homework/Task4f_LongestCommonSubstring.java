package pkg04.arrays.and.strings;

import java.util.Scanner;

public class Task4f_LongestCommonSubstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        System.out.println(LongestCommonSubString(first, second));
    }

    public static String LongestCommonSubString(String firstString, String secondString) {
//        I search for help in Wikipedia for this algorithm
        StringBuilder sb = new StringBuilder();
        if (null == firstString || null == secondString) {
            return "";
        }
        int[][] num = new int[firstString.length()][secondString.length()];
        int maxlen = 0;
        int lastSubsBegin = 0;

        for (int i = 0; i < firstString.length(); i++) {
            for (int j = 0; j < secondString.length(); j++) {
                if (firstString.charAt(i) == secondString.charAt(j)) {
                    if ((i == 0) || (j == 0)) {
                        num[i][j] = 1;
                    } else {
                        num[i][j] = 1 + num[i - 1][j - 1];
                    }

                    if (num[i][j] > maxlen) {
                        maxlen = num[i][j];
                        int thisSubsBegin = i - num[i][j] + 1;
                        if (lastSubsBegin == thisSubsBegin) {
                            sb.append(firstString.charAt(i));
                        } else {
                            lastSubsBegin = thisSubsBegin;
                            sb = new StringBuilder();
                            sb.append(firstString.substring(lastSubsBegin, i + 1));
                        }
                    }
                }
            }
        }
        return sb.toString();
    }
}
