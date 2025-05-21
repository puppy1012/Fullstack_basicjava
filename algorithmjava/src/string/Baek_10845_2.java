package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_10845_2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder builder = new StringBuilder();
        int back = -1;

        for (int i = 0; i < num; i++) {
            String input = br.readLine();
            String[] is = input.split(" ");
            String command = is[0];

            if (command.equals("push")) {
                int value = Integer.parseInt(is[1]);
                queue.add(value);
                back = value;
            } else if (command.equals("pop")) {
                builder.append(queue.isEmpty() ? "-1" : queue.poll()).append("\n");
            } else if (command.equals("size")) {
                builder.append(queue.size()).append("\n");
            } else if (command.equals("empty")) {
                builder.append(queue.isEmpty() ? "1" : "0").append("\n");
            } else if (command.equals("front")) {
                builder.append(queue.isEmpty() ? "-1" : queue.peek()).append("\n");
            } else if (command.equals("back")) {
                builder.append(queue.isEmpty() ? "-1" : back).append("\n");
            }
        }

        System.out.print(builder.toString());
    }
}
