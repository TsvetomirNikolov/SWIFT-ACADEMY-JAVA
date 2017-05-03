package pkg10.data.structuress;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task3_ParenthesesMatching {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Deque<Character> stack = new ArrayDeque<>();
        Deque<Character> queue = new ArrayDeque<>();
        for (Character characters : input.toCharArray()) {
            if (characters == '(' || characters == ')' || characters == '[' || characters == ']'
                    || characters == '{' || characters == '}') {
                queue.add(characters);
            }
        }
        stack.push(queue.poll());
        for (int i = 0; i < input.length(); i++) {
            if (queue.isEmpty()) {
                break;
            }
            if (queue.peek() == '}' && !stack.isEmpty()) {
                if (stack.peek() == '{') {
                    queue.poll();
                }
                stack.pop();
            } else if (queue.peek() == ']' && !stack.isEmpty()) {
                if (stack.peek() == '[') {
                    queue.poll();
                }
                stack.pop();
            } else if (queue.peek() == ')' && !stack.isEmpty()) {
                if (stack.peek() == '(') {
                    queue.poll();
                }
                stack.pop();
            } else {
                stack.push(queue.poll());
            }
        }
        if (stack.isEmpty() && queue.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
