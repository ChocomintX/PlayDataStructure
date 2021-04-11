package chapter07;

import chapter07.Set.BSTSet;
import chapter07.Set.LinkedListSet;
import chapter07.Set.Set;

import java.util.ArrayList;

public class Main {
    private static double testSet(Set<String> set, String filename) {
        long startTime = System.nanoTime();

        ArrayList<String> words = new ArrayList<>();
        FileOperation.readFile(filename, words);

        for (String word : words)
            set.add(word);
        System.out.println("Total different words: " + set.getSize());

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        double time1 = testSet(new BSTSet<String>(), "D:\\project\\PlayDataStructure\\src\\chapter07\\pride-and-prejudice.txt");
        System.out.println("BST Set: " + time1 + " s");

        double time2 = testSet(new LinkedListSet<String>(), "D:\\project\\PlayDataStructure\\src\\chapter07\\pride-and-prejudice.txt");
        System.out.println("LinkedList Set: " + time2 + " s");
    }
}
