package chapter07.Set;

import chapter04.LinkedList.LinkedList;
import chapter07.FileOperation;

import java.util.ArrayList;

public class LinkedListSet <E> implements Set<E>{
    private LinkedList<E> list;

    public LinkedListSet() {
        list=new LinkedList<>();
    }

    @Override
    public void add(E e) {
        if(!list.contains(e))
            list.addFirst(e);
    }

    @Override
    public void remove(E e) {
        list.removeElement(e);
    }

    @Override
    public boolean contains(E e) {
        return list.contains(e);
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Pride and Prejudice");

        ArrayList<String> words = new ArrayList<>();
        FileOperation.readFile("D:\\project\\PlayDataStructure\\src\\chapter07\\pride-and-prejudice.txt", words);
        System.out.println("Total words: " + words.size());

        LinkedListSet<String> set = new LinkedListSet<>();
        for (String word : words)
            set.add(word);
        System.out.println("Total different words: " + set.getSize());
    }
}
