package pkg10.data.structuress;

import java.beans.Expression;
import java.util.Scanner;

public class Task8_ExpressionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] inputToArray = input.toCharArray();
        System.out.println(calculate(input));
    }

    public static Double calculate(String expression) {

        try {
            int indexClose = expression.indexOf(")");
            int indexOpen = -1;
            if (indexClose != -1) {
                String substring = expression.substring(0, indexClose);
                indexOpen = substring.lastIndexOf("(");
                substring = substring.substring(indexOpen + 1).trim();
                if (indexOpen != -1 && indexClose != -1) {
                    Double result = calculate(substring);
                    expression = expression.substring(0, indexOpen).trim() + " " + result + " " + expression.substring(indexClose + 1).trim();
                    return calculate(expression.trim());
                }
            }

            String operation = "";
            if (expression.contains("/")) {
                operation = "/";
            } else if (expression.contains("*")) {
                operation = "*";
            } else if (expression.contains("+")) {
                operation = "+";
            } else if (expression.contains("-")) { 
                operation = "-";
            } else if (expression.contains("^")) {
                operation = "^";
            } else {
                return Double.parseDouble(expression);
            }

            int index = expression.indexOf(operation);
            if (index != -1) {
                indexOpen = expression.lastIndexOf(" ", index - 2);
                indexOpen = (indexOpen == -1) ? 0 : indexOpen;
                indexClose = expression.indexOf(" ", index + 2);
                indexClose = (indexClose == -1) ? expression.length() : indexClose;
                if (indexOpen != -1 && indexClose != -1) {
                    Double lhs = Double.parseDouble(expression.substring(indexOpen, index));
                    Double rhs = Double.parseDouble(expression.substring(index + 2, indexClose));
                    Double result = null;
                    switch (operation) {
                        case "/":
                            if (rhs == 0) {
                                return null;
                            }
                            result = lhs / rhs;
                            break;
                        case "*":
                            result = lhs * rhs;
                            break;
                        case "-":
                            result = lhs - rhs;
                            break;
                        case "+":
                            result = lhs + rhs;
                            break;
                        case "^":
                            result = lhs * rhs;
                            break;
                        default:
                            break;
                    }
                    if (indexClose == expression.length()) {
                        expression = expression.substring(0, indexOpen) + " " + result + " " + expression.substring(indexClose);
                    } else {
                        expression = expression.substring(0, indexOpen) + " " + result + " " + expression.substring(indexClose + 1);
                    }
                    return calculate(expression.trim());
                }
            }
        } catch (Exception exp) {
            exp.printStackTrace();
        }
        return 0.0;
    }
}
