package QueuePostTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 3; i++) {
        System.out.print("Masukkan 3 ID Buku: ");
        queue.add(sc.nextInt());
        }

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        System.out.println("ID Buku Paling Atas (Top): " + stack.peek());
    }
}