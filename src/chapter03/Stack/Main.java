package chapter03.Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);

        Scanner sc =new Scanner(System.in);
    }
}
